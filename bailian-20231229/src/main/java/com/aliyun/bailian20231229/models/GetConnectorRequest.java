// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetConnectorRequest extends TeaModel {
    /**
     * <p>The ID of the connector. You can find this ID in the <a href="https://bailian.console.aliyun.com/cn-beijing/?tab=app#/connector/list">Model Studio console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>conn_file_xxxx</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The name of the connector to query. An exact match is required.</p>
     * 
     * <strong>example:</strong>
     * <p>连接器名称</p>
     */
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
