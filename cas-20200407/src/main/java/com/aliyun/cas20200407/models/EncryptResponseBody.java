// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class EncryptResponseBody extends TeaModel {
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

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
