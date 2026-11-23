// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConnectionRequest extends TeaModel {
    /**
     * <p>The configuration information of the connection. The configurations are in key-value pairs. The keys in the Config parameter vary based on the connection type. For more information, see the supplementary description of the request parameters for the CreateConnection operation.</p>
     */
    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    /**
     * <p>The description of the connection.</p>
     * 
     * <strong>example:</strong>
     * <p>Connection used for annotation</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of model information.</p>
     */
    @NameInMap("Models")
    public java.util.List<UpdateConnectionRequestModels> models;

    /**
     * <p>The key-value configurations that need to be encrypted, such as the database logon password and the key for the model connection.</p>
     */
    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    public static UpdateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionRequest self = new UpdateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionRequest setConfigs(java.util.Map<String, String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    public UpdateConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConnectionRequest setModels(java.util.List<UpdateConnectionRequestModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<UpdateConnectionRequestModels> getModels() {
        return this.models;
    }

    public UpdateConnectionRequest setSecrets(java.util.Map<String, String> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    public static class UpdateConnectionRequestModels extends TeaModel {
        /**
         * <p>The display name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>car_tag</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The model identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>model_001</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The model type. Valid values:</p>
         * <ul>
         * <li>LLM</li>
         * <li>Embedding</li>
         * <li>ReRank</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>Specifies whether tool calling is supported. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ToolCall")
        public Boolean toolCall;

        public static UpdateConnectionRequestModels build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestModels self = new UpdateConnectionRequestModels();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestModels setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateConnectionRequestModels setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateConnectionRequestModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public UpdateConnectionRequestModels setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

    }

}
