// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerRequest extends TeaModel {
    /**
     * <p>The list of AK/SK identity configurations.</p>
     */
    @NameInMap("akSkIdentityConfigs")
    public java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

    /**
     * <p>The identity configuration for API key authentication.</p>
     */
    @NameInMap("apikeyIdentityConfig")
    public ApiKeyIdentityConfig apikeyIdentityConfig;

    /**
     * <p>The description of the consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable the consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The expiration time of the consumer. The value must be a positive integer that represents a UNIX timestamp in seconds and is later than the current time. If this parameter is left empty, the consumer never expires. The API key, JWT, and HMAC of the same consumer share this expiration time. Milliseconds are not automatically converted to seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1893456000</p>
     */
    @NameInMap("expireAt")
    public Long expireAt;

    /**
     * <p>The gateway type. Valid values:</p>
     * <ul>
     * <li>API: the consumer of a cloud-native API gateway.</li>
     * <li>AI: the consumer of an AI gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The JWT identity configuration.</p>
     */
    @NameInMap("jwtIdentityConfig")
    public JwtIdentityConfig jwtIdentityConfig;

    /**
     * <p>The name of the consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The idempotence identity. You can invoke the API with a globally unique value (a UUID is recommended) that does not exceed 64 characters in length. If you invoke a duplicate request with the same ClientToken and identical request parameters within 24 hours after the first request succeeds, the system directly returns the consumer ID created by the first request without creating a new consumer. If you invoke a request with the same ClientToken but different request parameters, the system returns IdempotentParameterMismatch. If the first request is still being processed, the system returns IdempotentProcessing. If this parameter is left empty, idempotence control is disabled, and the behavior is the same as that of the existing version.</p>
     * 
     * <strong>example:</strong>
     * <p>5f7a2c1e-9b3d-4e8f-a1c6-0d2b8e4f7a13</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. If you set this parameter to true, the system performs the same parameter, permission, IAM, resource policy, resource existence, and business rule checks as a real creation request, but does not create the consumer, write data to the database, create or delete a SecretRef, or generate audit logs. If this parameter is left empty or set to false, the behavior is the same as that of the previous version.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerRequest self = new CreateConsumerRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerRequest setAkSkIdentityConfigs(java.util.List<AkSkIdentityConfig> akSkIdentityConfigs) {
        this.akSkIdentityConfigs = akSkIdentityConfigs;
        return this;
    }
    public java.util.List<AkSkIdentityConfig> getAkSkIdentityConfigs() {
        return this.akSkIdentityConfigs;
    }

    public CreateConsumerRequest setApikeyIdentityConfig(ApiKeyIdentityConfig apikeyIdentityConfig) {
        this.apikeyIdentityConfig = apikeyIdentityConfig;
        return this;
    }
    public ApiKeyIdentityConfig getApikeyIdentityConfig() {
        return this.apikeyIdentityConfig;
    }

    public CreateConsumerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConsumerRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateConsumerRequest setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public Long getExpireAt() {
        return this.expireAt;
    }

    public CreateConsumerRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreateConsumerRequest setJwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
        this.jwtIdentityConfig = jwtIdentityConfig;
        return this;
    }
    public JwtIdentityConfig getJwtIdentityConfig() {
        return this.jwtIdentityConfig;
    }

    public CreateConsumerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateConsumerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConsumerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
