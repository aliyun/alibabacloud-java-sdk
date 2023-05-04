// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetDomainServerCertificateRequest extends TeaModel {
    /**
     * <p>Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate that uses the same name.</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The private key. Specify the private key only if you want to enable the SSL certificate.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to enable the SSL certificate. Valid values:</p>
     * <br>
     * <p>*   **on**: enables the SSL certificate.</p>
     * <p>*   **off**: disables the SSL certificate. This is the default value.</p>
     */
    @NameInMap("ForceSet")
    public String forceSet;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate that uses the same name.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The type of the SSL certificate. Valid values:</p>
     * <br>
     * <p>*   **upload**: a user-uploaded SSL certificate.</p>
     * <p>*   **cas**: an SSL certificate that is issued by Alibaba Cloud SSL Certificates Service.</p>
     * <p>*   **free**: a free SSL certificate.</p>
     * <br>
     * <p>>  If this parameter is set to **cas**, the **PrivateKey** parameter is optional.</p>
     */
    @NameInMap("ServerCertificate")
    public String serverCertificate;

    /**
     * <p>The name of the SSL certificate. You can specify only one name.</p>
     */
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
