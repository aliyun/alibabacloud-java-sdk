// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApiProductsAuthoritiesShrinkRequest extends TeaModel {
    /**
     * <p>The API products.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiProductIds")
    public String apiProductIdsShrink;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111385984</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>授权有效时间的截止时间，请设置格林尼治标准时间(GMT), 如果为空，即为授权永久有效。</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-12T03:07:37Z</p>
     */
    @NameInMap("AuthValidTime")
    public String authValidTime;

    /**
     * <p>The authorization description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
