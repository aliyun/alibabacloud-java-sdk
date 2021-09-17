// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListUserGameProcessResponseBody extends TeaModel {
    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Long totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Model")
    public java.util.List<ListUserGameProcessResponseBodyModel> model;

    public static ListUserGameProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGameProcessResponseBody self = new ListUserGameProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGameProcessResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUserGameProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGameProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserGameProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserGameProcessResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserGameProcessResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserGameProcessResponseBody setModel(java.util.List<ListUserGameProcessResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListUserGameProcessResponseBodyModel> getModel() {
        return this.model;
    }

    public static class ListUserGameProcessResponseBodyModel extends TeaModel {
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

        public static ListUserGameProcessResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListUserGameProcessResponseBodyModel self = new ListUserGameProcessResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListUserGameProcessResponseBodyModel setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListUserGameProcessResponseBodyModel setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListUserGameProcessResponseBodyModel setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public ListUserGameProcessResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserGameProcessResponseBodyModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUserGameProcessResponseBodyModel setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListUserGameProcessResponseBodyModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListUserGameProcessResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserGameProcessResponseBodyModel setCurrentStepStatus(String currentStepStatus) {
            this.currentStepStatus = currentStepStatus;
            return this;
        }
        public String getCurrentStepStatus() {
            return this.currentStepStatus;
        }

        public ListUserGameProcessResponseBodyModel setCurrentStepId(String currentStepId) {
            this.currentStepId = currentStepId;
            return this;
        }
        public String getCurrentStepId() {
            return this.currentStepId;
        }

        public ListUserGameProcessResponseBodyModel setGameCoinRecords(String gameCoinRecords) {
            this.gameCoinRecords = gameCoinRecords;
            return this;
        }
        public String getGameCoinRecords() {
            return this.gameCoinRecords;
        }

        public ListUserGameProcessResponseBodyModel setGameAwardRecords(String gameAwardRecords) {
            this.gameAwardRecords = gameAwardRecords;
            return this;
        }
        public String getGameAwardRecords() {
            return this.gameAwardRecords;
        }

        public ListUserGameProcessResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListUserGameProcessResponseBodyModel setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

    }

}
