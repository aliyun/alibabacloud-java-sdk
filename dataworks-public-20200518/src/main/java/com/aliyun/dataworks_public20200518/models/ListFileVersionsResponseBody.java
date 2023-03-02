// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileVersionsResponseBody extends TeaModel {
    /**
     * <p>The file versions returned.</p>
     */
    @NameInMap("Data")
    public ListFileVersionsResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFileVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileVersionsResponseBody self = new ListFileVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileVersionsResponseBody setData(ListFileVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFileVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListFileVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFileVersionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFileVersionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFileVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFileVersionsResponseBodyDataFileVersions extends TeaModel {
        /**
         * <p>The type of the change to the file of the current version. Valid values: CREATE, UPDATE, and DELETE.</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The description of the file version.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the file version was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CommitTime")
        public Long commitTime;

        /**
         * <p>The ID of the Alibaba Cloud account used to create the file of the current version.</p>
         */
        @NameInMap("CommitUser")
        public String commitUser;

        /**
         * <p>The code in the file of the current version.</p>
         */
        @NameInMap("FileContent")
        public String fileContent;

        /**
         * <p>The name of the file of the current version.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The basic information about the file of the current version.</p>
         */
        @NameInMap("FilePropertyContent")
        public String filePropertyContent;

        /**
         * <p>The version of the file.</p>
         */
        @NameInMap("FileVersion")
        public Integer fileVersion;

        /**
         * <p>Indicates whether the file version is the same as the latest file version in the production environment.</p>
         */
        @NameInMap("IsCurrentProd")
        public Boolean isCurrentProd;

        /**
         * <p>The scheduling configurations for the node that corresponds to the file of the current version.</p>
         */
        @NameInMap("NodeContent")
        public String nodeContent;

        /**
         * <p>The ID of the auto triggered node that corresponds to the file of the current version.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The status of the file of the current version. Valid values: COMMITTING, COMMITTED, CHECK_OK, PACKAGED, DEPLOYING, DEPLOYED, and CANCELLED.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The functional module to which the file belongs. Valid values: NORMAL, MANUAL, MANUAL_BIZ, SKIP, ADHOCQUERY, and COMPONENT. The value SKIP indicates that the node corresponding to the file is run in dry-run mode.</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static ListFileVersionsResponseBodyDataFileVersions build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseBodyDataFileVersions self = new ListFileVersionsResponseBodyDataFileVersions();
            return TeaModel.build(map, self);
        }

        public ListFileVersionsResponseBodyDataFileVersions setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public ListFileVersionsResponseBodyDataFileVersions setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListFileVersionsResponseBodyDataFileVersions setCommitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Long getCommitTime() {
            return this.commitTime;
        }

        public ListFileVersionsResponseBodyDataFileVersions setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFilePropertyContent(String filePropertyContent) {
            this.filePropertyContent = filePropertyContent;
            return this;
        }
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public ListFileVersionsResponseBodyDataFileVersions setIsCurrentProd(Boolean isCurrentProd) {
            this.isCurrentProd = isCurrentProd;
            return this;
        }
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        public ListFileVersionsResponseBodyDataFileVersions setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public ListFileVersionsResponseBodyDataFileVersions setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListFileVersionsResponseBodyDataFileVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileVersionsResponseBodyDataFileVersions setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class ListFileVersionsResponseBodyData extends TeaModel {
        /**
         * <p>The details of the file version.</p>
         */
        @NameInMap("FileVersions")
        public java.util.List<ListFileVersionsResponseBodyDataFileVersions> fileVersions;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFileVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFileVersionsResponseBodyData self = new ListFileVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFileVersionsResponseBodyData setFileVersions(java.util.List<ListFileVersionsResponseBodyDataFileVersions> fileVersions) {
            this.fileVersions = fileVersions;
            return this;
        }
        public java.util.List<ListFileVersionsResponseBodyDataFileVersions> getFileVersions() {
            return this.fileVersions;
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

    }

}
