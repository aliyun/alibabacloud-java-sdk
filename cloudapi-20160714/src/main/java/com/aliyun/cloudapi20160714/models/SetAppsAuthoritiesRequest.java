// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAppsAuthoritiesRequest extends TeaModel {
    /**
     * <p>The API ID for the specified operation. Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>Queries weather based on the region name</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>*   This operation is intended for API providers and callers.</p>
     * <p>*   API providers can authorize any apps to call their APIs.</p>
     * <p>*   API callers can authorize their own apps to call the APIs that they have purchased.</p>
     */
    @NameInMap("AuthValidTime")
    public String authValidTime;

    /**
     * <p>The time (UTC) when the authorization expires. If this parameter is empty, the authorization does not expire.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The description of the authorization.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static SetAppsAuthoritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppsAuthoritiesRequest self = new SetAppsAuthoritiesRequest();
        return TeaModel.build(map, self);
    }

    public SetAppsAuthoritiesRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public SetAppsAuthoritiesRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public SetAppsAuthoritiesRequest setAuthValidTime(String authValidTime) {
        this.authValidTime = authValidTime;
        return this;
    }
    public String getAuthValidTime() {
        return this.authValidTime;
    }

    public SetAppsAuthoritiesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetAppsAuthoritiesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetAppsAuthoritiesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetAppsAuthoritiesRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
