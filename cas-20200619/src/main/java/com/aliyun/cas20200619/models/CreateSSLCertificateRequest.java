// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class CreateSSLCertificateRequest extends TeaModel {
    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("PrivateKey")
    public String privateKey;

    public static CreateSSLCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSSLCertificateRequest self = new CreateSSLCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSSLCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateSSLCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

}
