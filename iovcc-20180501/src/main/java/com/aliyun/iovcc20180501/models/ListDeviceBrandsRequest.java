// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceBrandsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceBrandId")
    public Long deviceBrandId;

    @NameInMap("DeviceBrand")
    public String deviceBrand;

    @NameInMap("Start")
    public String start;

    @NameInMap("Length")
    public String length;

    public static ListDeviceBrandsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBrandsRequest self = new ListDeviceBrandsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceBrandsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListDeviceBrandsRequest setDeviceBrandId(Long deviceBrandId) {
        this.deviceBrandId = deviceBrandId;
        return this;
    }
    public Long getDeviceBrandId() {
        return this.deviceBrandId;
    }

    public ListDeviceBrandsRequest setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    public ListDeviceBrandsRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public ListDeviceBrandsRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

}
