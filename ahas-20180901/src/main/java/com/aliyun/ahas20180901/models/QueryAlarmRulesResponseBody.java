// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAlarmRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAlarmRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAlarmRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmRulesResponseBody self = new QueryAlarmRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlarmRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAlarmRulesResponseBody setData(QueryAlarmRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAlarmRulesResponseBodyData getData() {
        return this.data;
    }

    public QueryAlarmRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAlarmRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlarmRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions extends TeaModel {
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

        public static QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions self = new QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setConditionId(Long conditionId) {
            this.conditionId = conditionId;
            return this;
        }
        public Long getConditionId() {
            return this.conditionId;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setConditionVal(String conditionVal) {
            this.conditionVal = conditionVal;
            return this;
        }
        public String getConditionVal() {
            return this.conditionVal;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setGroupInterval(String groupInterval) {
            this.groupInterval = groupInterval;
            return this;
        }
        public String getGroupInterval() {
            return this.groupInterval;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setGroupWait(Integer groupWait) {
            this.groupWait = groupWait;
            return this;
        }
        public Integer getGroupWait() {
            return this.groupWait;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setRelationship(String relationship) {
            this.relationship = relationship;
            return this;
        }
        public String getRelationship() {
            return this.relationship;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setSlo(Float slo) {
            this.slo = slo;
            return this;
        }
        public Float getSlo() {
            return this.slo;
        }

    }

    public static class QueryAlarmRulesResponseBodyDataAlarmRules extends TeaModel {
        @NameInMap("AlarmGroup")
        public String alarmGroup;

        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("AlarmOn")
        public String alarmOn;

        @NameInMap("AlarmRuleConditions")
        public java.util.List<QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions> alarmRuleConditions;

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

        public static QueryAlarmRulesResponseBodyDataAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRulesResponseBodyDataAlarmRules self = new QueryAlarmRulesResponseBodyDataAlarmRules();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setAlarmOn(String alarmOn) {
            this.alarmOn = alarmOn;
            return this;
        }
        public String getAlarmOn() {
            return this.alarmOn;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setAlarmRuleConditions(java.util.List<QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions> alarmRuleConditions) {
            this.alarmRuleConditions = alarmRuleConditions;
            return this;
        }
        public java.util.List<QueryAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions> getAlarmRuleConditions() {
            return this.alarmRuleConditions;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setAlarmRuleId(Long alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public Long getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setAndOr(String andOr) {
            this.andOr = andOr;
            return this;
        }
        public String getAndOr() {
            return this.andOr;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setRepeatInterval(String repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public String getRepeatInterval() {
            return this.repeatInterval;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setSilencePeriod(String silencePeriod) {
            this.silencePeriod = silencePeriod;
            return this;
        }
        public String getSilencePeriod() {
            return this.silencePeriod;
        }

        public QueryAlarmRulesResponseBodyDataAlarmRules setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryAlarmRulesResponseBodyData extends TeaModel {
        @NameInMap("AlarmRules")
        public java.util.List<QueryAlarmRulesResponseBodyDataAlarmRules> alarmRules;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static QueryAlarmRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRulesResponseBodyData self = new QueryAlarmRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRulesResponseBodyData setAlarmRules(java.util.List<QueryAlarmRulesResponseBodyDataAlarmRules> alarmRules) {
            this.alarmRules = alarmRules;
            return this;
        }
        public java.util.List<QueryAlarmRulesResponseBodyDataAlarmRules> getAlarmRules() {
            return this.alarmRules;
        }

        public QueryAlarmRulesResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryAlarmRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAlarmRulesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryAlarmRulesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
