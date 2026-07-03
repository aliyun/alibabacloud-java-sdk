// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateResponseRuleRequest extends TeaModel {
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
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the position from which to start the query. If you do not specify this parameter, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The deployment region of the data management center for threat analysis. You must select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or Hong Kong (China).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in regions outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The action configuration, specified as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;actionType&quot;:&quot;doPlaybook&quot;,&quot;playbookName&quot;:&quot;block waf IP&quot;,&quot;playbookUuid&quot;:&quot;system_aliyun_waf_whole_process_book&quot;,&quot;disposeParam&quot;:{&quot;period&quot;:&quot;7d&quot;}}]</p>
     */
    @NameInMap("ResponseActionConfig")
    public String responseActionConfig;

    /**
     * <p>The action type for the automatic response rule. Valid values:</p>
     * <ul>
     * <li><p>doPlaybook: Runs a playbook.</p>
     * </li>
     * <li><p>changeEventStatus: Changes the status of an event.</p>
     * </li>
     * <li><p>changeThreatLevel: Changes the threat level of an event.</p>
     * </li>
     * <li><p>addEventTag: Adds a tag to an event.</p>
     * </li>
     * <li><p>deleteEventTag: Deletes a tag from an event.</p>
     * </li>
     * <li><p>alertWhitelist: Adds an alert to the allowlist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doPlaybook</p>
     */
    @NameInMap("ResponseActionType")
    public String responseActionType;

    /**
     * <p>The trigger conditions for the rule, specified as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;threat_level&quot;},&quot;operator&quot;:&quot;equals&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;suspicious&quot;}}]</p>
     */
    @NameInMap("ResponseExecutionCondition")
    public String responseExecutionCondition;

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
    public String responseRulePriority;

    /**
     * <p>The trigger type for the automatic response rule. Valid values:</p>
     * <ul>
     * <li><p>event: An event is generated.</p>
     * </li>
     * <li><p>event_update: An event is updated.</p>
     * </li>
     * <li><p>alert: An alert is generated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("ResponseTriggerType")
    public String responseTriggerType;

    /**
     * <p>The ID of the member account. An administrator uses this parameter to operate on behalf of the specified member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The operational scope. Valid values:</p>
     * <ul>
     * <li><p>0: Sets the scope to the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: Sets the scope to all accounts in the enterprise.</p>
     * </li>
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
