// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StopGameSessionRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("BizParam")
    public String bizParam;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("UserId")
    public String userId;

    public static StopGameSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopGameSessionRequest self = new StopGameSessionRequest();
        return TeaModel.build(map, self);
    }

    public StopGameSessionRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public StopGameSessionRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

    public StopGameSessionRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
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

    public StopGameSessionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
