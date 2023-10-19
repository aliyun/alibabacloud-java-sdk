// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApiProductsAuthoritiesRequest extends TeaModel {
    @NameInMap("ApiProductIds")
    public java.util.List<String> apiProductIds;

    @NameInMap("AppId")
    public Long appId;

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
