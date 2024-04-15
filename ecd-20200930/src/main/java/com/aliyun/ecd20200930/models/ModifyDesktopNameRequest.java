// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopNameRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The new name of the cloud computer. The name of the cloud computer must meet the following requirements:</p>
     * <br>
     * <p>*   The name must be 1 to 64 characters in length.</p>
     * <p>*   The name must start with a letter but cannot start with `http://` or `https://`.</p>
     * <p>*   The name can only contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     */
    @NameInMap("NewDesktopName")
    public String newDesktopName;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
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
