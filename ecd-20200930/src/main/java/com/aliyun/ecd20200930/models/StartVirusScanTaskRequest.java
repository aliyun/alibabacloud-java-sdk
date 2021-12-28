// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

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
