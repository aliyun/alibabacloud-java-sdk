// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateConsumerRequest extends TeaModel {
    @NameInMap("akSkIdentityConfigs")
    public java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

    @NameInMap("apikeyIdentityConfig")
    public ApiKeyIdentityConfig apikeyIdentityConfig;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("jwtIdentityConfig")
    public JwtIdentityConfig jwtIdentityConfig;

    public static UpdateConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerRequest self = new UpdateConsumerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerRequest setAkSkIdentityConfigs(java.util.List<AkSkIdentityConfig> akSkIdentityConfigs) {
        this.akSkIdentityConfigs = akSkIdentityConfigs;
        return this;
    }
    public java.util.List<AkSkIdentityConfig> getAkSkIdentityConfigs() {
        return this.akSkIdentityConfigs;
    }

    public UpdateConsumerRequest setApikeyIdentityConfig(ApiKeyIdentityConfig apikeyIdentityConfig) {
        this.apikeyIdentityConfig = apikeyIdentityConfig;
        return this;
    }
    public ApiKeyIdentityConfig getApikeyIdentityConfig() {
        return this.apikeyIdentityConfig;
    }

    public UpdateConsumerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConsumerRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateConsumerRequest setJwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
        this.jwtIdentityConfig = jwtIdentityConfig;
        return this;
    }
    public JwtIdentityConfig getJwtIdentityConfig() {
        return this.jwtIdentityConfig;
    }

}
