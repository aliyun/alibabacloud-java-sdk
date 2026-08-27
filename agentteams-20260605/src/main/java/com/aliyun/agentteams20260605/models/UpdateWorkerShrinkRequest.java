// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateWorkerShrinkRequest extends TeaModel {
    /**
     * <p>The Agents configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>agents-demo</p>
     */
    @NameInMap("Agents")
    public String agents;

    /**
     * <p>The list of channel configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Channels")
    public String channelsShrink;

    /**
     * <p>The idempotency token that ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-demo</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of credential bindings.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Credentials")
    public String credentialsShrink;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inst-demo</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The quota configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("LimitConfig")
    public String limitConfigShrink;

    /**
     * <p>The list of MCP servers.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("McpServers")
    public String mcpServersShrink;

    /**
     * <p>The model configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Model")
    public String modelShrink;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of skills.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Skills")
    public String skillsShrink;

    /**
     * <p>The Soul configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>soul-demo</p>
     */
    @NameInMap("Soul")
    public String soul;

    /**
     * <p>The template configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Template")
    public String templateShrink;

    /**
     * <p>The Worker version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    public static UpdateWorkerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkerShrinkRequest self = new UpdateWorkerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkerShrinkRequest setAgents(String agents) {
        this.agents = agents;
        return this;
    }
    public String getAgents() {
        return this.agents;
    }

    public UpdateWorkerShrinkRequest setChannelsShrink(String channelsShrink) {
        this.channelsShrink = channelsShrink;
        return this;
    }
    public String getChannelsShrink() {
        return this.channelsShrink;
    }

    public UpdateWorkerShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateWorkerShrinkRequest setCredentialsShrink(String credentialsShrink) {
        this.credentialsShrink = credentialsShrink;
        return this;
    }
    public String getCredentialsShrink() {
        return this.credentialsShrink;
    }

    public UpdateWorkerShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWorkerShrinkRequest setLimitConfigShrink(String limitConfigShrink) {
        this.limitConfigShrink = limitConfigShrink;
        return this;
    }
    public String getLimitConfigShrink() {
        return this.limitConfigShrink;
    }

    public UpdateWorkerShrinkRequest setMcpServersShrink(String mcpServersShrink) {
        this.mcpServersShrink = mcpServersShrink;
        return this;
    }
    public String getMcpServersShrink() {
        return this.mcpServersShrink;
    }

    public UpdateWorkerShrinkRequest setModelShrink(String modelShrink) {
        this.modelShrink = modelShrink;
        return this;
    }
    public String getModelShrink() {
        return this.modelShrink;
    }

    public UpdateWorkerShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkerShrinkRequest setSkillsShrink(String skillsShrink) {
        this.skillsShrink = skillsShrink;
        return this;
    }
    public String getSkillsShrink() {
        return this.skillsShrink;
    }

    public UpdateWorkerShrinkRequest setSoul(String soul) {
        this.soul = soul;
        return this;
    }
    public String getSoul() {
        return this.soul;
    }

    public UpdateWorkerShrinkRequest setTemplateShrink(String templateShrink) {
        this.templateShrink = templateShrink;
        return this;
    }
    public String getTemplateShrink() {
        return this.templateShrink;
    }

    public UpdateWorkerShrinkRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

}
