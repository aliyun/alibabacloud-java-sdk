// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApiProductsAuthoritiesRequest extends TeaModel {
    /**
     * <p>The API products.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiProductIds")
    public java.util.List<String> apiProductIds;

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

    public static SetApiProductsAuthoritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApiProductsAuthoritiesRequest self = new SetApiProductsAuthoritiesRequest();
        return TeaModel.build(map, self);
    }

    public SetApiProductsAuthoritiesRequest setApiProductIds(java.util.List<String> apiProductIds) {
        this.apiProductIds = apiProductIds;
        return this;
    }
    public java.util.List<String> getApiProductIds() {
        return this.apiProductIds;
    }

    public SetApiProductsAuthoritiesRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public SetApiProductsAuthoritiesRequest setAuthValidTime(String authValidTime) {
        this.authValidTime = authValidTime;
        return this;
    }
    public String getAuthValidTime() {
        return this.authValidTime;
    }

    public SetApiProductsAuthoritiesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetApiProductsAuthoritiesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
