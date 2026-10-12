// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSyncMCPServerRequest extends TeaModel {
    /**
     * <p>The AI gateway ID. This parameter is required. If this parameter is not specified, the API returns InvalidParameter.IsEmpty(400).</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The Nacos namespace ID. This parameter is required. If this parameter is not specified, the API returns InvalidParameter.IsEmpty(400).</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The Nacos service source ID. In a single Nacos source scenario, this parameter can be omitted because the server automatically populates the unique source. In a multi-Nacos source scenario, this parameter is required. Otherwise, a parameter error indicating that sourceId is empty is returned. If the gateway has no Nacos source, the error ErrServiceSourceNotFound is returned.</p>
     * 
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
