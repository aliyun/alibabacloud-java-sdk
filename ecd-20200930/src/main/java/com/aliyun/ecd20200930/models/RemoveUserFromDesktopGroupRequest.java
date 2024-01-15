// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveUserFromDesktopGroupRequest extends TeaModel {
    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The IDs of the desktop groups.</p>
     */
    @NameInMap("DesktopGroupIds")
    public java.util.List<String> desktopGroupIds;

    /**
     * <p>The authorized user to be removed.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RemoveUserFromDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromDesktopGroupRequest self = new RemoveUserFromDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public RemoveUserFromDesktopGroupRequest setDesktopGroupIds(java.util.List<String> desktopGroupIds) {
        this.desktopGroupIds = desktopGroupIds;
        return this;
    }
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    public RemoveUserFromDesktopGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public RemoveUserFromDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
