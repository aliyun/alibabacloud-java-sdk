// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    /**
     * <p>The visibility of the workspace. The default value is <code>PRIVATE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>Configuration properties for the connection, provided as key-value pairs. The required keys depend on the connection type. For details, see the supplementary parameter information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    /**
     * <p>The name of the connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-connection</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The type of the connection.</p>
     * 
     * <strong>example:</strong>
     * <p>DashScopeConnection</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The description of the connection.</p>
     * 
     * <strong>example:</strong>
     * <p>Open-source LLM service connection.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>A list of models. This parameter applies to model service connections.</p>
     */
    @NameInMap("Models")
    public java.util.List<CreateConnectionRequestModels> models;

    /**
     * <p>Resource metadata for the connection. This parameter is typically used for database connection types.</p>
     */
    @NameInMap("ResourceMeta")
    public CreateConnectionRequestResourceMeta resourceMeta;

    /**
     * <p>Sensitive connection properties that require encryption, such as database credentials or an API key for a model service.</p>
     */
    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    /**
     * <p>The ID of the workspace. To get this ID, call the <a href="https://help.aliyun.com/document_detail/449124.html"><code>ListWorkspaces</code></a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>123**45</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionRequest self = new CreateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnectionRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateConnectionRequest setConfigs(java.util.Map<String, String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    public CreateConnectionRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CreateConnectionRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public CreateConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConnectionRequest setModels(java.util.List<CreateConnectionRequestModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<CreateConnectionRequestModels> getModels() {
        return this.models;
    }

    public CreateConnectionRequest setResourceMeta(CreateConnectionRequestResourceMeta resourceMeta) {
        this.resourceMeta = resourceMeta;
        return this;
    }
    public CreateConnectionRequestResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public CreateConnectionRequest setSecrets(java.util.Map<String, String> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    public CreateConnectionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateConnectionRequestModels extends TeaModel {
        /**
         * <p>The display name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>Language model</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The context length.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("MaxModelLength")
        public Long maxModelLength;

        /**
         * <p>The model identifier. This value corresponds to the <code>model</code> parameter in an OpenAI API request.</p>
         * 
         * <strong>example:</strong>
         * <p>model_001</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>Specifies whether the model supports deep reasoning and can output the reasoning process as <code>reasoning_content</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportReasoning")
        public Boolean supportReasoning;

        /**
         * <p>Specifies whether the model supports structured output in the OpenAI API\&quot;s JSON Schema format.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportResponseSchema")
        public Boolean supportResponseSchema;

        /**
         * <p>Specifies whether the model supports visual understanding.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportVision")
        public Boolean supportVision;

        /**
         * <p>Specifies whether the model supports tool calling.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ToolCall")
        public Boolean toolCall;

        public static CreateConnectionRequestModels build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestModels self = new CreateConnectionRequestModels();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestModels setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateConnectionRequestModels setMaxModelLength(Long maxModelLength) {
            this.maxModelLength = maxModelLength;
            return this;
        }
        public Long getMaxModelLength() {
            return this.maxModelLength;
        }

        public CreateConnectionRequestModels setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateConnectionRequestModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public CreateConnectionRequestModels setSupportReasoning(Boolean supportReasoning) {
            this.supportReasoning = supportReasoning;
            return this;
        }
        public Boolean getSupportReasoning() {
            return this.supportReasoning;
        }

        public CreateConnectionRequestModels setSupportResponseSchema(Boolean supportResponseSchema) {
            this.supportResponseSchema = supportResponseSchema;
            return this;
        }
        public Boolean getSupportResponseSchema() {
            return this.supportResponseSchema;
        }

        public CreateConnectionRequestModels setSupportVision(Boolean supportVision) {
            this.supportVision = supportVision;
            return this;
        }
        public Boolean getSupportVision() {
            return this.supportVision;
        }

        public CreateConnectionRequestModels setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

    }

    public static class CreateConnectionRequestResourceMeta extends TeaModel {
        /**
         * <p>Additional configuration information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;vpcId&quot;:&quot;vpc-xxxx&quot;}</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-uf69****9nqjjes</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static CreateConnectionRequestResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestResourceMeta self = new CreateConnectionRequestResourceMeta();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestResourceMeta setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public CreateConnectionRequestResourceMeta setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateConnectionRequestResourceMeta setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
