// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableAccessForCloudSiemRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically add alert logs from Security Center, Web Application Firewall (WAF), and Cloud Firewall. By default, alert logs are automatically added.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoSubmit")
    public Integer autoSubmit;

    /**
     * <p>The region of the Data Management center for Threat Analysis. Select the region based on where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or Hong Kong (China).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in regions outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can use this parameter to switch to the perspective of the specified member.</p>
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
     * <li><p>1: The view of all member accounts.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static EnableAccessForCloudSiemRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAccessForCloudSiemRequest self = new EnableAccessForCloudSiemRequest();
        return TeaModel.build(map, self);
    }

    public EnableAccessForCloudSiemRequest setAutoSubmit(Integer autoSubmit) {
        this.autoSubmit = autoSubmit;
        return this;
    }
    public Integer getAutoSubmit() {
        return this.autoSubmit;
    }

    public EnableAccessForCloudSiemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableAccessForCloudSiemRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public EnableAccessForCloudSiemRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
