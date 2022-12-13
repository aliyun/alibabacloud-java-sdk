// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopNameRequest extends TeaModel {
    // The ID of the cloud desktop.
    @NameInMap("DesktopId")
    public String desktopId;

    // The new name of the cloud desktop. The name of the cloud desktop must meet the following requirements:
    // 
    // *   The name must be 1 to 64 characters in length.
    // *   The name must start with a letter and cannot start with `http://` or `https://`.
    // *   The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
    @NameInMap("NewDesktopName")
    public String newDesktopName;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDesktopNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopNameRequest self = new ModifyDesktopNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopNameRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ModifyDesktopNameRequest setNewDesktopName(String newDesktopName) {
        this.newDesktopName = newDesktopName;
        return this;
    }
    public String getNewDesktopName() {
        return this.newDesktopName;
    }

    public ModifyDesktopNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
