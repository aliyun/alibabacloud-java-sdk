// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StopGameSessionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("GameSession")
    @Validation(required = true)
    public String gameSession;

    @NameInMap("QueueState")
    @Validation(required = true)
    public Integer queueState;

    @NameInMap("QueueCode")
    @Validation(required = true)
    public Integer queueCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static StopGameSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StopGameSessionResponse self = new StopGameSessionResponse();
        return TeaModel.build(map, self);
    }

    public StopGameSessionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopGameSessionResponse setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public StopGameSessionResponse setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public StopGameSessionResponse setQueueState(Integer queueState) {
        this.queueState = queueState;
        return this;
    }
    public Integer getQueueState() {
        return this.queueState;
    }

    public StopGameSessionResponse setQueueCode(Integer queueCode) {
        this.queueCode = queueCode;
        return this;
    }
    public Integer getQueueCode() {
        return this.queueCode;
    }

    public StopGameSessionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopGameSessionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
