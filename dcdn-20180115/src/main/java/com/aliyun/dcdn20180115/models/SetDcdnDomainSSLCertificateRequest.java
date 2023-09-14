// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainSSLCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate. This parameter takes effect only when **CertType** is set to **cas**.</p>
     */
    @NameInMap("CertId")
    public Long certId;

    /**
     * <p>The name of the SSL certificate. You can specify only one certificate name.</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The region of the SSL certificate. This parameter takes effect only when **CertType** is set to **cas**. Default value: **cn-hangzhou**. Valid values: **cn-hangzhou** and **ap-southeast-1**.</p>
     */
    @NameInMap("CertRegion")
    public String certRegion;

    /**
     * <p>The type of the certificate. Valid values:</p>
     * <br>
     * <p>*   **upload**: a user-uploaded SSL certificate.</p>
     * <p>*   **cas**: a certificate that is acquired through Certificate Management Service.</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The domain name that is secured by the SSL certificate.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Env")
    public String env;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private key. Specify the private key only if you want to enable the SSL certificate.</p>
     */
    @NameInMap("SSLPri")
    public String SSLPri;

    /**
     * <p>Specifies whether to enable the SSL certificate. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off**</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    /**
     * <p>The content of the SSL certificate. Specify the content of the SSL certificate only if you want to enable the SSL certificate.</p>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetDcdnDomainSSLCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainSSLCertificateRequest self = new SetDcdnDomainSSLCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainSSLCertificateRequest setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public SetDcdnDomainSSLCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public SetDcdnDomainSSLCertificateRequest setCertRegion(String certRegion) {
        this.certRegion = certRegion;
        return this;
    }
    public String getCertRegion() {
        return this.certRegion;
    }

    public SetDcdnDomainSSLCertificateRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public SetDcdnDomainSSLCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDcdnDomainSSLCertificateRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public SetDcdnDomainSSLCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetDcdnDomainSSLCertificateRequest setSSLPri(String SSLPri) {
        this.SSLPri = SSLPri;
        return this;
    }
    public String getSSLPri() {
        return this.SSLPri;
    }

    public SetDcdnDomainSSLCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public SetDcdnDomainSSLCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public SetDcdnDomainSSLCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
