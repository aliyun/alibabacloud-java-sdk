// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNASFileSystemRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    public String officeSiteId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static CreateNASFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNASFileSystemRequest self = new CreateNASFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public CreateNASFileSystemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNASFileSystemRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateNASFileSystemRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNASFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
