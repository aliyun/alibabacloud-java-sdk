// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSceneRequest extends TeaModel {
    /**
     * <p>The region where the data management center of Threat Analysis is deployed. You must select the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: your assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. An administrator can use this ID to switch to the member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view.</p>
     * <ul>
     * <li><p>0: the view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: the view of all accounts within the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static DescribeAlertSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSceneRequest self = new DescribeAlertSceneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSceneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertSceneRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeAlertSceneRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
