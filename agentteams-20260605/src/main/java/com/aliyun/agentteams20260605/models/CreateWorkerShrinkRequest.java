// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateWorkerShrinkRequest extends TeaModel {
    @NameInMap("AgentType")
    public String agentType;

    @NameInMap("Agents")
    public String agents;

    @NameInMap("Channels")
    public String channelsShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Credentials")
    public String credentialsShrink;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("Groups")
    public String groupsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LimitConfig")
    public String limitConfigShrink;

    @NameInMap("McpServers")
    public String mcpServersShrink;

    @NameInMap("Model")
    public String modelShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("Skills")
    public String skillsShrink;

    @NameInMap("Soul")
    public String soul;

    @NameInMap("Subagents")
    public String subagentsShrink;

    @NameInMap("Template")
    public String templateShrink;

    @NameInMap("VersionCode")
    public String versionCode;

    public static CreateWorkerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkerShrinkRequest self = new CreateWorkerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkerShrinkRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public CreateWorkerShrinkRequest setAgents(String agents) {
        this.agents = agents;
        return this;
    }
    public String getAgents() {
        return this.agents;
    }

    public CreateWorkerShrinkRequest setChannelsShrink(String channelsShrink) {
        this.channelsShrink = channelsShrink;
        return this;
    }
    public String getChannelsShrink() {
        return this.channelsShrink;
    }

    public CreateWorkerShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWorkerShrinkRequest setCredentialsShrink(String credentialsShrink) {
        this.credentialsShrink = credentialsShrink;
        return this;
    }
    public String getCredentialsShrink() {
        return this.credentialsShrink;
    }

    public CreateWorkerShrinkRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public CreateWorkerShrinkRequest setGroupsShrink(String groupsShrink) {
        this.groupsShrink = groupsShrink;
        return this;
    }
    public String getGroupsShrink() {
        return this.groupsShrink;
    }

    public CreateWorkerShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateWorkerShrinkRequest setLimitConfigShrink(String limitConfigShrink) {
        this.limitConfigShrink = limitConfigShrink;
        return this;
    }
    public String getLimitConfigShrink() {
        return this.limitConfigShrink;
    }

    public CreateWorkerShrinkRequest setMcpServersShrink(String mcpServersShrink) {
        this.mcpServersShrink = mcpServersShrink;
        return this;
    }
    public String getMcpServersShrink() {
        return this.mcpServersShrink;
    }

    public CreateWorkerShrinkRequest setModelShrink(String modelShrink) {
        this.modelShrink = modelShrink;
        return this;
    }
    public String getModelShrink() {
        return this.modelShrink;
    }

    public CreateWorkerShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkerShrinkRequest setSkillsShrink(String skillsShrink) {
        this.skillsShrink = skillsShrink;
        return this;
    }
    public String getSkillsShrink() {
        return this.skillsShrink;
    }

    public CreateWorkerShrinkRequest setSoul(String soul) {
        this.soul = soul;
        return this;
    }
    public String getSoul() {
        return this.soul;
    }

    public CreateWorkerShrinkRequest setSubagentsShrink(String subagentsShrink) {
        this.subagentsShrink = subagentsShrink;
        return this;
    }
    public String getSubagentsShrink() {
        return this.subagentsShrink;
    }

    public CreateWorkerShrinkRequest setTemplateShrink(String templateShrink) {
        this.templateShrink = templateShrink;
        return this;
    }
    public String getTemplateShrink() {
        return this.templateShrink;
    }

    public CreateWorkerShrinkRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

}
