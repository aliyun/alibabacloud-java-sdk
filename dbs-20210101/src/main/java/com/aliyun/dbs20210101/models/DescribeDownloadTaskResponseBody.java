// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskResponseBody extends TeaModel {
    // The error code.
    @NameInMap("Code")
    public String code;

    // The details of the download tasks.
    @NameInMap("Data")
    public DescribeDownloadTaskResponseBodyData data;

    // The error code.
    @NameInMap("ErrCode")
    public String errCode;

    // The error message.
    @NameInMap("ErrMessage")
    public String errMessage;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
    @NameInMap("Success")
    public String success;

    public static DescribeDownloadTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadTaskResponseBody self = new DescribeDownloadTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDownloadTaskResponseBody setData(DescribeDownloadTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDownloadTaskResponseBodyData getData() {
        return this.data;
    }

    public DescribeDownloadTaskResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDownloadTaskResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDownloadTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDownloadTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeDownloadTaskResponseBodyDataContentList extends TeaModel {
        // The point in time of the backup set if the task is used to download a backup set at a specific point in time. The value is a timestamp of the LONG type. Unit: milliseconds.
        @NameInMap("BackupSetTime")
        public String backupSetTime;

        // The ID of the full backup set.
        @NameInMap("BakSetId")
        public String bakSetId;

        // The details of the databases.
        @NameInMap("DbList")
        public String dbList;

        // The status of the download task. Valid values:
        // 
        // *   **Initializing**: The download task is being initialized.
        // *   **queuing**: The download task is queuing.
        // *   **running**: The download task is running.
        // *   **failed**: The download task fails.
        // *   **finished**: The download task is complete.
        // *   **expired**: The download task expires.
        @NameInMap("DownloadStatus")
        public String downloadStatus;

        // The amount of output data. Unit: bytes.
        @NameInMap("ExportDataSize")
        public String exportDataSize;

        // The format to which the downloaded backup set is converted. Valid values:
        // 
        // *   **csv**
        // *   **SQL**
        // *   **Parquet**
        @NameInMap("Format")
        public String format;

        // The time when the download task was created. The value is a timestamp.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The amount of data that is processed. Unit: bytes.
        @NameInMap("ImportDataSize")
        public String importDataSize;

        // The number of tables that have been downloaded and the total number of tables to be downloaded.
        @NameInMap("Progress")
        public String progress;

        // The ID of the region in which the instance resides.
        @NameInMap("RegionCode")
        public String regionCode;

        // The destination path to which the data is downloaded if the TargeType parameter is set to OSS.
        @NameInMap("TargetPath")
        public String targetPath;

        // The type of the method in which the backup set is downloaded. Valid values:
        // 
        // *   **OSS**
        // *   **URL**
        @NameInMap("TargetType")
        public String targetType;

        // The ID of the download task.
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeDownloadTaskResponseBodyDataContentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadTaskResponseBodyDataContentList self = new DescribeDownloadTaskResponseBodyDataContentList();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadTaskResponseBodyDataContentList setBackupSetTime(String backupSetTime) {
            this.backupSetTime = backupSetTime;
            return this;
        }
        public String getBackupSetTime() {
            return this.backupSetTime;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setBakSetId(String bakSetId) {
            this.bakSetId = bakSetId;
            return this;
        }
        public String getBakSetId() {
            return this.bakSetId;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setDbList(String dbList) {
            this.dbList = dbList;
            return this;
        }
        public String getDbList() {
            return this.dbList;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setDownloadStatus(String downloadStatus) {
            this.downloadStatus = downloadStatus;
            return this;
        }
        public String getDownloadStatus() {
            return this.downloadStatus;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setExportDataSize(String exportDataSize) {
            this.exportDataSize = exportDataSize;
            return this;
        }
        public String getExportDataSize() {
            return this.exportDataSize;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setImportDataSize(String importDataSize) {
            this.importDataSize = importDataSize;
            return this;
        }
        public String getImportDataSize() {
            return this.importDataSize;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeDownloadTaskResponseBodyDataContentList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeDownloadTaskResponseBodyDataContent extends TeaModel {
        @NameInMap("List")
        public java.util.List<DescribeDownloadTaskResponseBodyDataContentList> list;

        public static DescribeDownloadTaskResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadTaskResponseBodyDataContent self = new DescribeDownloadTaskResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadTaskResponseBodyDataContent setList(java.util.List<DescribeDownloadTaskResponseBodyDataContentList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeDownloadTaskResponseBodyDataContentList> getList() {
            return this.list;
        }

    }

    public static class DescribeDownloadTaskResponseBodyData extends TeaModel {
        // The details of the download tasks.
        @NameInMap("Content")
        public DescribeDownloadTaskResponseBodyDataContent content;

        // The extra description of the download task.
        @NameInMap("Extra")
        public String extra;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalElements")
        public Long totalElements;

        // The total number of returned pages.
        @NameInMap("TotalPages")
        public Long totalPages;

        public static DescribeDownloadTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadTaskResponseBodyData self = new DescribeDownloadTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadTaskResponseBodyData setContent(DescribeDownloadTaskResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public DescribeDownloadTaskResponseBodyDataContent getContent() {
            return this.content;
        }

        public DescribeDownloadTaskResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeDownloadTaskResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeDownloadTaskResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeDownloadTaskResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public DescribeDownloadTaskResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
