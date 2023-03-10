// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSchedulerRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the scheduling rule.</p>
     */
    @NameInMap("SchedulerRules")
    public java.util.List<DescribeSchedulerRulesResponseBodySchedulerRules> schedulerRules;

    /**
     * <p>The total number of returned scheduling rules.</p>
     */
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
        /**
         * <p>The ID of the GA instance.</p>
         */
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
        /**
         * <p>The interaction resource.</p>
         */
        @NameInMap("ParamData")
        public DescribeSchedulerRulesResponseBodySchedulerRulesParamParamData paramData;

        /**
         * <p>The type of the interaction resource. Valid value: **GA**, which indicates that the Global Accelerator instance is used.</p>
         */
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
        /**
         * <p>The priority of the rule.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the region.</p>
         * <br>
         * <p>> This parameter is returned only if the **RuleType** parameter is set to **2**.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The waiting time of switching back. Unit: minutes.</p>
         */
        @NameInMap("RestoreDelay")
        public Integer restoreDelay;

        /**
         * <p>The status of the scheduling rule. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The address type of the interaction resource. Valid values:</p>
         * <br>
         * <p>*   **A**: IPv4 address</p>
         * <p>*   **CNAME**: CNAME record</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The address of the interaction resource.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The address type of the interaction resource. Valid values:</p>
         * <br>
         * <p>*   **1**: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance</p>
         * <p>*   **2**: the IP address of the interaction resource in the tiered protection scenario</p>
         * <p>*   **3**: the IP address that is used to accelerate access in the network acceleration scenario</p>
         * <p>*   **5**: the domain name that is configured in CDN in the CDN interaction scenario</p>
         * <p>*   **6** the IP address of the interaction resource in the cloud service interaction scenario</p>
         */
        @NameInMap("ValueType")
        public Integer valueType;

        public static DescribeSchedulerRulesResponseBodySchedulerRulesRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchedulerRulesResponseBodySchedulerRulesRules self = new DescribeSchedulerRulesResponseBodySchedulerRulesRules();
            return TeaModel.build(map, self);
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
        /**
         * <p>The Canonical Name (CNAME) record assigned by Sec-Traffic Manager for the scheduling rule.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.</p>
         */
        @NameInMap("Param")
        public DescribeSchedulerRulesResponseBodySchedulerRulesParam param;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <br>
         * <p>*   **2**: tiered protection</p>
         * <p>*   **3**: network acceleration</p>
         * <p>*   **5**: Alibaba Cloud CDN (CDN) interaction</p>
         * <p>*   **6**: cloud service interaction</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>An array that consists of the rules.</p>
         */
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
