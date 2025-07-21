// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveGroupRequest extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AdminUserIds")
    public java.util.List<String> adminUserIds;

    /**
     * <p>The ID of the cloud disk in Cloud Drive Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-532033****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the team.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7f4bbccda0cf40bb85981b65fb5e****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The size of the cloud disk in Cloud Drive Service. Unit: bytes. The size is unlimited.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024000</p>
     */
    @NameInMap("TotalSize")
    public Long totalSize;

    public static CreateCloudDriveGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveGroupRequest self = new CreateCloudDriveGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveGroupRequest setAdminUserIds(java.util.List<String> adminUserIds) {
        this.adminUserIds = adminUserIds;
        return this;
    }
    public java.util.List<String> getAdminUserIds() {
        return this.adminUserIds;
    }

    public CreateCloudDriveGroupRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CreateCloudDriveGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateCloudDriveGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCloudDriveGroupRequest setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
