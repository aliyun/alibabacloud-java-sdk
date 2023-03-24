// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DetachApplication2ConnectorRequest extends TeaModel {
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>ConnectorID。</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    public static DetachApplication2ConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachApplication2ConnectorRequest self = new DetachApplication2ConnectorRequest();
        return TeaModel.build(map, self);
    }

    public DetachApplication2ConnectorRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public DetachApplication2ConnectorRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

}
