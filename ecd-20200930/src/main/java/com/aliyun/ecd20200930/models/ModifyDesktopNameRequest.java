// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopNameRequest extends TeaModel {
    /**
     * <p>The ID of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The new name of the cloud desktop. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>The name must be 1 to 64 characters in length.</p>
     * </li>
     * <li><p>The name must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>The name can contain digits, letters, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DemoComputer01</p>
     */
    @NameInMap("NewDesktopName")
    public String newDesktopName;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to obtain a list of regions that are supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserAssignMode")
    public String userAssignMode;

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

    public ModifyDesktopNameRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
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

    public ModifyDesktopNameRequest setUserAssignMode(String userAssignMode) {
        this.userAssignMode = userAssignMode;
        return this;
    }
    public String getUserAssignMode() {
        return this.userAssignMode;
    }

}
