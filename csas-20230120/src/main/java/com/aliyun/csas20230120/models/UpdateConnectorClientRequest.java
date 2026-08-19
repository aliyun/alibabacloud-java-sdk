// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateConnectorClientRequest extends TeaModel {
    /**
     * <p>The connector ID. You can call <a href="~~ListConnectors~~">ListConnectors</a> to query connector IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-94db94e06b98****</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The unique identifier of the ConnectorClient device. You can call <a href="~~ListConnectors~~">ListConnectors</a> to query connector information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>672ECBEE-727B-5F43-8D22-90F2BD9E38A7</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>The connection status of the ConnectorClient. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: connected.</li>
     * <li><strong>Disabled</strong>: disconnected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateConnectorClientRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorClientRequest self = new UpdateConnectorClientRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorClientRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public UpdateConnectorClientRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public UpdateConnectorClientRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
