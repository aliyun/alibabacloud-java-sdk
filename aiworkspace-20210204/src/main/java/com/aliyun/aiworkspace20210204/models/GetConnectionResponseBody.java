// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetConnectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    /**
     * <strong>example:</strong>
     * <p>conn-pai9m***mi47</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <strong>example:</strong>
     * <p>OpenSearchConnection</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <strong>example:</strong>
     * <p>28632***898231</p>
     */
    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2025-03-07T07:54:56Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2025-03-07T07:54:56Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Models")
    public java.util.List<GetConnectionResponseBodyModels> models;

    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceMeta")
    public GetConnectionResponseBodyResourceMeta resourceMeta;

    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    /**
     * <strong>example:</strong>
     * <p>11**43</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionResponseBody self = new GetConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectionResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetConnectionResponseBody setConfigs(java.util.Map<String, String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    public GetConnectionResponseBody setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public GetConnectionResponseBody setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public GetConnectionResponseBody setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public GetConnectionResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetConnectionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetConnectionResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetConnectionResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetConnectionResponseBody setModels(java.util.List<GetConnectionResponseBodyModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<GetConnectionResponseBodyModels> getModels() {
        return this.models;
    }

    public GetConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionResponseBody setResourceMeta(GetConnectionResponseBodyResourceMeta resourceMeta) {
        this.resourceMeta = resourceMeta;
        return this;
    }
    public GetConnectionResponseBodyResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public GetConnectionResponseBody setSecrets(java.util.Map<String, String> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    public GetConnectionResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetConnectionResponseBodyModels extends TeaModel {
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

        public static GetConnectionResponseBodyModels build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyModels self = new GetConnectionResponseBodyModels();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyModels setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetConnectionResponseBodyModels setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetConnectionResponseBodyModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetConnectionResponseBodyModels setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

    }

    public static class GetConnectionResponseBodyResourceMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ld-2vc1***v1zaqgzol</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static GetConnectionResponseBodyResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyResourceMeta self = new GetConnectionResponseBodyResourceMeta();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyResourceMeta setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConnectionResponseBodyResourceMeta setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
