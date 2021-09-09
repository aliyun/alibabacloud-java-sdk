// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StopGameSessionRequest extends TeaModel {
    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("AccessKey")
    @Validation(required = true)
    public String accessKey;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("BizParam")
    public String bizParam;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("Reason")
    public String reason;

    public static StopGameSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopGameSessionRequest self = new StopGameSessionRequest();
        return TeaModel.build(map, self);
    }

    public StopGameSessionRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public StopGameSessionRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public StopGameSessionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public StopGameSessionRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

    public StopGameSessionRequest setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public StopGameSessionRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
