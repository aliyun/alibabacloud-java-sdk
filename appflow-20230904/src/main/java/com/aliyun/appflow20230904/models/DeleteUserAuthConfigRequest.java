// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class DeleteUserAuthConfigRequest extends TeaModel {
    /**
     * <p>The credential ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uac-8f4bfe29041441d8bdd9</p>
     */
    @NameInMap("AuthConfigId")
    public String authConfigId;

    /**
     * <p>The ID of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-5e43ef26b53e4a158529</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The connector name.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ConnectorVersion")
    public String connectorVersion;

    public static DeleteUserAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserAuthConfigRequest self = new DeleteUserAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserAuthConfigRequest setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }
    public String getAuthConfigId() {
        return this.authConfigId;
    }

    public DeleteUserAuthConfigRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public DeleteUserAuthConfigRequest setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

}
