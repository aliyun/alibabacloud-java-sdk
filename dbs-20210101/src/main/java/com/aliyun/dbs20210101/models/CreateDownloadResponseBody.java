// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateDownloadResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public CreateDownloadResponseBodyData data;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
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
        /**
         * <p>The point in time of the backup set if the task is used to download a backup set at a specific point in time. The value is a timestamp.</p>
         */
        @NameInMap("BackupSetTime")
        public Long backupSetTime;

        /**
         * <p>The ID of the full backup set.</p>
         */
        @NameInMap("BakSetId")
        public String bakSetId;

        /**
         * <p>The database and table information that is returned if the download task is a database and table filtering task.</p>
         */
        @NameInMap("DbList")
        public String dbList;

        /**
         * <p>The status of the download task. Valid values:</p>
         * <br>
         * <p>*   Initializing: The download task is being initialized.</p>
         * <p>*   queuing: The download task is queuing.</p>
         * <p>*   running: The download task is running.</p>
         * <p>*   failed: The download task fails.</p>
         * <p>*   finished: The download task is complete.</p>
         * <p>*   expired: The download task expires.</p>
         * <br>
         * <p>>  The download task expires in three days after the task is complete if the TargetType parameter is set to URL.</p>
         */
        @NameInMap("DownloadStatus")
        public String downloadStatus;

        /**
         * <p>The amount of output data. Unit: bytes.</p>
         */
        @NameInMap("ExportDataSize")
        public Long exportDataSize;

        /**
         * <p>The format to which the downloaded data is converted.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The time when the download task was created. The value is a timestamp.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The amount of data that is processed. Unit: bytes.</p>
         */
        @NameInMap("ImportDataSize")
        public Long importDataSize;

        /**
         * <p>The number of tables that have been downloaded and the total number of tables to be downloaded.</p>
         * <br>
         * <p>>  If the task is in the preparation stage, 0/0 is returned.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("RegionCode")
        public String regionCode;

        /**
         * <p>The destination path of the downloaded data.</p>
         * <br>
         * <p>>  This parameter is returned if the TargetType parameter is set to OSS.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The type of the method in which the backup set is downloaded.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The ID of the download task.</p>
         */
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
