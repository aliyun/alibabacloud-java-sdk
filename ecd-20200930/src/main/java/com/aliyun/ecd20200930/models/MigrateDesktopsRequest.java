// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateDesktopsRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computers. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the destination office network.</p>
     */
    @NameInMap("TargetOfficeSiteId")
    public String targetOfficeSiteId;

    public static MigrateDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateDesktopsRequest self = new MigrateDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public MigrateDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public MigrateDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MigrateDesktopsRequest setTargetOfficeSiteId(String targetOfficeSiteId) {
        this.targetOfficeSiteId = targetOfficeSiteId;
        return this;
    }
    public String getTargetOfficeSiteId() {
        return this.targetOfficeSiteId;
    }

}
