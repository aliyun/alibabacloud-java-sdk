// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class CreateSSLCertificateWithNameRequest extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("PrivateKey")
    public String privateKey;

    public static CreateSSLCertificateWithNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSSLCertificateWithNameRequest self = new CreateSSLCertificateWithNameRequest();
        return TeaModel.build(map, self);
    }

    public CreateSSLCertificateWithNameRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateSSLCertificateWithNameRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateSSLCertificateWithNameRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

}
