// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ImportApiKeyInput extends TeaModel {
    @NameInMap("apiKeyName")
    public String apiKeyName;

    @NameInMap("apiKeyValue")
    public String apiKeyValue;

    @NameInMap("expireTime")
    public String expireTime;

    @NameInMap("teamID")
    public String teamID;

    public static ImportApiKeyInput build(java.util.Map<String, ?> map) throws Exception {
        ImportApiKeyInput self = new ImportApiKeyInput();
        return TeaModel.build(map, self);
    }

    public ImportApiKeyInput setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public ImportApiKeyInput setApiKeyValue(String apiKeyValue) {
        this.apiKeyValue = apiKeyValue;
        return this;
    }
    public String getApiKeyValue() {
        return this.apiKeyValue;
    }

    public ImportApiKeyInput setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ImportApiKeyInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
