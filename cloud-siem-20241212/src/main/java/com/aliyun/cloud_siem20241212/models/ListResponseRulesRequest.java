// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListResponseRulesRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is required in actual API calls. If it is not provided, the service returns a 400 error &quot;The specified Lang can not be empty.&quot;. Explicitly pass the language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of data records to return for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position from which to start reading. If you leave this parameter empty, the reading starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the current page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the data management center for threat analysis is located. You must select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland and Hong Kong (China).</li>
     * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The action type of the automatic response rule. Valid values:</p>
     * <ul>
     * <li>doPlaybook: Execute a playbook.</li>
     * <li>changeEventStatus: Update the event status.</li>
     * <li>changeThreatLevel: Update the event threat level.</li>
     * <li>addEventTag: Add an event tag.</li>
     * <li>deleteEventTag: Delete an event tag.</li>
     * <li>alertWhitelist: Add an alert to the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doPlaybook</p>
     */
    @NameInMap("ResponseActionType")
    public String responseActionType;

    /**
     * <p>The name of the automatic response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Send Notification When Generating Urgent Incident</p>
     */
    @NameInMap("ResponseRuleName")
    public String responseRuleName;

    /**
     * <p>The status of the automatic response rule. Valid values:</p>
     * <ul>
     * <li>0: Disabled.</li>
     * <li>100: Enabled.</li>
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
     * <li>preset: Preset.</li>
     * <li>custom: Custom.</li>
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
     * <li>event: Event occurrence.</li>
     * <li>event_update: Event update.</li>
     * <li>alert: Alert occurrence.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("ResponseTriggerType")
    public String responseTriggerType;

    /**
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: The view of the current Alibaba Cloud account.</li>
     * <li>1: The view of all accounts in the enterprise.</li>
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
