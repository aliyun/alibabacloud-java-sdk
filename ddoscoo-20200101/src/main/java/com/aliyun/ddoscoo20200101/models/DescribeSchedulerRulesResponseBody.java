// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSchedulerRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SchedulerRules")
    public java.util.List<DescribeSchedulerRulesResponseBodySchedulerRules> schedulerRules;

    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeSchedulerRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchedulerRulesResponseBody self = new DescribeSchedulerRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSchedulerRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSchedulerRulesResponseBody setSchedulerRules(java.util.List<DescribeSchedulerRulesResponseBodySchedulerRules> schedulerRules) {
        this.schedulerRules = schedulerRules;
        return this;
    }
    public java.util.List<DescribeSchedulerRulesResponseBodySchedulerRules> getSchedulerRules() {
        return this.schedulerRules;
    }

    public DescribeSchedulerRulesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData extends TeaModel {
        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        public static DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData self = new DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData();
            return TeaModel.build(map, self);
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

    }

    public static class DescribeSchedulerRulesResponseBodySchedulerRulesParam extends TeaModel {
        @NameInMap("ParamData")
        public DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData paramData;

        @NameInMap("ParamType")
        public String paramType;

        public static DescribeSchedulerRulesResponseBodySchedulerRulesParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchedulerRulesResponseBodySchedulerRulesParam self = new DescribeSchedulerRulesResponseBodySchedulerRulesParam();
            return TeaModel.build(map, self);
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesParam setParamData(DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData paramData) {
            this.paramData = paramData;
            return this;
        }
        public DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData getParamData() {
            return this.paramData;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesParam setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

    }

    public static class DescribeSchedulerRulesResponseBodySchedulerRulesRules extends TeaModel {
        @NameInMap("Line")
        public String line;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RestoreDelay")
        public Integer restoreDelay;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueType")
        public Integer valueType;

        public static DescribeSchedulerRulesResponseBodySchedulerRulesRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchedulerRulesResponseBodySchedulerRulesRules self = new DescribeSchedulerRulesResponseBodySchedulerRulesRules();
            return TeaModel.build(map, self);
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesRules setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesRules setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesRules setRestoreDelay(Integer restoreDelay) {
            this.restoreDelay = restoreDelay;
            return this;
        }
        public Integer getRestoreDelay() {
            return this.restoreDelay;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRulesRules setValueType(Integer valueType) {
            this.valueType = valueType;
            return this;
        }
        public Integer getValueType() {
            return this.valueType;
        }

    }

    public static class DescribeSchedulerRulesResponseBodySchedulerRules extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Param")
        public DescribeSchedulerRulesResponseBodySchedulerRulesParam param;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Rules")
        public java.util.List<DescribeSchedulerRulesResponseBodySchedulerRulesRules> rules;

        public static DescribeSchedulerRulesResponseBodySchedulerRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchedulerRulesResponseBodySchedulerRules self = new DescribeSchedulerRulesResponseBodySchedulerRules();
            return TeaModel.build(map, self);
        }

        public DescribeSchedulerRulesResponseBodySchedulerRules setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRules setParam(DescribeSchedulerRulesResponseBodySchedulerRulesParam param) {
            this.param = param;
            return this;
        }
        public DescribeSchedulerRulesResponseBodySchedulerRulesParam getParam() {
            return this.param;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRules setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public DescribeSchedulerRulesResponseBodySchedulerRules setRules(java.util.List<DescribeSchedulerRulesResponseBodySchedulerRulesRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeSchedulerRulesResponseBodySchedulerRulesRules> getRules() {
            return this.rules;
        }

    }

}
