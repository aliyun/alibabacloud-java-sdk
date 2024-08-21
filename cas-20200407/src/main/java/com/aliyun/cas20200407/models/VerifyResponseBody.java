// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class VerifyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1ed33293-2e48-6b14-861e-538e28e408eb</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the signature is valid. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SignatureValid")
    public Boolean signatureValid;

    public static VerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyResponseBody self = new VerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyResponseBody setSignatureValid(Boolean signatureValid) {
        this.signatureValid = signatureValid;
        return this;
    }
    public Boolean getSignatureValid() {
        return this.signatureValid;
    }

}
