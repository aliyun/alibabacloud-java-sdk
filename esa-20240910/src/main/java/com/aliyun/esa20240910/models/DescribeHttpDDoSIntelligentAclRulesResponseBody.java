// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSIntelligentAclRulesResponseBody extends TeaModel {
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
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleInfos")
    public java.util.List<DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos> ruleInfos;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeHttpDDoSIntelligentAclRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSIntelligentAclRulesResponseBody self = new DescribeHttpDDoSIntelligentAclRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSIntelligentAclRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHttpDDoSIntelligentAclRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHttpDDoSIntelligentAclRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHttpDDoSIntelligentAclRulesResponseBody setRuleInfos(java.util.List<DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos> ruleInfos) {
        this.ruleInfos = ruleInfos;
        return this;
    }
    public java.util.List<DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos> getRuleInfos() {
        return this.ruleInfos;
    }

    public DescribeHttpDDoSIntelligentAclRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>deny</p>
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
         * <p>1000030</p>
         */
        @NameInMap("LogRuleId")
        public Long logRuleId;

        /**
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("PunishTime")
        public Long punishTime;

        /**
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <strong>example:</strong>
         * <p>20569929</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <strong>example:</strong>
         * <p>smart_cc_***</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos self = new DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos setLogRuleId(Long logRuleId) {
            this.logRuleId = logRuleId;
            return this;
        }
        public Long getLogRuleId() {
            return this.logRuleId;
        }

        public DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos setPunishTime(Long punishTime) {
            this.punishTime = punishTime;
            return this;
        }
        public Long getPunishTime() {
            return this.punishTime;
        }

        public DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeHttpDDoSIntelligentAclRulesResponseBodyRuleInfos setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
