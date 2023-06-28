// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CertConfig extends TeaModel {
    @NameInMap("certName")
    public String certName;

    @NameInMap("certificate")
    public String certificate;

    @NameInMap("privateKey")
    public String privateKey;

    public static CertConfig build(java.util.Map<String, ?> map) throws Exception {
        CertConfig self = new CertConfig();
        return TeaModel.build(map, self);
    }

    public CertConfig setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CertConfig setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CertConfig setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

}
