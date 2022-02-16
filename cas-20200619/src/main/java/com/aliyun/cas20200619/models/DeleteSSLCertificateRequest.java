// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DeleteSSLCertificateRequest extends TeaModel {
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    public static DeleteSSLCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSSLCertificateRequest self = new DeleteSSLCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSSLCertificateRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

}
