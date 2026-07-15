// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DomainInfo extends TeaModel {
    /**
     * <p>The SSL Certificates Service certificate identity.</p>
     * 
     * <strong>example:</strong>
     * <p>235556-cn-hangzhou</p>
     */
    @NameInMap("certIdentifier")
    public String certIdentifier;

    /**
     * <p>The client CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIFBTCCAu2gAwIBAgIUORLpYPGSFD1YOP6PMbE7Wd/mpTQwDQYJKoZIhvcNAQEL
     * BQAwE************************************************2VwVOJ2gqX3
     * YuGaxvIbDy0iQJ1GMerPRyzJTeVEtdIKT29u0PdFRr4KZWom35qX7G4=
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("clientCACert")
    public String clientCACert;

    /**
     * <p>The source from which the domain name was created.</p>
     * 
     * <strong>example:</strong>
     * <p>Console</p>
     */
    @NameInMap("createFrom")
    public String createFrom;

    /**
     * <p>The creation timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1719386834548</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The domain name ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-cq1lthllhtgja4dk54eg</p>
     */
    @NameInMap("domainId")
    public String domainId;

    /**
     * <p>domainScope</p>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("domainScope")
    public String domainScope;

    /**
     * <p>Specifies whether to enable forced HTTPS redirect when the HTTPS protocol type is configured.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceHttps")
    public Boolean forceHttps;

    /**
     * <p>Specifies whether to enable mTLS mutual authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("mTLSEnabled")
    public Boolean mTLSEnabled;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>abc.com</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The protocol type supported by the domain name.</p>
     * <ul>
     * <li>HTTP: Only HTTP is supported.</li>
     * <li>HTTPS: Only HTTPS is supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The domain name status.</p>
     * 
     * <strong>example:</strong>
     * <p>Published</p>
     */
    @NameInMap("status")
    public String status;

    @NameInMap("tlsMax")
    public String tlsMax;

    @NameInMap("tlsMin")
    public String tlsMin;

    /**
     * <p>The update timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1719386834548</p>
     */
    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static DomainInfo build(java.util.Map<String, ?> map) throws Exception {
        DomainInfo self = new DomainInfo();
        return TeaModel.build(map, self);
    }

    public DomainInfo setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DomainInfo setClientCACert(String clientCACert) {
        this.clientCACert = clientCACert;
        return this;
    }
    public String getClientCACert() {
        return this.clientCACert;
    }

    public DomainInfo setCreateFrom(String createFrom) {
        this.createFrom = createFrom;
        return this;
    }
    public String getCreateFrom() {
        return this.createFrom;
    }

    public DomainInfo setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DomainInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DomainInfo setDomainScope(String domainScope) {
        this.domainScope = domainScope;
        return this;
    }
    public String getDomainScope() {
        return this.domainScope;
    }

    public DomainInfo setForceHttps(Boolean forceHttps) {
        this.forceHttps = forceHttps;
        return this;
    }
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    public DomainInfo setMTLSEnabled(Boolean mTLSEnabled) {
        this.mTLSEnabled = mTLSEnabled;
        return this;
    }
    public Boolean getMTLSEnabled() {
        return this.mTLSEnabled;
    }

    public DomainInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DomainInfo setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DomainInfo setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DomainInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DomainInfo setTlsMax(String tlsMax) {
        this.tlsMax = tlsMax;
        return this;
    }
    public String getTlsMax() {
        return this.tlsMax;
    }

    public DomainInfo setTlsMin(String tlsMin) {
        this.tlsMin = tlsMin;
        return this;
    }
    public String getTlsMin() {
        return this.tlsMin;
    }

    public DomainInfo setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

}
