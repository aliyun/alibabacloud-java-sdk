// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListUserGameProcessResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Model")
    @Validation(required = true)
    public java.util.List<ListUserGameProcessResponseModel> model;

    public static ListUserGameProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGameProcessResponse self = new ListUserGameProcessResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGameProcessResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserGameProcessResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserGameProcessResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserGameProcessResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserGameProcessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGameProcessResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUserGameProcessResponse setModel(java.util.List<ListUserGameProcessResponseModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListUserGameProcessResponseModel> getModel() {
        return this.model;
    }

    public static class ListUserGameProcessResponseModel extends TeaModel {
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

        public static ListUserGameProcessResponseModel build(java.util.Map<String, ?> map) throws Exception {
            ListUserGameProcessResponseModel self = new ListUserGameProcessResponseModel();
            return TeaModel.build(map, self);
        }

        public ListUserGameProcessResponseModel setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListUserGameProcessResponseModel setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListUserGameProcessResponseModel setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public ListUserGameProcessResponseModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserGameProcessResponseModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUserGameProcessResponseModel setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListUserGameProcessResponseModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListUserGameProcessResponseModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserGameProcessResponseModel setCurrentStepStatus(String currentStepStatus) {
            this.currentStepStatus = currentStepStatus;
            return this;
        }
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        public ListUserGameProcessResponseModel setCurrentStepId(String currentStepId) {
            this.currentStepId = currentStepId;
            return this;
        }
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        public ListUserGameProcessResponseModel setGameCoinRecords(String gameCoinRecords) {
            this.gameCoinRecords = gameCoinRecords;
            return this;
        }
        public String getGameCoinRecords() {
            return this.gameCoinRecords;
        }

        public ListUserGameProcessResponseModel setGameAwardRecords(String gameAwardRecords) {
            this.gameAwardRecords = gameAwardRecords;
            return this;
        }
        public String getGameAwardRecords() {
            return this.gameAwardRecords;
        }

        public ListUserGameProcessResponseModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListUserGameProcessResponseModel setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

}
