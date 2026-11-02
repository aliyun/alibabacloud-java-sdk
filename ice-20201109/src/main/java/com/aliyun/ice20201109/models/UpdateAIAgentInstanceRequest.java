// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateAIAgentInstanceRequest extends TeaModel {
    /**
     * <p>The agent configuration to be updated. This configuration is merged with the configuration used when the instance was started. For more information, see the AIAgentConfig definition. The following parameters in AIAgentTemplateConfig can be updated:</p>
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
    public AIAgentConfig agentConfig;

    /**
     * <p>The agent instance ID.</p>
     * <blockquote>
     * <p>The InstanceId is the unique ID returned after the agent instance is successfully started. For more information about the API operations used to start an agent, see <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance</a> and <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
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
     * <p>The agent template configuration. <strong>[Deprecated]</strong> Use the AgentConfig parameter instead.</p>
     * </blockquote>
     * <p>The agent configuration to be updated. This configuration is merged with the configuration used when the instance was started. For more information, see the <a href="https://help.aliyun.com/document_detail/2846193.html">AIAgentTemplateConfig</a> definition.
     * The following parameters in AIAgentTemplateConfig can be updated:</p>
     * <ul>
     * <li><p>VoiceId (voice ID)</p>
     * </li>
     * <li><p>EnableVoiceInterrupt (enable voice interruption)</p>
     * </li>
     * <li><p>Greeting (greeting)</p>
     * </li>
     * <li><p>Volume (volume)</p>
     * </li>
     * <li><p>EnablePushToTalk (enable push-to-talk)</p>
     * </li>
     * <li><p>UseVoiceprint (use voiceprint)</p>
     * </li>
     * <li><p>AsrMaxSilence (maximum ASR silence duration)</p>
     * </li>
     * </ul>
     */
    @NameInMap("TemplateConfig")
    @Deprecated
    public AIAgentTemplateConfig templateConfig;

    /**
     * <p>The custom user data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VoiceId&quot;:&quot;xiaoxia&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UpdateAIAgentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIAgentInstanceRequest self = new UpdateAIAgentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAIAgentInstanceRequest setAgentConfig(AIAgentConfig agentConfig) {
        this.agentConfig = agentConfig;
        return this;
    }
    public AIAgentConfig getAgentConfig() {
        return this.agentConfig;
    }

    public UpdateAIAgentInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    @Deprecated
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
