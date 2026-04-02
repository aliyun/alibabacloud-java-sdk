// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Connection extends TeaModel {
    /**
     * <p>The workspace accessibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE (default): accessible only to you and the administrator of the workspace.</li>
     * <li>PUBLIC: accessible to all members in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The connection configuration.</p>
     */
    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    /**
     * <p>The connection ID.</p>
     * 
     * <strong>example:</strong>
     * <p>conn-pai9m***mi47</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>The connection name.</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The connection type. Valid values:</p>
     * <ul>
     * <li>DashScopeConnection</li>
     * <li>OpenLLMConnection</li>
     * <li>MilvusConnection</li>
     * <li>OpenSearchConnection</li>
     * <li>LindormConnection</li>
     * <li>ElasticsearchConnection</li>
     * <li>HologresConnection</li>
     * <li>RDSConnection</li>
     * <li>CustomConnection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ElasticsearchConnection</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The connection creator.</p>
     * 
     * <strong>example:</strong>
     * <p>20925961****557803</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The connection description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the connection was modified, in UTC. The time follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-07T07:54:56Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the connection was modified, in UTC. The time follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-07T07:54:56Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The models.</p>
     */
    @NameInMap("Models")
    public java.util.List<ConnectionModels> models;

    /**
     * <p>The connection resource. This parameter is used for the connection configuration of the database type.</p>
     */
    @NameInMap("ResourceMeta")
    public ConnectionResourceMeta resourceMeta;

    /**
     * <p>The key-value configuration to be encrypted, such as the database logon password and the key for model connection.</p>
     */
    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>228**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Connection build(java.util.Map<String, ?> map) throws Exception {
        Connection self = new Connection();
        return TeaModel.build(map, self);
    }

    public Connection setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Connection setConfigs(java.util.Map<String, String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    public Connection setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public Connection setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public Connection setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public Connection setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Connection setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Connection setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Connection setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Connection setModels(java.util.List<ConnectionModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<ConnectionModels> getModels() {
        return this.models;
    }

    public Connection setResourceMeta(ConnectionResourceMeta resourceMeta) {
        this.resourceMeta = resourceMeta;
        return this;
    }
    public ConnectionResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public Connection setSecrets(java.util.Map<String, String> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    public Connection setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ConnectionModels extends TeaModel {
        /**
         * <p>The display name of the model.</p>
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
         * <p>Indicates whether tool calling was supported. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ToolCall")
        public Boolean toolCall;

        public static ConnectionModels build(java.util.Map<String, ?> map) throws Exception {
            ConnectionModels self = new ConnectionModels();
            return TeaModel.build(map, self);
        }

        public ConnectionModels setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ConnectionModels setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ConnectionModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ConnectionModels setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

    }

    public static class ConnectionResourceMeta extends TeaModel {
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-2vc1***v1zaqgzol</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static ConnectionResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            ConnectionResourceMeta self = new ConnectionResourceMeta();
            return TeaModel.build(map, self);
        }

        public ConnectionResourceMeta setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ConnectionResourceMeta setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConnectionResourceMeta setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
