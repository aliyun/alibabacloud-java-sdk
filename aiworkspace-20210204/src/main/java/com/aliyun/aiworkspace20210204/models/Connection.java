// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Connection extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("ConnectionType")
    public String connectionType;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Models")
    public java.util.List<ConnectionModels> models;

    @NameInMap("ResourceMeta")
    public ConnectionResourceMeta resourceMeta;

    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

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
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Model")
        public String model;

        @NameInMap("ModelType")
        public String modelType;

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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static ConnectionResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            ConnectionResourceMeta self = new ConnectionResourceMeta();
            return TeaModel.build(map, self);
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
