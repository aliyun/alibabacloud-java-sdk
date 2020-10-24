// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DispatchGameSlotResponse extends TeaModel {
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

    public static DispatchGameSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        DispatchGameSlotResponse self = new DispatchGameSlotResponse();
        return TeaModel.build(map, self);
    }

    public DispatchGameSlotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DispatchGameSlotResponse setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public DispatchGameSlotResponse setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public DispatchGameSlotResponse setQueueState(Integer queueState) {
        this.queueState = queueState;
        return this;
    }
    public Integer getQueueState() {
        return this.queueState;
    }

    public DispatchGameSlotResponse setQueueCode(Integer queueCode) {
        this.queueCode = queueCode;
        return this;
    }
    public Integer getQueueCode() {
        return this.queueCode;
    }

    public DispatchGameSlotResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
