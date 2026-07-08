// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class GetUserAuthConfigRequest extends TeaModel {
    /**
     * <p>The credential ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uac-ac11e0f1db7647ce8469</p>
     */
    @NameInMap("AuthConfigId")
    public String authConfigId;

    /**
     * <p>The connector ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-5e43ef26b53e4a158529</p>
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

    public static GetUserAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserAuthConfigRequest self = new GetUserAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetUserAuthConfigRequest setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }
    public String getAuthConfigId() {
        return this.authConfigId;
    }

    public GetUserAuthConfigRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public GetUserAuthConfigRequest setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }
    public String getConnectorVersion() {
        return this.connectorVersion;
    }

}
