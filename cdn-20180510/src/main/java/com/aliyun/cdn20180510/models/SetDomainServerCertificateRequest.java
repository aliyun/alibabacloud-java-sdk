// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetDomainServerCertificateRequest extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ForceSet")
    public String forceSet;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerCertificate")
    public String serverCertificate;

    @NameInMap("ServerCertificateStatus")
    public String serverCertificateStatus;

    public static SetDomainServerCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainServerCertificateRequest self = new SetDomainServerCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainServerCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetDomainServerCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public SetDomainServerCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDomainServerCertificateRequest setForceSet(String forceSet) {
        this.forceSet = forceSet;
        return this;
    }
    public String getForceSet() {
        return this.forceSet;
    }

    public SetDomainServerCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDomainServerCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public SetDomainServerCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetDomainServerCertificateRequest setServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    public SetDomainServerCertificateRequest setServerCertificateStatus(String serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus;
        return this;
    }
    public String getServerCertificateStatus() {
        return this.serverCertificateStatus;
    }

}
