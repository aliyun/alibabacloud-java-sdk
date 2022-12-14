// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateDownloadResponseBody extends TeaModel {
    // The error code.
    @NameInMap("Code")
    public String code;

    // The response parameters.
    @NameInMap("Data")
    public CreateDownloadResponseBodyData data;

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

    public static CreateDownloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadResponseBody self = new CreateDownloadResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDownloadResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDownloadResponseBody setData(CreateDownloadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDownloadResponseBodyData getData() {
        return this.data;
    }

    public CreateDownloadResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateDownloadResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateDownloadResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDownloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDownloadResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateDownloadResponseBodyData extends TeaModel {
        // The point in time of the backup set if the task is used to download a backup set at a specific point in time. The value is a timestamp.
        @NameInMap("BackupSetTime")
        public Long backupSetTime;

        // The ID of the full backup set.
        @NameInMap("BakSetId")
        public String bakSetId;

        // The database and table information that is returned if the download task is a database and table filtering task.
        @NameInMap("DbList")
        public String dbList;

        // The status of the download task. Valid values:
        // 
        // *   Initializing: The download task is being initialized.
        // *   queuing: The download task is queuing.
        // *   running: The download task is running.
        // *   failed: The download task fails.
        // *   finished: The download task is complete.
        // *   expired: The download task expires.
        // 
        // >  The download task expires in three days after the task is complete if the TargetType parameter is set to URL.
        @NameInMap("DownloadStatus")
        public String downloadStatus;

        // The amount of output data. Unit: bytes.
        @NameInMap("ExportDataSize")
        public Long exportDataSize;

        // The format to which the downloaded data is converted.
        @NameInMap("Format")
        public String format;

        // The time when the download task was created. The value is a timestamp.
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        // The amount of data that is processed. Unit: bytes.
        @NameInMap("ImportDataSize")
        public Long importDataSize;

        // The number of tables that have been downloaded and the total number of tables to be downloaded.
        // 
        // >  If the task is in the preparation stage, 0/0 is returned.
        @NameInMap("Progress")
        public String progress;

        // The ID of the region in which the instance resides.
        @NameInMap("RegionCode")
        public String regionCode;

        // The destination path of the downloaded data.
        // 
        // >  This parameter is returned if the TargetType parameter is set to OSS.
        @NameInMap("TargetPath")
        public String targetPath;

        // The type of the method in which the backup set is downloaded.
        @NameInMap("TargetType")
        public String targetType;

        // The ID of the download task.
        @NameInMap("TaskId")
        public String taskId;

        public static CreateDownloadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDownloadResponseBodyData self = new CreateDownloadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDownloadResponseBodyData setBackupSetTime(Long backupSetTime) {
            this.backupSetTime = backupSetTime;
            return this;
        }
        public Long getBackupSetTime() {
            return this.backupSetTime;
        }

        public CreateDownloadResponseBodyData setBakSetId(String bakSetId) {
            this.bakSetId = bakSetId;
            return this;
        }
        public String getBakSetId() {
            return this.bakSetId;
        }

        public CreateDownloadResponseBodyData setDbList(String dbList) {
            this.dbList = dbList;
            return this;
        }
        public String getDbList() {
            return this.dbList;
        }

        public CreateDownloadResponseBodyData setDownloadStatus(String downloadStatus) {
            this.downloadStatus = downloadStatus;
            return this;
        }
        public String getDownloadStatus() {
            return this.downloadStatus;
        }

        public CreateDownloadResponseBodyData setExportDataSize(Long exportDataSize) {
            this.exportDataSize = exportDataSize;
            return this;
        }
        public Long getExportDataSize() {
            return this.exportDataSize;
        }

        public CreateDownloadResponseBodyData setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateDownloadResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateDownloadResponseBodyData setImportDataSize(Long importDataSize) {
            this.importDataSize = importDataSize;
            return this;
        }
        public Long getImportDataSize() {
            return this.importDataSize;
        }

        public CreateDownloadResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public CreateDownloadResponseBodyData setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public CreateDownloadResponseBodyData setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public CreateDownloadResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public CreateDownloadResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
