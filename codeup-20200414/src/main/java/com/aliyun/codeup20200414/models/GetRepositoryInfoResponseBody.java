// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetRepositoryInfoResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Result")
    public GetRepositoryInfoResponseBodyResult result;

    public static GetRepositoryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryInfoResponseBody self = new GetRepositoryInfoResponseBody();
        return TeaModel.build(map, self);
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

    public GetRepositoryInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRepositoryInfoResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetRepositoryInfoResponseBody setResult(GetRepositoryInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRepositoryInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRepositoryInfoResponseBodyResultNamespace extends TeaModel {
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

        public GetRepositoryInfoResponseBodyResultNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetRepositoryInfoResponseBodyResultNamespace set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetRepositoryInfoResponseBodyResultNamespace setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
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

        public GetRepositoryInfoResponseBodyResultNamespace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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

    public static class GetRepositoryInfoResponseBodyResultPermissions extends TeaModel {
        @NameInMap("ProjectAccess")
        public GetRepositoryInfoResponseBodyResultPermissionsProjectAccess projectAccess;

        @NameInMap("GroupAccess")
        public GetRepositoryInfoResponseBodyResultPermissionsGroupAccess groupAccess;

        public static GetRepositoryInfoResponseBodyResultPermissions build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryInfoResponseBodyResultPermissions self = new GetRepositoryInfoResponseBodyResultPermissions();
            return TeaModel.build(map, self);
        }

        public GetRepositoryInfoResponseBodyResultPermissions setProjectAccess(GetRepositoryInfoResponseBodyResultPermissionsProjectAccess projectAccess) {
            this.projectAccess = projectAccess;
            return this;
        }
        public GetRepositoryInfoResponseBodyResultPermissionsProjectAccess getProjectAccess() {
            return this.projectAccess;
        }

        public GetRepositoryInfoResponseBodyResultPermissions setGroupAccess(GetRepositoryInfoResponseBodyResultPermissionsGroupAccess groupAccess) {
            this.groupAccess = groupAccess;
            return this;
        }
        public GetRepositoryInfoResponseBodyResultPermissionsGroupAccess getGroupAccess() {
            return this.groupAccess;
        }

    }

    public static class GetRepositoryInfoResponseBodyResult extends TeaModel {
        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("DefaultBranch")
        public String defaultBranch;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("ImportUrl")
        public String importUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DemoProjectStatus")
        public Boolean demoProjectStatus;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("ImportStatus")
        public String importStatus;

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

        @NameInMap("Path")
        public String path;

        @NameInMap("VisibilityLevel")
        public String visibilityLevel;

        @NameInMap("AccessLevel")
        public Integer accessLevel;

        @NameInMap("ImportFromSubversion")
        public Boolean importFromSubversion;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        @NameInMap("Namespace")
        public GetRepositoryInfoResponseBodyResultNamespace namespace;

        @NameInMap("Permissions")
        public GetRepositoryInfoResponseBodyResultPermissions permissions;

        public static GetRepositoryInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRepositoryInfoResponseBodyResult self = new GetRepositoryInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRepositoryInfoResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public GetRepositoryInfoResponseBodyResult setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public GetRepositoryInfoResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetRepositoryInfoResponseBodyResult setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public GetRepositoryInfoResponseBodyResult setImportUrl(String importUrl) {
            this.importUrl = importUrl;
            return this;
        }
        public String getImportUrl() {
            return this.importUrl;
        }

        public GetRepositoryInfoResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRepositoryInfoResponseBodyResult setDemoProjectStatus(Boolean demoProjectStatus) {
            this.demoProjectStatus = demoProjectStatus;
            return this;
        }
        public Boolean getDemoProjectStatus() {
            return this.demoProjectStatus;
        }

        public GetRepositoryInfoResponseBodyResult setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetRepositoryInfoResponseBodyResult setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public GetRepositoryInfoResponseBodyResult setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public GetRepositoryInfoResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public GetRepositoryInfoResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRepositoryInfoResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public GetRepositoryInfoResponseBodyResult set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public GetRepositoryInfoResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public GetRepositoryInfoResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetRepositoryInfoResponseBodyResult setVisibilityLevel(String visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public GetRepositoryInfoResponseBodyResult setAccessLevel(Integer accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        public GetRepositoryInfoResponseBodyResult setImportFromSubversion(Boolean importFromSubversion) {
            this.importFromSubversion = importFromSubversion;
            return this;
        }
        public Boolean getImportFromSubversion() {
            return this.importFromSubversion;
        }

        public GetRepositoryInfoResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public GetRepositoryInfoResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepositoryInfoResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRepositoryInfoResponseBodyResult setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public GetRepositoryInfoResponseBodyResult setNamespace(GetRepositoryInfoResponseBodyResultNamespace namespace) {
            this.namespace = namespace;
            return this;
        }
        public GetRepositoryInfoResponseBodyResultNamespace getNamespace() {
            return this.namespace;
        }

        public GetRepositoryInfoResponseBodyResult setPermissions(GetRepositoryInfoResponseBodyResultPermissions permissions) {
            this.permissions = permissions;
            return this;
        }
        public GetRepositoryInfoResponseBodyResultPermissions getPermissions() {
            return this.permissions;
        }

    }

}
