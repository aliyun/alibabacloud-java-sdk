// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeIPSRulesResponseBody extends TeaModel {
    /**
     * <p>The number of rules that have the <code>drop</code> action.</p>
     * 
     * <strong>example:</strong>
     * <p>976</p>
     */
    @NameInMap("DropCount")
    public Long dropCount;

    /**
     * <p>The number of high-risk rules.</p>
     * 
     * <strong>example:</strong>
     * <p>518</p>
     */
    @NameInMap("HighRiskCount")
    public Long highRiskCount;

    /**
     * <p>The total number of enabled rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1752</p>
     */
    @NameInMap("OpenCount")
    public Long openCount;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6DF55258-1448-5386-B263-4771D081****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeIPSRulesResponseBodyRules> rules;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total number of user-defined rules.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("UserDefineCount")
    public Long userDefineCount;

    public static DescribeIPSRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPSRulesResponseBody self = new DescribeIPSRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIPSRulesResponseBody setDropCount(Long dropCount) {
        this.dropCount = dropCount;
        return this;
    }
    public Long getDropCount() {
        return this.dropCount;
    }

    public DescribeIPSRulesResponseBody setHighRiskCount(Long highRiskCount) {
        this.highRiskCount = highRiskCount;
        return this;
    }
    public Long getHighRiskCount() {
        return this.highRiskCount;
    }

    public DescribeIPSRulesResponseBody setOpenCount(Long openCount) {
        this.openCount = openCount;
        return this;
    }
    public Long getOpenCount() {
        return this.openCount;
    }

    public DescribeIPSRulesResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeIPSRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeIPSRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIPSRulesResponseBody setRules(java.util.List<DescribeIPSRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeIPSRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeIPSRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeIPSRulesResponseBody setUserDefineCount(Long userDefineCount) {
        this.userDefineCount = userDefineCount;
        return this;
    }
    public Long getUserDefineCount() {
        return this.userDefineCount;
    }

    public static class DescribeIPSRulesResponseBodyRules extends TeaModel {
        /**
         * <p>The target application.</p>
         * 
         * <strong>example:</strong>
         * <p>SMB</p>
         */
        @NameInMap("AttackApp")
        public String attackApp;

        /**
         * <p>The attack type.</p>
         * 
         * <strong>example:</strong>
         * <p>Exception connection</p>
         */
        @NameInMap("AttackType")
        public String attackType;

        /**
         * <p>The current action.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
        @NameInMap("CurrentMode")
        public String currentMode;

        /**
         * <p>The CVE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cve-2024-38816</p>
         */
        @NameInMap("Cve")
        public String cve;

        /**
         * <p>The default action.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
        @NameInMap("DefaultMode")
        public String defaultMode;

        /**
         * <p>A description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The engine mode.</p>
         * <p>This parameter takes effect only when <code>DefaultMode</code> is set to <code>drop</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleClass")
        public Integer ruleClass;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f532f59d-2026-436b-8209-e04d8ebc2****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleLevel")
        public Long ruleLevel;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>Nmap扫描探测</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>d401b0cb-dc64-4bbe-bba0-3e7c744****</p>
         */
        @NameInMap("RuleUuid")
        public String ruleUuid;

        /**
         * <p>The UNIX timestamp for when the rule was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1775101028</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>Specifies whether the rule is user-defined.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserDefined")
        public String userDefined;

        /**
         * <p>The user-defined status of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserStatus")
        public Integer userStatus;

        public static DescribeIPSRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeIPSRulesResponseBodyRules self = new DescribeIPSRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeIPSRulesResponseBodyRules setAttackApp(String attackApp) {
            this.attackApp = attackApp;
            return this;
        }
        public String getAttackApp() {
            return this.attackApp;
        }

        public DescribeIPSRulesResponseBodyRules setAttackType(String attackType) {
            this.attackType = attackType;
            return this;
        }
        public String getAttackType() {
            return this.attackType;
        }

        public DescribeIPSRulesResponseBodyRules setCurrentMode(String currentMode) {
            this.currentMode = currentMode;
            return this;
        }
        public String getCurrentMode() {
            return this.currentMode;
        }

        public DescribeIPSRulesResponseBodyRules setCve(String cve) {
            this.cve = cve;
            return this;
        }
        public String getCve() {
            return this.cve;
        }

        public DescribeIPSRulesResponseBodyRules setDefaultMode(String defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        public String getDefaultMode() {
            return this.defaultMode;
        }

        public DescribeIPSRulesResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIPSRulesResponseBodyRules setRuleClass(Integer ruleClass) {
            this.ruleClass = ruleClass;
            return this;
        }
        public Integer getRuleClass() {
            return this.ruleClass;
        }

        public DescribeIPSRulesResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeIPSRulesResponseBodyRules setRuleLevel(Long ruleLevel) {
            this.ruleLevel = ruleLevel;
            return this;
        }
        public Long getRuleLevel() {
            return this.ruleLevel;
        }

        public DescribeIPSRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeIPSRulesResponseBodyRules setRuleUuid(String ruleUuid) {
            this.ruleUuid = ruleUuid;
            return this;
        }
        public String getRuleUuid() {
            return this.ruleUuid;
        }

        public DescribeIPSRulesResponseBodyRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeIPSRulesResponseBodyRules setUserDefined(String userDefined) {
            this.userDefined = userDefined;
            return this;
        }
        public String getUserDefined() {
            return this.userDefined;
        }

        public DescribeIPSRulesResponseBodyRules setUserStatus(Integer userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public Integer getUserStatus() {
            return this.userStatus;
        }

    }

}
