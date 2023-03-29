// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainSMCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the SM certificate that you want to configure.</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The accelerated domain name for which you want to configure the SM certificate.</p>
     * <br>
     * <p>>  The domain name uses HTTPS secure acceleration.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable the SSL certificate. Valid values:</p>
     * <br>
     * <p>*   **on**: enables the SSL certificate.</p>
     * <p>*   **off**: disables the SSL certificate.</p>
     */
    @NameInMap("SSLProtocol")
    public String SSLProtocol;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetCdnDomainSMCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainSMCertificateRequest self = new SetCdnDomainSMCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainSMCertificateRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public SetCdnDomainSMCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCdnDomainSMCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCdnDomainSMCertificateRequest setSSLProtocol(String SSLProtocol) {
        this.SSLProtocol = SSLProtocol;
        return this;
    }
    public String getSSLProtocol() {
        return this.SSLProtocol;
    }

    public SetCdnDomainSMCertificateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
