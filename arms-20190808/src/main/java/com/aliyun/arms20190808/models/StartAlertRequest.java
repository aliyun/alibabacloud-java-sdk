// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartAlertRequest extends TeaModel {
    // The ID of the alert rule. You can call the SearchAlertRules operation and view the `Id` parameter in the response. For more information, see [SearchAlertRules](~~175825~~).
    @NameInMap("AlertId")
    public String alertId;

    // The ID of the region. Set the value to `cn-hangzhou`.
    @NameInMap("RegionId")
    public String regionId;

    public static StartAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAlertRequest self = new StartAlertRequest();
        return TeaModel.build(map, self);
    }

    public StartAlertRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

    public StartAlertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
