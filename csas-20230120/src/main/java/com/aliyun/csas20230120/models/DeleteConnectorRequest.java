// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteConnectorRequest extends TeaModel {
    /**
     * <p>ConnectorID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-d02b62911b2fb2d4</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    public static DeleteConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectorRequest self = new DeleteConnectorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConnectorRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

}
