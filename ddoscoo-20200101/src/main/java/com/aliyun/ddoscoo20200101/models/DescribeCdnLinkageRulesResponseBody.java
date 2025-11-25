// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCdnLinkageRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02FE96D9-C77B-5735-B36D-329E052C8047</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SchedulerRules")
    public java.util.List<DescribeCdnLinkageRulesResponseBodySchedulerRules> schedulerRules;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeCdnLinkageRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnLinkageRulesResponseBody self = new DescribeCdnLinkageRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnLinkageRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnLinkageRulesResponseBody setSchedulerRules(java.util.List<DescribeCdnLinkageRulesResponseBodySchedulerRules> schedulerRules) {
        this.schedulerRules = schedulerRules;
        return this;
    }
    public java.util.List<DescribeCdnLinkageRulesResponseBodySchedulerRules> getSchedulerRules() {
        return this.schedulerRules;
    }

    public DescribeCdnLinkageRulesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AccessQps")
        public Long accessQps;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UpstreamQps")
        public Long upstreamQps;

        public static DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData self = new DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData setAccessQps(Long accessQps) {
            this.accessQps = accessQps;
            return this;
        }
        public Long getAccessQps() {
            return this.accessQps;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData setUpstreamQps(Long upstreamQps) {
            this.upstreamQps = upstreamQps;
            return this;
        }
        public Long getUpstreamQps() {
            return this.upstreamQps;
        }

    }

    public static class DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam extends TeaModel {
        @NameInMap("ParamData")
        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData paramData;

        /**
         * <strong>example:</strong>
         * <p>cdn</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        public static DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam self = new DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam();
            return TeaModel.build(map, self);
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam setParamData(DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData paramData) {
            this.paramData = paramData;
            return this;
        }
        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParamParamData getParamData() {
            return this.paramData;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

    }

    public static class DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>203.107.XX.XX</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ValueType")
        public Integer valueType;

        public static DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules self = new DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules();
            return TeaModel.build(map, self);
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules setValueType(Integer valueType) {
            this.valueType = valueType;
            return this;
        }
        public Integer getValueType() {
            return this.valueType;
        }

    }

    public static class DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Param")
        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam param;

        /**
         * <strong>example:</strong>
         * <p>testDDos</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Rules")
        public java.util.List<DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules> rules;

        public static DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule self = new DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule();
            return TeaModel.build(map, self);
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule setParam(DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam param) {
            this.param = param;
            return this;
        }
        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleParam getParam() {
            return this.param;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule setRules(java.util.List<DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRuleRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeCdnLinkageRulesResponseBodySchedulerRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CdnLinkageEnable")
        public Integer cdnLinkageEnable;

        @NameInMap("CdnLinkageRule")
        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule cdnLinkageRule;

        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        public static DescribeCdnLinkageRulesResponseBodySchedulerRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnLinkageRulesResponseBodySchedulerRules self = new DescribeCdnLinkageRulesResponseBodySchedulerRules();
            return TeaModel.build(map, self);
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRules setCdnLinkageEnable(Integer cdnLinkageEnable) {
            this.cdnLinkageEnable = cdnLinkageEnable;
            return this;
        }
        public Integer getCdnLinkageEnable() {
            return this.cdnLinkageEnable;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRules setCdnLinkageRule(DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule cdnLinkageRule) {
            this.cdnLinkageRule = cdnLinkageRule;
            return this;
        }
        public DescribeCdnLinkageRulesResponseBodySchedulerRulesCdnLinkageRule getCdnLinkageRule() {
            return this.cdnLinkageRule;
        }

        public DescribeCdnLinkageRulesResponseBodySchedulerRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
