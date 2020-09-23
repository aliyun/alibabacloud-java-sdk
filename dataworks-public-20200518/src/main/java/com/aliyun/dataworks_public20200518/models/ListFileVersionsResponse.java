// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public ListFileVersionsResponseData data;

    public static ListFileVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileVersionsResponse self = new ListFileVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFileVersionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileVersionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListFileVersionsResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFileVersionsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFileVersionsResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFileVersionsResponse setData(ListFileVersionsResponseData data) {
        this.data = data;
        return this;
    }
    public ListFileVersionsResponseData getData() {
        return this.data;
    }

    public static class ListFileVersionsResponseDataFileVersions extends TeaModel {
        @NameInMap("FileVersion")
        @Validation(required = true)
        public Integer fileVersion;

        @NameInMap("FileContent")
        @Validation(required = true)
        public String fileContent;

        @NameInMap("CommitTime")
        @Validation(required = true)
        public Long commitTime;

        @NameInMap("CommitUser")
        @Validation(required = true)
        public String commitUser;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ChangeType")
        @Validation(required = true)
        public String changeType;

        @NameInMap("IsCurrentProd")
        @Validation(required = true)
        public Boolean isCurrentProd;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("NodeContent")
        @Validation(required = true)
        public String nodeContent;

        @NameInMap("FilePropertyContent")
        @Validation(required = true)
        public String filePropertyContent;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        public static ListFileVersionsResponseDataFileVersions build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseDataFileVersions self = new ListFileVersionsResponseDataFileVersions();
            return TeaModel.build(map, self);
        }

        public ListFileVersionsResponseDataFileVersions setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public ListFileVersionsResponseDataFileVersions setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public ListFileVersionsResponseDataFileVersions setCommitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Long getCommitTime() {
            return this.commitTime;
        }

        public ListFileVersionsResponseDataFileVersions setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public ListFileVersionsResponseDataFileVersions setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFileVersionsResponseDataFileVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileVersionsResponseDataFileVersions setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public ListFileVersionsResponseDataFileVersions setIsCurrentProd(Boolean isCurrentProd) {
            this.isCurrentProd = isCurrentProd;
            return this;
        }
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        public ListFileVersionsResponseDataFileVersions setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListFileVersionsResponseDataFileVersions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListFileVersionsResponseDataFileVersions setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public ListFileVersionsResponseDataFileVersions setFilePropertyContent(String filePropertyContent) {
            this.filePropertyContent = filePropertyContent;
            return this;
        }
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        public ListFileVersionsResponseDataFileVersions setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class ListFileVersionsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("FileVersions")
        @Validation(required = true)
        public java.util.List<ListFileVersionsResponseDataFileVersions> fileVersions;

        public static ListFileVersionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseData self = new ListFileVersionsResponseData();
            return TeaModel.build(map, self);
        }

        public ListFileVersionsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFileVersionsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileVersionsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFileVersionsResponseData setFileVersions(java.util.List<ListFileVersionsResponseDataFileVersions> fileVersions) {
            this.fileVersions = fileVersions;
            return this;
        }
        public java.util.List<ListFileVersionsResponseDataFileVersions> getFileVersions() {
            return this.fileVersions;
        }

    }

}
