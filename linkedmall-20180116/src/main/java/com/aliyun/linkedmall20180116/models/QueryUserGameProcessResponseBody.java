// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserGameProcessResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryUserGameProcessResponseBodyModel model;

    public static QueryUserGameProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGameProcessResponseBody self = new QueryUserGameProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserGameProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserGameProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserGameProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserGameProcessResponseBody setModel(QueryUserGameProcessResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryUserGameProcessResponseBodyModel getModel() {
        return this.model;
    }

    public static class QueryUserGameProcessResponseBodyModel extends TeaModel {
        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("GameId")
        public String gameId;

        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Content")
        public String content;

        @NameInMap("Status")
        public String status;

        @NameInMap("CurrentStepStatus")
        public String currentStepStatus;

        @NameInMap("CurrentStepId")
        public String currentStepId;

        @NameInMap("GameCoinRecords")
        public String gameCoinRecords;

        @NameInMap("GameAwardRecords")
        public String gameAwardRecords;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("RouteId")
        public String routeId;

        public static QueryUserGameProcessResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUserGameProcessResponseBodyModel self = new QueryUserGameProcessResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryUserGameProcessResponseBodyModel setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public QueryUserGameProcessResponseBodyModel setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public QueryUserGameProcessResponseBodyModel setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public QueryUserGameProcessResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUserGameProcessResponseBodyModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryUserGameProcessResponseBodyModel setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryUserGameProcessResponseBodyModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryUserGameProcessResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryUserGameProcessResponseBodyModel setCurrentStepStatus(String currentStepStatus) {
            this.currentStepStatus = currentStepStatus;
            return this;
        }
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        public QueryUserGameProcessResponseBodyModel setCurrentStepId(String currentStepId) {
            this.currentStepId = currentStepId;
            return this;
        }
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        public QueryUserGameProcessResponseBodyModel setGameCoinRecords(String gameCoinRecords) {
            this.gameCoinRecords = gameCoinRecords;
            return this;
        }
        public String getGameCoinRecords() {
            return this.gameCoinRecords;
        }

        public QueryUserGameProcessResponseBodyModel setGameAwardRecords(String gameAwardRecords) {
            this.gameAwardRecords = gameAwardRecords;
            return this;
        }
        public String getGameAwardRecords() {
            return this.gameAwardRecords;
        }

        public QueryUserGameProcessResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryUserGameProcessResponseBodyModel setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

}
