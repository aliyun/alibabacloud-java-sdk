// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddDRMCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("ServCert")
    public String servCert;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("Passphrase")
    public String passphrase;

    @NameInMap("Ask")
    public String ask;

    @NameInMap("Description")
    public String description;

    public static AddDRMCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDRMCertificateRequest self = new AddDRMCertificateRequest();
        return TeaModel.build(map, self);
    }

    public AddDRMCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddDRMCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AddDRMCertificateRequest setServCert(String servCert) {
        this.servCert = servCert;
        return this;
    }
    public String getServCert() {
        return this.servCert;
    }

    public AddDRMCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public AddDRMCertificateRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }
    public String getPassphrase() {
        return this.passphrase;
    }

    public AddDRMCertificateRequest setAsk(String ask) {
        this.ask = ask;
        return this;
    }
    public String getAsk() {
        return this.ask;
    }

    public AddDRMCertificateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
