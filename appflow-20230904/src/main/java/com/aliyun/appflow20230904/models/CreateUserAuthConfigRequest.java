// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class CreateUserAuthConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AuthConfig")
    public String authConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian-01ce5586-420f-4cbf-9392-7001a1c33bc1</p>
     */
    @NameInMap("AuthConfigName")
    public String authConfigName;

    /**
     * <strong>example:</strong>
     * <p>DingdingAccessToken</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-3c60c6e123e146fbb6f8</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConnectorVersion")
    public String connectorVersion;

    public static CreateUserAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAuthConfigRequest self = new CreateUserAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserAuthConfigRequest setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public CreateUserAuthConfigRequest setAuthConfigName(String authConfigName) {
        this.authConfigName = authConfigName;
        return this;
    }
    public String getAuthConfigName() {
        return this.authConfigName;
    }

    public CreateUserAuthConfigRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateUserAuthConfigRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public CreateUserAuthConfigRequest setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

}
