// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAllAlarmRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAllAlarmRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAllAlarmRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllAlarmRulesResponseBody self = new QueryAllAlarmRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllAlarmRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAllAlarmRulesResponseBody setData(QueryAllAlarmRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAllAlarmRulesResponseBodyData getData() {
        return this.data;
    }

    public QueryAllAlarmRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllAlarmRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllAlarmRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions extends TeaModel {
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

        public static QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions self = new QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions();
            return TeaModel.build(map, self);
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setConditionId(Long conditionId) {
            this.conditionId = conditionId;
            return this;
        }
        public Long getConditionId() {
            return this.conditionId;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setConditionVal(String conditionVal) {
            this.conditionVal = conditionVal;
            return this;
        }
        public String getConditionVal() {
            return this.conditionVal;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setGroupInterval(String groupInterval) {
            this.groupInterval = groupInterval;
            return this;
        }
        public String getGroupInterval() {
            return this.groupInterval;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setGroupWait(Integer groupWait) {
            this.groupWait = groupWait;
            return this;
        }
        public Integer getGroupWait() {
            return this.groupWait;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setRelationship(String relationship) {
            this.relationship = relationship;
            return this;
        }
        public String getRelationship() {
            return this.relationship;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions setSlo(Float slo) {
            this.slo = slo;
            return this;
        }
        public Float getSlo() {
            return this.slo;
        }

    }

    public static class QueryAllAlarmRulesResponseBodyDataAlarmRules extends TeaModel {
        @NameInMap("AlarmGroup")
        public String alarmGroup;

        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("AlarmOn")
        public String alarmOn;

        @NameInMap("AlarmRuleConditions")
        public java.util.List<QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions> alarmRuleConditions;

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

        public static QueryAllAlarmRulesResponseBodyDataAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            QueryAllAlarmRulesResponseBodyDataAlarmRules self = new QueryAllAlarmRulesResponseBodyDataAlarmRules();
            return TeaModel.build(map, self);
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setAlarmOn(String alarmOn) {
            this.alarmOn = alarmOn;
            return this;
        }
        public String getAlarmOn() {
            return this.alarmOn;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setAlarmRuleConditions(java.util.List<QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions> alarmRuleConditions) {
            this.alarmRuleConditions = alarmRuleConditions;
            return this;
        }
        public java.util.List<QueryAllAlarmRulesResponseBodyDataAlarmRulesAlarmRuleConditions> getAlarmRuleConditions() {
            return this.alarmRuleConditions;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setAlarmRuleId(Long alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public Long getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setAndOr(String andOr) {
            this.andOr = andOr;
            return this;
        }
        public String getAndOr() {
            return this.andOr;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setRepeatInterval(String repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public String getRepeatInterval() {
            return this.repeatInterval;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setSilencePeriod(String silencePeriod) {
            this.silencePeriod = silencePeriod;
            return this;
        }
        public String getSilencePeriod() {
            return this.silencePeriod;
        }

        public QueryAllAlarmRulesResponseBodyDataAlarmRules setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryAllAlarmRulesResponseBodyData extends TeaModel {
        @NameInMap("AlarmRules")
        public java.util.List<QueryAllAlarmRulesResponseBodyDataAlarmRules> alarmRules;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static QueryAllAlarmRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAllAlarmRulesResponseBodyData self = new QueryAllAlarmRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAllAlarmRulesResponseBodyData setAlarmRules(java.util.List<QueryAllAlarmRulesResponseBodyDataAlarmRules> alarmRules) {
            this.alarmRules = alarmRules;
            return this;
        }
        public java.util.List<QueryAllAlarmRulesResponseBodyDataAlarmRules> getAlarmRules() {
            return this.alarmRules;
        }

        public QueryAllAlarmRulesResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryAllAlarmRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAllAlarmRulesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryAllAlarmRulesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
