// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddContainerAppRequest extends TeaModel {
    @NameInMap("ContainerType")
    public String containerType;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("Name")
    public String name;

    @NameInMap("Repository")
    public String repository;

    public static AddContainerAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContainerAppRequest self = new AddContainerAppRequest();
        return TeaModel.build(map, self);
    }

    public AddContainerAppRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public AddContainerAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddContainerAppRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public AddContainerAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddContainerAppRequest setRepository(String repository) {
        this.repository = repository;
        return this;
    }
    public String getRepository() {
        return this.repository;
    }

}
