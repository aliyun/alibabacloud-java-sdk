// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetIntegrationStateRequest extends TeaModel {
    /**
     * <p>The ID of the Container Service for Kubernetes (ACK) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The abbreviation of the software that is supported by ARMS. Valid values (case-insensitive): <code>ASM</code>, <code>IoT</code>, and <code>Flink</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asm</p>
     */
    @NameInMap("Integration")
    public String integration;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetIntegrationStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationStateRequest self = new GetIntegrationStateRequest();
        return TeaModel.build(map, self);
    }

    public GetIntegrationStateRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetIntegrationStateRequest setIntegration(String integration) {
        this.integration = integration;
        return this;
    }
    public String getIntegration() {
        return this.integration;
    }

    public GetIntegrationStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
