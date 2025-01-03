// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateRepositoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>EAE03103-5497-58D1-9169-E524DDE8604C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateRepositoryResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>2022-02-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>29322</p>
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
         * <p>19238</p>
         */
        @NameInMap("ownerId")
        public Long ownerId;

        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("archived")
        public Boolean archived;

        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("buildsEnabled")
        public Boolean buildsEnabled;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>19238</p>
         */
        @NameInMap("creatorId")
        public Long creatorId;

        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("defaultBranch")
        public String defaultBranch;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p><a href="https://codeup.aliyun.com/xxx/test/test.git">https://codeup.aliyun.com/xxx/test/test.git</a></p>
         */
        @NameInMap("httpUrlToRepo")
        public String httpUrlToRepo;

        /**
         * <strong>example:</strong>
         * <p>2825387</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("issuesEnabled")
        public Boolean issuesEnabled;

        /**
         * <strong>example:</strong>
         * <p>2022-03-20 14:24:54</p>
         */
        @NameInMap("lastActivityAt")
        public String lastActivityAt;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("mergeRequestsEnabled")
        public Boolean mergeRequestsEnabled;

        /**
         * <strong>example:</strong>
         * <p>codeup</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("namespace")
        public UpdateRepositoryResponseBodyResultNamespace namespace;

        /**
         * <strong>example:</strong>
         * <p>codeup</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>codeup-test-org / codeup</p>
         */
        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("snippetsEnabled")
        public Boolean snippetsEnabled;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:git@codeup.aliyun.com">git@codeup.aliyun.com</a>:xxx/test/test.git</p>
         */
        @NameInMap("sshUrlToRepo")
        public String sshUrlToRepo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        /**
         * <strong>example:</strong>
         * <p><a href="https://codeup.aliyun.com/xxx/test/test">https://codeup.aliyun.com/xxx/test/test</a></p>
         */
        @NameInMap("webUrl")
        public String webUrl;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
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
