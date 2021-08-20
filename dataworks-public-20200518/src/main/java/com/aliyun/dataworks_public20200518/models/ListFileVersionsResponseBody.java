// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileVersionsResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ListFileVersionsResponseBodyData data;

    public static ListFileVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileVersionsResponseBody self = new ListFileVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileVersionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFileVersionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFileVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFileVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListFileVersionsResponseBody setData(ListFileVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFileVersionsResponseBodyData getData() {
        return this.data;
    }

    public static class ListFileVersionsResponseBodyDataFileVersions extends TeaModel {
        @NameInMap("FileContent")
        public String fileContent;

        @NameInMap("Status")
        public String status;

        @NameInMap("IsCurrentProd")
        public Boolean isCurrentProd;

        @NameInMap("CommitUser")
        public String commitUser;

        @NameInMap("NodeContent")
        public String nodeContent;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("FilePropertyContent")
        public String filePropertyContent;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("UseType")
        public String useType;

        @NameInMap("ChangeType")
        public String changeType;

        @NameInMap("FileVersion")
        public Integer fileVersion;

        @NameInMap("CommitTime")
        public Long commitTime;

        @NameInMap("NodeId")
        public Long nodeId;

        public static ListFileVersionsResponseBodyDataFileVersions build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseBodyDataFileVersions self = new ListFileVersionsResponseBodyDataFileVersions();
            return TeaModel.build(map, self);
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileVersionsResponseBodyDataFileVersions setIsCurrentProd(Boolean isCurrentProd) {
            this.isCurrentProd = isCurrentProd;
            return this;
        }
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        public ListFileVersionsResponseBodyDataFileVersions setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public ListFileVersionsResponseBodyDataFileVersions setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFilePropertyContent(String filePropertyContent) {
            this.filePropertyContent = filePropertyContent;
            return this;
        }
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFileVersionsResponseBodyDataFileVersions setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

        public ListFileVersionsResponseBodyDataFileVersions setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public ListFileVersionsResponseBodyDataFileVersions setCommitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Long getCommitTime() {
            return this.commitTime;
        }

        public ListFileVersionsResponseBodyDataFileVersions setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListFileVersionsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("FileVersions")
        public java.util.List<ListFileVersionsResponseBodyDataFileVersions> fileVersions;

        public static ListFileVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseBodyData self = new ListFileVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFileVersionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFileVersionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileVersionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFileVersionsResponseBodyData setFileVersions(java.util.List<ListFileVersionsResponseBodyDataFileVersions> fileVersions) {
            this.fileVersions = fileVersions;
            return this;
        }
        public java.util.List<ListFileVersionsResponseBodyDataFileVersions> getFileVersions() {
            return this.fileVersions;
        }

    }

}
