// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportCertificateRequest extends TeaModel {
    @NameInMap("PKCS12Blob")
    public String PKCS12Blob;

    @NameInMap("Passphrase")
    public String passphrase;

    public static ImportCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCertificateRequest self = new ImportCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ImportCertificateRequest setPKCS12Blob(String PKCS12Blob) {
        this.PKCS12Blob = PKCS12Blob;
        return this;
    }
    public String getPKCS12Blob() {
        return this.PKCS12Blob;
    }

    public ImportCertificateRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }
    public String getPassphrase() {
        return this.passphrase;
    }

}
