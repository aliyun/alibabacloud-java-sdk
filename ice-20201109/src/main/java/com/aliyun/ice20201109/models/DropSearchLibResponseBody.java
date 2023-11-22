// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DropSearchLibResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DropSearchLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DropSearchLibResponseBody self = new DropSearchLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DropSearchLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
