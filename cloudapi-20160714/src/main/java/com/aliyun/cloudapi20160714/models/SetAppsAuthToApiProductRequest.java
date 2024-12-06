// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAppsAuthToApiProductRequest extends TeaModel {
    /**
     * <p>The ID of the API product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>117b7a64a8b3f064eaa4a47ac62aac5e</p>
     */
    @NameInMap("ApiProductId")
    public String apiProductId;

    /**
     * <p>The IDs of the applications that you want to authorize.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppIds")
    public java.util.List<Long> appIds;

    /**
     * <p>The time (UTC) when the authorization expires. If this parameter is empty, the authorization does not expire.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-31T08:15:39Z</p>
     */
    @NameInMap("AuthValidTime")
    public String authValidTime;

    /**
     * <p>The description of the authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetAppsAuthToApiProductRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppsAuthToApiProductRequest self = new SetAppsAuthToApiProductRequest();
        return TeaModel.build(map, self);
    }

    public SetAppsAuthToApiProductRequest setApiProductId(String apiProductId) {
        this.apiProductId = apiProductId;
        return this;
    }
    public String getApiProductId() {
        return this.apiProductId;
    }

    public SetAppsAuthToApiProductRequest setAppIds(java.util.List<Long> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<Long> getAppIds() {
        return this.appIds;
    }

    public SetAppsAuthToApiProductRequest setAuthValidTime(String authValidTime) {
        this.authValidTime = authValidTime;
        return this;
    }
    public String getAuthValidTime() {
        return this.authValidTime;
    }

    public SetAppsAuthToApiProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetAppsAuthToApiProductRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
