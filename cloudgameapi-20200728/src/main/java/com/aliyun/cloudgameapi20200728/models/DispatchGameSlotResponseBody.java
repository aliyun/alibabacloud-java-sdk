// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DispatchGameSlotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionName")
    public String regionName;

    @NameInMap("GameSession")
    public String gameSession;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("QueueState")
    public Integer queueState;

    @NameInMap("Message")
    public String message;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("QueueCode")
    public Integer queueCode;

    public static DispatchGameSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DispatchGameSlotResponseBody self = new DispatchGameSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public DispatchGameSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DispatchGameSlotResponseBody setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public DispatchGameSlotResponseBody setGameSession(String gameSession) {
        this.gameSession = gameSession;
        return this;
    }
    public String getGameSession() {
        return this.gameSession;
    }

    public DispatchGameSlotResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DispatchGameSlotResponseBody setQueueState(Integer queueState) {
        this.queueState = queueState;
        return this;
    }
    public Integer getQueueState() {
        return this.queueState;
    }

    public DispatchGameSlotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DispatchGameSlotResponseBody setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public DispatchGameSlotResponseBody setQueueCode(Integer queueCode) {
        this.queueCode = queueCode;
        return this;
    }
    public Integer getQueueCode() {
        return this.queueCode;
    }

    public static class BatchDispatchGameSlotResponseBodyQueueResultList extends TeaModel {
        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("GameSession")
        public String gameSession;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("QueueState")
        public Integer queueState;

        @NameInMap("Message")
        public String message;

        @NameInMap("GameId")
        public String gameId;

        @NameInMap("QueueCode")
        public Integer queueCode;

        public static BatchDispatchGameSlotResponseBodyQueueResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchDispatchGameSlotResponseBodyQueueResultList self = new BatchDispatchGameSlotResponseBodyQueueResultList();
            return TeaModel.build(map, self);
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setGameSession(String gameSession) {
            this.gameSession = gameSession;
            return this;
        }
        public String getGameSession() {
            return this.gameSession;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setQueueState(Integer queueState) {
            this.queueState = queueState;
            return this;
        }
        public Integer getQueueState() {
            return this.queueState;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setQueueCode(Integer queueCode) {
            this.queueCode = queueCode;
            return this;
        }
        public Integer getQueueCode() {
            return this.queueCode;
        }

    }

}
