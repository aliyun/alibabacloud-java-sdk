// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopHostNameRequest extends TeaModel {
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
     * <p>The new hostname of the cloud desktop. The hostname must meet the following requirements:</p>
     * <ul>
     * <li><p>The hostname must be 2 to 15 characters in length.</p>
     * </li>
     * <li><p>The hostname can contain letters, digits, and hyphens (-). It cannot start or end with a hyphen, contain consecutive hyphens, or consist of only digits.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NewName</p>
     */
    @NameInMap("NewHostName")
    public String newHostName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the available regions for Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public ModifyDesktopHostNameRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
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
