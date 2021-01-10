// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateDeviceBrandRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("BrandName")
    public String brandName;

    @NameInMap("Manufacture")
    public String manufacture;

    @NameInMap("Description")
    public String description;

    public static CreateDeviceBrandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceBrandRequest self = new CreateDeviceBrandRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceBrandRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateDeviceBrandRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public CreateDeviceBrandRequest setManufacture(String manufacture) {
        this.manufacture = manufacture;
        return this;
    }
    public String getManufacture() {
        return this.manufacture;
    }

    public CreateDeviceBrandRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
