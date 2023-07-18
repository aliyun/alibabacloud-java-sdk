// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveCdnDomainConfigRequest extends TeaModel {
    @NameInMap("AuthConfig")
    public String authConfig;

    @NameInMap("CorsConfig")
    public String corsConfig;

    @NameInMap("IpConfig")
    public String ipConfig;

    @NameInMap("RefererConfig")
    public String refererConfig;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("UaConfig")
    public String uaConfig;

    public static SaveCdnDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCdnDomainConfigRequest self = new SaveCdnDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveCdnDomainConfigRequest setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public SaveCdnDomainConfigRequest setCorsConfig(String corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }
    public String getCorsConfig() {
        return this.corsConfig;
    }

    public SaveCdnDomainConfigRequest setIpConfig(String ipConfig) {
        this.ipConfig = ipConfig;
        return this;
    }
    public String getIpConfig() {
        return this.ipConfig;
    }

    public SaveCdnDomainConfigRequest setRefererConfig(String refererConfig) {
        this.refererConfig = refererConfig;
        return this;
    }
    public String getRefererConfig() {
        return this.refererConfig;
    }

    public SaveCdnDomainConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SaveCdnDomainConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveCdnDomainConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SaveCdnDomainConfigRequest setUaConfig(String uaConfig) {
        this.uaConfig = uaConfig;
        return this;
    }
    public String getUaConfig() {
        return this.uaConfig;
    }

}
