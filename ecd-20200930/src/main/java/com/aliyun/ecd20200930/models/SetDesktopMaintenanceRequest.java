// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopMaintenanceRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computers for which you want to set the maintenance mode. You can specify up to 100 cloud computer IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>Specifies whether to enter or exit maintenance mode for the cloud computer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enter</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetDesktopMaintenanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopMaintenanceRequest self = new SetDesktopMaintenanceRequest();
        return TeaModel.build(map, self);
    }

    public SetDesktopMaintenanceRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public SetDesktopMaintenanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SetDesktopMaintenanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
