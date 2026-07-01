// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAIAgentInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The AI agent configuration to update. This configuration is merged with the existing configuration of the instance. For more information, see the AIAgentConfig definition. The following parameters in AIAgentConfig can be updated:</p>
     * <ul>
     * <li><p>VoiceId</p>
     * </li>
     * <li><p>EnableVoiceInterrupt</p>
     * </li>
     * <li><p>Greeting</p>
     * </li>
     * <li><p>Volume</p>
     * </li>
     * <li><p>EnablePushToTalk</p>
     * </li>
     * <li><p>UseVoiceprint</p>
     * </li>
     * <li><p>BailianAppParams</p>
     * </li>
     * </ul>
     */
    @NameInMap("AgentConfig")
    public String agentConfigShrink;

    /**
     * <p>The ID of the AI agent instance.</p>
     * <blockquote>
     * <p>This unique ID is returned after the AI agent instance starts successfully. For more information about starting an agent, see <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance</a> and <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <blockquote>
     * <p>The AI agent template configuration. This parameter is deprecated. Use the AgentConfig parameter instead.</p>
     * </blockquote>
     * <p>The AI agent configuration to update. This configuration is merged with the existing configuration of the instance. For more information, see the <a href="https://help.aliyun.com/document_detail/2846193.html">AIAgentTemplateConfig</a> definition.
     * The following parameters in AIAgentTemplateConfig can be updated:</p>
     * <ul>
     * <li><p>VoiceId (Voice ID)</p>
     * </li>
     * <li><p>EnableVoiceInterrupt (Enable voice interruption)</p>
     * </li>
     * <li><p>Greeting (Greeting)</p>
     * </li>
     * <li><p>Volume (Volume)</p>
     * </li>
     * <li><p>EnablePushToTalk (Enable push-to-talk)</p>
     * </li>
     * <li><p>UseVoiceprint (Use voiceprint)</p>
     * </li>
     * <li><p>AsrMaxSilence (ASR maximum silence duration)</p>
     * </li>
     * </ul>
     */
    @NameInMap("TemplateConfig")
    @Deprecated
    public String templateConfigShrink;

    /**
     * <p>Custom user data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VoiceId&quot;:&quot;xiaoxia&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UpdateAIAgentInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIAgentInstanceShrinkRequest self = new UpdateAIAgentInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAIAgentInstanceShrinkRequest setAgentConfigShrink(String agentConfigShrink) {
        this.agentConfigShrink = agentConfigShrink;
        return this;
    }
    public String getAgentConfigShrink() {
        return this.agentConfigShrink;
    }

    public UpdateAIAgentInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    @Deprecated
    public UpdateAIAgentInstanceShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public UpdateAIAgentInstanceShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
