// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>The CA certificate identifier. This parameter is optional for Dedicated+HTTPS, not allowed for Serverless, and not verified for Dedicated+HTTP.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("caCertIdentifier")
    public String caCertIdentifier;

    /**
     * <p>The certificate identifier. This parameter is required for Dedicated+HTTPS and must pass the submittable verification. This parameter is not allowed for Serverless and is not verified for Dedicated+HTTP.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("certIdentifier")
    public String certIdentifier;

    /**
     * <p>The client CA certificate. This parameter is conditionally required for Dedicated+HTTPS when MTLSEnabled is set to true. This parameter is not allowed for Serverless and is not verified for Dedicated+HTTP.</p>
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
     * <p>The scope of the domain name. Valid values: Dedicated (dedicated gateway domain name) and Serverless (serverless gateway domain name). Default value: Dedicated.</p>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("domainScope")
    public String domainScope;

    /**
     * <p>Specifies whether to enable forced HTTPS redirection when the HTTPS protocol type is set. This parameter is required for Serverless and Dedicated+HTTPS, and is not verified for Dedicated+HTTP.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceHttps")
    public Boolean forceHttps;

    /**
     * <p>The gateway type. This parameter is optional. If not specified, the default value is API.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The HTTP/2 settings. Valid values: GlobalConfig (follows the global configuration), Open (enabled), and Close (disabled). Default value: GlobalConfig. This setting is supported only for HTTPS domain names in the Dedicated scope.</p>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("http2Option")
    public String http2Option;

    /**
     * <p>Specifies whether to enable mTLS mutual authentication. This parameter is optional for Dedicated+HTTPS. If this parameter is set to true, ClientCACert is required. This parameter is not allowed for Serverless and is not verified for Dedicated+HTTP.</p>
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
     * <p>The TLS cipher suite configuration, which includes the configuration type, cipher suite name, and supported TLS versions. This configuration is supported only for HTTPS domain names in the Dedicated scope.</p>
     */
    @NameInMap("tlsCipherSuitesConfig")
    public TlsCipherSuitesConfig tlsCipherSuitesConfig;

    /**
     * <p>The maximum TLS protocol version. This parameter is optional for Dedicated+HTTPS. If not specified, it is derived from TlsMin and must be greater than or equal to TlsMin. This parameter is not allowed for Serverless.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS1.3</p>
     */
    @NameInMap("tlsMax")
    public String tlsMax;

    /**
     * <p>The minimum TLS protocol version. This parameter is optional for Dedicated+HTTPS. If not specified, the default value is TLS 1.0. TLS 1.0 to 1.3 are allowed, compatible with TLSv1.x. This parameter is not allowed for Serverless.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS1.0</p>
     */
    @NameInMap("tlsMin")
    public String tlsMin;

    /**
     * <p>The idempotency token. The caller generates a globally unique value (UUID is recommended) with a length of up to 64 characters. Within about 24 hours after the first request succeeds, a repeated request with the same ClientToken and identical request parameters directly returns the domainId created in the first request without creating the domain name again. If the same ClientToken is used but the request parameters are different, IdempotentParameterMismatch is returned. If the first request is still being processed, IdempotentProcessing is returned. If this parameter is not specified, idempotency control is not enabled, and the behavior is consistent with the existing version.</p>
     * 
     * <strong>example:</strong>
     * <p>5f7a2c1e-9b3d-4e8f-a1c6-0d2b8e4f7a13</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. If this parameter is set to true, all synchronous validations consistent with actual creation (including idempotency checks for existing test domain names) are executed, but no domain name is created and no side effects are generated. If this parameter is not specified or is set to false, the behavior is consistent with the existing version.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

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

    public CreateDomainRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDomainRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
