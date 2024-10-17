// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentInstanceShrinkRequest extends TeaModel {
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
    public String runtimeConfigShrink;

    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static StartAIAgentInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentInstanceShrinkRequest self = new StartAIAgentInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartAIAgentInstanceShrinkRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public StartAIAgentInstanceShrinkRequest setRuntimeConfigShrink(String runtimeConfigShrink) {
        this.runtimeConfigShrink = runtimeConfigShrink;
        return this;
    }
    public String getRuntimeConfigShrink() {
        return this.runtimeConfigShrink;
    }

    public StartAIAgentInstanceShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public StartAIAgentInstanceShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
