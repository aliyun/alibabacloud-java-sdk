// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ExperimentConfig extends TeaModel {
    /**
     * <p>The endpoint connector ID. This parameter is required in user/agent mode.</p>
     */
    @NameInMap("endpointConnectorId")
    public String endpointConnectorId;

    /**
     * <p>The experiment label (A/B/C/D/E).</p>
     */
    @NameInMap("label")
    public String label;

    /**
     * <p>The model name. You can set this parameter to agent in agent scenarios.</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>The model parameters.</p>
     */
    @NameInMap("modelParameters")
    public ModelParameters modelParameters;

    /**
     * <p>The model provider. Valid values: dashscope (default), user, and agent.</p>
     */
    @NameInMap("modelProvider")
    public String modelProvider;

    /**
     * <p>The experiment name.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The prompt message template. Supports {{variable name}} placeholders.</p>
     */
    @NameInMap("promptTemplate")
    public java.util.List<PromptTemplateItem> promptTemplate;

    /**
     * <p>The agent request body template. This parameter is required in agent mode. Supports {{variable name}} placeholders.</p>
     */
    @NameInMap("requestBodyTemplate")
    public String requestBodyTemplate;

    /**
     * <p>The agent request header template. This parameter is optional in agent mode. Supports {{variable name}} placeholders.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Content-Type: application/json&quot; }</p>
     */
    @NameInMap("requestHeaderTemplate")
    public String requestHeaderTemplate;

    /**
     * <p>The agent request method. Valid values: POST (default) and GET.</p>
     */
    @NameInMap("requestMethod")
    public String requestMethod;

    public static ExperimentConfig build(java.util.Map<String, ?> map) throws Exception {
        ExperimentConfig self = new ExperimentConfig();
        return TeaModel.build(map, self);
    }

    public ExperimentConfig setEndpointConnectorId(String endpointConnectorId) {
        this.endpointConnectorId = endpointConnectorId;
        return this;
    }
    public String getEndpointConnectorId() {
        return this.endpointConnectorId;
    }

    public ExperimentConfig setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ExperimentConfig setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ExperimentConfig setModelParameters(ModelParameters modelParameters) {
        this.modelParameters = modelParameters;
        return this;
    }
    public ModelParameters getModelParameters() {
        return this.modelParameters;
    }

    public ExperimentConfig setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public ExperimentConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExperimentConfig setPromptTemplate(java.util.List<PromptTemplateItem> promptTemplate) {
        this.promptTemplate = promptTemplate;
        return this;
    }
    public java.util.List<PromptTemplateItem> getPromptTemplate() {
        return this.promptTemplate;
    }

    public ExperimentConfig setRequestBodyTemplate(String requestBodyTemplate) {
        this.requestBodyTemplate = requestBodyTemplate;
        return this;
    }
    public String getRequestBodyTemplate() {
        return this.requestBodyTemplate;
    }

    public ExperimentConfig setRequestHeaderTemplate(String requestHeaderTemplate) {
        this.requestHeaderTemplate = requestHeaderTemplate;
        return this;
    }
    public String getRequestHeaderTemplate() {
        return this.requestHeaderTemplate;
    }

    public ExperimentConfig setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public String getRequestMethod() {
        return this.requestMethod;
    }

}
