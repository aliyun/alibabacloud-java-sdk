// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchRepositoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
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
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListSearchRepositoryResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListSearchRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchRepositoryResponseBody self = new ListSearchRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchRepositoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSearchRepositoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSearchRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchRepositoryResponseBody setResult(java.util.List<ListSearchRepositoryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSearchRepositoryResponseBodyResult> getResult() {
        return this.result;
    }

    public ListSearchRepositoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSearchRepositoryResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListSearchRepositoryResponseBodyResultHighlightTextMap extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("creatorUserId")
        public String creatorUserId;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("readMe")
        public String readMe;

        /**
         * <strong>example:</strong>
         * <p>codeup/test-repo</p>
         */
        @NameInMap("repoNameWithNamespace")
        public String repoNameWithNamespace;

        /**
         * <strong>example:</strong>
         * <p>codeup/test-repo</p>
         */
        @NameInMap("repoPath")
        public String repoPath;

        public static ListSearchRepositoryResponseBodyResultHighlightTextMap build(java.util.Map<String, ?> map) throws Exception {
            ListSearchRepositoryResponseBodyResultHighlightTextMap self = new ListSearchRepositoryResponseBodyResultHighlightTextMap();
            return TeaModel.build(map, self);
        }

        public ListSearchRepositoryResponseBodyResultHighlightTextMap setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public ListSearchRepositoryResponseBodyResultHighlightTextMap setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSearchRepositoryResponseBodyResultHighlightTextMap setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListSearchRepositoryResponseBodyResultHighlightTextMap setReadMe(String readMe) {
            this.readMe = readMe;
            return this;
        }
        public String getReadMe() {
            return this.readMe;
        }

        public ListSearchRepositoryResponseBodyResultHighlightTextMap setRepoNameWithNamespace(String repoNameWithNamespace) {
            this.repoNameWithNamespace = repoNameWithNamespace;
            return this;
        }
        public String getRepoNameWithNamespace() {
            return this.repoNameWithNamespace;
        }

        public ListSearchRepositoryResponseBodyResultHighlightTextMap setRepoPath(String repoPath) {
            this.repoPath = repoPath;
            return this;
        }
        public String getRepoPath() {
            return this.repoPath;
        }

    }

    public static class ListSearchRepositoryResponseBodyResultSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-10-10 10:10:10</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2022-11-11 11:11:11</p>
         */
        @NameInMap("lastActivityTime")
        public String lastActivityTime;

        /**
         * <strong>example:</strong>
         * <p>62a94a8611fc0f0c9e2a7bc1</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("readMe")
        public String readMe;

        /**
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        @NameInMap("repoName")
        public String repoName;

        /**
         * <strong>example:</strong>
         * <p>codeup/test-repo</p>
         */
        @NameInMap("repoPath")
        public String repoPath;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("visibilityLevel")
        public Integer visibilityLevel;

        public static ListSearchRepositoryResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            ListSearchRepositoryResponseBodyResultSource self = new ListSearchRepositoryResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public ListSearchRepositoryResponseBodyResultSource setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSearchRepositoryResponseBodyResultSource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSearchRepositoryResponseBodyResultSource setLastActivityTime(String lastActivityTime) {
            this.lastActivityTime = lastActivityTime;
            return this;
        }
        public String getLastActivityTime() {
            return this.lastActivityTime;
        }

        public ListSearchRepositoryResponseBodyResultSource setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListSearchRepositoryResponseBodyResultSource setReadMe(String readMe) {
            this.readMe = readMe;
            return this;
        }
        public String getReadMe() {
            return this.readMe;
        }

        public ListSearchRepositoryResponseBodyResultSource setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListSearchRepositoryResponseBodyResultSource setRepoPath(String repoPath) {
            this.repoPath = repoPath;
            return this;
        }
        public String getRepoPath() {
            return this.repoPath;
        }

        public ListSearchRepositoryResponseBodyResultSource setVisibilityLevel(Integer visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

    }

    public static class ListSearchRepositoryResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60d54f3daccf2bbd6659f3ad/gitlabhq/master/config/environments/test.rb</p>
         */
        @NameInMap("docId")
        public String docId;

        @NameInMap("highlightTextMap")
        public ListSearchRepositoryResponseBodyResultHighlightTextMap highlightTextMap;

        @NameInMap("source")
        public ListSearchRepositoryResponseBodyResultSource source;

        public static ListSearchRepositoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSearchRepositoryResponseBodyResult self = new ListSearchRepositoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSearchRepositoryResponseBodyResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListSearchRepositoryResponseBodyResult setHighlightTextMap(ListSearchRepositoryResponseBodyResultHighlightTextMap highlightTextMap) {
            this.highlightTextMap = highlightTextMap;
            return this;
        }
        public ListSearchRepositoryResponseBodyResultHighlightTextMap getHighlightTextMap() {
            return this.highlightTextMap;
        }

        public ListSearchRepositoryResponseBodyResult setSource(ListSearchRepositoryResponseBodyResultSource source) {
            this.source = source;
            return this;
        }
        public ListSearchRepositoryResponseBodyResultSource getSource() {
            return this.source;
        }

    }

}
