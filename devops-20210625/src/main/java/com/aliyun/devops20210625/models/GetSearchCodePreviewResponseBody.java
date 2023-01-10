// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetSearchCodePreviewResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetSearchCodePreviewResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static GetSearchCodePreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSearchCodePreviewResponseBody self = new GetSearchCodePreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSearchCodePreviewResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSearchCodePreviewResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSearchCodePreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSearchCodePreviewResponseBody setResult(GetSearchCodePreviewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetSearchCodePreviewResponseBodyResult getResult() {
        return this.result;
    }

    public GetSearchCodePreviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSearchCodePreviewResponseBodyResultHighlightTextMap extends TeaModel {
        @NameInMap("clob")
        public String clob;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("organizationId")
        public String organizationId;

        public static GetSearchCodePreviewResponseBodyResultHighlightTextMap build(java.util.Map<String, ?> map) throws Exception {
            GetSearchCodePreviewResponseBodyResultHighlightTextMap self = new GetSearchCodePreviewResponseBodyResultHighlightTextMap();
            return TeaModel.build(map, self);
        }

        public GetSearchCodePreviewResponseBodyResultHighlightTextMap setClob(String clob) {
            this.clob = clob;
            return this;
        }
        public String getClob() {
            return this.clob;
        }

        public GetSearchCodePreviewResponseBodyResultHighlightTextMap setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetSearchCodePreviewResponseBodyResultHighlightTextMap setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetSearchCodePreviewResponseBodyResultSource extends TeaModel {
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

        public static GetSearchCodePreviewResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            GetSearchCodePreviewResponseBodyResultSource self = new GetSearchCodePreviewResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public GetSearchCodePreviewResponseBodyResultSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetSearchCodePreviewResponseBodyResultSource setCheckinDate(String checkinDate) {
            this.checkinDate = checkinDate;
            return this;
        }
        public String getCheckinDate() {
            return this.checkinDate;
        }

        public GetSearchCodePreviewResponseBodyResultSource setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetSearchCodePreviewResponseBodyResultSource setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetSearchCodePreviewResponseBodyResultSource setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetSearchCodePreviewResponseBodyResultSource setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetSearchCodePreviewResponseBodyResultSource setRepoPath(String repoPath) {
            this.repoPath = repoPath;
            return this;
        }
        public String getRepoPath() {
            return this.repoPath;
        }

    }

    public static class GetSearchCodePreviewResponseBodyResult extends TeaModel {
        @NameInMap("docId")
        public String docId;

        @NameInMap("highlightTextMap")
        public GetSearchCodePreviewResponseBodyResultHighlightTextMap highlightTextMap;

        @NameInMap("source")
        public GetSearchCodePreviewResponseBodyResultSource source;

        public static GetSearchCodePreviewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSearchCodePreviewResponseBodyResult self = new GetSearchCodePreviewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSearchCodePreviewResponseBodyResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GetSearchCodePreviewResponseBodyResult setHighlightTextMap(GetSearchCodePreviewResponseBodyResultHighlightTextMap highlightTextMap) {
            this.highlightTextMap = highlightTextMap;
            return this;
        }
        public GetSearchCodePreviewResponseBodyResultHighlightTextMap getHighlightTextMap() {
            return this.highlightTextMap;
        }

        public GetSearchCodePreviewResponseBodyResult setSource(GetSearchCodePreviewResponseBodyResultSource source) {
            this.source = source;
            return this;
        }
        public GetSearchCodePreviewResponseBodyResultSource getSource() {
            return this.source;
        }

    }

}
