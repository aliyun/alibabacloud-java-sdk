// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStockResponseBody extends TeaModel {
    @NameInMap("AvailableTotal")
    public Long availableTotal;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("InstanceStockList")
    public java.util.List<GetGameStockResponseBodyInstanceStockList> instanceStockList;

    @NameInMap("Message")
    public String message;

    @NameInMap("QuotaTotal")
    public Long quotaTotal;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsedTotal")
    public Long usedTotal;

    public static GetGameStockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameStockResponseBody self = new GetGameStockResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameStockResponseBody setAvailableTotal(Long availableTotal) {
        this.availableTotal = availableTotal;
        return this;
    }
    public Long getAvailableTotal() {
        return this.availableTotal;
    }

    public GetGameStockResponseBody setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public GetGameStockResponseBody setInstanceStockList(java.util.List<GetGameStockResponseBodyInstanceStockList> instanceStockList) {
        this.instanceStockList = instanceStockList;
        return this;
    }
    public java.util.List<GetGameStockResponseBodyInstanceStockList> getInstanceStockList() {
        return this.instanceStockList;
    }

    public GetGameStockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGameStockResponseBody setQuotaTotal(Long quotaTotal) {
        this.quotaTotal = quotaTotal;
        return this;
    }
    public Long getQuotaTotal() {
        return this.quotaTotal;
    }

    public GetGameStockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameStockResponseBody setUsedTotal(Long usedTotal) {
        this.usedTotal = usedTotal;
        return this;
    }
    public Long getUsedTotal() {
        return this.usedTotal;
    }

    public static class GetGameStockResponseBodyInstanceStockList extends TeaModel {
        @NameInMap("AvailableSlots")
        public Long availableSlots;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("QuotaSlots")
        public Long quotaSlots;

        @NameInMap("ReginName")
        public String reginName;

        @NameInMap("UsedSlots")
        public Long usedSlots;

        @NameInMap("UserLevel")
        public Long userLevel;

        public static GetGameStockResponseBodyInstanceStockList build(java.util.Map<String, ?> map) throws Exception {
            GetGameStockResponseBodyInstanceStockList self = new GetGameStockResponseBodyInstanceStockList();
            return TeaModel.build(map, self);
        }

        public GetGameStockResponseBodyInstanceStockList setAvailableSlots(Long availableSlots) {
            this.availableSlots = availableSlots;
            return this;
        }
        public Long getAvailableSlots() {
            return this.availableSlots;
        }

        public GetGameStockResponseBodyInstanceStockList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetGameStockResponseBodyInstanceStockList setQuotaSlots(Long quotaSlots) {
            this.quotaSlots = quotaSlots;
            return this;
        }
        public Long getQuotaSlots() {
            return this.quotaSlots;
        }

        public GetGameStockResponseBodyInstanceStockList setReginName(String reginName) {
            this.reginName = reginName;
            return this;
        }
        public String getReginName() {
            return this.reginName;
        }

        public GetGameStockResponseBodyInstanceStockList setUsedSlots(Long usedSlots) {
            this.usedSlots = usedSlots;
            return this;
        }
        public Long getUsedSlots() {
            return this.usedSlots;
        }

        public GetGameStockResponseBodyInstanceStockList setUserLevel(Long userLevel) {
            this.userLevel = userLevel;
            return this;
        }
        public Long getUserLevel() {
            return this.userLevel;
        }

    }

}
