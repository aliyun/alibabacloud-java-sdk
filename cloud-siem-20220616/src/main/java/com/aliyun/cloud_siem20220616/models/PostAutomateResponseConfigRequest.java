// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostAutomateResponseConfigRequest extends TeaModel {
    /**
     * <p>The action configuration of the automated response rule. The value is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;actionType&quot;: &quot;doPlaybook&quot;,
     *             &quot;playbookName&quot;: &quot;WafBlockIP&quot;,
     *             &quot;playbookUuid&quot;: &quot;bdad6220-6584-41b2-9704-fc6584568758&quot;
     *       }
     * ]</p>
     */
    @NameInMap("ActionConfig")
    public String actionConfig;

    /**
     * <p>The type of the handling action. Multiple types are separated by commas (,). Valid values:</p>
     * <ul>
     * <li><strong>doPlaybook</strong>: runs the playbook.</li>
     * <li><strong>changeEventStatus</strong>: changes the event status.</li>
     * <li><strong>changeThreatLevel</strong>: changes the threat level of the event.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doPlaybook,changeEventStatus</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The type of the automated response rule. Valid values:</p>
     * <ul>
     * <li><strong>event</strong></li>
     * <li><strong>alert</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("AutoResponseType")
    public String autoResponseType;

    /**
     * <p>The trigger condition of the automated response rule. The value is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;alert_name&quot;},&quot;operator&quot;:&quot;containsString&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;webshell_online&quot;}}]</p>
     */
    @NameInMap("ExecutionCondition")
    public String executionCondition;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Your assets reside in regions in China.</li>
     * <li><strong>ap-southeast-1</strong>: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw kill quara book</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The ID of the user who created the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>17108579417****</p>
     */
    @NameInMap("SubUserId")
    public Long subUserId;

    public static PostAutomateResponseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PostAutomateResponseConfigRequest self = new PostAutomateResponseConfigRequest();
        return TeaModel.build(map, self);
    }

    public PostAutomateResponseConfigRequest setActionConfig(String actionConfig) {
        this.actionConfig = actionConfig;
        return this;
    }
    public String getActionConfig() {
        return this.actionConfig;
    }

    public PostAutomateResponseConfigRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public PostAutomateResponseConfigRequest setAutoResponseType(String autoResponseType) {
        this.autoResponseType = autoResponseType;
        return this;
    }
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    public PostAutomateResponseConfigRequest setExecutionCondition(String executionCondition) {
        this.executionCondition = executionCondition;
        return this;
    }
    public String getExecutionCondition() {
        return this.executionCondition;
    }

    public PostAutomateResponseConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PostAutomateResponseConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PostAutomateResponseConfigRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public PostAutomateResponseConfigRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public PostAutomateResponseConfigRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PostAutomateResponseConfigRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

}
