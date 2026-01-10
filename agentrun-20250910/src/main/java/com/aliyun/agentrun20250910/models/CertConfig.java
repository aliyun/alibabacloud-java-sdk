// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CertConfig extends TeaModel {
    /**
     * <p>证书的名称。支持字母、数字、下划线（_）和短划线（-），不能以数字和短划线（-）开头。长度范围为 1~128 个字符。</p>
     * 
     * <strong>example:</strong>
     * <p>my-cert</p>
     */
    @NameInMap("certName")
    public String certName;

    /**
     * <p>证书，如果是证书链，则需要依次填写多个证书。</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\nxxxxx\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("certificate")
    public String certificate;

    /**
     * <p>私钥。</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY-----\nxxxxx\n-----END RSA PRIVATE KEY-----</p>
     */
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
