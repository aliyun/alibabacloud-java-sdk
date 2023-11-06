// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X 1.0 instance that you want to upgrade.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The version number of the PolarDB-X 1.0 instance. You can leave this parameter unspecified.</p>
     */
    @NameInMap("Rpm")
    public String rpm;

    public static UpgradeInstanceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceVersionRequest self = new UpgradeInstanceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceVersionRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public UpgradeInstanceVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeInstanceVersionRequest setRpm(String rpm) {
        this.rpm = rpm;
        return this;
    }
    public String getRpm() {
        return this.rpm;
    }

}
