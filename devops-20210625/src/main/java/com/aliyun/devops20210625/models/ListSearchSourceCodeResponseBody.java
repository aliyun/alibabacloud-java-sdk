// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchSourceCodeResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListSearchSourceCodeResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

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
        @NameInMap("clob")
        public String clob;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("language")
        public String language;

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
        @NameInMap("branch")
        public String branch;

        @NameInMap("checkinDate")
        public String checkinDate;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("filePath")
        public String filePath;

        @NameInMap("language")
        public String language;

        @NameInMap("organizationId")
        public String organizationId;

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
