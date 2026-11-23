// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ValidateConnectionRequest extends TeaModel {
    /**
     * <p>The configuration information of the connection. The information is configured in key-value pairs. The keys in the configuration vary based on the connection type. For more information, see the supplementary description of request parameters for the CreateConnection operation.</p>
     */
    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    /**
     * <p>The connection ID. For more information about how to obtain the connection ID, see <a href="~~ListConnections~~">ListConnections</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>conn-x2wz5zvvbyf2420fi9</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>The type of the connection. You can specify a connection type that supports public network access. Valid values:</p>
     * <ul>
     * <li>DashScopeConnection: The Model Studio connection.</li>
     * <li>DeepSeekConnection: The DeepSeek connection.</li>
     * <li>FunctionAIMCPConnection: The Function AI MCP connection.</li>
     * <li>CustomMCPConnection: The custom MCP connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DashScopeConnection</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The key-value configurations that require encryption, such as the database logon password and the key for the model connection.</p>
     */
    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    /**
     * <p>The validation type. Valid values:</p>
     * <ul>
     * <li>Connectivity: The connectivity test.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Connectivity</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    /**
     * <p>The workspace ID. You can obtain the workspace ID by calling the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation.</p>
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
