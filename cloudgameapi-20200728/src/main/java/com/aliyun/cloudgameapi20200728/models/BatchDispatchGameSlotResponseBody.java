// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class BatchDispatchGameSlotResponseBody extends TeaModel {
    @NameInMap("QueueResultList")
    public java.util.List<BatchDispatchGameSlotResponseBodyQueueResultList> queueResultList;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchDispatchGameSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDispatchGameSlotResponseBody self = new BatchDispatchGameSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDispatchGameSlotResponseBody setQueueResultList(java.util.List<BatchDispatchGameSlotResponseBodyQueueResultList> queueResultList) {
        this.queueResultList = queueResultList;
        return this;
    }
    public java.util.List<BatchDispatchGameSlotResponseBodyQueueResultList> getQueueResultList() {
        return this.queueResultList;
    }

    public BatchDispatchGameSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchDispatchGameSlotResponseBodyQueueResultList extends TeaModel {
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

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("UserId")
        public String userId;

        public static BatchDispatchGameSlotResponseBodyQueueResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchDispatchGameSlotResponseBodyQueueResultList self = new BatchDispatchGameSlotResponseBodyQueueResultList();
            return TeaModel.build(map, self);
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setGameSession(String gameSession) {
            this.gameSession = gameSession;
            return this;
        }
        public String getGameSession() {
            return this.gameSession;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setQueueCode(Integer queueCode) {
            this.queueCode = queueCode;
            return this;
        }
        public Integer getQueueCode() {
            return this.queueCode;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setQueueState(Integer queueState) {
            this.queueState = queueState;
            return this;
        }
        public Integer getQueueState() {
            return this.queueState;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public BatchDispatchGameSlotResponseBodyQueueResultList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
