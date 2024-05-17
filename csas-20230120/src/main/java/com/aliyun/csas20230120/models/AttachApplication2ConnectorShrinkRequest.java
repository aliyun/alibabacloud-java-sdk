// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AttachApplication2ConnectorShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationIds")
    public String applicationIdsShrink;

    /**
     * <p>ConnectorID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    public static AttachApplication2ConnectorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachApplication2ConnectorShrinkRequest self = new AttachApplication2ConnectorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachApplication2ConnectorShrinkRequest setApplicationIdsShrink(String applicationIdsShrink) {
        this.applicationIdsShrink = applicationIdsShrink;
        return this;
    }
    public String getApplicationIdsShrink() {
        return this.applicationIdsShrink;
    }

    public AttachApplication2ConnectorShrinkRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

}
