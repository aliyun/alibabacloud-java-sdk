// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateDesktopsRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("RegionId")
    public String regionId;

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
