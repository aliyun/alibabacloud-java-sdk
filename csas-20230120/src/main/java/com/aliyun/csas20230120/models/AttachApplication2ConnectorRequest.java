// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AttachApplication2ConnectorRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>ConnectorID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-94db94e06b98****</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    public static AttachApplication2ConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachApplication2ConnectorRequest self = new AttachApplication2ConnectorRequest();
        return TeaModel.build(map, self);
    }

    public AttachApplication2ConnectorRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public AttachApplication2ConnectorRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

}
