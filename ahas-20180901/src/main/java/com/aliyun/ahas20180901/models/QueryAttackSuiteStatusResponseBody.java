// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAttackSuiteStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackSuiteStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteStatusResponseBody self = new QueryAttackSuiteStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackSuiteStatusResponseBody setData(QueryAttackSuiteStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAttackSuiteStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryAttackSuiteStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackSuiteStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackSuiteStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackSuiteStatusResponseBodyData extends TeaModel {
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

        public static QueryAttackSuiteStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackSuiteStatusResponseBodyData self = new QueryAttackSuiteStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackSuiteStatusResponseBodyData setAttackModel(String attackModel) {
            this.attackModel = attackModel;
            return this;
        }
        public String getAttackModel() {
            return this.attackModel;
        }

        public QueryAttackSuiteStatusResponseBodyData setAttackStatus(String attackStatus) {
            this.attackStatus = attackStatus;
            return this;
        }
        public String getAttackStatus() {
            return this.attackStatus;
        }

        public QueryAttackSuiteStatusResponseBodyData setAttackSuiteId(String attackSuiteId) {
            this.attackSuiteId = attackSuiteId;
            return this;
        }
        public String getAttackSuiteId() {
            return this.attackSuiteId;
        }

        public QueryAttackSuiteStatusResponseBodyData setCheckAbility(String checkAbility) {
            this.checkAbility = checkAbility;
            return this;
        }
        public String getCheckAbility() {
            return this.checkAbility;
        }

        public QueryAttackSuiteStatusResponseBodyData setComponentLabel(String componentLabel) {
            this.componentLabel = componentLabel;
            return this;
        }
        public String getComponentLabel() {
            return this.componentLabel;
        }

        public QueryAttackSuiteStatusResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAttackSuiteStatusResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAttackSuiteStatusResponseBodyData setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public QueryAttackSuiteStatusResponseBodyData setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

        public QueryAttackSuiteStatusResponseBodyData setSourceType(Integer sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Integer getSourceType() {
            return this.sourceType;
        }

        public QueryAttackSuiteStatusResponseBodyData setSubTaskProgress(String subTaskProgress) {
            this.subTaskProgress = subTaskProgress;
            return this;
        }
        public String getSubTaskProgress() {
            return this.subTaskProgress;
        }

    }

}
