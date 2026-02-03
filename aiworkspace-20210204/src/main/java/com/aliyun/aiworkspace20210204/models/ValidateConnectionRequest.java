// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ValidateConnectionRequest extends TeaModel {
    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    /**
     * <strong>example:</strong>
     * <p>conn-x2wz5zvvbyf2420fi9</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <strong>example:</strong>
     * <p>DashScopeConnection</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    /**
     * <strong>example:</strong>
     * <p>Connectivity</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ValidateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateConnectionRequest self = new ValidateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ValidateConnectionRequest setConfigs(java.util.Map<String, String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    public ValidateConnectionRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public ValidateConnectionRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public ValidateConnectionRequest setSecrets(java.util.Map<String, String> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    public ValidateConnectionRequest setValidateType(String validateType) {
        this.validateType = validateType;
        return this;
    }
    public String getValidateType() {
        return this.validateType;
    }

    public ValidateConnectionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
