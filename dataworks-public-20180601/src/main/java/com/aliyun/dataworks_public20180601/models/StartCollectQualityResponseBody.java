// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartCollectQualityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("ReturnValue")
    public java.util.List<StartCollectQualityResponseBodyReturnValue> returnValue;

    public static StartCollectQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCollectQualityResponseBody self = new StartCollectQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCollectQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartCollectQualityResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public StartCollectQualityResponseBody setReturnValue(java.util.List<StartCollectQualityResponseBodyReturnValue> returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public java.util.List<StartCollectQualityResponseBodyReturnValue> getReturnValue() {
        return this.returnValue;
    }

    public static class StartCollectQualityResponseBodyReturnValueStrongMethodSet extends TeaModel {
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

        public static StartCollectQualityResponseBodyReturnValueStrongMethodSet build(java.util.Map<String, ?> map) throws Exception {
            StartCollectQualityResponseBodyReturnValueStrongMethodSet self = new StartCollectQualityResponseBodyReturnValueStrongMethodSet();
            return TeaModel.build(map, self);
        }

        public StartCollectQualityResponseBodyReturnValueStrongMethodSet setColName(String colName) {
            this.colName = colName;
            return this;
        }
        public String getColName() {
            return this.colName;
        }

        public StartCollectQualityResponseBodyReturnValueStrongMethodSet setIsColRule(Boolean isColRule) {
            this.isColRule = isColRule;
            return this;
        }
        public Boolean getIsColRule() {
            return this.isColRule;
        }

        public StartCollectQualityResponseBodyReturnValueStrongMethodSet setIsSqlRule(Boolean isSqlRule) {
            this.isSqlRule = isSqlRule;
            return this;
        }
        public Boolean getIsSqlRule() {
            return this.isSqlRule;
        }

        public StartCollectQualityResponseBodyReturnValueStrongMethodSet setIsStrongRule(Boolean isStrongRule) {
            this.isStrongRule = isStrongRule;
            return this;
        }
        public Boolean getIsStrongRule() {
            return this.isStrongRule;
        }

        public StartCollectQualityResponseBodyReturnValueStrongMethodSet setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public StartCollectQualityResponseBodyReturnValueStrongMethodSet setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class StartCollectQualityResponseBodyReturnValueWeakMethodSet extends TeaModel {
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

        public static StartCollectQualityResponseBodyReturnValueWeakMethodSet build(java.util.Map<String, ?> map) throws Exception {
            StartCollectQualityResponseBodyReturnValueWeakMethodSet self = new StartCollectQualityResponseBodyReturnValueWeakMethodSet();
            return TeaModel.build(map, self);
        }

        public StartCollectQualityResponseBodyReturnValueWeakMethodSet setColName(String colName) {
            this.colName = colName;
            return this;
        }
        public String getColName() {
            return this.colName;
        }

        public StartCollectQualityResponseBodyReturnValueWeakMethodSet setIsColRule(Boolean isColRule) {
            this.isColRule = isColRule;
            return this;
        }
        public Boolean getIsColRule() {
            return this.isColRule;
        }

        public StartCollectQualityResponseBodyReturnValueWeakMethodSet setIsSqlRule(Boolean isSqlRule) {
            this.isSqlRule = isSqlRule;
            return this;
        }
        public Boolean getIsSqlRule() {
            return this.isSqlRule;
        }

        public StartCollectQualityResponseBodyReturnValueWeakMethodSet setIsStrongRule(Boolean isStrongRule) {
            this.isStrongRule = isStrongRule;
            return this;
        }
        public Boolean getIsStrongRule() {
            return this.isStrongRule;
        }

        public StartCollectQualityResponseBodyReturnValueWeakMethodSet setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public StartCollectQualityResponseBodyReturnValueWeakMethodSet setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class StartCollectQualityResponseBodyReturnValue extends TeaModel {
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

        @NameInMap("StrongMethodSet")
        public java.util.List<StartCollectQualityResponseBodyReturnValueStrongMethodSet> strongMethodSet;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("WeakMethodSet")
        public java.util.List<StartCollectQualityResponseBodyReturnValueWeakMethodSet> weakMethodSet;

        public static StartCollectQualityResponseBodyReturnValue build(java.util.Map<String, ?> map) throws Exception {
            StartCollectQualityResponseBodyReturnValue self = new StartCollectQualityResponseBodyReturnValue();
            return TeaModel.build(map, self);
        }

        public StartCollectQualityResponseBodyReturnValue setActualExpression(String actualExpression) {
            this.actualExpression = actualExpression;
            return this;
        }
        public String getActualExpression() {
            return this.actualExpression;
        }

        public StartCollectQualityResponseBodyReturnValue setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public StartCollectQualityResponseBodyReturnValue setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public StartCollectQualityResponseBodyReturnValue setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public StartCollectQualityResponseBodyReturnValue setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public StartCollectQualityResponseBodyReturnValue setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public StartCollectQualityResponseBodyReturnValue setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public StartCollectQualityResponseBodyReturnValue setStrongMethodSet(java.util.List<StartCollectQualityResponseBodyReturnValueStrongMethodSet> strongMethodSet) {
            this.strongMethodSet = strongMethodSet;
            return this;
        }
        public java.util.List<StartCollectQualityResponseBodyReturnValueStrongMethodSet> getStrongMethodSet() {
            return this.strongMethodSet;
        }

        public StartCollectQualityResponseBodyReturnValue setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public StartCollectQualityResponseBodyReturnValue setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public StartCollectQualityResponseBodyReturnValue setWeakMethodSet(java.util.List<StartCollectQualityResponseBodyReturnValueWeakMethodSet> weakMethodSet) {
            this.weakMethodSet = weakMethodSet;
            return this;
        }
        public java.util.List<StartCollectQualityResponseBodyReturnValueWeakMethodSet> getWeakMethodSet() {
            return this.weakMethodSet;
        }

    }

}
