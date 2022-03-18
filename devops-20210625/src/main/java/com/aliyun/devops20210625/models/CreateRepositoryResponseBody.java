// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateRepositoryResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateRepositoryResponseBodyResult result;

    // 调用是否成功
    @NameInMap("success")
    public Boolean success;

    public static CreateRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryResponseBody self = new CreateRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
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

        // 归属者id
        @NameInMap("ownerId")
        public Long ownerId;

        // 路径
        @NameInMap("path")
        public String path;

        // 公开性
        @NameInMap("public")
        public Boolean _public;

        // 更新时间
        @NameInMap("updatedAt")
        public String updatedAt;

        // 可见性。0：私有，10：内部公开
        @NameInMap("visibilityLevel")
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
        // 从SVN导入
        @NameInMap("Import_from_svn")
        public Boolean importFromSvn;

        // 归档标识
        @NameInMap("archived")
        public Boolean archived;

        // 代码库头像地址
        @NameInMap("avatar_url")
        public String avatarUrl;

        // 创建时间
        @NameInMap("createdAt")
        public String createdAt;

        // 创建者id
        @NameInMap("creatorId")
        public Long creatorId;

        // 默认分支
        @NameInMap("defaultBranch")
        public String defaultBranch;

        // demo库标识
        @NameInMap("demoProject")
        public Boolean demoProject;

        // 描述
        @NameInMap("description")
        public String description;

        // http地址
        @NameInMap("httpUrlToRepo")
        public String httpUrlToRepo;

        // id
        @NameInMap("id")
        public Long id;

        // 最后活跃时间
        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        // 名称
        @NameInMap("name")
        public String name;

        // 名称（含父路径）
        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        // 父路径信息
        @NameInMap("namespace")
        public CreateRepositoryResponseBodyResultNamespace namespace;

        // 路径
        @NameInMap("path")
        public String path;

        // 路径（含父路径）
        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        // ssh地址
        @NameInMap("sshUrlToRepo")
        public String sshUrlToRepo;

        // 可见性。0：私有，10：内部公开
        @NameInMap("visibilityLevel")
        public String visibilityLevel;

        // web url
        @NameInMap("webUrl")
        public String webUrl;

        public static CreateRepositoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryResponseBodyResult self = new CreateRepositoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryResponseBodyResult setImportFromSvn(Boolean importFromSvn) {
            this.importFromSvn = importFromSvn;
            return this;
        }
        public Boolean getImportFromSvn() {
            return this.importFromSvn;
        }

        public CreateRepositoryResponseBodyResult setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public CreateRepositoryResponseBodyResult setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
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

        public CreateRepositoryResponseBodyResult setDemoProject(Boolean demoProject) {
            this.demoProject = demoProject;
            return this;
        }
        public Boolean getDemoProject() {
            return this.demoProject;
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

        public CreateRepositoryResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
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

        public CreateRepositoryResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
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

    }

}
