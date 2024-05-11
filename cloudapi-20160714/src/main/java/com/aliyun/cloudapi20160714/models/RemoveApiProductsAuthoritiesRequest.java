// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveApiProductsAuthoritiesRequest extends TeaModel {
    /**
     * <p>The API products.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiProductIds")
    public java.util.List<String> apiProductIds;

    /**
     * <p>The application ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RemoveApiProductsAuthoritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApiProductsAuthoritiesRequest self = new RemoveApiProductsAuthoritiesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApiProductsAuthoritiesRequest setApiProductIds(java.util.List<String> apiProductIds) {
        this.apiProductIds = apiProductIds;
        return this;
    }
    public java.util.List<String> getApiProductIds() {
        return this.apiProductIds;
    }

    public RemoveApiProductsAuthoritiesRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RemoveApiProductsAuthoritiesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
