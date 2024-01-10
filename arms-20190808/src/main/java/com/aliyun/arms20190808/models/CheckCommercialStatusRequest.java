// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckCommercialStatusRequest extends TeaModel {
    /**
     * <p>The region ID. Default value: cn-hangzhou.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Sub-services:</p>
     * <p>- apm: Application Monitoring</p>
     * <p>- rum: Real User Monitoring</p>
     * <p>- prometheus: Managed Service for Prometheus</p>
     * <p>- xtrace: Managed Service for OpenTelemetry</p>
     */
    @NameInMap("Service")
    public String service;

    public static CheckCommercialStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCommercialStatusRequest self = new CheckCommercialStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckCommercialStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckCommercialStatusRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
