// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateRepositoryGroupRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("avatarUrl")
    public String avatarUrl;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("visibilityLevel")
    public Integer visibilityLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CreateRepositoryGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryGroupRequest self = new CreateRepositoryGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryGroupRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateRepositoryGroupRequest setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public CreateRepositoryGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRepositoryGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRepositoryGroupRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateRepositoryGroupRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateRepositoryGroupRequest setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    public CreateRepositoryGroupRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
