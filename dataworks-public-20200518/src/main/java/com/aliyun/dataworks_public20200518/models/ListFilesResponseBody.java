// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFilesResponseBody extends TeaModel {
    /**
     * <p>The files returned.</p>
     */
    @NameInMap("Data")
    public ListFilesResponseBodyData data;

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
     * <p>The ID of the request. You can troubleshoot errors based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
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
        @NameInMap("AbsoluteFolderPath")
        public String absoluteFolderPath;

        /**
         * <p>Specifies whether the automatic parsing feature is enabled for the file. Valid values:</p>
         * <br>
         * <p>*   true: The automatic parsing feature is enabled for the file.</p>
         * <p>*   false: The automatic parsing feature is not enabled for the file.</p>
         * <br>
         * <p>This parameter is equivalent to the Analyze Code parameter in the Dependencies section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("AutoParsing")
        public Boolean autoParsing;

        /**
         * <p>The ID of the workflow to which the file belongs. This parameter is deprecated and replaced by the BusinessId parameter.</p>
         */
        @NameInMap("BizId")
        public Long bizId;

        /**
         * <p>The ID of the workflow to which the file belongs.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>Indicates whether the latest code in the file is committed. Valid values: 0 and 1. The value 0 indicates that the latest code in the file is not committed. The value 1 indicates that the latest code in the file is committed.</p>
         */
        @NameInMap("CommitStatus")
        public Integer commitStatus;

        /**
         * <p>The ID of the compute engine instance that is used to run the node that corresponds to the file.</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>This parameter is deprecated. You can call the [GetFile](~~173954#doc-api-dataworks-public-GetFile~~) operation to query the details of the file.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the file was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the file.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The latest version number of the file.</p>
         */
        @NameInMap("CurrentVersion")
        public Integer currentVersion;

        /**
         * <p>The description of the file.</p>
         */
        @NameInMap("FileDescription")
        public String fileDescription;

        /**
         * <p>The ID of the folder to which the file belongs.</p>
         */
        @NameInMap("FileFolderId")
        public String fileFolderId;

        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the code in the file. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <p>Indicates whether the file needs to be uploaded to MaxCompute if the file is a MaxCompute resource file.</p>
         * <br>
         * <p>This parameter is returned only if the file is a MaxCompute resource file.</p>
         */
        @NameInMap("IsMaxCompute")
        public Boolean isMaxCompute;

        /**
         * <p>The time when the file was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("LastEditTime")
        public Long lastEditTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to last modify the file.</p>
         */
        @NameInMap("LastEditUser")
        public String lastEditUser;

        /**
         * <p>The ID of the auto triggered node that is generated in the scheduling system after the file is committed.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The ID of the Alibaba Cloud account used by the file owner.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the node group file to which the current file belongs. This parameter is returned only if the current file is an inner file of the node group file.</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The module to which the file belongs. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The file is used for DataStudio.</p>
         * <p>*   MANUAL: The file is used for a manually triggered node.</p>
         * <p>*   MANUAL_BIZ: The file is used for a manually triggered workflow.</p>
         * <p>*   SKIP: The files is used for a dry-run node in DataStudio.</p>
         * <p>*   ADHOCQUERY: The file is used for an ad hoc query.</p>
         * <p>*   COMPONENT: The file is used for a snippet.</p>
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
        /**
         * <p>The details of the files.</p>
         */
        @NameInMap("Files")
        public java.util.List<ListFilesResponseBodyDataFiles> files;

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
