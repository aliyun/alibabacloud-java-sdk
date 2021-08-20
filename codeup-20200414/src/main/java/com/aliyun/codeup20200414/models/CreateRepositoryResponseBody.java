// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Result")
    public CreateRepositoryResponseBodyResult result;

    public static CreateRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryResponseBody self = new CreateRepositoryResponseBody();
        return TeaModel.build(map, self);
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

    public CreateRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateRepositoryResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateRepositoryResponseBody setResult(CreateRepositoryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRepositoryResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateRepositoryResponseBodyResultNamespace extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Description")
        public String description;

        @NameInMap("State")
        public String state;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("Id")
        public Long id;

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

        public CreateRepositoryResponseBodyResultNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRepositoryResponseBodyResultNamespace setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateRepositoryResponseBodyResultNamespace set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public CreateRepositoryResponseBodyResultNamespace setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public CreateRepositoryResponseBodyResultNamespace setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateRepositoryResponseBodyResultNamespace setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRepositoryResponseBodyResultNamespace setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
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

        public CreateRepositoryResponseBodyResultNamespace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateRepositoryResponseBodyResult extends TeaModel {
        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("DefaultBranch")
        public String defaultBranch;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("SnippetsEnableStatus")
        public Boolean snippetsEnableStatus;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("IssuesEnableStatus")
        public Boolean issuesEnableStatus;

        @NameInMap("DemoProjectStatus")
        public Boolean demoProjectStatus;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("BuildsEnableStatus")
        public Boolean buildsEnableStatus;

        @NameInMap("HttpUrlToRepo")
        public String httpUrlToRepo;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("MergeRequestEnableStatus")
        public Boolean mergeRequestEnableStatus;

        @NameInMap("Path")
        public String path;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("WikiEnableStatus")
        public Boolean wikiEnableStatus;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        @NameInMap("Namespace")
        public CreateRepositoryResponseBodyResultNamespace namespace;

        public static CreateRepositoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryResponseBodyResult self = new CreateRepositoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public CreateRepositoryResponseBodyResult setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public CreateRepositoryResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateRepositoryResponseBodyResult setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public CreateRepositoryResponseBodyResult setSnippetsEnableStatus(Boolean snippetsEnableStatus) {
            this.snippetsEnableStatus = snippetsEnableStatus;
            return this;
        }
        public Boolean getSnippetsEnableStatus() {
            return this.snippetsEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateRepositoryResponseBodyResult setIssuesEnableStatus(Boolean issuesEnableStatus) {
            this.issuesEnableStatus = issuesEnableStatus;
            return this;
        }
        public Boolean getIssuesEnableStatus() {
            return this.issuesEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setDemoProjectStatus(Boolean demoProjectStatus) {
            this.demoProjectStatus = demoProjectStatus;
            return this;
        }
        public Boolean getDemoProjectStatus() {
            return this.demoProjectStatus;
        }

        public CreateRepositoryResponseBodyResult setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public CreateRepositoryResponseBodyResult setBuildsEnableStatus(Boolean buildsEnableStatus) {
            this.buildsEnableStatus = buildsEnableStatus;
            return this;
        }
        public Boolean getBuildsEnableStatus() {
            return this.buildsEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public CreateRepositoryResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateRepositoryResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRepositoryResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public CreateRepositoryResponseBodyResult set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public CreateRepositoryResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public CreateRepositoryResponseBodyResult setMergeRequestEnableStatus(Boolean mergeRequestEnableStatus) {
            this.mergeRequestEnableStatus = mergeRequestEnableStatus;
            return this;
        }
        public Boolean getMergeRequestEnableStatus() {
            return this.mergeRequestEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateRepositoryResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public CreateRepositoryResponseBodyResult setWikiEnableStatus(Boolean wikiEnableStatus) {
            this.wikiEnableStatus = wikiEnableStatus;
            return this;
        }
        public Boolean getWikiEnableStatus() {
            return this.wikiEnableStatus;
        }

        public CreateRepositoryResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public CreateRepositoryResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRepositoryResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateRepositoryResponseBodyResult setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public CreateRepositoryResponseBodyResult setNamespace(CreateRepositoryResponseBodyResultNamespace namespace) {
            this.namespace = namespace;
            return this;
        }
        public CreateRepositoryResponseBodyResultNamespace getNamespace() {
            return this.namespace;
        }

    }

}
