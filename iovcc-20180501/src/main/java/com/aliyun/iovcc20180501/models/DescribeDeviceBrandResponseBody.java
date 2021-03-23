// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceBrandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceBrand")
    public DescribeDeviceBrandResponseBodyDeviceBrand deviceBrand;

    public static DescribeDeviceBrandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceBrandResponseBody self = new DescribeDeviceBrandResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceBrandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceBrandResponseBody setDeviceBrand(DescribeDeviceBrandResponseBodyDeviceBrand deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public DescribeDeviceBrandResponseBodyDeviceBrand getDeviceBrand() {
        return this.deviceBrand;
    }

    public static class DescribeDeviceBrandResponseBodyDeviceBrand extends TeaModel {
        @NameInMap("DeviceBrandId")
        public Long deviceBrandId;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Manufacture")
        public String manufacture;

        @NameInMap("Description")
        public String description;

        public static DescribeDeviceBrandResponseBodyDeviceBrand build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceBrandResponseBodyDeviceBrand self = new DescribeDeviceBrandResponseBodyDeviceBrand();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceBrandResponseBodyDeviceBrand setDeviceBrandId(Long deviceBrandId) {
            this.deviceBrandId = deviceBrandId;
            return this;
        }
        public Long getDeviceBrandId() {
            return this.deviceBrandId;
        }

        public DescribeDeviceBrandResponseBodyDeviceBrand setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public DescribeDeviceBrandResponseBodyDeviceBrand setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeDeviceBrandResponseBodyDeviceBrand setManufacture(String manufacture) {
            this.manufacture = manufacture;
            return this;
        }
        public String getManufacture() {
            return this.manufacture;
        }

        public DescribeDeviceBrandResponseBodyDeviceBrand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
