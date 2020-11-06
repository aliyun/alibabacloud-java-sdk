// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateApiRequest extends TeaModel {
    // aliasName
    @NameInMap("aliasName")
    public String aliasName;

    // attachedServices
    @NameInMap("attachedServices")
    public java.util.List<Long> attachedServices;

    // basePath
    @NameInMap("basePath")
    public String basePath;

    // description
    @NameInMap("description")
    public String description;

    // name
    @NameInMap("name")
    public String name;

    // status
    @NameInMap("status")
    public Long status;

    public static CreateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiRequest self = new CreateApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateApiRequest setAttachedServices(java.util.List<Long> attachedServices) {
        this.attachedServices = attachedServices;
        return this;
    }
    public java.util.List<Long> getAttachedServices() {
        return this.attachedServices;
    }

    public CreateApiRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public CreateApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApiRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
