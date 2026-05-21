// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetConnectorRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>file_conn_xxxx</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    @NameInMap("ConnectorName")
    public String connectorName;

    public static GetConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectorRequest self = new GetConnectorRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectorRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public GetConnectorRequest setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

}
