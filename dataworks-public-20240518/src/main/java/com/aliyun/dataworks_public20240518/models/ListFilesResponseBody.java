// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListFilesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListFilesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFilesResponseBody self = new ListFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFilesResponseBody setData(ListFilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFilesResponseBodyData getData() {
        return this.data;
    }

    public ListFilesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFilesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFilesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFilesResponseBodyDataFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Business_process/my_first_business_process/MaxCompute/ods_layer</p>
         */
        @NameInMap("AbsoluteFolderPath")
        public String absoluteFolderPath;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoParsing")
        public Boolean autoParsing;

        /**
         * <strong>example:</strong>
         * <p>300000</p>
         */
        @NameInMap("BizId")
        public Long bizId;

        /**
         * <strong>example:</strong>
         * <p>300000</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CommitStatus")
        public Integer commitStatus;

        /**
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1593950832000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>382762****</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CurrentVersion")
        public Integer currentVersion;

        /**
         * <strong>example:</strong>
         * <p>my test datastudio file</p>
         */
        @NameInMap("FileDescription")
        public String fileDescription;

        /**
         * <strong>example:</strong>
         * <p>2735c2****</p>
         */
        @NameInMap("FileFolderId")
        public String fileFolderId;

        /**
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsMaxCompute")
        public Boolean isMaxCompute;

        /**
         * <strong>example:</strong>
         * <p>1593950832000</p>
         */
        @NameInMap("LastEditTime")
        public Long lastEditTime;

        /**
         * <strong>example:</strong>
         * <p>382762****</p>
         */
        @NameInMap("LastEditUser")
        public String lastEditUser;

        /**
         * <strong>example:</strong>
         * <p>300001</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <strong>example:</strong>
         * <p>3872572****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static ListFilesResponseBodyDataFiles build(java.util.Map<String, ?> map) throws Exception {
            ListFilesResponseBodyDataFiles self = new ListFilesResponseBodyDataFiles();
            return TeaModel.build(map, self);
        }

        public ListFilesResponseBodyDataFiles setAbsoluteFolderPath(String absoluteFolderPath) {
            this.absoluteFolderPath = absoluteFolderPath;
            return this;
        }
        public String getAbsoluteFolderPath() {
            return this.absoluteFolderPath;
        }

        public ListFilesResponseBodyDataFiles setAutoParsing(Boolean autoParsing) {
            this.autoParsing = autoParsing;
            return this;
        }
        public Boolean getAutoParsing() {
            return this.autoParsing;
        }

        public ListFilesResponseBodyDataFiles setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public ListFilesResponseBodyDataFiles setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public ListFilesResponseBodyDataFiles setCommitStatus(Integer commitStatus) {
            this.commitStatus = commitStatus;
            return this;
        }
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        public ListFilesResponseBodyDataFiles setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public ListFilesResponseBodyDataFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListFilesResponseBodyDataFiles setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFilesResponseBodyDataFiles setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListFilesResponseBodyDataFiles setCurrentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        public ListFilesResponseBodyDataFiles setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public ListFilesResponseBodyDataFiles setFileFolderId(String fileFolderId) {
            this.fileFolderId = fileFolderId;
            return this;
        }
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        public ListFilesResponseBodyDataFiles setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListFilesResponseBodyDataFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFilesResponseBodyDataFiles setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListFilesResponseBodyDataFiles setIsMaxCompute(Boolean isMaxCompute) {
            this.isMaxCompute = isMaxCompute;
            return this;
        }
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        public ListFilesResponseBodyDataFiles setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        public ListFilesResponseBodyDataFiles setLastEditUser(String lastEditUser) {
            this.lastEditUser = lastEditUser;
            return this;
        }
        public String getLastEditUser() {
            return this.lastEditUser;
        }

        public ListFilesResponseBodyDataFiles setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListFilesResponseBodyDataFiles setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListFilesResponseBodyDataFiles setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListFilesResponseBodyDataFiles setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class ListFilesResponseBodyData extends TeaModel {
        @NameInMap("Files")
        public java.util.List<ListFilesResponseBodyDataFiles> files;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFilesResponseBodyData self = new ListFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFilesResponseBodyData setFiles(java.util.List<ListFilesResponseBodyDataFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListFilesResponseBodyDataFiles> getFiles() {
            return this.files;
        }

        public ListFilesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFilesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFilesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
