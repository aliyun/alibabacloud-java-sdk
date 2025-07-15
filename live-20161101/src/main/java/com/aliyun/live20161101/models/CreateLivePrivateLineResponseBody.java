// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLivePrivateLineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7908F2FF-44F8-120F-9FD6-85AE4B6C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLivePrivateLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePrivateLineResponseBody self = new CreateLivePrivateLineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLivePrivateLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
