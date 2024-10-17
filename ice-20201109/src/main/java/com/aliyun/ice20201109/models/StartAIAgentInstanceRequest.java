// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeConfig")
    public AIAgentRuntimeConfig runtimeConfig;

    @NameInMap("TemplateConfig")
    public AIAgentTemplateConfig templateConfig;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static StartAIAgentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentInstanceRequest self = new StartAIAgentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartAIAgentInstanceRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public StartAIAgentInstanceRequest setRuntimeConfig(AIAgentRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public AIAgentRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public StartAIAgentInstanceRequest setTemplateConfig(AIAgentTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public AIAgentTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public StartAIAgentInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
