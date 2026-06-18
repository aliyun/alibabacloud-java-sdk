// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateConnectorRequest extends TeaModel {
    /**
     * <p>The name of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-connector</p>
     */
    @NameInMap("ConnectorName")
    public String connectorName;

    /**
     * <p>A description of the connector.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>never_delete_aeip_95_us-west-1</p>
     */
    @NameInMap("Description")
    public String description;

    public static UpdateConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorRequest self = new UpdateConnectorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorRequest setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public UpdateConnectorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
