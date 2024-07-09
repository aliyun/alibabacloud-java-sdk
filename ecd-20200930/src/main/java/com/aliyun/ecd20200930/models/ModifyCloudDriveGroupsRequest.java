// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCloudDriveGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk in Cloud Drive Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+cds-135515****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The IDs of the teams.</p>
     */
    @NameInMap("GroupId")
    public java.util.List<String> groupId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the team space. Valid values:</p>
     * <ul>
     * <li>enabled</li>
     * <li>disabled</li>
     * </ul>
     * <p>Default value: enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total capacity of the team space.</p>
     * 
     * <strong>example:</strong>
     * <p>32212254720</p>
     */
    @NameInMap("TotalSize")
    public Long totalSize;

    public static ModifyCloudDriveGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudDriveGroupsRequest self = new ModifyCloudDriveGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudDriveGroupsRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ModifyCloudDriveGroupsRequest setGroupId(java.util.List<String> groupId) {
        this.groupId = groupId;
        return this;
    }
    public java.util.List<String> getGroupId() {
        return this.groupId;
    }

    public ModifyCloudDriveGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudDriveGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyCloudDriveGroupsRequest setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
