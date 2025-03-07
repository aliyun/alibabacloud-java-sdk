// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent created in the <a href="https://ims.console.aliyun.com/ai/robot/list">IMS</a> console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>同步聊天记录配置。</p>
     */
    @NameInMap("ChatSyncConfig")
    public String chatSyncConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeConfig")
    public String runtimeConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>f213fbc005e4f309379701645f4****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

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

    public StartAIAgentInstanceShrinkRequest setChatSyncConfigShrink(String chatSyncConfigShrink) {
        this.chatSyncConfigShrink = chatSyncConfigShrink;
        return this;
    }
    public String getChatSyncConfigShrink() {
        return this.chatSyncConfigShrink;
    }

    public StartAIAgentInstanceShrinkRequest setRuntimeConfigShrink(String runtimeConfigShrink) {
        this.runtimeConfigShrink = runtimeConfigShrink;
        return this;
    }
    public String getRuntimeConfigShrink() {
        return this.runtimeConfigShrink;
    }

    public StartAIAgentInstanceShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
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
