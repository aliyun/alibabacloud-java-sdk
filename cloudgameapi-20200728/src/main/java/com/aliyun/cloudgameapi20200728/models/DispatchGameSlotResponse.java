// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DispatchGameSlotResponse extends TeaModel {
    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("GameSession")
    @Validation(required = true)
    public String gameSession;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("QueueCode")
    @Validation(required = true)
    public Integer queueCode;

    @NameInMap("QueueState")
    @Validation(required = true)
    public Integer queueState;

    @NameInMap("RegionName")
    @Validation(required = true)
    public String regionName;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    public static DispatchGameSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        DispatchGameSlotResponse self = new DispatchGameSlotResponse();
        return TeaModel.build(map, self);
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

    public DispatchGameSlotResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DispatchGameSlotResponse setQueueCode(Integer queueCode) {
        this.queueCode = queueCode;
        return this;
    }
    public Integer getQueueCode() {
        return this.queueCode;
    }

    public DispatchGameSlotResponse setQueueState(Integer queueState) {
        this.queueState = queueState;
        return this;
    }
    public Integer getQueueState() {
        return this.queueState;
    }

    public DispatchGameSlotResponse setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public DispatchGameSlotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DispatchGameSlotResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class BatchDispatchGameSlotResponseQueueResultList extends TeaModel {
        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("GameSession")
        @Validation(required = true)
        public String gameSession;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("QueueCode")
        @Validation(required = true)
        public Integer queueCode;

        @NameInMap("QueueState")
        @Validation(required = true)
        public Integer queueState;

        @NameInMap("RegionName")
        @Validation(required = true)
        public String regionName;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        public static BatchDispatchGameSlotResponseQueueResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchDispatchGameSlotResponseQueueResultList self = new BatchDispatchGameSlotResponseQueueResultList();
            return TeaModel.build(map, self);
        }

        public BatchDispatchGameSlotResponseQueueResultList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public BatchDispatchGameSlotResponseQueueResultList setGameSession(String gameSession) {
            this.gameSession = gameSession;
            return this;
        }
        public String getGameSession() {
            return this.gameSession;
        }

        public BatchDispatchGameSlotResponseQueueResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchDispatchGameSlotResponseQueueResultList setQueueCode(Integer queueCode) {
            this.queueCode = queueCode;
            return this;
        }
        public Integer getQueueCode() {
            return this.queueCode;
        }

        public BatchDispatchGameSlotResponseQueueResultList setQueueState(Integer queueState) {
            this.queueState = queueState;
            return this;
        }
        public Integer getQueueState() {
            return this.queueState;
        }

        public BatchDispatchGameSlotResponseQueueResultList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public BatchDispatchGameSlotResponseQueueResultList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
