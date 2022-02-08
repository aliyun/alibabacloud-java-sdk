// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartTaskQualityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("ReturnValue")
    public StartTaskQualityResponseBodyReturnValue returnValue;

    public static StartTaskQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTaskQualityResponseBody self = new StartTaskQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTaskQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartTaskQualityResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public StartTaskQualityResponseBody setReturnValue(StartTaskQualityResponseBodyReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public StartTaskQualityResponseBodyReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static class StartTaskQualityResponseBodyReturnValueStrongMethodSet extends TeaModel {
        @NameInMap("ColName")
        public String colName;

        @NameInMap("IsColRule")
        public Boolean isColRule;

        @NameInMap("IsSqlRule")
        public Boolean isSqlRule;

        @NameInMap("IsStrongRule")
        public Boolean isStrongRule;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("RuleId")
        public Long ruleId;

        public static StartTaskQualityResponseBodyReturnValueStrongMethodSet build(java.util.Map<String, ?> map) throws Exception {
            StartTaskQualityResponseBodyReturnValueStrongMethodSet self = new StartTaskQualityResponseBodyReturnValueStrongMethodSet();
            return TeaModel.build(map, self);
        }

        public StartTaskQualityResponseBodyReturnValueStrongMethodSet setColName(String colName) {
            this.colName = colName;
            return this;
        }
        public String getColName() {
            return this.colName;
        }

        public StartTaskQualityResponseBodyReturnValueStrongMethodSet setIsColRule(Boolean isColRule) {
            this.isColRule = isColRule;
            return this;
        }
        public Boolean getIsColRule() {
            return this.isColRule;
        }

        public StartTaskQualityResponseBodyReturnValueStrongMethodSet setIsSqlRule(Boolean isSqlRule) {
            this.isSqlRule = isSqlRule;
            return this;
        }
        public Boolean getIsSqlRule() {
            return this.isSqlRule;
        }

        public StartTaskQualityResponseBodyReturnValueStrongMethodSet setIsStrongRule(Boolean isStrongRule) {
            this.isStrongRule = isStrongRule;
            return this;
        }
        public Boolean getIsStrongRule() {
            return this.isStrongRule;
        }

        public StartTaskQualityResponseBodyReturnValueStrongMethodSet setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public StartTaskQualityResponseBodyReturnValueStrongMethodSet setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class StartTaskQualityResponseBodyReturnValueWeakMethodSet extends TeaModel {
        @NameInMap("ColName")
        public String colName;

        @NameInMap("IsColRule")
        public Boolean isColRule;

        @NameInMap("IsSqlRule")
        public Boolean isSqlRule;

        @NameInMap("IsStrongRule")
        public Boolean isStrongRule;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("RuleId")
        public Long ruleId;

        public static StartTaskQualityResponseBodyReturnValueWeakMethodSet build(java.util.Map<String, ?> map) throws Exception {
            StartTaskQualityResponseBodyReturnValueWeakMethodSet self = new StartTaskQualityResponseBodyReturnValueWeakMethodSet();
            return TeaModel.build(map, self);
        }

        public StartTaskQualityResponseBodyReturnValueWeakMethodSet setColName(String colName) {
            this.colName = colName;
            return this;
        }
        public String getColName() {
            return this.colName;
        }

        public StartTaskQualityResponseBodyReturnValueWeakMethodSet setIsColRule(Boolean isColRule) {
            this.isColRule = isColRule;
            return this;
        }
        public Boolean getIsColRule() {
            return this.isColRule;
        }

        public StartTaskQualityResponseBodyReturnValueWeakMethodSet setIsSqlRule(Boolean isSqlRule) {
            this.isSqlRule = isSqlRule;
            return this;
        }
        public Boolean getIsSqlRule() {
            return this.isSqlRule;
        }

        public StartTaskQualityResponseBodyReturnValueWeakMethodSet setIsStrongRule(Boolean isStrongRule) {
            this.isStrongRule = isStrongRule;
            return this;
        }
        public Boolean getIsStrongRule() {
            return this.isStrongRule;
        }

        public StartTaskQualityResponseBodyReturnValueWeakMethodSet setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public StartTaskQualityResponseBodyReturnValueWeakMethodSet setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class StartTaskQualityResponseBodyReturnValue extends TeaModel {
        @NameInMap("ActualExpression")
        public String actualExpression;

        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("CallbackUrl")
        public String callbackUrl;

        @NameInMap("Connection")
        public String connection;

        @NameInMap("EntityId")
        public Long entityId;

        @NameInMap("MatchExpression")
        public String matchExpression;

        @NameInMap("PluginName")
        public String pluginName;

        @NameInMap("StatisticsFlag")
        public Long statisticsFlag;

        @NameInMap("StrongMethodSet")
        public java.util.List<StartTaskQualityResponseBodyReturnValueStrongMethodSet> strongMethodSet;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TriggerFlag")
        public Long triggerFlag;

        @NameInMap("WeakMethodSet")
        public java.util.List<StartTaskQualityResponseBodyReturnValueWeakMethodSet> weakMethodSet;

        public static StartTaskQualityResponseBodyReturnValue build(java.util.Map<String, ?> map) throws Exception {
            StartTaskQualityResponseBodyReturnValue self = new StartTaskQualityResponseBodyReturnValue();
            return TeaModel.build(map, self);
        }

        public StartTaskQualityResponseBodyReturnValue setActualExpression(String actualExpression) {
            this.actualExpression = actualExpression;
            return this;
        }
        public String getActualExpression() {
            return this.actualExpression;
        }

        public StartTaskQualityResponseBodyReturnValue setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public StartTaskQualityResponseBodyReturnValue setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public StartTaskQualityResponseBodyReturnValue setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public StartTaskQualityResponseBodyReturnValue setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public StartTaskQualityResponseBodyReturnValue setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public StartTaskQualityResponseBodyReturnValue setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public StartTaskQualityResponseBodyReturnValue setStatisticsFlag(Long statisticsFlag) {
            this.statisticsFlag = statisticsFlag;
            return this;
        }
        public Long getStatisticsFlag() {
            return this.statisticsFlag;
        }

        public StartTaskQualityResponseBodyReturnValue setStrongMethodSet(java.util.List<StartTaskQualityResponseBodyReturnValueStrongMethodSet> strongMethodSet) {
            this.strongMethodSet = strongMethodSet;
            return this;
        }
        public java.util.List<StartTaskQualityResponseBodyReturnValueStrongMethodSet> getStrongMethodSet() {
            return this.strongMethodSet;
        }

        public StartTaskQualityResponseBodyReturnValue setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public StartTaskQualityResponseBodyReturnValue setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public StartTaskQualityResponseBodyReturnValue setTriggerFlag(Long triggerFlag) {
            this.triggerFlag = triggerFlag;
            return this;
        }
        public Long getTriggerFlag() {
            return this.triggerFlag;
        }

        public StartTaskQualityResponseBodyReturnValue setWeakMethodSet(java.util.List<StartTaskQualityResponseBodyReturnValueWeakMethodSet> weakMethodSet) {
            this.weakMethodSet = weakMethodSet;
            return this;
        }
        public java.util.List<StartTaskQualityResponseBodyReturnValueWeakMethodSet> getWeakMethodSet() {
            return this.weakMethodSet;
        }

    }

}
