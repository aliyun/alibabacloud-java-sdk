// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserGameProcessResponse extends TeaModel {
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
    public QueryUserGameProcessResponseModel model;

    public static QueryUserGameProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGameProcessResponse self = new QueryUserGameProcessResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserGameProcessResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserGameProcessResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserGameProcessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserGameProcessResponse setModel(QueryUserGameProcessResponseModel model) {
        this.model = model;
        return this;
    }
    public QueryUserGameProcessResponseModel getModel() {
        return this.model;
    }

    public static class QueryUserGameProcessResponseModel extends TeaModel {
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

        public static QueryUserGameProcessResponseModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUserGameProcessResponseModel self = new QueryUserGameProcessResponseModel();
            return TeaModel.build(map, self);
        }

        public QueryUserGameProcessResponseModel setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public QueryUserGameProcessResponseModel setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public QueryUserGameProcessResponseModel setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public QueryUserGameProcessResponseModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUserGameProcessResponseModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryUserGameProcessResponseModel setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryUserGameProcessResponseModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryUserGameProcessResponseModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryUserGameProcessResponseModel setCurrentStepStatus(String currentStepStatus) {
            this.currentStepStatus = currentStepStatus;
            return this;
        }
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        public QueryUserGameProcessResponseModel setCurrentStepId(String currentStepId) {
            this.currentStepId = currentStepId;
            return this;
        }
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        public QueryUserGameProcessResponseModel setGameCoinRecords(String gameCoinRecords) {
            this.gameCoinRecords = gameCoinRecords;
            return this;
        }
        public String getGameCoinRecords() {
            return this.gameCoinRecords;
        }

        public QueryUserGameProcessResponseModel setGameAwardRecords(String gameAwardRecords) {
            this.gameAwardRecords = gameAwardRecords;
            return this;
        }
        public String getGameAwardRecords() {
            return this.gameAwardRecords;
        }

        public QueryUserGameProcessResponseModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryUserGameProcessResponseModel setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

}
