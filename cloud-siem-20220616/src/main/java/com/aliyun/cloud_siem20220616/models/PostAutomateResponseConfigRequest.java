// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostAutomateResponseConfigRequest extends TeaModel {
    /**
     * <p>The action configuration of the automated response rule. The value is in the JSON format.</p>
     */
    @NameInMap("ActionConfig")
    public String actionConfig;

    /**
     * <p>The type of the handling action. Multiple types are separated by commas (,). Valid values:</p>
     * <br>
     * <p>*   **doPlaybook**: runs the playbook.</p>
     * <p>*   **changeEventStatus**: changes the event status.</p>
     * <p>*   **changeThreatLevel**: changes the threat level of the event.</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The type of the automated response rule. Valid values:</p>
     * <br>
     * <p>*   **event**</p>
     * <p>*   **alert**</p>
     */
    @NameInMap("AutoResponseType")
    public String autoResponseType;

    /**
     * <p>The trigger condition of the automated response rule. The value is in the JSON format.</p>
     */
    @NameInMap("ExecutionCondition")
    public String executionCondition;

    /**
     * <p>The rule ID.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Your assets reside in regions in China.</p>
     * <p>*   **ap-southeast-1**: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The rule name.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The ID of the user who created the rule.</p>
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
