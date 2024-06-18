// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DetachApplication2ConnectorShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationIds")
    public String applicationIdsShrink;

    /**
     * <p>ConnectorID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-94db94e06b98****</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    public static DetachApplication2ConnectorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachApplication2ConnectorShrinkRequest self = new DetachApplication2ConnectorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachApplication2ConnectorShrinkRequest setApplicationIdsShrink(String applicationIdsShrink) {
        this.applicationIdsShrink = applicationIdsShrink;
        return this;
    }
    public String getApplicationIdsShrink() {
        return this.applicationIdsShrink;
    }

    public DetachApplication2ConnectorShrinkRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

}
