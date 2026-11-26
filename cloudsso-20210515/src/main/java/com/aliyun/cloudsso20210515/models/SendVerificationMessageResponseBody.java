// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SendVerificationMessageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A24A87F9-2B1C-5E4A-9D3E-1C6F8B902E41</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendVerificationMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendVerificationMessageResponseBody self = new SendVerificationMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendVerificationMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
