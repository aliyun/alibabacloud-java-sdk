// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveApiProductsAuthoritiesShrinkRequest extends TeaModel {
    @NameInMap("ApiProductIds")
    public String apiProductIdsShrink;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RemoveApiProductsAuthoritiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApiProductsAuthoritiesShrinkRequest self = new RemoveApiProductsAuthoritiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApiProductsAuthoritiesShrinkRequest setApiProductIdsShrink(String apiProductIdsShrink) {
        this.apiProductIdsShrink = apiProductIdsShrink;
        return this;
    }
    public String getApiProductIdsShrink() {
        return this.apiProductIdsShrink;
    }

    public RemoveApiProductsAuthoritiesShrinkRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RemoveApiProductsAuthoritiesShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
