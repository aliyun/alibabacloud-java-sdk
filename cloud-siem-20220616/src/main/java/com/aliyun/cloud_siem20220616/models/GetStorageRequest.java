// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetStorageRequest extends TeaModel {
    /**
     * <p>The region where the Data Management hub for threat analysis is located. Select a region for the management hub based on the region of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Select this value if your assets are in the Chinese mainland or the China (Hong Kong) region.</p>
     * </li>
     * <li><p>ap-southeast-1: Select this value if your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. This parameter is used by an administrator to switch to the perspective of a member.</p>
     * 
     * <strong>example:</strong>
     * <p>127XXXX</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts that belong to the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static GetStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageRequest self = new GetStorageRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStorageRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public GetStorageRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
