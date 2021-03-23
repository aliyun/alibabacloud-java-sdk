// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceBrandsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceBrands")
    public java.util.List<ListDeviceBrandsResponseBodyDeviceBrands> deviceBrands;

    public static ListDeviceBrandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBrandsResponseBody self = new ListDeviceBrandsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceBrandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceBrandsResponseBody setDeviceBrands(java.util.List<ListDeviceBrandsResponseBodyDeviceBrands> deviceBrands) {
        this.deviceBrands = deviceBrands;
        return this;
    }
    public java.util.List<ListDeviceBrandsResponseBodyDeviceBrands> getDeviceBrands() {
        return this.deviceBrands;
    }

    public static class ListDeviceBrandsResponseBodyDeviceBrands extends TeaModel {
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

        public static ListDeviceBrandsResponseBodyDeviceBrands build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceBrandsResponseBodyDeviceBrands self = new ListDeviceBrandsResponseBodyDeviceBrands();
            return TeaModel.build(map, self);
        }

        public ListDeviceBrandsResponseBodyDeviceBrands setDeviceBrandId(Long deviceBrandId) {
            this.deviceBrandId = deviceBrandId;
            return this;
        }
        public Long getDeviceBrandId() {
            return this.deviceBrandId;
        }

        public ListDeviceBrandsResponseBodyDeviceBrands setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public ListDeviceBrandsResponseBodyDeviceBrands setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDeviceBrandsResponseBodyDeviceBrands setManufacture(String manufacture) {
            this.manufacture = manufacture;
            return this;
        }
        public String getManufacture() {
            return this.manufacture;
        }

        public ListDeviceBrandsResponseBodyDeviceBrands setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
