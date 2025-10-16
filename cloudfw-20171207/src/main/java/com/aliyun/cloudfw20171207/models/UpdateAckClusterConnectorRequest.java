// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateAckClusterConnectorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-7c1bad6c3cc84c33baab</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <strong>example:</strong>
     * <p>ack-cluster-connector-name</p>
     */
    @NameInMap("ConnectorName")
    public String connectorName;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public String ttl;

    public static UpdateAckClusterConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterConnectorRequest self = new UpdateAckClusterConnectorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterConnectorRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public UpdateAckClusterConnectorRequest setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public UpdateAckClusterConnectorRequest setTtl(String ttl) {
        this.ttl = ttl;
        return this;
    }
    public String getTtl() {
        return this.ttl;
    }

}
