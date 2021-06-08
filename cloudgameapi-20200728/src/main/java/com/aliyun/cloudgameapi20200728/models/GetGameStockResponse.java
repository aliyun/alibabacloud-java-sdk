// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStockResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("InstanceStockList")
    @Validation(required = true)
    public java.util.List<GetGameStockResponseInstanceStockList> instanceStockList;

    public static GetGameStockResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameStockResponse self = new GetGameStockResponse();
        return TeaModel.build(map, self);
    }

    public GetGameStockResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetGameStockResponse setInstanceStockList(java.util.List<GetGameStockResponseInstanceStockList> instanceStockList) {
        this.instanceStockList = instanceStockList;
        return this;
    }
    public java.util.List<GetGameStockResponseInstanceStockList> getInstanceStockList() {
        return this.instanceStockList;
    }

    public static class GetGameStockResponseInstanceStockList extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("ReginName")
        @Validation(required = true)
        public String reginName;

        @NameInMap("UserLevel")
        @Validation(required = true)
        public Long userLevel;

        @NameInMap("InstanceSpec")
        @Validation(required = true)
        public String instanceSpec;

        @NameInMap("AvailableSlots")
        @Validation(required = true)
        public Long availableSlots;

        public static GetGameStockResponseInstanceStockList build(java.util.Map<String, ?> map) throws Exception {
            GetGameStockResponseInstanceStockList self = new GetGameStockResponseInstanceStockList();
            return TeaModel.build(map, self);
        }

        public GetGameStockResponseInstanceStockList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetGameStockResponseInstanceStockList setReginName(String reginName) {
            this.reginName = reginName;
            return this;
        }
        public String getReginName() {
            return this.reginName;
        }

        public GetGameStockResponseInstanceStockList setUserLevel(Long userLevel) {
            this.userLevel = userLevel;
            return this;
        }
        public Long getUserLevel() {
            return this.userLevel;
        }

        public GetGameStockResponseInstanceStockList setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public GetGameStockResponseInstanceStockList setAvailableSlots(Long availableSlots) {
            this.availableSlots = availableSlots;
            return this;
        }
        public Long getAvailableSlots() {
            return this.availableSlots;
        }

    }

}
