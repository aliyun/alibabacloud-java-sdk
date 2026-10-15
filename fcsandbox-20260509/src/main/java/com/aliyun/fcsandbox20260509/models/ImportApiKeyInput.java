// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ImportApiKeyInput extends TeaModel {
    /**
     * <p>The name of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The value of the API key to import.</p>
     */
    @NameInMap("apiKeyValue")
    public String apiKeyValue;

    /**
     * <p>The expiration time of the API key.</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The unique identifier of the team to which the API key belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
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
