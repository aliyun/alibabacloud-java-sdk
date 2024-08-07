// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SetStorageRequest extends TeaModel {
    /**
     * <p>The storage region of logs.</p>
     * <p>If the data management center is <strong>cn-hangzhou</strong>, the default value of <strong>Region</strong> is cn-shanghai, which specifies the China (Shanghai) region. If the data management center is <strong>ap-southeast-1</strong>, the default value of <strong>Region</strong> is ap-southeast-1, which specifies the Singapore region.</p>
     * <p>The region for log storage cannot be changed. To change the region, contact the technical support of threat analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The storage duration of logs. Default value: 180. Minimum value: 30. Maximum value: 3000. Unit: days.</p>
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
