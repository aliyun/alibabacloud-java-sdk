// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListResponseRulesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position from which the current call starts reading. An empty value indicates that all data has been read.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
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

    /**
     * <p>The list of automatic response rules.</p>
     */
    @NameInMap("ResponseRules")
    public java.util.List<ListResponseRulesResponseBodyResponseRules> responseRules;

    /**
     * <p>The total number of records that match the request conditions. This parameter is optional and is not returned by default.</p>
     * 
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
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1769843323000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The action configuration of the automatic response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;actionType&quot;:&quot;doPlaybook&quot;,&quot;playbookName&quot;:&quot;block waf IP&quot;,&quot;playbookUuid&quot;:&quot;system_aliyun_waf_whole_process_book&quot;,&quot;disposeParam&quot;:{&quot;period&quot;:&quot;7d&quot;}}]</p>
         */
        @NameInMap("ResponseActionConfig")
        public String responseActionConfig;

        /**
         * <p>The action type of the automatic response rule. Valid values:</p>
         * <ul>
         * <li>doPlaybook: execute a playbook</li>
         * <li>changeEventStatus: update event status</li>
         * <li>changeThreatLevel: update event threat level</li>
         * <li>addEventTag: add an event label</li>
         * <li>deleteEventTag: delete an event label</li>
         * <li>alertWhitelist: add alert to whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>doPlaybook</p>
         */
        @NameInMap("ResponseActionType")
        public String responseActionType;

        /**
         * <p>The trigger condition configuration of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;threat_level&quot;},&quot;operator&quot;:&quot;equals&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;suspicious&quot;}}]</p>
         */
        @NameInMap("ResponseExecutionCondition")
        public String responseExecutionCondition;

        /**
         * <p>The ID of the automatic response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>403235</p>
         */
        @NameInMap("ResponseRuleId")
        public String responseRuleId;

        /**
         * <p>The name of the automatic response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Send Notification When Generating Urgent Incident</p>
         */
        @NameInMap("ResponseRuleName")
        public String responseRuleName;

        /**
         * <p>The execution priority of the automatic response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResponseRulePriority")
        public Integer responseRulePriority;

        @NameInMap("ResponseRuleRemark")
        public String responseRuleRemark;

        /**
         * <p>The status of the automatic response rule. Valid values:</p>
         * <ul>
         * <li>0: disabled</li>
         * <li>100: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResponseRuleStatus")
        public Integer responseRuleStatus;

        /**
         * <p>The type of the response rule. Valid values:</p>
         * <ul>
         * <li>preset: predefined</li>
         * <li>custom: custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ResponseRuleType")
        public String responseRuleType;

        /**
         * <p>The trigger type of the automatic response rule. Valid values:</p>
         * <ul>
         * <li>event: event occurred</li>
         * <li>event_update: event updated</li>
         * <li>alert: alert occurred</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>event</p>
         */
        @NameInMap("ResponseTriggerType")
        public String responseTriggerType;

        /**
         * <p>The time when the rule was last updated.</p>
         * 
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

        public ListResponseRulesResponseBodyResponseRules setResponseRuleRemark(String responseRuleRemark) {
            this.responseRuleRemark = responseRuleRemark;
            return this;
        }
        public String getResponseRuleRemark() {
            return this.responseRuleRemark;
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
