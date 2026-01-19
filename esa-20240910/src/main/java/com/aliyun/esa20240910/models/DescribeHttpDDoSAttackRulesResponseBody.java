// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSAttackRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D4030CD2-0D9D-5E92-B358-421AE58307C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleInfos")
    public java.util.List<DescribeHttpDDoSAttackRulesResponseBodyRuleInfos> ruleInfos;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHttpDDoSAttackRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSAttackRulesResponseBody self = new DescribeHttpDDoSAttackRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSAttackRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHttpDDoSAttackRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHttpDDoSAttackRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHttpDDoSAttackRulesResponseBody setRuleInfos(java.util.List<DescribeHttpDDoSAttackRulesResponseBodyRuleInfos> ruleInfos) {
        this.ruleInfos = ruleInfos;
        return this;
    }
    public java.util.List<DescribeHttpDDoSAttackRulesResponseBodyRuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    public DescribeHttpDDoSAttackRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHttpDDoSAttackRulesResponseBodyRuleInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("DefaultAction")
        public String defaultAction;

        /**
         * <strong>example:</strong>
         * <p>100010</p>
         */
        @NameInMap("LogRuleId")
        public Integer logRuleId;

        /**
         * <strong>example:</strong>
         * <p>The HTTP request\&quot;s Accept header contains invalid features#1</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <strong>example:</strong>
         * <p>20203578</p>
         */
        @NameInMap("RuleId")
        public Integer ruleId;

        /**
         * <strong>example:</strong>
         * <p>global_01_s</p>
         */
        @NameInMap("RuleIdInfo")
        public String ruleIdInfo;

        /**
         * <strong>example:</strong>
         * <p>Illegal request。</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeHttpDDoSAttackRulesResponseBodyRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHttpDDoSAttackRulesResponseBodyRuleInfos self = new DescribeHttpDDoSAttackRulesResponseBodyRuleInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHttpDDoSAttackRulesResponseBodyRuleInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeHttpDDoSAttackRulesResponseBodyRuleInfos setDefaultAction(String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }
        public String getDefaultAction() {
            return this.defaultAction;
        }

        public DescribeHttpDDoSAttackRulesResponseBodyRuleInfos setLogRuleId(Integer logRuleId) {
            this.logRuleId = logRuleId;
            return this;
        }
        public Integer getLogRuleId() {
            return this.logRuleId;
        }

        public DescribeHttpDDoSAttackRulesResponseBodyRuleInfos setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public DescribeHttpDDoSAttackRulesResponseBodyRuleInfos setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public DescribeHttpDDoSAttackRulesResponseBodyRuleInfos setRuleIdInfo(String ruleIdInfo) {
            this.ruleIdInfo = ruleIdInfo;
            return this;
        }
        public String getRuleIdInfo() {
            return this.ruleIdInfo;
        }

        public DescribeHttpDDoSAttackRulesResponseBodyRuleInfos setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeHttpDDoSAttackRulesResponseBodyRuleInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
