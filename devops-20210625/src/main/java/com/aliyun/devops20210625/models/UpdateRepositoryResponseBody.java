// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateRepositoryResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateRepositoryResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static UpdateRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryResponseBody self = new UpdateRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

    public UpdateRepositoryResponseBody setResult(UpdateRepositoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateRepositoryResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateRepositoryResponseBodyResultNamespace extends TeaModel {
        @NameInMap("avatar")
        public String avatar;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

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

        public UpdateRepositoryResponseBodyResultNamespace setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateRepositoryResponseBodyResultNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRepositoryResponseBodyResultNamespace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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

        public UpdateRepositoryResponseBodyResultNamespace setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRepositoryResponseBodyResultNamespace setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateRepositoryResponseBodyResultNamespace setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

    public static class UpdateRepositoryResponseBodyResult extends TeaModel {
        @NameInMap("archived")
        public Boolean archived;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("buildsEnabled")
        public Boolean buildsEnabled;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("creatorId")
        public Long creatorId;

        @NameInMap("defaultBranch")
        public String defaultBranch;

        @NameInMap("description")
        public String description;

        @NameInMap("httpUrlToRepo")
        public String httpUrlToRepo;

        @NameInMap("id")
        public Long id;

        @NameInMap("issuesEnabled")
        public Boolean issuesEnabled;

        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        @NameInMap("mergeRequestsEnabled")
        public Boolean mergeRequestsEnabled;

        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("namespace")
        public UpdateRepositoryResponseBodyResultNamespace namespace;

        @NameInMap("path")
        public String path;

        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("snippetsEnabled")
        public Boolean snippetsEnabled;

        @NameInMap("sshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        @NameInMap("webUrl")
        public String webUrl;

        @NameInMap("wikiEnabled")
        public Boolean wikiEnabled;

        public static UpdateRepositoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateRepositoryResponseBodyResult self = new UpdateRepositoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateRepositoryResponseBodyResult setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public UpdateRepositoryResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateRepositoryResponseBodyResult setBuildsEnabled(Boolean buildsEnabled) {
            this.buildsEnabled = buildsEnabled;
            return this;
        }
        public Boolean getBuildsEnabled() {
            return this.buildsEnabled;
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

        public UpdateRepositoryResponseBodyResult setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public UpdateRepositoryResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRepositoryResponseBodyResult setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public UpdateRepositoryResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateRepositoryResponseBodyResult setIssuesEnabled(Boolean issuesEnabled) {
            this.issuesEnabled = issuesEnabled;
            return this;
        }
        public Boolean getIssuesEnabled() {
            return this.issuesEnabled;
        }

        public UpdateRepositoryResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public UpdateRepositoryResponseBodyResult setMergeRequestsEnabled(Boolean mergeRequestsEnabled) {
            this.mergeRequestsEnabled = mergeRequestsEnabled;
            return this;
        }
        public Boolean getMergeRequestsEnabled() {
            return this.mergeRequestsEnabled;
        }

        public UpdateRepositoryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRepositoryResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public UpdateRepositoryResponseBodyResult setNamespace(UpdateRepositoryResponseBodyResultNamespace namespace) {
            this.namespace = namespace;
            return this;
        }
        public UpdateRepositoryResponseBodyResultNamespace getNamespace() {
            return this.namespace;
        }

        public UpdateRepositoryResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRepositoryResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public UpdateRepositoryResponseBodyResult setSnippetsEnabled(Boolean snippetsEnabled) {
            this.snippetsEnabled = snippetsEnabled;
            return this;
        }
        public Boolean getSnippetsEnabled() {
            return this.snippetsEnabled;
        }

        public UpdateRepositoryResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public UpdateRepositoryResponseBodyResult setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public UpdateRepositoryResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateRepositoryResponseBodyResult setWikiEnabled(Boolean wikiEnabled) {
            this.wikiEnabled = wikiEnabled;
            return this;
        }
        public Boolean getWikiEnabled() {
            return this.wikiEnabled;
        }

    }

}
