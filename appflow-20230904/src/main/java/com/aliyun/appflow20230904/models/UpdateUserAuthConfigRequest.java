// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class UpdateUserAuthConfigRequest extends TeaModel {
    /**
     * <p>The user authentication credential, provided as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;apiKey\&quot;: \&quot;************\&quot;}</p>
     */
    @NameInMap("AuthConfig")
    public String authConfig;

    /**
     * <p>The ID of the credential.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uac-42b60d53bcce466d9d08</p>
     */
    @NameInMap("AuthConfigId")
    public String authConfigId;

    /**
     * <p>The name of the credential.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("AuthConfigName")
    public String authConfigName;

    /**
     * <p>The ID of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-6b8df2297dca4a5f8f15</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The connector version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConnectorVersion")
    public String connectorVersion;

    public static UpdateUserAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthConfigRequest self = new UpdateUserAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthConfigRequest setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public UpdateUserAuthConfigRequest setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }
    public String getAuthConfigId() {
        return this.authConfigId;
    }

    public UpdateUserAuthConfigRequest setAuthConfigName(String authConfigName) {
        this.authConfigName = authConfigName;
        return this;
    }
    public String getAuthConfigName() {
        return this.authConfigName;
    }

    public UpdateUserAuthConfigRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public UpdateUserAuthConfigRequest setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

}
