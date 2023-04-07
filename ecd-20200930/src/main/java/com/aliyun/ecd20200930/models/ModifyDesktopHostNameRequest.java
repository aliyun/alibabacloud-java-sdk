// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopHostNameRequest extends TeaModel {
    /**
     * <p>The ID of the cloud desktop.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The new hostname of the cloud desktop. The hostname must meet the following requirements:</p>
     * <br>
     * <p>*   Must be 2 to 15 characters in length.</p>
     * <p>*   Contain letters, digits, and hyphens (-). It cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</p>
     */
    @NameInMap("NewHostName")
    public String newHostName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDesktopHostNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopHostNameRequest self = new ModifyDesktopHostNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopHostNameRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ModifyDesktopHostNameRequest setNewHostName(String newHostName) {
        this.newHostName = newHostName;
        return this;
    }
    public String getNewHostName() {
        return this.newHostName;
    }

    public ModifyDesktopHostNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
