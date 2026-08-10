// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ApiKey extends TeaModel {
    /**
     * <p>The unique identifier of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>34f6a4c4-499f-4bbd-baa0-0e699f53abcd</p>
     */
    @NameInMap("apiKeyID")
    public String apiKeyID;

    /**
     * <p>The masked display value of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>e2b_xxxx****xxxx</p>
     */
    @NameInMap("apiKeyMask")
    public String apiKeyMask;

    /**
     * <p>The name of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The value of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>e2b_xxxxxx79cd777ef8exxxxxx4ad6f1b567cxxxxxx</p>
     */
    @NameInMap("apiKeyValue")
    public String apiKeyValue;

    /**
     * <p>The time when the API key was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-13T08:27:20Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-13T08:27:20Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    @NameInMap("ipWhitelist")
    public java.util.List<IPConfig> ipWhitelist;

    /**
     * <p>The time when the API key was last used.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-14T08:27:20Z</p>
     */
    @NameInMap("lastUsedTime")
    public String lastUsedTime;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwxqyrgwabcd</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    @NameInMap("source")
    public String source;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>active</li>
     * <li>inactive</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The name of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>Development Team</p>
     */
    @NameInMap("teamName")
    public String teamName;

    @NameInMap("teamPlan")
    public String teamPlan;

    /**
     * <p>The UID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("userID")
    public String userID;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("username")
    public String username;

    public static ApiKey build(java.util.Map<String, ?> map) throws Exception {
        ApiKey self = new ApiKey();
        return TeaModel.build(map, self);
    }

    public ApiKey setApiKeyID(String apiKeyID) {
        this.apiKeyID = apiKeyID;
        return this;
    }
    public String getApiKeyID() {
        return this.apiKeyID;
    }

    public ApiKey setApiKeyMask(String apiKeyMask) {
        this.apiKeyMask = apiKeyMask;
        return this;
    }
    public String getApiKeyMask() {
        return this.apiKeyMask;
    }

    public ApiKey setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public ApiKey setApiKeyValue(String apiKeyValue) {
        this.apiKeyValue = apiKeyValue;
        return this;
    }
    public String getApiKeyValue() {
        return this.apiKeyValue;
    }

    public ApiKey setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ApiKey setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ApiKey setIpBlacklist(java.util.List<IPConfig> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public ApiKey setIpWhitelist(java.util.List<IPConfig> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    public ApiKey setLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }
    public String getLastUsedTime() {
        return this.lastUsedTime;
    }

    public ApiKey setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public ApiKey setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApiKey setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiKey setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public ApiKey setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public ApiKey setTeamPlan(String teamPlan) {
        this.teamPlan = teamPlan;
        return this;
    }
    public String getTeamPlan() {
        return this.teamPlan;
    }

    public ApiKey setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public ApiKey setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
