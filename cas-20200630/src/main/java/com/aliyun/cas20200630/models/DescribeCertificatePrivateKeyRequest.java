// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCertificatePrivateKeyRequest extends TeaModel {
    @NameInMap("EncryptedCode")
    public String encryptedCode;

    @NameInMap("Identifier")
    public String identifier;

    public static DescribeCertificatePrivateKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificatePrivateKeyRequest self = new DescribeCertificatePrivateKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificatePrivateKeyRequest setEncryptedCode(String encryptedCode) {
        this.encryptedCode = encryptedCode;
        return this;
    }
    public String getEncryptedCode() {
        return this.encryptedCode;
    }

    public DescribeCertificatePrivateKeyRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
