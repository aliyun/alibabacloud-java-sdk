// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApiProductsAuthoritiesShrinkRequest extends TeaModel {
    @NameInMap("ApiProductIds")
    public String apiProductIdsShrink;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AuthValidTime")
    public String authValidTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetApiProductsAuthoritiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApiProductsAuthoritiesShrinkRequest self = new SetApiProductsAuthoritiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetApiProductsAuthoritiesShrinkRequest setApiProductIdsShrink(String apiProductIdsShrink) {
        this.apiProductIdsShrink = apiProductIdsShrink;
        return this;
    }
    public String getApiProductIdsShrink() {
        return this.apiProductIdsShrink;
    }

    public SetApiProductsAuthoritiesShrinkRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public SetApiProductsAuthoritiesShrinkRequest setAuthValidTime(String authValidTime) {
        this.authValidTime = authValidTime;
        return this;
    }
    public String getAuthValidTime() {
        return this.authValidTime;
    }

    public SetApiProductsAuthoritiesShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetApiProductsAuthoritiesShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
