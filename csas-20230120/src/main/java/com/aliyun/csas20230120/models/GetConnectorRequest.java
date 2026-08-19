// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetConnectorRequest extends TeaModel {
    /**
     * <p>ConnectorID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-fcd9c35583087b2f</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

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

}
