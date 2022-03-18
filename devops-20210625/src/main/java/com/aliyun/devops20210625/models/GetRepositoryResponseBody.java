// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 代码库信息
    @NameInMap("repository")
    public GetRepositoryResponseBodyRepository repository;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    public static GetRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryResponseBody self = new GetRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepositoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRepositoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRepositoryResponseBody setRepository(GetRepositoryResponseBodyRepository repository) {
        this.repository = repository;
        return this;
    }
    public GetRepositoryResponseBodyRepository getRepository() {
        return this.repository;
    }

    public GetRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRepositoryResponseBodyRepositoryNamespace extends TeaModel {
        // 头像地址
        @NameInMap("avatar")
        public String avatar;

        // 创建时间
        @NameInMap("createdAt")
        public String createdAt;

        // 描述
        @NameInMap("description")
        public String description;

        // id
        @NameInMap("id")
        public Long id;

        // 名称
        @NameInMap("name")
        public String name;

        // 归属者ID
        @NameInMap("ownerId")
        public Long ownerId;

        // 路径
        @NameInMap("path")
        public String path;

        // 更新时间
        @NameInMap("updatedAt")
        public String updatedAt;

        // 可见性。0：私有，10：内部公开
        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        public static GetRepositoryResponseBodyRepositoryNamespace build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryResponseBodyRepositoryNamespace self = new GetRepositoryResponseBodyRepositoryNamespace();
            return TeaModel.build(map, self);
        }

        public GetRepositoryResponseBodyRepositoryNamespace setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetRepositoryResponseBodyRepositoryNamespace setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryResponseBodyRepositoryNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRepositoryResponseBodyRepositoryNamespace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRepositoryResponseBodyRepositoryNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryResponseBodyRepositoryNamespace setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public GetRepositoryResponseBodyRepositoryNamespace setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetRepositoryResponseBodyRepositoryNamespace setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetRepositoryResponseBodyRepositoryNamespace setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

    public static class GetRepositoryResponseBodyRepository extends TeaModel {
        // 归档标识
        @NameInMap("archive")
        public Boolean archive;

        // 代码库头像地址
        @NameInMap("avatarUrl")
        public String avatarUrl;

        // 创建时间
        @NameInMap("createdAt")
        public String createdAt;

        // 创建者ID
        @NameInMap("creatorId")
        public Long creatorId;

        // 默认分支
        @NameInMap("defaultBranch")
        public String defaultBranch;

        // DEMO库标识
        @NameInMap("demoProjectStatus")
        public Boolean demoProjectStatus;

        // 描述
        @NameInMap("description")
        public String description;

        // HTTP克隆地址
        @NameInMap("httpUrlToRepository")
        public String httpUrlToRepository;

        // 代码库ID
        @NameInMap("id")
        public Long id;

        // 最后活跃时间
        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        // 名称
        @NameInMap("name")
        public String name;

        // 名称（含父名称）
        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        // 父空间
        @NameInMap("namespace")
        public GetRepositoryResponseBodyRepositoryNamespace namespace;

        // 路径
        @NameInMap("path")
        public String path;

        // 路径（含父路径）
        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        // SSH克隆地址
        @NameInMap("sshUrlToRepository")
        public String sshUrlToRepository;

        // 可见性。0：私有，10：内部公开
        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        // 页面访问地址
        @NameInMap("webUrl")
        public String webUrl;

        public static GetRepositoryResponseBodyRepository build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryResponseBodyRepository self = new GetRepositoryResponseBodyRepository();
            return TeaModel.build(map, self);
        }

        public GetRepositoryResponseBodyRepository setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public GetRepositoryResponseBodyRepository setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetRepositoryResponseBodyRepository setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryResponseBodyRepository setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetRepositoryResponseBodyRepository setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public GetRepositoryResponseBodyRepository setDemoProjectStatus(Boolean demoProjectStatus) {
            this.demoProjectStatus = demoProjectStatus;
            return this;
        }
        public Boolean getDemoProjectStatus() {
            return this.demoProjectStatus;
        }

        public GetRepositoryResponseBodyRepository setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRepositoryResponseBodyRepository setHttpUrlToRepository(String httpUrlToRepository) {
            this.httpUrlToRepository = httpUrlToRepository;
            return this;
        }
        public String getHttpUrlToRepository() {
            return this.httpUrlToRepository;
        }

        public GetRepositoryResponseBodyRepository setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRepositoryResponseBodyRepository setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public GetRepositoryResponseBodyRepository setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryResponseBodyRepository setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public GetRepositoryResponseBodyRepository setNamespace(GetRepositoryResponseBodyRepositoryNamespace namespace) {
            this.namespace = namespace;
            return this;
        }
        public GetRepositoryResponseBodyRepositoryNamespace getNamespace() {
            return this.namespace;
        }

        public GetRepositoryResponseBodyRepository setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetRepositoryResponseBodyRepository setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public GetRepositoryResponseBodyRepository setSshUrlToRepository(String sshUrlToRepository) {
            this.sshUrlToRepository = sshUrlToRepository;
            return this;
        }
        public String getSshUrlToRepository() {
            return this.sshUrlToRepository;
        }

        public GetRepositoryResponseBodyRepository setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public GetRepositoryResponseBodyRepository setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
