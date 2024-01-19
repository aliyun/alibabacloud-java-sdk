// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectLabelRequest extends TeaModel {
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

    public static UpdateProjectLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectLabelRequest self = new UpdateProjectLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectLabelRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateProjectLabelRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public UpdateProjectLabelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProjectLabelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProjectLabelRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public UpdateProjectLabelRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

}
