// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetIntegrationStateRequest extends TeaModel {
    // The abbreviation of the software that is supported by Application Real-Time Monitoring Service (ARMS). Valid values (case-insensitive): `ASM`, `IoT`, and `Flink`.
    @NameInMap("ClusterId")
    public String clusterId;

    // The integration state of Prometheus dashboards and collection rules. Valid values:
    // 
    // *   `true`: Prometheus dashboards and collection rules are integrated.
    // *   `false`: Prometheus dashboards and collection rules are not integrated.
    @NameInMap("Integration")
    public String integration;

    // The ID of the request.
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
