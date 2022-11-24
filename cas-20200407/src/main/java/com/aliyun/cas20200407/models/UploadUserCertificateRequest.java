// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadUserCertificateRequest extends TeaModel {
    @NameInMap("Cert")
    public String cert;

    @NameInMap("EncryptCert")
    public String encryptCert;

    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    @NameInMap("Key")
    public String key;

    @NameInMap("Name")
    public String name;

    @NameInMap("SignCert")
    public String signCert;

    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    public static UploadUserCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadUserCertificateRequest self = new UploadUserCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UploadUserCertificateRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public UploadUserCertificateRequest setEncryptCert(String encryptCert) {
        this.encryptCert = encryptCert;
        return this;
    }
    public String getEncryptCert() {
        return this.encryptCert;
    }

    public UploadUserCertificateRequest setEncryptPrivateKey(String encryptPrivateKey) {
        this.encryptPrivateKey = encryptPrivateKey;
        return this;
    }
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    public UploadUserCertificateRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UploadUserCertificateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadUserCertificateRequest setSignCert(String signCert) {
        this.signCert = signCert;
        return this;
    }
    public String getSignCert() {
        return this.signCert;
    }

    public UploadUserCertificateRequest setSignPrivateKey(String signPrivateKey) {
        this.signPrivateKey = signPrivateKey;
        return this;
    }
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

}
