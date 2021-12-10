// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StopGameSessionResponseBody extends TeaModel {
    @NameInMap("GameId")
    public String gameId;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("Message")
    public String message;

    @NameInMap("QueueCode")
    public Integer queueCode;

    @NameInMap("QueueState")
    public Integer queueState;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static StopGameSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopGameSessionResponseBody self = new StopGameSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public StopGameSessionResponseBody setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public StopGameSessionResponseBody setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public StopGameSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopGameSessionResponseBody setQueueCode(Integer queueCode) {
        this.queueCode = queueCode;
        return this;
    }
    public Integer getQueueCode() {
        return this.queueCode;
    }

    public StopGameSessionResponseBody setQueueState(Integer queueState) {
        this.queueState = queueState;
        return this;
    }
    public Integer getQueueState() {
        return this.queueState;
    }

    public StopGameSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopGameSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
