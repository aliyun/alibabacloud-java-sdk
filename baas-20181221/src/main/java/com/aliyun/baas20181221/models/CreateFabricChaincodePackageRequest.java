// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChaincodePackageRequest extends TeaModel {
    @NameInMap("Location")
    public String location;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("OssUrl")
    public String ossUrl;

    public static CreateFabricChaincodePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChaincodePackageRequest self = new CreateFabricChaincodePackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricChaincodePackageRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateFabricChaincodePackageRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateFabricChaincodePackageRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

}
