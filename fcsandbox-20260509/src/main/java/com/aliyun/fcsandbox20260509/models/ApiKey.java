// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ApiKey extends TeaModel {
    @NameInMap("apiKeyID")
    public String apiKeyID;

    @NameInMap("apiKeyMask")
    public String apiKeyMask;

    @NameInMap("apiKeyName")
    public String apiKeyName;

    @NameInMap("apiKeyValue")
    public String apiKeyValue;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("lastUsedTime")
    public String lastUsedTime;

    @NameInMap("userID")
    public String userID;

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

    public ApiKey setLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }
    public String getLastUsedTime() {
        return this.lastUsedTime;
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
