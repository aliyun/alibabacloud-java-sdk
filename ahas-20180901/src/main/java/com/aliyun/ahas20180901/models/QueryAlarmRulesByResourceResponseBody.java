// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAlarmRulesByResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAlarmRulesByResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAlarmRulesByResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmRulesByResourceResponseBody self = new QueryAlarmRulesByResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlarmRulesByResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAlarmRulesByResourceResponseBody setData(QueryAlarmRulesByResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAlarmRulesByResourceResponseBodyData getData() {
        return this.data;
    }

    public QueryAlarmRulesByResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAlarmRulesByResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlarmRulesByResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions extends TeaModel {
        @NameInMap("AlarmType")
        public String alarmType;

        @NameInMap("ConditionId")
        public Long conditionId;

        @NameInMap("ConditionVal")
        public String conditionVal;

        @NameInMap("GroupInterval")
        public String groupInterval;

        @NameInMap("GroupWait")
        public Integer groupWait;

        @NameInMap("Relationship")
        public String relationship;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Slo")
        public Float slo;

        public static QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions self = new QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions setConditionId(Long conditionId) {
            this.conditionId = conditionId;
            return this;
        }
        public Long getConditionId() {
            return this.conditionId;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions setConditionVal(String conditionVal) {
            this.conditionVal = conditionVal;
            return this;
        }
        public String getConditionVal() {
            return this.conditionVal;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions setGroupInterval(String groupInterval) {
            this.groupInterval = groupInterval;
            return this;
        }
        public String getGroupInterval() {
            return this.groupInterval;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions setGroupWait(Integer groupWait) {
            this.groupWait = groupWait;
            return this;
        }
        public Integer getGroupWait() {
            return this.groupWait;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions setRelationship(String relationship) {
            this.relationship = relationship;
            return this;
        }
        public String getRelationship() {
            return this.relationship;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions setSlo(Float slo) {
            this.slo = slo;
            return this;
        }
        public Float getSlo() {
            return this.slo;
        }

    }

    public static class QueryAlarmRulesByResourceResponseBodyDataAlarmRules extends TeaModel {
        @NameInMap("AlarmGroup")
        public String alarmGroup;

        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("AlarmOn")
        public String alarmOn;

        @NameInMap("AlarmRuleConditions")
        public java.util.List<QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions> alarmRuleConditions;

        @NameInMap("AlarmRuleId")
        public Long alarmRuleId;

        @NameInMap("AndOr")
        public String andOr;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RepeatInterval")
        public String repeatInterval;

        @NameInMap("SilencePeriod")
        public String silencePeriod;

        @NameInMap("UserId")
        public String userId;

        public static QueryAlarmRulesByResourceResponseBodyDataAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRulesByResourceResponseBodyDataAlarmRules self = new QueryAlarmRulesByResourceResponseBodyDataAlarmRules();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setAlarmOn(String alarmOn) {
            this.alarmOn = alarmOn;
            return this;
        }
        public String getAlarmOn() {
            return this.alarmOn;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setAlarmRuleConditions(java.util.List<QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions> alarmRuleConditions) {
            this.alarmRuleConditions = alarmRuleConditions;
            return this;
        }
        public java.util.List<QueryAlarmRulesByResourceResponseBodyDataAlarmRulesAlarmRuleConditions> getAlarmRuleConditions() {
            return this.alarmRuleConditions;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setAlarmRuleId(Long alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public Long getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setAndOr(String andOr) {
            this.andOr = andOr;
            return this;
        }
        public String getAndOr() {
            return this.andOr;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setRepeatInterval(String repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public String getRepeatInterval() {
            return this.repeatInterval;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setSilencePeriod(String silencePeriod) {
            this.silencePeriod = silencePeriod;
            return this;
        }
        public String getSilencePeriod() {
            return this.silencePeriod;
        }

        public QueryAlarmRulesByResourceResponseBodyDataAlarmRules setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryAlarmRulesByResourceResponseBodyData extends TeaModel {
        @NameInMap("AlarmRules")
        public java.util.List<QueryAlarmRulesByResourceResponseBodyDataAlarmRules> alarmRules;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static QueryAlarmRulesByResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRulesByResourceResponseBodyData self = new QueryAlarmRulesByResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRulesByResourceResponseBodyData setAlarmRules(java.util.List<QueryAlarmRulesByResourceResponseBodyDataAlarmRules> alarmRules) {
            this.alarmRules = alarmRules;
            return this;
        }
        public java.util.List<QueryAlarmRulesByResourceResponseBodyDataAlarmRules> getAlarmRules() {
            return this.alarmRules;
        }

        public QueryAlarmRulesByResourceResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryAlarmRulesByResourceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAlarmRulesByResourceResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryAlarmRulesByResourceResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
