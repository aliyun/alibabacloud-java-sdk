// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetRepositoryInfoResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetRepositoryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryInfoResponseBody self = new GetRepositoryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepositoryInfoResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetRepositoryInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRepositoryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepositoryInfoResponseBody setResult(GetRepositoryInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRepositoryInfoResponseBodyResult getResult() {
        return this.result;
    }

    public GetRepositoryInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRepositoryInfoResponseBodyResultNamespace extends TeaModel {
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

        public static GetRepositoryInfoResponseBodyResultNamespace build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryInfoResponseBodyResultNamespace self = new GetRepositoryInfoResponseBodyResultNamespace();
            return TeaModel.build(map, self);
        }

        public GetRepositoryInfoResponseBodyResultNamespace setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetRepositoryInfoResponseBodyResultNamespace set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

    public static class GetRepositoryInfoResponseBodyResultPermissionsGroupAccess extends TeaModel {
        @NameInMap("AccessLevel")
        public Integer accessLevel;

        public static GetRepositoryInfoResponseBodyResultPermissionsGroupAccess build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryInfoResponseBodyResultPermissionsGroupAccess self = new GetRepositoryInfoResponseBodyResultPermissionsGroupAccess();
            return TeaModel.build(map, self);
        }

        public GetRepositoryInfoResponseBodyResultPermissionsGroupAccess setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

    }

    public static class GetRepositoryInfoResponseBodyResultPermissionsProjectAccess extends TeaModel {
        @NameInMap("AccessLevel")
        public Integer accessLevel;

        public static GetRepositoryInfoResponseBodyResultPermissionsProjectAccess build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryInfoResponseBodyResultPermissionsProjectAccess self = new GetRepositoryInfoResponseBodyResultPermissionsProjectAccess();
            return TeaModel.build(map, self);
        }

        public GetRepositoryInfoResponseBodyResultPermissionsProjectAccess setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

    }

    public static class GetRepositoryInfoResponseBodyResultPermissions extends TeaModel {
        @NameInMap("GroupAccess")
        public GetRepositoryInfoResponseBodyResultPermissionsGroupAccess groupAccess;

        @NameInMap("ProjectAccess")
        public GetRepositoryInfoResponseBodyResultPermissionsProjectAccess projectAccess;

        public static GetRepositoryInfoResponseBodyResultPermissions build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryInfoResponseBodyResultPermissions self = new GetRepositoryInfoResponseBodyResultPermissions();
            return TeaModel.build(map, self);
        }

        public GetRepositoryInfoResponseBodyResultPermissions setGroupAccess(GetRepositoryInfoResponseBodyResultPermissionsGroupAccess groupAccess) {
            this.groupAccess = groupAccess;
            return this;
        }
        public GetRepositoryInfoResponseBodyResultPermissionsGroupAccess getGroupAccess() {
            return this.groupAccess;
        }

        public GetRepositoryInfoResponseBodyResultPermissions setProjectAccess(GetRepositoryInfoResponseBodyResultPermissionsProjectAccess projectAccess) {
            this.projectAccess = projectAccess;
            return this;
        }
        public GetRepositoryInfoResponseBodyResultPermissionsProjectAccess getProjectAccess() {
            return this.projectAccess;
        }

    }

    public static class GetRepositoryInfoResponseBodyResult extends TeaModel {
        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

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

        @NameInMap("ImportFromSubversion")
        public Boolean importFromSubversion;

        @NameInMap("ImportStatus")
        public String importStatus;

        @NameInMap("ImportUrl")
        public String importUrl;

        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("Namespace")
        public GetRepositoryInfoResponseBodyResultNamespace namespace;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("Permissions")
        public GetRepositoryInfoResponseBodyResultPermissions permissions;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        public static GetRepositoryInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryInfoResponseBodyResult self = new GetRepositoryInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRepositoryInfoResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public GetRepositoryInfoResponseBodyResult setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public GetRepositoryInfoResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetRepositoryInfoResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryInfoResponseBodyResult setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetRepositoryInfoResponseBodyResult setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public GetRepositoryInfoResponseBodyResult setDemoProjectStatus(Boolean demoProjectStatus) {
            this.demoProjectStatus = demoProjectStatus;
            return this;
        }
        public Boolean getDemoProjectStatus() {
            return this.demoProjectStatus;
        }

        public GetRepositoryInfoResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRepositoryInfoResponseBodyResult setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public GetRepositoryInfoResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRepositoryInfoResponseBodyResult setImportFromSubversion(Boolean importFromSubversion) {
            this.importFromSubversion = importFromSubversion;
            return this;
        }
        public Boolean getImportFromSubversion() {
            return this.importFromSubversion;
        }

        public GetRepositoryInfoResponseBodyResult setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public GetRepositoryInfoResponseBodyResult setImportUrl(String importUrl) {
            this.importUrl = importUrl;
            return this;
        }
        public String getImportUrl() {
            return this.importUrl;
        }

        public GetRepositoryInfoResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public GetRepositoryInfoResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryInfoResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public GetRepositoryInfoResponseBodyResult setNamespace(GetRepositoryInfoResponseBodyResultNamespace namespace) {
            this.namespace = namespace;
            return this;
        }
        public GetRepositoryInfoResponseBodyResultNamespace getNamespace() {
            return this.namespace;
        }

        public GetRepositoryInfoResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetRepositoryInfoResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public GetRepositoryInfoResponseBodyResult setPermissions(GetRepositoryInfoResponseBodyResultPermissions permissions) {
            this.permissions = permissions;
            return this;
        }
        public GetRepositoryInfoResponseBodyResultPermissions getPermissions() {
            return this.permissions;
        }

        public GetRepositoryInfoResponseBodyResult set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public GetRepositoryInfoResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public GetRepositoryInfoResponseBodyResult setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public GetRepositoryInfoResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public GetRepositoryInfoResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
