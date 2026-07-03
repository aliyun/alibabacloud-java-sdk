// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeStorageRequest extends TeaModel {
    /**
     * <p>The region of the Data Management center for threat analysis. Select a region for the center based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Select this value if your assets are in the Chinese mainland or the China (Hong Kong) region.</p>
     * </li>
     * <li><p>ap-southeast-1: Select this value if your assets are in regions outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member whose view you want to use. This parameter is available only for administrators.</p>
     * 
     * <strong>example:</strong>
     * <p>137820528780****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of view. Valid values:</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts in your enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static DescribeStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageRequest self = new DescribeStorageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeStorageRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeStorageRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
