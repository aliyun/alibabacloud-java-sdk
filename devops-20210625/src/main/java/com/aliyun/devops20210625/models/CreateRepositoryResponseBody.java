// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateRepositoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>401</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNAUTHORIZED_ERROR</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>F590C9D8-E908-5B6C-95AC-56B7E8011FFA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateRepositoryResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>codeup repo description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>3194</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>codeup</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ownerId")
        public Long ownerId;

        /**
         * <strong>example:</strong>
         * <p>codeup</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("public")
        public Boolean _public;

        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Import_from_svn")
        public Boolean importFromSvn;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("archived")
        public Boolean archived;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("avatar_url")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>1233</p>
         */
        @NameInMap("creatorId")
        public Long creatorId;

        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("defaultBranch")
        public String defaultBranch;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("demoProject")
        public Boolean demoProject;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("httpUrlToRepo")
        public String httpUrlToRepo;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>2959</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        /**
         * <strong>example:</strong>
         * <p>codeupTest</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>codeup-test-org / test-codeup</p>
         */
        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("namespace")
        public CreateRepositoryResponseBodyResultNamespace namespace;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>codeup-test-org/test-codeup</p>
         */
        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("sshUrlToRepo")
        public String sshUrlToRepo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("visibilityLevel")
        public String visibilityLevel;

        /**
         * <p>web url</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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
