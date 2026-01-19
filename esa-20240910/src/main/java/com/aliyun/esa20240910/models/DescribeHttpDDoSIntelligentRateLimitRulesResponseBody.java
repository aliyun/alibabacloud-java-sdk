// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSIntelligentRateLimitRulesResponseBody extends TeaModel {
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
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleInfos")
    public java.util.List<DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos> ruleInfos;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeHttpDDoSIntelligentRateLimitRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSIntelligentRateLimitRulesResponseBody self = new DescribeHttpDDoSIntelligentRateLimitRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSIntelligentRateLimitRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHttpDDoSIntelligentRateLimitRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHttpDDoSIntelligentRateLimitRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHttpDDoSIntelligentRateLimitRulesResponseBody setRuleInfos(java.util.List<DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos> ruleInfos) {
        this.ruleInfos = ruleInfos;
        return this;
    }
    public java.util.List<DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    public DescribeHttpDDoSIntelligentRateLimitRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>js</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>{&quot;$and&quot;:[{&quot;key&quot;:&quot;URI&quot;,&quot;opValue&quot;:&quot;prefix-match&quot;,&quot;values&quot;:&quot;/&quot;}]}</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <strong>example:</strong>
         * <p>100030</p>
         */
        @NameInMap("LogRuleId")
        public Long logRuleId;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("PunishTime")
        public Long punishTime;

        /**
         * <strong>example:</strong>
         * <p>{&quot;threshold&quot;:2000,&quot;interval&quot;:5,&quot;target&quot;:&quot;ip&quot;,&quot;ttl&quot;:600}</p>
         */
        @NameInMap("RateLimit")
        public String rateLimit;

        /**
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <strong>example:</strong>
         * <p>20110849</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <strong>example:</strong>
         * <p>inner_cc_client_ip_ratelimit</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;field&quot;:&quot;ip&quot;,&quot;mode&quot;:&quot;count&quot;}</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        public static DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos self = new DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setLogRuleId(Long logRuleId) {
            this.logRuleId = logRuleId;
            return this;
        }
        public Long getLogRuleId() {
            return this.logRuleId;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setPunishTime(Long punishTime) {
            this.punishTime = punishTime;
            return this;
        }
        public Long getPunishTime() {
            return this.punishTime;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setRateLimit(String rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public String getRateLimit() {
            return this.rateLimit;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeHttpDDoSIntelligentRateLimitRulesResponseBodyRuleInfos setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

    }

}
