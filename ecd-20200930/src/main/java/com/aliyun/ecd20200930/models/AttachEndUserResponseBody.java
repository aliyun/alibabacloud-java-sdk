// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachEndUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachEndUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachEndUserResponseBody self = new AttachEndUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachEndUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
