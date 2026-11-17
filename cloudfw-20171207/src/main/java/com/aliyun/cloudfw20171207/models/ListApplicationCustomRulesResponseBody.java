// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListApplicationCustomRulesResponseBody extends TeaModel {
    /**
     * <p>The list of application custom rules, sorted by priority in ascending order.</p>
     */
    @NameInMap("ApplicationCustomRules")
    public java.util.List<ListApplicationCustomRulesResponseBodyApplicationCustomRules> applicationCustomRules;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of application custom rules that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationCustomRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationCustomRulesResponseBody self = new ListApplicationCustomRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationCustomRulesResponseBody setApplicationCustomRules(java.util.List<ListApplicationCustomRulesResponseBodyApplicationCustomRules> applicationCustomRules) {
        this.applicationCustomRules = applicationCustomRules;
        return this;
    }
    public java.util.List<ListApplicationCustomRulesResponseBodyApplicationCustomRules> getApplicationCustomRules() {
        return this.applicationCustomRules;
    }

    public ListApplicationCustomRulesResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListApplicationCustomRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationCustomRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationCustomRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications extends TeaModel {
        /**
         * <p>The ID of the application in the built-in application signature library.</p>
         * 
         * <strong>example:</strong>
         * <p>10012150000</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        /**
         * <p>The name of the application. The name is returned in Chinese or English based on the Lang parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        public static ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications self = new ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

    }

    public static class ListApplicationCustomRulesResponseBodyApplicationCustomRules extends TeaModel {
        /**
         * <p>The ID of the application custom rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-7d2e4f6a8b0c1d3e</p>
         */
        @NameInMap("ApplicationCustomRuleId")
        public String applicationCustomRuleId;

        /**
         * <p>The name of the custom rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom rule 01</p>
         */
        @NameInMap("ApplicationCustomRuleName")
        public String applicationCustomRuleName;

        /**
         * <p>The ID of the application template to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ati-4f0691c56b8d4f06</p>
         */
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        /**
         * <p>The list of applications associated with the rule.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications> applications;

        /**
         * <p>The priority of the rule. Valid values: integers from 1 to 200. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The action performed after the rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: allows the traffic.</li>
         * <li><strong>Alert</strong>: monitors the traffic.</li>
         * <li><strong>Deny</strong>: blocks the traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        public static ListApplicationCustomRulesResponseBodyApplicationCustomRules build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationCustomRulesResponseBodyApplicationCustomRules self = new ListApplicationCustomRulesResponseBodyApplicationCustomRules();
            return TeaModel.build(map, self);
        }

        public ListApplicationCustomRulesResponseBodyApplicationCustomRules setApplicationCustomRuleId(String applicationCustomRuleId) {
            this.applicationCustomRuleId = applicationCustomRuleId;
            return this;
        }
        public String getApplicationCustomRuleId() {
            return this.applicationCustomRuleId;
        }

        public ListApplicationCustomRulesResponseBodyApplicationCustomRules setApplicationCustomRuleName(String applicationCustomRuleName) {
            this.applicationCustomRuleName = applicationCustomRuleName;
            return this;
        }
        public String getApplicationCustomRuleName() {
            return this.applicationCustomRuleName;
        }

        public ListApplicationCustomRulesResponseBodyApplicationCustomRules setApplicationTemplateId(String applicationTemplateId) {
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        public ListApplicationCustomRulesResponseBodyApplicationCustomRules setApplications(java.util.List<ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListApplicationCustomRulesResponseBodyApplicationCustomRulesApplications> getApplications() {
            return this.applications;
        }

        public ListApplicationCustomRulesResponseBodyApplicationCustomRules setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListApplicationCustomRulesResponseBodyApplicationCustomRules setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

    }

}
