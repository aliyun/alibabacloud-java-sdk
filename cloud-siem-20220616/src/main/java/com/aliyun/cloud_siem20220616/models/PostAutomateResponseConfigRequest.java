// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostAutomateResponseConfigRequest extends TeaModel {
    @NameInMap("ActionConfig")
    public String actionConfig;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("AutoResponseType")
    public String autoResponseType;

    @NameInMap("ExecutionCondition")
    public String executionCondition;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleName")
    public String ruleName;

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
