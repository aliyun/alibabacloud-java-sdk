// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SetStorageRequest extends TeaModel {
    /**
     * <p>The log storage region.</p>
     * <p>If the Data Management center is in cn-hangzhou, the default value of Region is <strong>cn-shanghai</strong>. If the Data Management center is in <strong>ap-southeast-1</strong>, the default value of <strong>Region</strong> is <strong>ap-southeast-1</strong>.</p>
     * <p>The log storage region cannot be changed. To change the region, contact the Threat Analysis operations team.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region of the Data Management center for Threat Analysis. Select the region for the Data Management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Select this value if your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: Select this value if your assets are in a region outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. An administrator can use this parameter to switch to the view of a specific member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view.</p>
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

    /**
     * <p>The log storage duration in days. The default value is 180. The minimum value is 30 and the maximum value is 3000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static SetStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStorageRequest self = new SetStorageRequest();
        return TeaModel.build(map, self);
    }

    public SetStorageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SetStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetStorageRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public SetStorageRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public SetStorageRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
