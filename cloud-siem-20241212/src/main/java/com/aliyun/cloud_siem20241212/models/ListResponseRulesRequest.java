// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListResponseRulesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. If you leave this parameter empty, the first page of results is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region of the data management center for threat analysis. Select the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p><code>cn-hangzhou</code>: Your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p><code>ap-southeast-1</code>: Your assets are in international regions.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The action of the automated response rule. Valid values:</p>
     * <ul>
     * <li><p><code>doPlaybook</code>: Executes a playbook.</p>
     * </li>
     * <li><p><code>changeEventStatus</code>: Updates the status of an event.</p>
     * </li>
     * <li><p><code>changeThreatLevel</code>: Updates the threat level of an event.</p>
     * </li>
     * <li><p><code>addEventTag</code>: Adds a tag to an event.</p>
     * </li>
     * <li><p><code>deleteEventTag</code>: Removes a tag from an event.</p>
     * </li>
     * <li><p><code>alertWhitelist</code>: Adds an alert to the allowlist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doPlaybook</p>
     */
    @NameInMap("ResponseActionType")
    public String responseActionType;

    /**
     * <p>The name of the automated response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Send Notification When Generating Urgent Incident</p>
     */
    @NameInMap("ResponseRuleName")
    public String responseRuleName;

    /**
     * <p>The status of the automated response rule. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: disabled</p>
     * </li>
     * <li><p><code>100</code>: enabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResponseRuleStatus")
    public Integer responseRuleStatus;

    /**
     * <p>The type of the automated response rule. Valid values:</p>
     * <ul>
     * <li><p><code>preset</code>: A preset rule.</p>
     * </li>
     * <li><p><code>custom</code>: A custom rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ResponseRuleType")
    public String responseRuleType;

    /**
     * <p>The trigger type of the automated response rule. Valid values:</p>
     * <ul>
     * <li><p><code>event</code>: An event is generated.</p>
     * </li>
     * <li><p><code>event_update</code>: An event is updated.</p>
     * </li>
     * <li><p><code>alert</code>: An alert is generated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("ResponseTriggerType")
    public String responseTriggerType;

    /**
     * <p>The ID of a member. An administrator can use this parameter to view data as the specified member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: Displays data from the current Alibaba Cloud account.</p>
     * </li>
     * <li><p><code>1</code>: Displays data from all accounts in the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static ListResponseRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResponseRulesRequest self = new ListResponseRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListResponseRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListResponseRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResponseRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResponseRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResponseRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResponseRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListResponseRulesRequest setResponseActionType(String responseActionType) {
        this.responseActionType = responseActionType;
        return this;
    }
    public String getResponseActionType() {
        return this.responseActionType;
    }

    public ListResponseRulesRequest setResponseRuleName(String responseRuleName) {
        this.responseRuleName = responseRuleName;
        return this;
    }
    public String getResponseRuleName() {
        return this.responseRuleName;
    }

    public ListResponseRulesRequest setResponseRuleStatus(Integer responseRuleStatus) {
        this.responseRuleStatus = responseRuleStatus;
        return this;
    }
    public Integer getResponseRuleStatus() {
        return this.responseRuleStatus;
    }

    public ListResponseRulesRequest setResponseRuleType(String responseRuleType) {
        this.responseRuleType = responseRuleType;
        return this;
    }
    public String getResponseRuleType() {
        return this.responseRuleType;
    }

    public ListResponseRulesRequest setResponseTriggerType(String responseTriggerType) {
        this.responseTriggerType = responseTriggerType;
        return this;
    }
    public String getResponseTriggerType() {
        return this.responseTriggerType;
    }

    public ListResponseRulesRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListResponseRulesRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
