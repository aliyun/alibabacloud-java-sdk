// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class StartUserGameResponse extends TeaModel {
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
    public StartUserGameResponseModel model;

    public static StartUserGameResponse build(java.util.Map<String, ?> map) throws Exception {
        StartUserGameResponse self = new StartUserGameResponse();
        return TeaModel.build(map, self);
    }

    public StartUserGameResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartUserGameResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartUserGameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartUserGameResponse setModel(StartUserGameResponseModel model) {
        this.model = model;
        return this;
    }
    public StartUserGameResponseModel getModel() {
        return this.model;
    }

    public static class StartUserGameResponseModel extends TeaModel {
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

        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

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

        public static StartUserGameResponseModel build(java.util.Map<String, ?> map) throws Exception {
            StartUserGameResponseModel self = new StartUserGameResponseModel();
            return TeaModel.build(map, self);
        }

        public StartUserGameResponseModel setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public StartUserGameResponseModel setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public StartUserGameResponseModel setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public StartUserGameResponseModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StartUserGameResponseModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public StartUserGameResponseModel setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public StartUserGameResponseModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public StartUserGameResponseModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public StartUserGameResponseModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StartUserGameResponseModel setCurrentStepStatus(String currentStepStatus) {
            this.currentStepStatus = currentStepStatus;
            return this;
        }
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        public StartUserGameResponseModel setCurrentStepId(String currentStepId) {
            this.currentStepId = currentStepId;
            return this;
        }
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        public StartUserGameResponseModel setGameCoinRecords(String gameCoinRecords) {
            this.gameCoinRecords = gameCoinRecords;
            return this;
        }
        public String getGameCoinRecords() {
            return this.gameCoinRecords;
        }

        public StartUserGameResponseModel setGameAwardRecords(String gameAwardRecords) {
            this.gameAwardRecords = gameAwardRecords;
            return this;
        }
        public String getGameAwardRecords() {
            return this.gameAwardRecords;
        }

        public StartUserGameResponseModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public StartUserGameResponseModel setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

}
