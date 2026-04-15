// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListResponseRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseRules")
    public java.util.List<ListResponseRulesResponseBodyResponseRules> responseRules;

    /**
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResponseRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResponseRulesResponseBody self = new ListResponseRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResponseRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResponseRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResponseRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResponseRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResponseRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResponseRulesResponseBody setResponseRules(java.util.List<ListResponseRulesResponseBodyResponseRules> responseRules) {
        this.responseRules = responseRules;
        return this;
    }
    public java.util.List<ListResponseRulesResponseBodyResponseRules> getResponseRules() {
        return this.responseRules;
    }

    public ListResponseRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResponseRulesResponseBodyResponseRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1769843323000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;actionType&quot;:&quot;doPlaybook&quot;,&quot;playbookName&quot;:&quot;block waf IP&quot;,&quot;playbookUuid&quot;:&quot;system_aliyun_waf_whole_process_book&quot;,&quot;disposeParam&quot;:{&quot;period&quot;:&quot;7d&quot;}}]</p>
         */
        @NameInMap("ResponseActionConfig")
        public String responseActionConfig;

        /**
         * <strong>example:</strong>
         * <p>doPlaybook</p>
         */
        @NameInMap("ResponseActionType")
        public String responseActionType;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;threat_level&quot;},&quot;operator&quot;:&quot;equals&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;suspicious&quot;}}]</p>
         */
        @NameInMap("ResponseExecutionCondition")
        public String responseExecutionCondition;

        /**
         * <strong>example:</strong>
         * <p>403235</p>
         */
        @NameInMap("ResponseRuleId")
        public String responseRuleId;

        /**
         * <strong>example:</strong>
         * <p>Send Notification When Generating Urgent Incident</p>
         */
        @NameInMap("ResponseRuleName")
        public String responseRuleName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResponseRulePriority")
        public Integer responseRulePriority;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResponseRuleStatus")
        public Integer responseRuleStatus;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ResponseRuleType")
        public String responseRuleType;

        /**
         * <strong>example:</strong>
         * <p>event</p>
         */
        @NameInMap("ResponseTriggerType")
        public String responseTriggerType;

        /**
         * <strong>example:</strong>
         * <p>1769843323000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListResponseRulesResponseBodyResponseRules build(java.util.Map<String, ?> map) throws Exception {
            ListResponseRulesResponseBodyResponseRules self = new ListResponseRulesResponseBodyResponseRules();
            return TeaModel.build(map, self);
        }

        public ListResponseRulesResponseBodyResponseRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseActionConfig(String responseActionConfig) {
            this.responseActionConfig = responseActionConfig;
            return this;
        }
        public String getResponseActionConfig() {
            return this.responseActionConfig;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseActionType(String responseActionType) {
            this.responseActionType = responseActionType;
            return this;
        }
        public String getResponseActionType() {
            return this.responseActionType;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseExecutionCondition(String responseExecutionCondition) {
            this.responseExecutionCondition = responseExecutionCondition;
            return this;
        }
        public String getResponseExecutionCondition() {
            return this.responseExecutionCondition;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseRuleId(String responseRuleId) {
            this.responseRuleId = responseRuleId;
            return this;
        }
        public String getResponseRuleId() {
            return this.responseRuleId;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseRuleName(String responseRuleName) {
            this.responseRuleName = responseRuleName;
            return this;
        }
        public String getResponseRuleName() {
            return this.responseRuleName;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseRulePriority(Integer responseRulePriority) {
            this.responseRulePriority = responseRulePriority;
            return this;
        }
        public Integer getResponseRulePriority() {
            return this.responseRulePriority;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseRuleStatus(Integer responseRuleStatus) {
            this.responseRuleStatus = responseRuleStatus;
            return this;
        }
        public Integer getResponseRuleStatus() {
            return this.responseRuleStatus;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseRuleType(String responseRuleType) {
            this.responseRuleType = responseRuleType;
            return this;
        }
        public String getResponseRuleType() {
            return this.responseRuleType;
        }

        public ListResponseRulesResponseBodyResponseRules setResponseTriggerType(String responseTriggerType) {
            this.responseTriggerType = responseTriggerType;
            return this;
        }
        public String getResponseTriggerType() {
            return this.responseTriggerType;
        }

        public ListResponseRulesResponseBodyResponseRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
