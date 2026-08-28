// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSyncMCPServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gw-xxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>src-xxxx</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    public static ListSyncMCPServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSyncMCPServerRequest self = new ListSyncMCPServerRequest();
        return TeaModel.build(map, self);
    }

    public ListSyncMCPServerRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListSyncMCPServerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListSyncMCPServerRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
