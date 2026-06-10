// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the enterprise cloud drive that you created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-0456357992</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The group ID.</p>
     */
    @NameInMap("GroupId")
    public java.util.List<String> groupId;

    /**
     * <p>The team space name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test team 1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The parent organization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("ParentOrgId")
    public String parentOrgId;

    /**
     * <p>The region ID.</p>
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
