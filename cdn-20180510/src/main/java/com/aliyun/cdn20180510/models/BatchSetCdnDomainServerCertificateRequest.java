// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainServerCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SSLPri")
    public String SSLPri;

    @NameInMap("Region")
    public String region;

    @NameInMap("ForceSet")
    public String forceSet;

    public static BatchSetCdnDomainServerCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetCdnDomainServerCertificateRequest self = new BatchSetCdnDomainServerCertificateRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetCdnDomainServerCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSetCdnDomainServerCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchSetCdnDomainServerCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchSetCdnDomainServerCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public BatchSetCdnDomainServerCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public BatchSetCdnDomainServerCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public BatchSetCdnDomainServerCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public BatchSetCdnDomainServerCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public BatchSetCdnDomainServerCertificateRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public BatchSetCdnDomainServerCertificateRequest setForceSet(String forceSet) {
        this.forceSet = forceSet;
        return this;
    }
    public String getForceSet() {
        return this.forceSet;
    }

}
