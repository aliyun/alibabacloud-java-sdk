// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDeviceBrandsRequest extends TeaModel {
    @NameInMap("DeviceBrandId")
    public Long deviceBrandId;

    @NameInMap("DeviceBrand")
    public String deviceBrand;

    @NameInMap("ProjectId")
    public String projectId;

    public static CountDeviceBrandsRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDeviceBrandsRequest self = new CountDeviceBrandsRequest();
        return TeaModel.build(map, self);
    }

    public CountDeviceBrandsRequest setDeviceBrandId(Long deviceBrandId) {
        this.deviceBrandId = deviceBrandId;
        return this;
    }
    public Long getDeviceBrandId() {
        return this.deviceBrandId;
    }

    public CountDeviceBrandsRequest setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    public CountDeviceBrandsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
