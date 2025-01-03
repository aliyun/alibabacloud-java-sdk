// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListGroupRepositoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>9293CBDA-B5BC-5AD6-A8F4-C7873AC7A3DF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListGroupRepositoriesResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListGroupRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupRepositoriesResponseBody self = new ListGroupRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupRepositoriesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGroupRepositoriesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListGroupRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupRepositoriesResponseBody setResult(java.util.List<ListGroupRepositoriesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListGroupRepositoriesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListGroupRepositoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGroupRepositoriesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListGroupRepositoriesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("archived")
        public Boolean archived;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("commitCount")
        public Long commitCount;

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

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx/test/test">https://xxx/test/test</a></p>
         */
        @NameInMap("httpUrl")
        public String httpUrl;

        /**
         * <strong>example:</strong>
         * <p>89616</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx/x">http://xxx/x</a></p>
         */
        @NameInMap("importUrl")
        public String importUrl;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isStared")
        public Boolean isStared;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("issuesEnabled")
        public Boolean issuesEnabled;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
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
         * <p>test-group-repo</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("nameWithNamespace")
        public String nameWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>100003</p>
         */
        @NameInMap("namespaceId")
        public Boolean namespaceId;

        /**
         * <strong>example:</strong>
         * <p>test-group-repo</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>codeup-test-org/test-group-repo</p>
         */
        @NameInMap("pathWithNamespace")
        public String pathWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("privateFlag")
        public Boolean privateFlag;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("snippetsEnabled")
        public Boolean snippetsEnabled;

        /**
         * <strong>example:</strong>
         * <p>git@xxx:xxx/test/test.git</p>
         */
        @NameInMap("sshUrl")
        public String sshUrl;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("starCount")
        public Integer starCount;

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

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("webUrl")
        public String webUrl;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("wikiEnabled")
        public Boolean wikiEnabled;

        public static ListGroupRepositoriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListGroupRepositoriesResponseBodyResult self = new ListGroupRepositoriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListGroupRepositoriesResponseBodyResult setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public ListGroupRepositoriesResponseBodyResult setCommitCount(Long commitCount) {
            this.commitCount = commitCount;
            return this;
        }
        public Long getCommitCount() {
            return this.commitCount;
        }

        public ListGroupRepositoriesResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListGroupRepositoriesResponseBodyResult setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListGroupRepositoriesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGroupRepositoriesResponseBodyResult setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public ListGroupRepositoriesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGroupRepositoriesResponseBodyResult setImportUrl(String importUrl) {
            this.importUrl = importUrl;
            return this;
        }
        public String getImportUrl() {
            return this.importUrl;
        }

        public ListGroupRepositoriesResponseBodyResult setIsStared(Boolean isStared) {
            this.isStared = isStared;
            return this;
        }
        public Boolean getIsStared() {
            return this.isStared;
        }

        public ListGroupRepositoriesResponseBodyResult setIssuesEnabled(Boolean issuesEnabled) {
            this.issuesEnabled = issuesEnabled;
            return this;
        }
        public Boolean getIssuesEnabled() {
            return this.issuesEnabled;
        }

        public ListGroupRepositoriesResponseBodyResult setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public ListGroupRepositoriesResponseBodyResult setMergeRequestsEnabled(Boolean mergeRequestsEnabled) {
            this.mergeRequestsEnabled = mergeRequestsEnabled;
            return this;
        }
        public Boolean getMergeRequestsEnabled() {
            return this.mergeRequestsEnabled;
        }

        public ListGroupRepositoriesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupRepositoriesResponseBodyResult setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ListGroupRepositoriesResponseBodyResult setNamespaceId(Boolean namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Boolean getNamespaceId() {
            return this.namespaceId;
        }

        public ListGroupRepositoriesResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGroupRepositoriesResponseBodyResult setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ListGroupRepositoriesResponseBodyResult setPrivateFlag(Boolean privateFlag) {
            this.privateFlag = privateFlag;
            return this;
        }
        public Boolean getPrivateFlag() {
            return this.privateFlag;
        }

        public ListGroupRepositoriesResponseBodyResult setSnippetsEnabled(Boolean snippetsEnabled) {
            this.snippetsEnabled = snippetsEnabled;
            return this;
        }
        public Boolean getSnippetsEnabled() {
            return this.snippetsEnabled;
        }

        public ListGroupRepositoriesResponseBodyResult setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public ListGroupRepositoriesResponseBodyResult setStarCount(Integer starCount) {
            this.starCount = starCount;
            return this;
        }
        public Integer getStarCount() {
            return this.starCount;
        }

        public ListGroupRepositoriesResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListGroupRepositoriesResponseBodyResult setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ListGroupRepositoriesResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ListGroupRepositoriesResponseBodyResult setWikiEnabled(Boolean wikiEnabled) {
            this.wikiEnabled = wikiEnabled;
            return this;
        }
        public Boolean getWikiEnabled() {
            return this.wikiEnabled;
        }

    }

}
