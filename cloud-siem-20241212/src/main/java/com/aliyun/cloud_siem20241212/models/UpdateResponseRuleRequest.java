// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateResponseRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
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
     * <p>The maximum number of data records to read in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that marks the position from which to start reading. If this parameter is left empty, data is read from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the data management center of the threat analysis feature is located. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: the Chinese mainland.</li>
     * <li>ap-southeast-1: outside China.</li>
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
     * <li>doPlaybook: execute a playbook.</li>
     * <li>changeEventStatus: update the event status.</li>
     * <li>changeThreatLevel: update the event threat level.</li>
     * <li>addEventTag: add an event label.</li>
     * <li>deleteEventTag: delete an event label.</li>
     * <li>alertWhitelist: add the alert to the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alertWhitelist</p>
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
     * <p>The ID of the automated response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>440918</p>
     */
    @NameInMap("ResponseRuleId")
    public String responseRuleId;

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
    public Integer responseRulePriority;

    @NameInMap("ResponseRuleRemark")
    public String responseRuleRemark;

    /**
     * <p>The status of the automated response rule. Valid values:</p>
     * <ul>
     * <li>0: disabled.</li>
     * <li>100: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResponseRuleStatus")
    public Integer responseRuleStatus;

    /**
     * <p>The trigger type of the automated response rule. Valid values:</p>
     * <ul>
     * <li>event: event occurred.</li>
     * <li>event_update: event updated.</li>
     * <li>alert: alert occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("ResponseTriggerType")
    public String responseTriggerType;

    public static UpdateResponseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResponseRuleRequest self = new UpdateResponseRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResponseRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateResponseRuleRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public UpdateResponseRuleRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public UpdateResponseRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateResponseRuleRequest setResponseActionConfig(String responseActionConfig) {
        this.responseActionConfig = responseActionConfig;
        return this;
    }
    public String getResponseActionConfig() {
        return this.responseActionConfig;
    }

    public UpdateResponseRuleRequest setResponseActionType(String responseActionType) {
        this.responseActionType = responseActionType;
        return this;
    }
    public String getResponseActionType() {
        return this.responseActionType;
    }

    public UpdateResponseRuleRequest setResponseExecutionCondition(String responseExecutionCondition) {
        this.responseExecutionCondition = responseExecutionCondition;
        return this;
    }
    public String getResponseExecutionCondition() {
        return this.responseExecutionCondition;
    }

    public UpdateResponseRuleRequest setResponseRuleId(String responseRuleId) {
        this.responseRuleId = responseRuleId;
        return this;
    }
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

    public UpdateResponseRuleRequest setResponseRuleName(String responseRuleName) {
        this.responseRuleName = responseRuleName;
        return this;
    }
    public String getResponseRuleName() {
        return this.responseRuleName;
    }

    public UpdateResponseRuleRequest setResponseRulePriority(Integer responseRulePriority) {
        this.responseRulePriority = responseRulePriority;
        return this;
    }
    public Integer getResponseRulePriority() {
        return this.responseRulePriority;
    }

    public UpdateResponseRuleRequest setResponseRuleRemark(String responseRuleRemark) {
        this.responseRuleRemark = responseRuleRemark;
        return this;
    }
    public String getResponseRuleRemark() {
        return this.responseRuleRemark;
    }

    public UpdateResponseRuleRequest setResponseRuleStatus(Integer responseRuleStatus) {
        this.responseRuleStatus = responseRuleStatus;
        return this;
    }
    public Integer getResponseRuleStatus() {
        return this.responseRuleStatus;
    }

    public UpdateResponseRuleRequest setResponseTriggerType(String responseTriggerType) {
        this.responseTriggerType = responseTriggerType;
        return this;
    }
    public String getResponseTriggerType() {
        return this.responseTriggerType;
    }

}
