// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelDomainVerificationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AC0AF67-D303-4EB9-B20E-B4D4B2C3F97B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelDomainVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelDomainVerificationResponseBody self = new CancelDomainVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelDomainVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
