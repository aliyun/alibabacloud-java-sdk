// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CertConfig extends TeaModel {
    // 证书名称
    @NameInMap("certName")
    public String certName;

    // 证书，如果是证书链则依次填写多个证书
    @NameInMap("certificate")
    public String certificate;

    // 私钥
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
