// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopMaintenanceRequest extends TeaModel {
    /**
     * <p>A list of cloud computer IDs for which you want to set maintenance mode. A maximum of 100 cloud computer IDs are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>Enter or exit cloud computer maintenance mode.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>ENTER: The enters the maintenance mode.</li>
     * <li>EXIT: The exits the maintenance mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enter</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
