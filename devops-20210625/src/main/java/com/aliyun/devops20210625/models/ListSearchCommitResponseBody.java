// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchCommitResponseBody extends TeaModel {
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
     * <p>F7B85D1B-D1C2-140F-A039-341859F130B9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListSearchCommitResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListSearchCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchCommitResponseBody self = new ListSearchCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchCommitResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSearchCommitResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSearchCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchCommitResponseBody setResult(java.util.List<ListSearchCommitResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSearchCommitResponseBodyResult> getResult() {
        return this.result;
    }

    public ListSearchCommitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSearchCommitResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListSearchCommitResponseBodyResultHighlightTextMap extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>df1b701cb0f3f7ca92320d49d31995821f2d045c</p>
         */
        @NameInMap("commitId")
        public String commitId;

        @NameInMap("commitMessage")
        public String commitMessage;

        /**
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        @NameInMap("title")
        public String title;

        public static ListSearchCommitResponseBodyResultHighlightTextMap build(java.util.Map<String, ?> map) throws Exception {
            ListSearchCommitResponseBodyResultHighlightTextMap self = new ListSearchCommitResponseBodyResultHighlightTextMap();
            return TeaModel.build(map, self);
        }

        public ListSearchCommitResponseBodyResultHighlightTextMap setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListSearchCommitResponseBodyResultHighlightTextMap setCommitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            return this;
        }
        public String getCommitMessage() {
            return this.commitMessage;
        }

        public ListSearchCommitResponseBodyResultHighlightTextMap setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListSearchCommitResponseBodyResultHighlightTextMap setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListSearchCommitResponseBodyResultSourceAuthor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        @NameInMap("name")
        public String name;

        public static ListSearchCommitResponseBodyResultSourceAuthor build(java.util.Map<String, ?> map) throws Exception {
            ListSearchCommitResponseBodyResultSourceAuthor self = new ListSearchCommitResponseBodyResultSourceAuthor();
            return TeaModel.build(map, self);
        }

        public ListSearchCommitResponseBodyResultSourceAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListSearchCommitResponseBodyResultSourceAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListSearchCommitResponseBodyResultSource extends TeaModel {
        @NameInMap("author")
        public ListSearchCommitResponseBodyResultSourceAuthor author;

        /**
         * <strong>example:</strong>
         * <p>2022-11-11 11:11:11</p>
         */
        @NameInMap("authorTime")
        public String authorTime;

        /**
         * <strong>example:</strong>
         * <p>a748f5ecb17a93900d4808944bfcc96dc158ee2d</p>
         */
        @NameInMap("commitId")
        public String commitId;

        @NameInMap("commitMessage")
        public String commitMessage;

        /**
         * <strong>example:</strong>
         * <p>61133b011bd96aa110f1b500</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>codeup/test-repo</p>
         */
        @NameInMap("repoPath")
        public String repoPath;

        @NameInMap("title")
        public String title;

        public static ListSearchCommitResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            ListSearchCommitResponseBodyResultSource self = new ListSearchCommitResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public ListSearchCommitResponseBodyResultSource setAuthor(ListSearchCommitResponseBodyResultSourceAuthor author) {
            this.author = author;
            return this;
        }
        public ListSearchCommitResponseBodyResultSourceAuthor getAuthor() {
            return this.author;
        }

        public ListSearchCommitResponseBodyResultSource setAuthorTime(String authorTime) {
            this.authorTime = authorTime;
            return this;
        }
        public String getAuthorTime() {
            return this.authorTime;
        }

        public ListSearchCommitResponseBodyResultSource setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListSearchCommitResponseBodyResultSource setCommitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            return this;
        }
        public String getCommitMessage() {
            return this.commitMessage;
        }

        public ListSearchCommitResponseBodyResultSource setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListSearchCommitResponseBodyResultSource setRepoPath(String repoPath) {
            this.repoPath = repoPath;
            return this;
        }
        public String getRepoPath() {
            return this.repoPath;
        }

        public ListSearchCommitResponseBodyResultSource setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListSearchCommitResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60d54f3daccf2bbd6659f3ad/gitlabhq/master/config/environments/test.rb</p>
         */
        @NameInMap("docId")
        public String docId;

        @NameInMap("highlightTextMap")
        public ListSearchCommitResponseBodyResultHighlightTextMap highlightTextMap;

        @NameInMap("source")
        public ListSearchCommitResponseBodyResultSource source;

        public static ListSearchCommitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSearchCommitResponseBodyResult self = new ListSearchCommitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSearchCommitResponseBodyResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListSearchCommitResponseBodyResult setHighlightTextMap(ListSearchCommitResponseBodyResultHighlightTextMap highlightTextMap) {
            this.highlightTextMap = highlightTextMap;
            return this;
        }
        public ListSearchCommitResponseBodyResultHighlightTextMap getHighlightTextMap() {
            return this.highlightTextMap;
        }

        public ListSearchCommitResponseBodyResult setSource(ListSearchCommitResponseBodyResultSource source) {
            this.source = source;
            return this;
        }
        public ListSearchCommitResponseBodyResultSource getSource() {
            return this.source;
        }

    }

}
