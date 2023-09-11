// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StopAlertRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule.</p>
     */
    @NameInMap("AlertId")
    public String alertId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StopAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAlertRequest self = new StopAlertRequest();
        return TeaModel.build(map, self);
    }

    public StopAlertRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

    public StopAlertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
