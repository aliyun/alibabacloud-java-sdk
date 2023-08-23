// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenArmsServiceSecondVersionRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the service. Valid values:</p>
     * <br>
     * <p>*   `arms`: ARMS</p>
     * <p>*   `arms_app`: Application Monitoring</p>
     * <p>*   `arms_web`: Browser Monitoring</p>
     * <p>*   `prometheus_monitor`: Managed Service for Prometheus</p>
     * <p>*   `synthetic_post`: Synthetic Monitoring</p>
     */
    @NameInMap("Type")
    public String type;

    public static OpenArmsServiceSecondVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsServiceSecondVersionRequest self = new OpenArmsServiceSecondVersionRequest();
        return TeaModel.build(map, self);
    }

    public OpenArmsServiceSecondVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OpenArmsServiceSecondVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
