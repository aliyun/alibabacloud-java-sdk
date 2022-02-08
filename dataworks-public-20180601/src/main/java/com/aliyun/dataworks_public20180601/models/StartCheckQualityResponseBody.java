// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartCheckQualityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("ReturnValue")
    public StartCheckQualityResponseBodyReturnValue returnValue;

    public static StartCheckQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCheckQualityResponseBody self = new StartCheckQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCheckQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartCheckQualityResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public StartCheckQualityResponseBody setReturnValue(StartCheckQualityResponseBodyReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public StartCheckQualityResponseBodyReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static class StartCheckQualityResponseBodyReturnValueResultsActualResult extends TeaModel {
        @NameInMap("ActualThreshold")
        public String actualThreshold;

        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("Property")
        public String property;

        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public Long status;

        public static StartCheckQualityResponseBodyReturnValueResultsActualResult build(java.util.Map<String, ?> map) throws Exception {
            StartCheckQualityResponseBodyReturnValueResultsActualResult self = new StartCheckQualityResponseBodyReturnValueResultsActualResult();
            return TeaModel.build(map, self);
        }

        public StartCheckQualityResponseBodyReturnValueResultsActualResult setActualThreshold(String actualThreshold) {
            this.actualThreshold = actualThreshold;
            return this;
        }
        public String getActualThreshold() {
            return this.actualThreshold;
        }

        public StartCheckQualityResponseBodyReturnValueResultsActualResult setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public StartCheckQualityResponseBodyReturnValueResultsActualResult setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public StartCheckQualityResponseBodyReturnValueResultsActualResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public StartCheckQualityResponseBodyReturnValueResultsActualResult setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class StartCheckQualityResponseBodyReturnValueResultsSampleResult extends TeaModel {
        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("Property")
        public String property;

        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public Long status;

        public static StartCheckQualityResponseBodyReturnValueResultsSampleResult build(java.util.Map<String, ?> map) throws Exception {
            StartCheckQualityResponseBodyReturnValueResultsSampleResult self = new StartCheckQualityResponseBodyReturnValueResultsSampleResult();
            return TeaModel.build(map, self);
        }

        public StartCheckQualityResponseBodyReturnValueResultsSampleResult setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public StartCheckQualityResponseBodyReturnValueResultsSampleResult setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public StartCheckQualityResponseBodyReturnValueResultsSampleResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public StartCheckQualityResponseBodyReturnValueResultsSampleResult setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class StartCheckQualityResponseBodyReturnValueResults extends TeaModel {
        @NameInMap("ActualExpression")
        public String actualExpression;

        @NameInMap("ActualResult")
        public java.util.List<StartCheckQualityResponseBodyReturnValueResultsActualResult> actualResult;

        @NameInMap("Bizdate")
        public String bizdate;

        @NameInMap("BlockType")
        public Long blockType;

        @NameInMap("CheckResult")
        public Long checkResult;

        @NameInMap("CheckerName")
        public String checkerName;

        @NameInMap("ContainStrongRule")
        public Long containStrongRule;

        @NameInMap("CriticalThreshold")
        public String criticalThreshold;

        @NameInMap("DateType")
        public String dateType;

        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("ExternalType")
        public String externalType;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("IfFixedCheck")
        public Long ifFixedCheck;

        @NameInMap("MatchExpression")
        public String matchExpression;

        @NameInMap("MethodId")
        public Long methodId;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Property")
        public String property;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("SampleResult")
        public java.util.List<StartCheckQualityResponseBodyReturnValueResultsSampleResult> sampleResult;

        @NameInMap("TaskLevel")
        public Long taskLevel;

        @NameInMap("TaskStatus")
        public Long taskStatus;

        @NameInMap("Trend")
        public String trend;

        @NameInMap("WarningThreshold")
        public String warningThreshold;

        @NameInMap("WhereCondition")
        public String whereCondition;

        public static StartCheckQualityResponseBodyReturnValueResults build(java.util.Map<String, ?> map) throws Exception {
            StartCheckQualityResponseBodyReturnValueResults self = new StartCheckQualityResponseBodyReturnValueResults();
            return TeaModel.build(map, self);
        }

        public StartCheckQualityResponseBodyReturnValueResults setActualExpression(String actualExpression) {
            this.actualExpression = actualExpression;
            return this;
        }
        public String getActualExpression() {
            return this.actualExpression;
        }

        public StartCheckQualityResponseBodyReturnValueResults setActualResult(java.util.List<StartCheckQualityResponseBodyReturnValueResultsActualResult> actualResult) {
            this.actualResult = actualResult;
            return this;
        }
        public java.util.List<StartCheckQualityResponseBodyReturnValueResultsActualResult> getActualResult() {
            return this.actualResult;
        }

        public StartCheckQualityResponseBodyReturnValueResults setBizdate(String bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public String getBizdate() {
            return this.bizdate;
        }

        public StartCheckQualityResponseBodyReturnValueResults setBlockType(Long blockType) {
            this.blockType = blockType;
            return this;
        }
        public Long getBlockType() {
            return this.blockType;
        }

        public StartCheckQualityResponseBodyReturnValueResults setCheckResult(Long checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Long getCheckResult() {
            return this.checkResult;
        }

        public StartCheckQualityResponseBodyReturnValueResults setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public StartCheckQualityResponseBodyReturnValueResults setContainStrongRule(Long containStrongRule) {
            this.containStrongRule = containStrongRule;
            return this;
        }
        public Long getContainStrongRule() {
            return this.containStrongRule;
        }

        public StartCheckQualityResponseBodyReturnValueResults setCriticalThreshold(String criticalThreshold) {
            this.criticalThreshold = criticalThreshold;
            return this;
        }
        public String getCriticalThreshold() {
            return this.criticalThreshold;
        }

        public StartCheckQualityResponseBodyReturnValueResults setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public StartCheckQualityResponseBodyReturnValueResults setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public StartCheckQualityResponseBodyReturnValueResults setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public StartCheckQualityResponseBodyReturnValueResults setExternalType(String externalType) {
            this.externalType = externalType;
            return this;
        }
        public String getExternalType() {
            return this.externalType;
        }

        public StartCheckQualityResponseBodyReturnValueResults setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public StartCheckQualityResponseBodyReturnValueResults setIfFixedCheck(Long ifFixedCheck) {
            this.ifFixedCheck = ifFixedCheck;
            return this;
        }
        public Long getIfFixedCheck() {
            return this.ifFixedCheck;
        }

        public StartCheckQualityResponseBodyReturnValueResults setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public StartCheckQualityResponseBodyReturnValueResults setMethodId(Long methodId) {
            this.methodId = methodId;
            return this;
        }
        public Long getMethodId() {
            return this.methodId;
        }

        public StartCheckQualityResponseBodyReturnValueResults setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public StartCheckQualityResponseBodyReturnValueResults setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public StartCheckQualityResponseBodyReturnValueResults setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public StartCheckQualityResponseBodyReturnValueResults setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public StartCheckQualityResponseBodyReturnValueResults setSampleResult(java.util.List<StartCheckQualityResponseBodyReturnValueResultsSampleResult> sampleResult) {
            this.sampleResult = sampleResult;
            return this;
        }
        public java.util.List<StartCheckQualityResponseBodyReturnValueResultsSampleResult> getSampleResult() {
            return this.sampleResult;
        }

        public StartCheckQualityResponseBodyReturnValueResults setTaskLevel(Long taskLevel) {
            this.taskLevel = taskLevel;
            return this;
        }
        public Long getTaskLevel() {
            return this.taskLevel;
        }

        public StartCheckQualityResponseBodyReturnValueResults setTaskStatus(Long taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        public StartCheckQualityResponseBodyReturnValueResults setTrend(String trend) {
            this.trend = trend;
            return this;
        }
        public String getTrend() {
            return this.trend;
        }

        public StartCheckQualityResponseBodyReturnValueResults setWarningThreshold(String warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

        public StartCheckQualityResponseBodyReturnValueResults setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }
        public String getWhereCondition() {
            return this.whereCondition;
        }

    }

    public static class StartCheckQualityResponseBodyReturnValue extends TeaModel {
        @NameInMap("Results")
        public java.util.List<StartCheckQualityResponseBodyReturnValueResults> results;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskId")
        public String taskId;

        public static StartCheckQualityResponseBodyReturnValue build(java.util.Map<String, ?> map) throws Exception {
            StartCheckQualityResponseBodyReturnValue self = new StartCheckQualityResponseBodyReturnValue();
            return TeaModel.build(map, self);
        }

        public StartCheckQualityResponseBodyReturnValue setResults(java.util.List<StartCheckQualityResponseBodyReturnValueResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<StartCheckQualityResponseBodyReturnValueResults> getResults() {
            return this.results;
        }

        public StartCheckQualityResponseBodyReturnValue setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public StartCheckQualityResponseBodyReturnValue setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
