// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateRepositoryResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryResponseBody self = new CreateRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateRepositoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepositoryResponseBody setResult(CreateRepositoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRepositoryResponseBodyResult getResult() {
        return this.result;
    }

    public CreateRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRepositoryResponseBodyResultNamespace extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("Path")
        public String path;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        public static CreateRepositoryResponseBodyResultNamespace build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryResponseBodyResultNamespace self = new CreateRepositoryResponseBodyResultNamespace();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryResponseBodyResultNamespace setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public CreateRepositoryResponseBodyResultNamespace setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateRepositoryResponseBodyResultNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRepositoryResponseBodyResultNamespace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateRepositoryResponseBodyResultNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRepositoryResponseBodyResultNamespace setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public CreateRepositoryResponseBodyResultNamespace setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRepositoryResponseBodyResultNamespace set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public CreateRepositoryResponseBodyResultNamespace setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateRepositoryResponseBodyResultNamespace setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateRepositoryResponseBodyResultNamespace setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

    public static class CreateRepositoryResponseBodyResult extends TeaModel {
        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("BuildsEnableStatus")
        public Boolean buildsEnableStatus;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DefaultBranch")
        public String defaultBranch;

        @NameInMap("DemoProjectStatus")
        public Boolean demoProjectStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("HttpUrlToRepo")
        public String httpUrlToRepo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IssuesEnableStatus")
        public Boolean issuesEnableStatus;

        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("MergeRequestEnableStatus")
        public Boolean mergeRequestEnableStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("Namespace")
        public CreateRepositoryResponseBodyResultNamespace namespace;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("SnippetsEnableStatus")
        public Boolean snippetsEnableStatus;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("WikiEnableStatus")
        public Boolean wikiEnableStatus;

        public static CreateRepositoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryResponseBodyResult self = new CreateRepositoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryResponseBodyResult setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public CreateRepositoryResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateRepositoryResponseBodyResult setBuildsEnableStatus(Boolean buildsEnableStatus) {
            this.buildsEnableStatus = buildsEnableStatus;
            return this;
        }
        public Boolean getBuildsEnableStatus() {
            return this.buildsEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateRepositoryResponseBodyResult setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public CreateRepositoryResponseBodyResult setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public CreateRepositoryResponseBodyResult setDemoProjectStatus(Boolean demoProjectStatus) {
            this.demoProjectStatus = demoProjectStatus;
            return this;
        }
        public Boolean getDemoProjectStatus() {
            return this.demoProjectStatus;
        }

        public CreateRepositoryResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRepositoryResponseBodyResult setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public CreateRepositoryResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateRepositoryResponseBodyResult setIssuesEnableStatus(Boolean issuesEnableStatus) {
            this.issuesEnableStatus = issuesEnableStatus;
            return this;
        }
        public Boolean getIssuesEnableStatus() {
            return this.issuesEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public CreateRepositoryResponseBodyResult setMergeRequestEnableStatus(Boolean mergeRequestEnableStatus) {
            this.mergeRequestEnableStatus = mergeRequestEnableStatus;
            return this;
        }
        public Boolean getMergeRequestEnableStatus() {
            return this.mergeRequestEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRepositoryResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public CreateRepositoryResponseBodyResult setNamespace(CreateRepositoryResponseBodyResultNamespace namespace) {
            this.namespace = namespace;
            return this;
        }
        public CreateRepositoryResponseBodyResultNamespace getNamespace() {
            return this.namespace;
        }

        public CreateRepositoryResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRepositoryResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public CreateRepositoryResponseBodyResult set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public CreateRepositoryResponseBodyResult setSnippetsEnableStatus(Boolean snippetsEnableStatus) {
            this.snippetsEnableStatus = snippetsEnableStatus;
            return this;
        }
        public Boolean getSnippetsEnableStatus() {
            return this.snippetsEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public CreateRepositoryResponseBodyResult setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public CreateRepositoryResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public CreateRepositoryResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateRepositoryResponseBodyResult setWikiEnableStatus(Boolean wikiEnableStatus) {
            this.wikiEnableStatus = wikiEnableStatus;
            return this;
        }
        public Boolean getWikiEnableStatus() {
            return this.wikiEnableStatus;
        }

    }

}
