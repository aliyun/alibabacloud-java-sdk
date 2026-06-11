// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerRequest extends TeaModel {
    /**
     * <p>A list of AK/SK identity configurations.</p>
     */
    @NameInMap("akSkIdentityConfigs")
    public java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

    /**
     * <p>The identity configuration for API key authentication.</p>
     */
    @NameInMap("apikeyIdentityConfig")
    public ApiKeyIdentityConfig apikeyIdentityConfig;

    /**
     * <p>The consumer description.</p>
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
     * <p>The gateway type. Valid values:</p>
     * <ul>
     * <li><p>API: For a cloud-native API gateway.</p>
     * </li>
     * <li><p>AI: For an AI gateway.</p>
     * </li>
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
     * <p>The consumer name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

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

}
