// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateModelProviderTemplateRequest extends TeaModel {
    /**
     * <p>Agent platform.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>Agent provider name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>Business type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>Model provider configuration JSON, containing connection information such as baseUrl, apiKey, and api. The apiKey is encrypted after creation. Not required when ProviderType is WuyingCredit, as it is copied from the system template.</p>
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
     * <p>Model provider template description.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云百炼服务商</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Whether to enable Wuying security proxy. Must be true when ProviderType is WuyingCredit.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWuyingProxy")
    public Boolean enableWuyingProxy;

    /**
     * <p>Associated model group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>Model provider template name.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云百炼</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Model provider name. Must be unique within the same model template. Naming rules vary by ProviderType. For details, see the ProviderType description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    /**
     * <p>Model provider type. Different types impose different constraints on ProviderName and Config:</p>
     * <ul>
     * <li>WuyingCredit: Wuying credit package. ProviderName must be wuying-credit. Created by copying from the system template. Config is not required.</li>
     * <li>Managed: Managed provider. System-reserved names such as wuying-credit cannot be used. Config is required.</li>
     * <li>Custom: User-defined provider. ProviderName must start with the provider- prefix. Config is required.</li>
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
