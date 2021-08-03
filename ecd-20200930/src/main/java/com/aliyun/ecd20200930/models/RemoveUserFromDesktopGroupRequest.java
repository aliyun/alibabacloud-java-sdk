// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveUserFromDesktopGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    public static RemoveUserFromDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromDesktopGroupRequest self = new RemoveUserFromDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveUserFromDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public RemoveUserFromDesktopGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

}
