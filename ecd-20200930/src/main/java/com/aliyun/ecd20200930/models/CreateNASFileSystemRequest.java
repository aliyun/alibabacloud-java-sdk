// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNASFileSystemRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    public String officeSiteId;

    public static CreateNASFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNASFileSystemRequest self = new CreateNASFileSystemRequest();
        return TeaModel.build(map, self);
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

    public CreateNASFileSystemRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

}
