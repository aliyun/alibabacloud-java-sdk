// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryCodeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListRepositoryCodeResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListRepositoryCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCodeResponseBody self = new ListRepositoryCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryCodeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryCodeResponseBody setResult(java.util.List<ListRepositoryCodeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryCodeResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryCodeResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoryCodeResponseBodyResultSource extends TeaModel {
        @NameInMap("Branch")
        public String branch;

        @NameInMap("CheckinDate")
        public String checkinDate;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Language")
        public String language;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("RepoPath")
        public String repoPath;

        public static ListRepositoryCodeResponseBodyResultSource build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCodeResponseBodyResultSource self = new ListRepositoryCodeResponseBodyResultSource();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCodeResponseBodyResultSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public ListRepositoryCodeResponseBodyResultSource setCheckinDate(String checkinDate) {
            this.checkinDate = checkinDate;
            return this;
        }
        public String getCheckinDate() {
            return this.checkinDate;
        }

        public ListRepositoryCodeResponseBodyResultSource setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListRepositoryCodeResponseBodyResultSource setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListRepositoryCodeResponseBodyResultSource setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListRepositoryCodeResponseBodyResultSource setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListRepositoryCodeResponseBodyResultSource setRepoPath(String repoPath) {
            this.repoPath = repoPath;
            return this;
        }
        public String getRepoPath() {
            return this.repoPath;
        }

    }

    public static class ListRepositoryCodeResponseBodyResult extends TeaModel {
        @NameInMap("DocId")
        public String docId;

        @NameInMap("HighlightTextMap")
        public java.util.Map<String, ?> highlightTextMap;

        @NameInMap("Source")
        public ListRepositoryCodeResponseBodyResultSource source;

        public static ListRepositoryCodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCodeResponseBodyResult self = new ListRepositoryCodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCodeResponseBodyResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListRepositoryCodeResponseBodyResult setHighlightTextMap(java.util.Map<String, ?> highlightTextMap) {
            this.highlightTextMap = highlightTextMap;
            return this;
        }
        public java.util.Map<String, ?> getHighlightTextMap() {
            return this.highlightTextMap;
        }

        public ListRepositoryCodeResponseBodyResult setSource(ListRepositoryCodeResponseBodyResultSource source) {
            this.source = source;
            return this;
        }
        public ListRepositoryCodeResponseBodyResultSource getSource() {
            return this.source;
        }

    }

}
