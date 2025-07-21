// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateConsumerRequest extends TeaModel {
    @NameInMap("akSkIdentityConfigs")
    public java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

    @NameInMap("apikeyIdentityConfig")
    public ApiKeyIdentityConfig apikeyIdentityConfig;

    /**
     * <strong>example:</strong>
     * <p>consumer for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    @NameInMap("jwtIdentityConfig")
    public JwtIdentityConfig jwtIdentityConfig;

    /**
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
