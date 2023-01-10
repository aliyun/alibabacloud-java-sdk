// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchRepositoryResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListSearchRepositoryResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

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
        @NameInMap("creatorUserId")
        public String creatorUserId;

        @NameInMap("description")
        public String description;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("readMe")
        public String readMe;

        @NameInMap("repoNameWithNamespace")
        public String repoNameWithNamespace;

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
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("lastActivityTime")
        public String lastActivityTime;

        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("readMe")
        public String readMe;

        @NameInMap("repoName")
        public String repoName;

        @NameInMap("repoPath")
        public String repoPath;

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
