// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>The CA certificate identifier. This parameter is optional for Dedicated with HTTPS. This parameter is not allowed for Serverless and is not validated for Dedicated with HTTP.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("caCertIdentifier")
    public String caCertIdentifier;

    /**
     * <p>The certificate identifier. This parameter is required for Dedicated with HTTPS and must pass validation. This parameter is not allowed for Serverless and is not validated for Dedicated with HTTP.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("certIdentifier")
    public String certIdentifier;

    /**
     * <p>The client CA certificate. This parameter is conditionally required for Dedicated with HTTPS (when MTLSEnabled is set to true). This parameter is not allowed for Serverless and is not validated for Dedicated with HTTP.</p>
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
     * <p>The domain name scope. Valid values:</p>
     * <ul>
     * <li>Dedicated: dedicated gateway domain name.</li>
     * <li>Serverless: Serverless gateway domain name.</li>
     * </ul>
     * <p>Default value: Dedicated.</p>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("domainScope")
    public String domainScope;

    /**
     * <p>Specifies whether to enable forced HTTPS redirect for the HTTPS protocol type. This parameter is required for Serverless and for Dedicated with HTTPS. This parameter is not validated for Dedicated with HTTP.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceHttps")
    public Boolean forceHttps;

    /**
     * <p>The gateway type. If not specified, the default value is API.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The HTTP/2 setting. Valid values:</p>
     * <ul>
     * <li>GlobalConfig: follows the global configuration.</li>
     * <li>Open: enabled.</li>
     * <li>Close: disabled.</li>
     * </ul>
     * <p>Default value: GlobalConfig. This setting is supported only for HTTPS domain names in the Dedicated scope.</p>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("http2Option")
    public String http2Option;

    /**
     * <p>Specifies whether to enable mTLS mutual authentication. This parameter is optional for Dedicated with HTTPS. When set to true, ClientCACert is required. This parameter is not allowed for Serverless.</p>
     */
    @NameInMap("mTLSEnabled")
    public Boolean mTLSEnabled;

    /**
     * <p>The domain name. The name must be 1 to 128 characters in length, such as abc.com.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc.com</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The protocol type used by the domain name. Valid values: HTTP and HTTPS. This parameter is required for the Dedicated scope and is not allowed for the Serverless scope.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/151181.html">resource group ID</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzhiv7derfweq</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The TLS cipher suite configuration, including the configuration type, cipher suite names, and supported TLS versions. This configuration is supported only for HTTPS domain names in the Dedicated scope.</p>
     */
    @NameInMap("tlsCipherSuitesConfig")
    public TlsCipherSuitesConfig tlsCipherSuitesConfig;

    /**
     * <p>The maximum TLS protocol version. This parameter is optional for Dedicated with HTTPS. If not specified, the value is derived from TlsMin. The value must be greater than or equal to TlsMin. This parameter is not allowed for Serverless.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS1.3</p>
     */
    @NameInMap("tlsMax")
    public String tlsMax;

    /**
     * <p>The minimum TLS protocol version. This parameter is optional for Dedicated with HTTPS. If not specified, the default value is TLS 1.0. Valid values: TLS 1.0 to TLS 1.3, compatible with TLSv1.x. This parameter is not allowed for Serverless.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS1.0</p>
     */
    @NameInMap("tlsMin")
    public String tlsMin;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setCaCertIdentifier(String caCertIdentifier) {
        this.caCertIdentifier = caCertIdentifier;
        return this;
    }
    public String getCaCertIdentifier() {
        return this.caCertIdentifier;
    }

    public CreateDomainRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public CreateDomainRequest setClientCACert(String clientCACert) {
        this.clientCACert = clientCACert;
        return this;
    }
    public String getClientCACert() {
        return this.clientCACert;
    }

    public CreateDomainRequest setDomainScope(String domainScope) {
        this.domainScope = domainScope;
        return this;
    }
    public String getDomainScope() {
        return this.domainScope;
    }

    public CreateDomainRequest setForceHttps(Boolean forceHttps) {
        this.forceHttps = forceHttps;
        return this;
    }
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    public CreateDomainRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreateDomainRequest setHttp2Option(String http2Option) {
        this.http2Option = http2Option;
        return this;
    }
    public String getHttp2Option() {
        return this.http2Option;
    }

    public CreateDomainRequest setMTLSEnabled(Boolean mTLSEnabled) {
        this.mTLSEnabled = mTLSEnabled;
        return this;
    }
    public Boolean getMTLSEnabled() {
        return this.mTLSEnabled;
    }

    public CreateDomainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDomainRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateDomainRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDomainRequest setTlsCipherSuitesConfig(TlsCipherSuitesConfig tlsCipherSuitesConfig) {
        this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
        return this;
    }
    public TlsCipherSuitesConfig getTlsCipherSuitesConfig() {
        return this.tlsCipherSuitesConfig;
    }

    public CreateDomainRequest setTlsMax(String tlsMax) {
        this.tlsMax = tlsMax;
        return this;
    }
    public String getTlsMax() {
        return this.tlsMax;
    }

    public CreateDomainRequest setTlsMin(String tlsMin) {
        this.tlsMin = tlsMin;
        return this;
    }
    public String getTlsMin() {
        return this.tlsMin;
    }

}
