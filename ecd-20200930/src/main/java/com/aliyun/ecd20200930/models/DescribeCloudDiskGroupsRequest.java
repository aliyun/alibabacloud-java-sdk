// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-0456357992</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("GroupId")
    public java.util.List<String> groupId;

    @NameInMap("GroupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("ParentOrgId")
    public String parentOrgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudDiskGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskGroupsRequest self = new DescribeCloudDiskGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskGroupsRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DescribeCloudDiskGroupsRequest setGroupId(java.util.List<String> groupId) {
        this.groupId = groupId;
        return this;
    }
    public java.util.List<String> getGroupId() {
        return this.groupId;
    }

    public DescribeCloudDiskGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeCloudDiskGroupsRequest setParentOrgId(String parentOrgId) {
        this.parentOrgId = parentOrgId;
        return this;
    }
    public String getParentOrgId() {
        return this.parentOrgId;
    }

    public DescribeCloudDiskGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
