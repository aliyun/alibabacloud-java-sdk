// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileVersionResponse extends TeaModel {
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
    public GetFileVersionResponseData data;

    public static GetFileVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileVersionResponse self = new GetFileVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetFileVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileVersionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetFileVersionResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileVersionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileVersionResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileVersionResponse setData(GetFileVersionResponseData data) {
        this.data = data;
        return this;
    }
    public GetFileVersionResponseData getData() {
        return this.data;
    }

    public static class GetFileVersionResponseData extends TeaModel {
        @NameInMap("FileVersion")
        @Validation(required = true)
        public Integer fileVersion;

        @NameInMap("FileContent")
        @Validation(required = true)
        public String fileContent;

        @NameInMap("FilePropertyContent")
        @Validation(required = true)
        public String filePropertyContent;

        @NameInMap("NodeContent")
        @Validation(required = true)
        public String nodeContent;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("IsCurrentProd")
        @Validation(required = true)
        public Boolean isCurrentProd;

        @NameInMap("ChangeType")
        @Validation(required = true)
        public String changeType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("CommitUser")
        @Validation(required = true)
        public String commitUser;

        @NameInMap("CommitTime")
        @Validation(required = true)
        public Long commitTime;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        public static GetFileVersionResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFileVersionResponseData self = new GetFileVersionResponseData();
            return TeaModel.build(map, self);
        }

        public GetFileVersionResponseData setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public GetFileVersionResponseData setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public GetFileVersionResponseData setFilePropertyContent(String filePropertyContent) {
            this.filePropertyContent = filePropertyContent;
            return this;
        }
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        public GetFileVersionResponseData setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public GetFileVersionResponseData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetFileVersionResponseData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetFileVersionResponseData setIsCurrentProd(Boolean isCurrentProd) {
            this.isCurrentProd = isCurrentProd;
            return this;
        }
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        public GetFileVersionResponseData setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetFileVersionResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFileVersionResponseData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetFileVersionResponseData setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public GetFileVersionResponseData setCommitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Long getCommitTime() {
            return this.commitTime;
        }

        public GetFileVersionResponseData setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

}
