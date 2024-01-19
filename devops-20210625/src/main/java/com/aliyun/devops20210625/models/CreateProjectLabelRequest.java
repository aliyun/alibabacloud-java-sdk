// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateProjectLabelRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("color")
    public String color;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    public static CreateProjectLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectLabelRequest self = new CreateProjectLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectLabelRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateProjectLabelRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateProjectLabelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectLabelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectLabelRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateProjectLabelRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

}
