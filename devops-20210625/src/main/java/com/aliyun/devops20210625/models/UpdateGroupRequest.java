// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("avatarUrl")
    public String avatarUrl;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("path")
    public String path;

    @NameInMap("pathWithNamespace")
    public String pathWithNamespace;

    @NameInMap("visibilityLevel")
    public Integer visibilityLevel;

    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateGroupRequest setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public UpdateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGroupRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateGroupRequest setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }
    public String getPathWithNamespace() {
        return this.pathWithNamespace;
    }

    public UpdateGroupRequest setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    public UpdateGroupRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
