// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-connection</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <strong>example:</strong>
     * <p>DashScopeConnection</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Models")
    public java.util.List<CreateConnectionRequestModels> models;

    @NameInMap("ResourceMeta")
    public CreateConnectionRequestResourceMeta resourceMeta;

    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    /**
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
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>model_001</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
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
         * <strong>example:</strong>
         * <p>ld-uf69****9nqjjes</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static CreateConnectionRequestResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestResourceMeta self = new CreateConnectionRequestResourceMeta();
            return TeaModel.build(map, self);
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
