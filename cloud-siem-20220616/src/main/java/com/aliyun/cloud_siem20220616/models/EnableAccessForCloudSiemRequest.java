// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableAccessForCloudSiemRequest extends TeaModel {
    @NameInMap("AutoSubmit")
    public Integer autoSubmit;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

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
