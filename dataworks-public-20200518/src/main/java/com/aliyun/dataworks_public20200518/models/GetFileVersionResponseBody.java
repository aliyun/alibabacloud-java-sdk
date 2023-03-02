// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileVersionResponseBody extends TeaModel {
    /**
     * <p>The details of the file version.</p>
     */
    @NameInMap("Data")
    public GetFileVersionResponseBodyData data;

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
     * <p>The ID of the request. You can troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFileVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileVersionResponseBody self = new GetFileVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileVersionResponseBody setData(GetFileVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileVersionResponseBodyData getData() {
        return this.data;
    }

    public GetFileVersionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileVersionResponseBodyData extends TeaModel {
        /**
         * <p>The change type of the file version. Valid values: CREATE, UPDATE, and DELETE.</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The description of the file version.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the version was generated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CommitTime")
        public Long commitTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the file version.</p>
         */
        @NameInMap("CommitUser")
        public String commitUser;

        /**
         * <p>The file code.</p>
         */
        @NameInMap("FileContent")
        public String fileContent;

        /**
         * <p>The file name.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The basic information about the file.</p>
         */
        @NameInMap("FilePropertyContent")
        public String filePropertyContent;

        /**
         * <p>The file version.</p>
         */
        @NameInMap("FileVersion")
        public Integer fileVersion;

        /**
         * <p>Indicates whether the version is the latest version in the production environment.</p>
         */
        @NameInMap("IsCurrentProd")
        public Boolean isCurrentProd;

        /**
         * <p>The scheduling configurations of the node that corresponds to the file version.</p>
         */
        @NameInMap("NodeContent")
        public String nodeContent;

        /**
         * <p>The ID of the node that corresponds to the file version.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The status of the file version. Valid values: COMMITTING, COMMITTED, CHECK_OK, PACKAGED, DEPLOYING, DEPLOYED, and CANCELLED. The value CHECK_OK is equivalent to the value COMMITTED.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The functional module to which the file belongs. Valid values: NORMAL, MANUAL, MANUAL_BIZ, SKIP, ADHOCQUERY, and COMPONENT. The value NORMAL indicates DataStudio. The value MANUAL indicates a manually triggered node. The value MANUAL_BIZ indicates a manually triggered workflow. The value SKIP indicates a dry-run DataStudio node. The value ADHOCQUERY indicates an ad hoc query. The value COMPONENT indicates snippets.</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static GetFileVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileVersionResponseBodyData self = new GetFileVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileVersionResponseBodyData setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetFileVersionResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetFileVersionResponseBodyData setCommitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Long getCommitTime() {
            return this.commitTime;
        }

        public GetFileVersionResponseBodyData setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public GetFileVersionResponseBodyData setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public GetFileVersionResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetFileVersionResponseBodyData setFilePropertyContent(String filePropertyContent) {
            this.filePropertyContent = filePropertyContent;
            return this;
        }
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        public GetFileVersionResponseBodyData setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public GetFileVersionResponseBodyData setIsCurrentProd(Boolean isCurrentProd) {
            this.isCurrentProd = isCurrentProd;
            return this;
        }
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        public GetFileVersionResponseBodyData setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public GetFileVersionResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetFileVersionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFileVersionResponseBodyData setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

}
