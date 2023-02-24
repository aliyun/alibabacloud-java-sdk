// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("repository")
    public GetRepositoryResponseBodyRepository repository;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("avatar")
        public String avatar;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        /**
         * <p>id</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("ownerId")
        public Long ownerId;

        @NameInMap("path")
        public String path;

        @NameInMap("updatedAt")
        public String updatedAt;

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
        @NameInMap("archive")
        public Boolean archive;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("creatorId")
        public Long creatorId;

        @NameInMap("defaultBranch")
        public String defaultBranch;

        @NameInMap("demoProjectStatus")
        public Boolean demoProjectStatus;

        @NameInMap("description")
        public String description;

        @NameInMap("httpUrlToRepository")
        public String httpUrlToRepository;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("namespace")
        public GetRepositoryResponseBodyRepositoryNamespace namespace;

        @NameInMap("path")
        public String path;

        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("sshUrlToRepository")
        public String sshUrlToRepository;

        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

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
