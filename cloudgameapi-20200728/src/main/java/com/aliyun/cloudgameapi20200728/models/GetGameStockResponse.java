// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStockResponse extends TeaModel {
    @NameInMap("AvailableTotal")
    @Validation(required = true)
    public Long availableTotal;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("QuotaTotal")
    @Validation(required = true)
    public Long quotaTotal;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UsedTotal")
    @Validation(required = true)
    public Long usedTotal;

    @NameInMap("InstanceStockList")
    @Validation(required = true)
    public java.util.List<GetGameStockResponseInstanceStockList> instanceStockList;

    public static GetGameStockResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameStockResponse self = new GetGameStockResponse();
        return TeaModel.build(map, self);
    }

    public GetGameStockResponse setAvailableTotal(Long availableTotal) {
        this.availableTotal = availableTotal;
        return this;
    }
    public Long getAvailableTotal() {
        return this.availableTotal;
    }

    public GetGameStockResponse setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public GetGameStockResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGameStockResponse setQuotaTotal(Long quotaTotal) {
        this.quotaTotal = quotaTotal;
        return this;
    }
    public Long getQuotaTotal() {
        return this.quotaTotal;
    }

    public GetGameStockResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameStockResponse setUsedTotal(Long usedTotal) {
        this.usedTotal = usedTotal;
        return this;
    }
    public Long getUsedTotal() {
        return this.usedTotal;
    }

    public GetGameStockResponse setInstanceStockList(java.util.List<GetGameStockResponseInstanceStockList> instanceStockList) {
        this.instanceStockList = instanceStockList;
        return this;
    }
    public java.util.List<GetGameStockResponseInstanceStockList> getInstanceStockList() {
        return this.instanceStockList;
    }

    public static class GetGameStockResponseInstanceStockList extends TeaModel {
        @NameInMap("AvailableSlots")
        @Validation(required = true)
        public Long availableSlots;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("QuotaSlots")
        @Validation(required = true)
        public Long quotaSlots;

        @NameInMap("ReginName")
        @Validation(required = true)
        public String reginName;

        @NameInMap("UsedSlots")
        @Validation(required = true)
        public Long usedSlots;

        @NameInMap("UserLevel")
        @Validation(required = true)
        public Long userLevel;

        public static GetGameStockResponseInstanceStockList build(java.util.Map<String, ?> map) throws Exception {
            GetGameStockResponseInstanceStockList self = new GetGameStockResponseInstanceStockList();
            return TeaModel.build(map, self);
        }

        public GetGameStockResponseInstanceStockList setAvailableSlots(Long availableSlots) {
            this.availableSlots = availableSlots;
            return this;
        }
        public Long getAvailableSlots() {
            return this.availableSlots;
        }

        public GetGameStockResponseInstanceStockList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetGameStockResponseInstanceStockList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetGameStockResponseInstanceStockList setQuotaSlots(Long quotaSlots) {
            this.quotaSlots = quotaSlots;
            return this;
        }
        public Long getQuotaSlots() {
            return this.quotaSlots;
        }

        public GetGameStockResponseInstanceStockList setReginName(String reginName) {
            this.reginName = reginName;
            return this;
        }
        public String getReginName() {
            return this.reginName;
        }

        public GetGameStockResponseInstanceStockList setUsedSlots(Long usedSlots) {
            this.usedSlots = usedSlots;
            return this;
        }
        public Long getUsedSlots() {
            return this.usedSlots;
        }

        public GetGameStockResponseInstanceStockList setUserLevel(Long userLevel) {
            this.userLevel = userLevel;
            return this;
        }
        public Long getUserLevel() {
            return this.userLevel;
        }

    }

}
