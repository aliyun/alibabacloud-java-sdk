// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class StartUserGameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public StartUserGameResponseBodyModel model;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartUserGameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartUserGameResponseBody self = new StartUserGameResponseBody();
        return TeaModel.build(map, self);
    }

    public StartUserGameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartUserGameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartUserGameResponseBody setModel(StartUserGameResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public StartUserGameResponseBodyModel getModel() {
        return this.model;
    }

    public StartUserGameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartUserGameResponseBodyModel extends TeaModel {
        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("CurrentShowContent")
        public String currentShowContent;

        @NameInMap("CurrentStepId")
        public String currentStepId;

        @NameInMap("CurrentStepStatus")
        public String currentStepStatus;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("GameId")
        public String gameId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("RouteId")
        public String routeId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static StartUserGameResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            StartUserGameResponseBodyModel self = new StartUserGameResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public StartUserGameResponseBodyModel setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public StartUserGameResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public StartUserGameResponseBodyModel setCurrentShowContent(String currentShowContent) {
            this.currentShowContent = currentShowContent;
            return this;
        }
        public String getCurrentShowContent() {
            return this.currentShowContent;
        }

        public StartUserGameResponseBodyModel setCurrentStepId(String currentStepId) {
            this.currentStepId = currentStepId;
            return this;
        }
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        public StartUserGameResponseBodyModel setCurrentStepStatus(String currentStepStatus) {
            this.currentStepStatus = currentStepStatus;
            return this;
        }
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        public StartUserGameResponseBodyModel setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public StartUserGameResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public StartUserGameResponseBodyModel setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public StartUserGameResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StartUserGameResponseBodyModel setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public StartUserGameResponseBodyModel setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

        public StartUserGameResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StartUserGameResponseBodyModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
