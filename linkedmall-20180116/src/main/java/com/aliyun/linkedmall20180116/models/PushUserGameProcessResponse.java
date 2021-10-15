// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class PushUserGameProcessResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Model")
    @Validation(required = true)
    public PushUserGameProcessResponseModel model;

    public static PushUserGameProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        PushUserGameProcessResponse self = new PushUserGameProcessResponse();
        return TeaModel.build(map, self);
    }

    public PushUserGameProcessResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PushUserGameProcessResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushUserGameProcessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushUserGameProcessResponse setModel(PushUserGameProcessResponseModel model) {
        this.model = model;
        return this;
    }
    public PushUserGameProcessResponseModel getModel() {
        return this.model;
    }

    public static class PushUserGameProcessResponseModel extends TeaModel {
        @NameInMap("ProcessId")
        @Validation(required = true)
        public String processId;

        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("ActivityId")
        @Validation(required = true)
        public String activityId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CurrentStepStatus")
        @Validation(required = true)
        public String currentStepStatus;

        @NameInMap("CurrentStepId")
        @Validation(required = true)
        public String currentStepId;

        @NameInMap("GameCoinRecords")
        @Validation(required = true)
        public String gameCoinRecords;

        @NameInMap("GameAwardRecords")
        @Validation(required = true)
        public String gameAwardRecords;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public String extInfo;

        @NameInMap("RouteId")
        @Validation(required = true)
        public String routeId;

        public static PushUserGameProcessResponseModel build(java.util.Map<String, ?> map) throws Exception {
            PushUserGameProcessResponseModel self = new PushUserGameProcessResponseModel();
            return TeaModel.build(map, self);
        }

        public PushUserGameProcessResponseModel setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public PushUserGameProcessResponseModel setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public PushUserGameProcessResponseModel setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public PushUserGameProcessResponseModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PushUserGameProcessResponseModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PushUserGameProcessResponseModel setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public PushUserGameProcessResponseModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PushUserGameProcessResponseModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PushUserGameProcessResponseModel setCurrentStepStatus(String currentStepStatus) {
            this.currentStepStatus = currentStepStatus;
            return this;
        }
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        public PushUserGameProcessResponseModel setCurrentStepId(String currentStepId) {
            this.currentStepId = currentStepId;
            return this;
        }
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        public PushUserGameProcessResponseModel setGameCoinRecords(String gameCoinRecords) {
            this.gameCoinRecords = gameCoinRecords;
            return this;
        }
        public String getGameCoinRecords() {
            return this.gameCoinRecords;
        }

        public PushUserGameProcessResponseModel setGameAwardRecords(String gameAwardRecords) {
            this.gameAwardRecords = gameAwardRecords;
            return this;
        }
        public String getGameAwardRecords() {
            return this.gameAwardRecords;
        }

        public PushUserGameProcessResponseModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public PushUserGameProcessResponseModel setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

}
