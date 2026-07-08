// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class EncryptResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The encrypted data. The data is Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EncryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EncryptResponseBody self = new EncryptResponseBody();
        return TeaModel.build(map, self);
    }

    public EncryptResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public EncryptResponseBody setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public EncryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
