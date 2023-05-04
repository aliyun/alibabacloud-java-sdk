// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainSSLCertificateRequest extends TeaModel {
    @NameInMap("CertId")
    public Long certId;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("CertRegion")
    public String certRegion;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SSLPri")
    public String SSLPri;

    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetCdnDomainSSLCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainSSLCertificateRequest self = new SetCdnDomainSSLCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainSSLCertificateRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public SetCdnDomainSSLCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetCdnDomainSSLCertificateRequest setCertRegion(String certRegion) {
        this.certRegion = certRegion;
        return this;
    }
    public String getCertRegion() {
        return this.certRegion;
    }

    public SetCdnDomainSSLCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public SetCdnDomainSSLCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCdnDomainSSLCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCdnDomainSSLCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public SetCdnDomainSSLCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public SetCdnDomainSSLCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public SetCdnDomainSSLCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
