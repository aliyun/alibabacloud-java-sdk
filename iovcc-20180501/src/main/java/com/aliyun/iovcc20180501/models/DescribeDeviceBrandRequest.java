// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceBrandRequest extends TeaModel {
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

    public static DescribeDeviceBrandRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceBrandRequest self = new DescribeDeviceBrandRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceBrandRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeDeviceBrandRequest setDeviceBrandId(Long deviceBrandId) {
        this.deviceBrandId = deviceBrandId;
        return this;
    }
    public Long getDeviceBrandId() {
        return this.deviceBrandId;
    }

    public DescribeDeviceBrandRequest setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    public DescribeDeviceBrandRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public DescribeDeviceBrandRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

}
