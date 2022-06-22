// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAttackSuiteListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackSuiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteListResponseBody self = new QueryAttackSuiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackSuiteListResponseBody setData(java.util.List<QueryAttackSuiteListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAttackSuiteListResponseBodyData> getData() {
        return this.data;
    }

    public QueryAttackSuiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackSuiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackSuiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackSuiteListResponseBodyData extends TeaModel {
        @NameInMap("attackModel")
        public String attackModel;

        @NameInMap("attackStatus")
        public String attackStatus;

        @NameInMap("attackSuiteId")
        public String attackSuiteId;

        @NameInMap("checkAbility")
        public String checkAbility;

        @NameInMap("componentLabel")
        public String componentLabel;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("name")
        public String name;

        @NameInMap("scenarioId")
        public String scenarioId;

        @NameInMap("scenarioName")
        public String scenarioName;

        @NameInMap("sourceType")
        public Integer sourceType;

        @NameInMap("subTaskProgress")
        public String subTaskProgress;

        public static QueryAttackSuiteListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackSuiteListResponseBodyData self = new QueryAttackSuiteListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackSuiteListResponseBodyData setAttackModel(String attackModel) {
            this.attackModel = attackModel;
            return this;
        }
        public String getAttackModel() {
            return this.attackModel;
        }

        public QueryAttackSuiteListResponseBodyData setAttackStatus(String attackStatus) {
            this.attackStatus = attackStatus;
            return this;
        }
        public String getAttackStatus() {
            return this.attackStatus;
        }

        public QueryAttackSuiteListResponseBodyData setAttackSuiteId(String attackSuiteId) {
            this.attackSuiteId = attackSuiteId;
            return this;
        }
        public String getAttackSuiteId() {
            return this.attackSuiteId;
        }

        public QueryAttackSuiteListResponseBodyData setCheckAbility(String checkAbility) {
            this.checkAbility = checkAbility;
            return this;
        }
        public String getCheckAbility() {
            return this.checkAbility;
        }

        public QueryAttackSuiteListResponseBodyData setComponentLabel(String componentLabel) {
            this.componentLabel = componentLabel;
            return this;
        }
        public String getComponentLabel() {
            return this.componentLabel;
        }

        public QueryAttackSuiteListResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAttackSuiteListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAttackSuiteListResponseBodyData setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public QueryAttackSuiteListResponseBodyData setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

        public QueryAttackSuiteListResponseBodyData setSourceType(Integer sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Integer getSourceType() {
            return this.sourceType;
        }

        public QueryAttackSuiteListResponseBodyData setSubTaskProgress(String subTaskProgress) {
            this.subTaskProgress = subTaskProgress;
            return this;
        }
        public String getSubTaskProgress() {
            return this.subTaskProgress;
        }

    }

}
