// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchSourceCodeResponseBody extends TeaModel {
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
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListSearchSourceCodeResponseBodyResult> result;

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

    public static ListSearchSourceCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchSourceCodeResponseBody self = new ListSearchSourceCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchSourceCodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSearchSourceCodeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSearchSourceCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchSourceCodeResponseBody setResult(java.util.List<ListSearchSourceCodeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSearchSourceCodeResponseBodyResult> getResult() {
        return this.result;
    }

    public ListSearchSourceCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSearchSourceCodeResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListSearchSourceCodeResponseBodyResultHighlightTextMap extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("clob")
        public String clob;

        /**
         * <strong>example:</strong>
         * <p>test.java</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        public static ListSearchSourceCodeResponseBodyResultHighlightTextMap build(java.util.Map<String, ?> map) throws Exception {
            ListSearchSourceCodeResponseBodyResultHighlightTextMap self = new ListSearchSourceCodeResponseBodyResultHighlightTextMap();
            return TeaModel.build(map, self);
        }

        public ListSearchSourceCodeResponseBodyResultHighlightTextMap setClob(String clob) {
            this.clob = clob;
            return this;
        }
        public String getClob() {
            return this.clob;
        }

        public ListSearchSourceCodeResponseBodyResultHighlightTextMap setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListSearchSourceCodeResponseBodyResultHighlightTextMap setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListSearchSourceCodeResponseBodyResultHighlightTextMap setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListSearchSourceCodeResponseBodyResultSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("branch")
        public String branch;

        /**
         * <strong>example:</strong>
         * <p>2022-10-10 10:00:00</p>
         */
        @NameInMap("checkinDate")
        public String checkinDate;

        /**
         * <strong>example:</strong>
         * <p>test_utils.js</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>spec/frontend/snippets/test_utils.js</p>
         */
        @NameInMap("filePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>JavaScript</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>codeup/test-repo</p>
         */
        @NameInMap("repoPath")
        public String repoPath;

        public static ListSearchSourceCodeResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            ListSearchSourceCodeResponseBodyResultSource self = new ListSearchSourceCodeResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public ListSearchSourceCodeResponseBodyResultSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public ListSearchSourceCodeResponseBodyResultSource setCheckinDate(String checkinDate) {
            this.checkinDate = checkinDate;
            return this;
        }
        public String getCheckinDate() {
            return this.checkinDate;
        }

        public ListSearchSourceCodeResponseBodyResultSource setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListSearchSourceCodeResponseBodyResultSource setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListSearchSourceCodeResponseBodyResultSource setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListSearchSourceCodeResponseBodyResultSource setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListSearchSourceCodeResponseBodyResultSource setRepoPath(String repoPath) {
            this.repoPath = repoPath;
            return this;
        }
        public String getRepoPath() {
            return this.repoPath;
        }

    }

    public static class ListSearchSourceCodeResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60d54f3daccf2bbd6659f3ad/gitlabhq/master/spec/frontend/snippets/test_utils.js</p>
         */
        @NameInMap("docId")
        public String docId;

        @NameInMap("highlightTextMap")
        public ListSearchSourceCodeResponseBodyResultHighlightTextMap highlightTextMap;

        @NameInMap("source")
        public ListSearchSourceCodeResponseBodyResultSource source;

        public static ListSearchSourceCodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSearchSourceCodeResponseBodyResult self = new ListSearchSourceCodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSearchSourceCodeResponseBodyResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListSearchSourceCodeResponseBodyResult setHighlightTextMap(ListSearchSourceCodeResponseBodyResultHighlightTextMap highlightTextMap) {
            this.highlightTextMap = highlightTextMap;
            return this;
        }
        public ListSearchSourceCodeResponseBodyResultHighlightTextMap getHighlightTextMap() {
            return this.highlightTextMap;
        }

        public ListSearchSourceCodeResponseBodyResult setSource(ListSearchSourceCodeResponseBodyResultSource source) {
            this.source = source;
            return this;
        }
        public ListSearchSourceCodeResponseBodyResultSource getSource() {
            return this.source;
        }

    }

}
