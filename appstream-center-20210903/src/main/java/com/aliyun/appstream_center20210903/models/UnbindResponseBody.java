// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class UnbindResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindResponseBody self = new UnbindResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
