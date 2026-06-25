// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Connection extends TeaModel {
    /**
     * <p>The workspace visibility. Valid values:</p>
     * <ul>
     * <li><p>PRIVATE (default): The connection is visible only to you and administrators in the workspace.</p>
     * </li>
     * <li><p>PUBLIC: The connection is visible to all users in the workspace.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The connection configurations.</p>
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
     * <p>The name of the connection.</p>
     * 
     * <strong>example:</strong>
     * <p>lindorm-connection</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The connection type. Valid values:</p>
     * <ul>
     * <li><p>DashScopeConnection: A service connection to Alibaba Cloud Model Studio.</p>
     * </li>
     * <li><p>OpenLLMConnection: An open source model connection.</p>
     * </li>
     * <li><p>MilvusConnection: A Milvus connection.</p>
     * </li>
     * <li><p>OpenSearchConnection: An OpenSearch connection.</p>
     * </li>
     * <li><p>LindormConnection: A Lindorm connection.</p>
     * </li>
     * <li><p>ElasticsearchConnection: An Elasticsearch connection.</p>
     * </li>
     * <li><p>HologresConnection: A Hologres connection.</p>
     * </li>
     * <li><p>RDSConnection: An RDS connection.</p>
     * </li>
     * <li><p>CustomConnection: A custom connection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ElasticsearchConnection</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The creator of the connection.</p>
     * 
     * <strong>example:</strong>
     * <p>20925961****557803</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The connection description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description of a database connection.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the connection was created. The time is in UTC and follows the ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-07T07:54:56Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the connection was last modified. The time is in UTC and follows the ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-07T07:54:56Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The model list.</p>
     */
    @NameInMap("Models")
    public java.util.List<ConnectionModels> models;

    /**
     * <p>The resource information for the connection. This usually applies to database connection configurations.</p>
     */
    @NameInMap("ResourceMeta")
    public ConnectionResourceMeta resourceMeta;

    /**
     * <p>The key-value configurations to encrypt, such as database logon passwords and model connection keys.</p>
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
         * <p>The model\&quot;s display name.</p>
         * 
         * <strong>example:</strong>
         * <p>BGE model deploy.</p>
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
         * <li><p>LLM (large language model)</p>
         * </li>
         * <li><p>Embedding (Embedding model)</p>
         * </li>
         * <li><p>ReRank (ReRank model)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>Indicates whether tool calling is supported. Valid values:</p>
         * <ul>
         * <li><p>true: Supported</p>
         * </li>
         * <li><p>false: Not supported</p>
         * </li>
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
        /**
         * <p>Extra configuration information.</p>
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
         * <p>ld-2vc1***v1zaqgzol</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm-xxxxxxx</p>
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
