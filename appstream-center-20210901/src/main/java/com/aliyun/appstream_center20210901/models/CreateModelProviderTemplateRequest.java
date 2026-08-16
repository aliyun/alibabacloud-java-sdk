// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateModelProviderTemplateRequest extends TeaModel {
    /**
     * <p>The Agent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The Agent provider name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The business type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The model provider configuration in JSON format, which contains connection information such as baseUrl, apiKey, and api. The apiKey is encrypted after creation. When ProviderType is set to WuyingCredit, this parameter is not required because the configuration is copied from the system template.</p>
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
     * <p>阿里云百炼服务商</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the WUYING secure proxy. This parameter must be set to true when ProviderType is set to WuyingCredit.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWuyingProxy")
    public Boolean enableWuyingProxy;

    /**
     * <p>The ID of the associated model template.</p>
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
     * <p>阿里云百炼</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The model provider name. The name must be unique within the same model template. The naming rules vary based on the value of ProviderType. For more information, see the description of ProviderType.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    /**
     * <p>The model provider type. Different types impose different constraints on ProviderName and Config. Valid values:</p>
     * <ul>
     * <li>WuyingCredit: WUYING credit plan. ProviderName must be set to wuying-credit. The template is created by copying from a system template, and Config is not required.</li>
     * <li>Managed: managed provider. System-reserved names such as wuying-credit cannot be used. Config is required.</li>
     * <li>Custom: user-defined provider. ProviderName must start with the prefix provider-. Config is required.</li>
     * </ul>
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
