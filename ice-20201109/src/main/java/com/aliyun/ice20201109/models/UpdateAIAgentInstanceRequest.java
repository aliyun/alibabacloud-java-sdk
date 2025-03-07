// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAIAgentInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The template configurations of the AI agent. The configurations are merged with the template configurations that are used to start the AI agent. For more information, see the definition of TemplateConfig.</p>
     */
    @NameInMap("TemplateConfig")
    public AIAgentTemplateConfig templateConfig;

    /**
     * <strong>example:</strong>
     * <p>{&quot;VoiceId&quot;:&quot;xiaoxia&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UpdateAIAgentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIAgentInstanceRequest self = new UpdateAIAgentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAIAgentInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAIAgentInstanceRequest setTemplateConfig(AIAgentTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public AIAgentTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public UpdateAIAgentInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
