// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeUserSiemOrderStatusRequest extends TeaModel {
    /**
     * <p>The region of the data management center for threat detection and response. Select the data management center based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: assets in the Chinese mainland or Hong Kong (China).</li>
     * <li>ap-southeast-1: assets in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to another member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890***</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account view.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static DescribeUserSiemOrderStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSiemOrderStatusRequest self = new DescribeUserSiemOrderStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserSiemOrderStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserSiemOrderStatusRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeUserSiemOrderStatusRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
