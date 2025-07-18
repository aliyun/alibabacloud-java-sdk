// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpConnectConfig extends TeaModel {
    @NameInMap("ConnectorId")
    public String connectorId;

    @NameInMap("UseConnector")
    public Boolean useConnector;

    public static IdpConnectConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpConnectConfig self = new IdpConnectConfig();
        return TeaModel.build(map, self);
    }

    public IdpConnectConfig setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public IdpConnectConfig setUseConnector(Boolean useConnector) {
        this.useConnector = useConnector;
        return this;
    }
    public Boolean getUseConnector() {
        return this.useConnector;
    }

}
