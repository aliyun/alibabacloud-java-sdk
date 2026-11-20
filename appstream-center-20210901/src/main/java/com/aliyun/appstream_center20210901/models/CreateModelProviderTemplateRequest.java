// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateModelProviderTemplateRequest extends TeaModel {
    /**
     * <p>The business platform to which the agent belongs. This value must be consistent with the target model group. If this parameter is not provided or an unrecognized value is passed, <code>ENTERPRISE</code> is used.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>COMMON</code>: common model group</li>
     * <li><code>JVS</code>: JVS Claw business</li>
     * <li><code>ENTERPRISE</code>: Enterprise Edition business</li>
     * <li><code>ENTERPRISE_JVS</code>: Enterprise Edition JVS Computer business</li>
     * <li><code>ENTERPRISE_SEAT</code>: Enterprise Edition seat business</li>
     * <li><code>ENTERPRISE_AGENTIC_COMPUTER</code>: AI cloud computer business</li>
     * <li><code>AGENTIC_COMPUTER</code>: Agentic Computer business</li>
     * <li><code>FIXED_API_KEY</code>: fixed API key call business</li>
     * </ul>
     * <p>The platform identifier does not automatically supplement the configuration capabilities or system templates for the corresponding agent.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The agent type, which must be consistent with the target model group.</p>
     * <p>When you create a custom or managed model connection configuration, the following types are supported:</p>
     * <ul>
     * <li><code>OpenClaw</code>: OpenClaw agent</li>
     * <li><code>HermesAgent</code>: Hermes agent</li>
     * <li><code>AgenticComputer</code>: Agentic Computer agent</li>
     * <li><code>Common</code>: common model group</li>
     * </ul>
     * <p>The provider configuration for <code>Common</code> uses the same field format as <code>OpenClaw</code>. The presence of an agent name in other businesses does not mean that this operation supports its model connection configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The business type, which is used to identify the business to which the model provider template belongs. Set this parameter to <code>1</code> for Enterprise Edition. This operation does not provide a default value for this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The connection configuration of the model provider, passed as a JSON string.</p>
     * <p><strong>When <code>ProviderType</code> is <code>Managed</code> or <code>Custom</code>, you must provide the service endpoint and key.</strong> The field names depend on <code>AgentProvider</code>:</p>
     * <ul>
     * <li><code>OpenClaw</code>, <code>AgenticComputer</code>, and <code>Common</code>: use <code>baseUrl</code> and <code>apiKey</code>. The protocol configuration field is <code>api</code>.</li>
     * <li><code>HermesAgent</code>: use <code>base_url</code> and <code>api_key</code>. The protocol configuration field is <code>api_mode</code>.</li>
     * </ul>
     * <p>Do not mix the two field formats. The key is encrypted and saved after creation. When <code>ProviderType</code> is <code>WuyingPlan</code> or <code>WuyingCredit</code>, the configuration is copied from the system template, and you do not need to pass this parameter.</p>
     * <h3>Endpoint and key verification</h3>
     * <ul>
     * <li><code>Managed</code>: The service endpoint must exactly match the available endpoint configured by the platform for the provider. Bailian, Moonshot, and SiliconFlow use the provided key to request the <code>/models</code> API under the service endpoint. If the verification request fails, the creation fails and <code>ApiKey.Invalid</code> is returned. Invalid, inactive, or mismatched keys, as well as connection failures during the verification request, may trigger this error.</li>
     * <li><code>Custom</code>: The provider name must start with <code>provider-</code>, and the service endpoint must be a valid public HTTP or HTTPS address. The preceding online key verification for the model list API is not performed during creation.</li>
     * </ul>
     * <p>Other supported managed providers do not perform the preceding <code>/models</code> online verification. Successful creation does not replace actual model call verification. The keys in the examples are desensitized. You must use valid keys for actual calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;api&quot;: &quot;openai-completions&quot;,
     *     &quot;apiKey&quot;: &quot;sk-xxxx&quot;,
     *     &quot;baseUrl&quot;: &quot;<a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a>&quot;
     * }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The description of the model provider template.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud Bailian provider</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the Wuying secure proxy.</p>
     * <ul>
     * <li><code>true</code>: Yes.</li>
     * <li><code>false</code>: No.</li>
     * </ul>
     * <p>When <code>ProviderType</code> is <code>Managed</code> or <code>Custom</code>, this parameter takes effect only when the service provides proxy capabilities. If the service does not provide proxy capabilities, setting this parameter to <code>true</code> does not enable the proxy.</p>
     * <p>When <code>ProviderType</code> is <code>WuyingPlan</code> or <code>WuyingCredit</code>, the actual proxy configuration is copied with the preset template and is not overridden by this parameter. Set this parameter to <code>true</code> when you use <code>WuyingCredit</code>. If the service requires the secure proxy to be enabled but the request is not set to <code>true</code>, <code>ModelProviderTemplate.WuyingProxyRequired</code> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWuyingProxy")
    public Boolean enableWuyingProxy;

    /**
     * <p>The ID of the associated model group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>The name of the model provider template.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud Bailian</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the model provider. The name must be unique within the same model group.</p>
     * <ul>
     * <li><p>If <code>ProviderType</code> is <code>WuyingPlan</code>, set this parameter to <code>wuying-plan</code>.</p>
     * </li>
     * <li><p>If <code>ProviderType</code> is <code>WuyingCredit</code>, set this parameter to <code>wuying-credit</code>.</p>
     * </li>
     * <li><p>If <code>ProviderType</code> is <code>Custom</code>, the name must start with <code>provider-</code>.</p>
     * </li>
     * <li><p>If <code>ProviderType</code> is <code>Managed</code>, use one of the following provider names. <code>OpenClaw</code>, <code>AgenticComputer</code>, and <code>Common</code> use the values in the list. <code>HermesAgent</code> uses the names with the <code>wuying-</code> prefix, such as <code>wuying-bailian</code>.</p>
     * </li>
     * <li><p><code>bailian</code>: Alibaba Cloud Bailian</p>
     * </li>
     * <li><p><code>moonshot</code>: Moonshot</p>
     * </li>
     * <li><p><code>siliconflow</code>: SiliconFlow</p>
     * </li>
     * <li><p><code>bailian-coding</code>: Alibaba Cloud Bailian Coding Plan</p>
     * </li>
     * <li><p><code>bailian-token-plan</code>: Alibaba Cloud Bailian Token Plan</p>
     * </li>
     * <li><p><code>kimi-coding</code>: Kimi Coding Plan</p>
     * </li>
     * <li><p><code>zhipu</code>: Zhipu AI</p>
     * </li>
     * <li><p><code>zhipu-coding</code>: Zhipu AI Coding Plan</p>
     * </li>
     * <li><p><code>minimax-token-plan</code>: MiniMax Token Plan</p>
     * </li>
     * </ul>
     * <p>Whether the provider can be created also depends on whether the corresponding service endpoint and business configuration are available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    /**
     * <p>The access type of the model provider. We recommend that you explicitly pass this parameter. The value is case-sensitive.</p>
     * <ul>
     * <li><code>WuyingPlan</code>: Wuying plan model. <code>ProviderName</code> must be <code>wuying-plan</code>. The configuration is copied from the system template applicable to the current business and agent type. You do not need to provide <code>Config</code>.</li>
     * <li><code>WuyingCredit</code>: Wuying credit package model. <code>ProviderName</code> must be <code>wuying-credit</code>. The configuration is copied from the system template. You do not need to provide <code>Config</code>. Set <code>EnableWuyingProxy</code> to <code>true</code>.</li>
     * <li><code>Managed</code>: third-party model provider managed by the platform. You must provide <code>Config</code>, and the <code>ProviderName</code> and service endpoint must fall within the supported scope of the selected agent.</li>
     * <li><code>Custom</code>: custom model provider. <code>ProviderName</code> must start with <code>provider-</code>. You must provide <code>Config</code>.</li>
     * </ul>
     * <p><code>WuyingPlan</code> and <code>WuyingCredit</code> rely on the corresponding system templates being configured. If no template is found, <code>ModelProviderTemplate.NotFound</code> is returned. If this parameter is not provided, the preceding plan or credit package configuration is not automatically adopted.</p>
     * <p><code>WuyingPreset</code> indicates the system-preset intelligent models in the common model group. Do not mistake it for the template copying method of <code>WuyingPlan</code> or <code>WuyingCredit</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Managed</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    public static CreateModelProviderTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProviderTemplateRequest self = new CreateModelProviderTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelProviderTemplateRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public CreateModelProviderTemplateRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public CreateModelProviderTemplateRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public CreateModelProviderTemplateRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateModelProviderTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelProviderTemplateRequest setEnableWuyingProxy(Boolean enableWuyingProxy) {
        this.enableWuyingProxy = enableWuyingProxy;
        return this;
    }
    public Boolean getEnableWuyingProxy() {
        return this.enableWuyingProxy;
    }

    public CreateModelProviderTemplateRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public CreateModelProviderTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelProviderTemplateRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public CreateModelProviderTemplateRequest setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

}
