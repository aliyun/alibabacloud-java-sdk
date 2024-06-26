// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAccessTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessTokenLifetime")
    public String accessTokenLifetime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RefreshTokenLifetime")
    public String refreshTokenLifetime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static CreateAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessTokenRequest self = new CreateAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessTokenRequest setAccessTokenLifetime(String accessTokenLifetime) {
        this.accessTokenLifetime = accessTokenLifetime;
        return this;
    }
    public String getAccessTokenLifetime() {
        return this.accessTokenLifetime;
    }

    public CreateAccessTokenRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateAccessTokenRequest setRefreshTokenLifetime(String refreshTokenLifetime) {
        this.refreshTokenLifetime = refreshTokenLifetime;
        return this;
    }
    public String getRefreshTokenLifetime() {
        return this.refreshTokenLifetime;
    }

    public CreateAccessTokenRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
