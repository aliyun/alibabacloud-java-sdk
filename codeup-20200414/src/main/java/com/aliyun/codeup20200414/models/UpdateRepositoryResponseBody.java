// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateRepositoryResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public UpdateRepositoryResponseBodyResult result;

    public static UpdateRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryResponseBody self = new UpdateRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateRepositoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateRepositoryResponseBody setResult(UpdateRepositoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateRepositoryResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateRepositoryResponseBodyResultNamespace extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Description")
        public String description;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("Path")
        public String path;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("Id")
        public Long id;

        public static UpdateRepositoryResponseBodyResultNamespace build(java.util.Map<String, ?> map) throws Exception {
            UpdateRepositoryResponseBodyResultNamespace self = new UpdateRepositoryResponseBodyResultNamespace();
            return TeaModel.build(map, self);
        }

        public UpdateRepositoryResponseBodyResultNamespace setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public UpdateRepositoryResponseBodyResultNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRepositoryResponseBodyResultNamespace set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public UpdateRepositoryResponseBodyResultNamespace setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public UpdateRepositoryResponseBodyResultNamespace setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRepositoryResponseBodyResultNamespace setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateRepositoryResponseBodyResultNamespace setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateRepositoryResponseBodyResultNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRepositoryResponseBodyResultNamespace setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public UpdateRepositoryResponseBodyResultNamespace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class UpdateRepositoryResponseBodyResult extends TeaModel {
        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("DefaultBranch")
        public String defaultBranch;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("HttpUrlToRepo")
        public String httpUrlToRepo;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("Path")
        public String path;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Namespace")
        public UpdateRepositoryResponseBodyResultNamespace namespace;

        public static UpdateRepositoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateRepositoryResponseBodyResult self = new UpdateRepositoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateRepositoryResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public UpdateRepositoryResponseBodyResult setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public UpdateRepositoryResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateRepositoryResponseBodyResult setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public UpdateRepositoryResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateRepositoryResponseBodyResult setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public UpdateRepositoryResponseBodyResult setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public UpdateRepositoryResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateRepositoryResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRepositoryResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public UpdateRepositoryResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public UpdateRepositoryResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public UpdateRepositoryResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRepositoryResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public UpdateRepositoryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRepositoryResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateRepositoryResponseBodyResult setNamespace(UpdateRepositoryResponseBodyResultNamespace namespace) {
            this.namespace = namespace;
            return this;
        }
        public UpdateRepositoryResponseBodyResultNamespace getNamespace() {
            return this.namespace;
        }

    }

}
