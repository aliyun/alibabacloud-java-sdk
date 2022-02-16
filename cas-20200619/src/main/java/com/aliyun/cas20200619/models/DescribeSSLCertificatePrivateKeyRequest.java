// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificatePrivateKeyRequest extends TeaModel {
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("EncryptedCode")
    public String encryptedCode;

    public static DescribeSSLCertificatePrivateKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificatePrivateKeyRequest self = new DescribeSSLCertificatePrivateKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificatePrivateKeyRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DescribeSSLCertificatePrivateKeyRequest setEncryptedCode(String encryptedCode) {
        this.encryptedCode = encryptedCode;
        return this;
    }
    public String getEncryptedCode() {
        return this.encryptedCode;
    }

}
