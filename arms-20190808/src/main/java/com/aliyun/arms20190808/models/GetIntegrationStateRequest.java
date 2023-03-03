// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetIntegrationStateRequest extends TeaModel {
    /**
     * <p>The abbreviation of the software that is supported by Application Real-Time Monitoring Service (ARMS). Valid values (case-insensitive): `ASM`, `IoT`, and `Flink`.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The integration state of Prometheus dashboards and collection rules. Valid values:</p>
     * <br>
     * <p>*   `true`: Prometheus dashboards and collection rules are integrated.</p>
     * <p>*   `false`: Prometheus dashboards and collection rules are not integrated.</p>
     */
    @NameInMap("Integration")
    public String integration;

    /**
     * <p>The ID of the request.</p>
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
