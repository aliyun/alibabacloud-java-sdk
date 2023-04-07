// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud desktops.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The IDs of the workspaces.</p>
     */
    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartVirusScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVirusScanTaskRequest self = new StartVirusScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartVirusScanTaskRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public StartVirusScanTaskRequest setOfficeSiteId(java.util.List<String> officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public java.util.List<String> getOfficeSiteId() {
        return this.officeSiteId;
    }

    public StartVirusScanTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
