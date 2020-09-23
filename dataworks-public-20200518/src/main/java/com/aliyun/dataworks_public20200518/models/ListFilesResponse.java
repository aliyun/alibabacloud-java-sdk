// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFilesResponse extends TeaModel {
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
    public ListFilesResponseData data;

    public static ListFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFilesResponse self = new ListFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListFilesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFilesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListFilesResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFilesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFilesResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFilesResponse setData(ListFilesResponseData data) {
        this.data = data;
        return this;
    }
    public ListFilesResponseData getData() {
        return this.data;
    }

    public static class ListFilesResponseDataFiles extends TeaModel {
        @NameInMap("ConnectionName")
        @Validation(required = true)
        public String connectionName;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        @NameInMap("IsMaxCompute")
        @Validation(required = true)
        public Boolean isMaxCompute;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("CreateUser")
        @Validation(required = true)
        public String createUser;

        @NameInMap("BizId")
        @Validation(required = true)
        public Long bizId;

        @NameInMap("FileFolderId")
        @Validation(required = true)
        public String fileFolderId;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileType")
        @Validation(required = true)
        public Integer fileType;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        @NameInMap("FileDescription")
        @Validation(required = true)
        public String fileDescription;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("CurrentVersion")
        @Validation(required = true)
        public Integer currentVersion;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("LastEditUser")
        @Validation(required = true)
        public String lastEditUser;

        @NameInMap("LastEditTime")
        @Validation(required = true)
        public Long lastEditTime;

        @NameInMap("CommitStatus")
        @Validation(required = true)
        public Integer commitStatus;

        @NameInMap("FileId")
        @Validation(required = true)
        public Long fileId;

        public static ListFilesResponseDataFiles build(java.util.Map<String, ?> map) throws Exception {
            ListFilesResponseDataFiles self = new ListFilesResponseDataFiles();
            return TeaModel.build(map, self);
        }

        public ListFilesResponseDataFiles setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public ListFilesResponseDataFiles setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListFilesResponseDataFiles setIsMaxCompute(Boolean isMaxCompute) {
            this.isMaxCompute = isMaxCompute;
            return this;
        }
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        public ListFilesResponseDataFiles setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFilesResponseDataFiles setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListFilesResponseDataFiles setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public ListFilesResponseDataFiles setFileFolderId(String fileFolderId) {
            this.fileFolderId = fileFolderId;
            return this;
        }
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        public ListFilesResponseDataFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFilesResponseDataFiles setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListFilesResponseDataFiles setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

        public ListFilesResponseDataFiles setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public ListFilesResponseDataFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListFilesResponseDataFiles setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListFilesResponseDataFiles setCurrentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        public ListFilesResponseDataFiles setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListFilesResponseDataFiles setLastEditUser(String lastEditUser) {
            this.lastEditUser = lastEditUser;
            return this;
        }
        public String getLastEditUser() {
            return this.lastEditUser;
        }

        public ListFilesResponseDataFiles setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        public ListFilesResponseDataFiles setCommitStatus(Integer commitStatus) {
            this.commitStatus = commitStatus;
            return this;
        }
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        public ListFilesResponseDataFiles setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

    }

    public static class ListFilesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Files")
        @Validation(required = true)
        public java.util.List<ListFilesResponseDataFiles> files;

        public static ListFilesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFilesResponseData self = new ListFilesResponseData();
            return TeaModel.build(map, self);
        }

        public ListFilesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFilesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFilesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFilesResponseData setFiles(java.util.List<ListFilesResponseDataFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListFilesResponseDataFiles> getFiles() {
            return this.files;
        }

    }

}
