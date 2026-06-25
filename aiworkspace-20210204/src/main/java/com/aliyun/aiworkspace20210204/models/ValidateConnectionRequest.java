// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ValidateConnectionRequest extends TeaModel {
    /**
     * <p>The configuration of the connection, specified as key-value pairs. The configuration keys vary by connection type. For more information, see the supplementary information about the request parameters of the CreateConnection operation.</p>
     */
    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    /**
     * <p>The connection ID. For more information about how to obtain the connection ID, see <a href="url">ListConnections</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>conn-x2wz5zvvbyf2420fi9</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>The connection type. Only connection types that support public network access are available. Valid values:</p>
     * <ul>
     * <li><p>DashScopeConnection: a service connection for Alibaba Cloud Model Studio.</p>
     * </li>
     * <li><p>DeepSeekConnection: a service connection for DeepSeek.</p>
     * </li>
     * <li><p>FunctionAIMCPConnection: a connection for Function AI MCP.</p>
     * </li>
     * <li><p>CustomMCPConnection: a custom MCP connection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DashScopeConnection</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The key-value pairs to encrypt, such as a database logon password or a model connection key.</p>
     */
    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    /**
     * <p>The validation type. Set the value to:</p>
     * <ul>
     * <li>Connectivity: a connectivity test</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Connectivity</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    /**
     * <p>The workspace ID. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
