// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateResponseRuleRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of data records to return in the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which to start reading. If this parameter is left empty, the reading starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the data management center of Threat Analysis is located. You must select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland and Hong Kong (China).</li>
     * <li>ap-southeast-1: Assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The action configuration of the automated response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;actionType&quot;:&quot;doPlaybook&quot;,&quot;playbookName&quot;:&quot;block waf IP&quot;,&quot;playbookUuid&quot;:&quot;system_aliyun_waf_whole_process_book&quot;,&quot;disposeParam&quot;:{&quot;period&quot;:&quot;7d&quot;}}]</p>
     */
    @NameInMap("ResponseActionConfig")
    public String responseActionConfig;

    /**
     * <p>The action type of the automated response rule. Valid values:</p>
     * <ul>
     * <li>doPlaybook: Executes a playbook.</li>
     * <li>changeEventStatus: Updates the event status.</li>
     * <li>changeThreatLevel: Updates the threat level of the event.</li>
     * <li>addEventTag: Adds an event tag.</li>
     * <li>deleteEventTag: Deletes an event tag.</li>
     * <li>alertWhitelist: Adds an alert to the whitelist.</li>
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
     * <p>The name of the automated response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Send Notification When Generating Urgent Incident</p>
     */
    @NameInMap("ResponseRuleName")
    public String responseRuleName;

    /**
     * <p>The execution priority of the automated response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResponseRulePriority")
    public String responseRulePriority;

    /**
     * <p>The remarks of the response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Automatic notification rule for high-risk alerts</p>
     */
    @NameInMap("ResponseRuleRemark")
    public String responseRuleRemark;

    /**
     * <p>The trigger type of the automated response rule. Valid values:</p>
     * <ul>
     * <li>event: An event occurs.</li>
     * <li>event_update: An event is updated.</li>
     * <li>alert: An alert is triggered.</li>
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
     * <p>113091674488****</p>
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

    public static CreateResponseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResponseRuleRequest self = new CreateResponseRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateResponseRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateResponseRuleRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public CreateResponseRuleRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public CreateResponseRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateResponseRuleRequest setResponseActionConfig(String responseActionConfig) {
        this.responseActionConfig = responseActionConfig;
        return this;
    }
    public String getResponseActionConfig() {
        return this.responseActionConfig;
    }

    public CreateResponseRuleRequest setResponseActionType(String responseActionType) {
        this.responseActionType = responseActionType;
        return this;
    }
    public String getResponseActionType() {
        return this.responseActionType;
    }

    public CreateResponseRuleRequest setResponseExecutionCondition(String responseExecutionCondition) {
        this.responseExecutionCondition = responseExecutionCondition;
        return this;
    }
    public String getResponseExecutionCondition() {
        return this.responseExecutionCondition;
    }

    public CreateResponseRuleRequest setResponseRuleName(String responseRuleName) {
        this.responseRuleName = responseRuleName;
        return this;
    }
    public String getResponseRuleName() {
        return this.responseRuleName;
    }

    public CreateResponseRuleRequest setResponseRulePriority(String responseRulePriority) {
        this.responseRulePriority = responseRulePriority;
        return this;
    }
    public String getResponseRulePriority() {
        return this.responseRulePriority;
    }

    public CreateResponseRuleRequest setResponseRuleRemark(String responseRuleRemark) {
        this.responseRuleRemark = responseRuleRemark;
        return this;
    }
    public String getResponseRuleRemark() {
        return this.responseRuleRemark;
    }

    public CreateResponseRuleRequest setResponseTriggerType(String responseTriggerType) {
        this.responseTriggerType = responseTriggerType;
        return this;
    }
    public String getResponseTriggerType() {
        return this.responseTriggerType;
    }

    public CreateResponseRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CreateResponseRuleRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
