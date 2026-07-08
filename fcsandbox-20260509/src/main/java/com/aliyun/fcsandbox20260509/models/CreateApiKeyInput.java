// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateApiKeyInput extends TeaModel {
    @NameInMap("apiKeyName")
    public String apiKeyName;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("teamID")
    public String teamID;

    public static CreateApiKeyInput build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyInput self = new CreateApiKeyInput();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyInput setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public CreateApiKeyInput setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public CreateApiKeyInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
