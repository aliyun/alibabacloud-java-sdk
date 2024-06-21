// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckCommercialStatusRequest extends TeaModel {
    /**
     * <p>The region ID. Default value: cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Sub-services:</p>
     * <ul>
     * <li>apm: Application Monitoring</li>
     * <li>rum: Real User Monitoring</li>
     * <li>prometheus: Managed Service for Prometheus</li>
     * <li>xtrace: Managed Service for OpenTelemetry</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apm</p>
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
