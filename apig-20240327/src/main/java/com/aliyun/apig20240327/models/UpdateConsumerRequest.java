// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateConsumerRequest extends TeaModel {
    /**
     * <p>The list of AK/SK identity authentication configurations.</p>
     */
    @NameInMap("akSkIdentityConfigs")
    public java.util.List<AkSkIdentityConfig> akSkIdentityConfigs;

    /**
     * <p>The API key identity authentication configuration.</p>
     */
    @NameInMap("apikeyIdentityConfig")
    public ApiKeyIdentityConfig apikeyIdentityConfig;

    /**
     * <p>Specifies whether to clear the expiration time and restore permanent validity. If this parameter is set to true, expireAt cannot be specified at the same time. The default value is false, which indicates that the expiration time is not cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("clearExpireAt")
    public Boolean clearExpireAt;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test consumer</p>
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
     * <p>Specifies whether to enable the consumer after renewal. This parameter can be set to true only when renew=true. The default value is false, which retains the current enabled or disabled state and does not implicitly enable a manually disabled consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableAfterRenewal")
    public Boolean enableAfterRenewal;

    /**
     * <p>The expiration time of the consumer, in UTC UNIX seconds. It must be a positive integer and later than the current time. If this parameter is not specified, the original value is retained. This parameter cannot be set at the same time as clearExpireAt=true. If renew=true, the value must be later than the original unexpired expiration time. If the configuration is saved but fails to be delivered, a retry with the original expiration time is allowed, but shortening the expiration time is still prohibited.</p>
     * 
     * <strong>example:</strong>
     * <p>1893456000</p>
     */
    @NameInMap("expireAt")
    public Long expireAt;

    /**
     * <p>The JWT identity authentication configuration.</p>
     */
    @NameInMap("jwtIdentityConfig")
    public JwtIdentityConfig jwtIdentityConfig;

    /**
     * <p>Specifies whether to only renew the consumer. If this parameter is set to true, only the validity period is updated and the consumer is explicitly enabled at the same time. The latest credentials, description, and authorizations on the server are retained. You must set expireAt or clearExpireAt=true, and you cannot specify identity configurations or description. The default value is false, which retains the original consumer update semantics.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("renew")
    public Boolean renew;

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

    public UpdateConsumerRequest setClearExpireAt(Boolean clearExpireAt) {
        this.clearExpireAt = clearExpireAt;
        return this;
    }
    public Boolean getClearExpireAt() {
        return this.clearExpireAt;
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

    public UpdateConsumerRequest setEnableAfterRenewal(Boolean enableAfterRenewal) {
        this.enableAfterRenewal = enableAfterRenewal;
        return this;
    }
    public Boolean getEnableAfterRenewal() {
        return this.enableAfterRenewal;
    }

    public UpdateConsumerRequest setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public Long getExpireAt() {
        return this.expireAt;
    }

    public UpdateConsumerRequest setJwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
        this.jwtIdentityConfig = jwtIdentityConfig;
        return this;
    }
    public JwtIdentityConfig getJwtIdentityConfig() {
        return this.jwtIdentityConfig;
    }

    public UpdateConsumerRequest setRenew(Boolean renew) {
        this.renew = renew;
        return this;
    }
    public Boolean getRenew() {
        return this.renew;
    }

}
