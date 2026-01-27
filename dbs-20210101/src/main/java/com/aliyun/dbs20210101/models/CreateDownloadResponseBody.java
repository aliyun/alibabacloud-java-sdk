// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateDownloadResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>DBS.ParamIsInValid</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the download task.</p>
     */
    @NameInMap("Data")
    public CreateDownloadResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>DBS.ParamIsInValid</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>formatType can not be empty</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>formatType can not be empty</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A08F908D-2C35-583F-93C1-ED80753F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The point in time of the backup set if the task is used to download a backup set at a specific point in time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1661373070000</p>
         */
        @NameInMap("BackupSetTime")
        public Long backupSetTime;

        /**
         * <p>The ID of the full backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>146005****</p>
         */
        @NameInMap("BakSetId")
        public String bakSetId;

        /**
         * <p>The database and table information that is returned if databases and tables are filtered by the download task.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("DbList")
        public String dbList;

        /**
         * <p>The state of the download task. Valid values:</p>
         * <ul>
         * <li>initializing: The download task was being initialized.</li>
         * <li>queuing: The download task was queuing.</li>
         * <li>running: The download task was running.</li>
         * <li>failed: The download task failed.</li>
         * <li>finished: The download task was complete.</li>
         * <li>expired: The download task expired.</li>
         * </ul>
         * <blockquote>
         * <p>If the TargetType parameter is set to URL, the download task expires in three days after the task is complete.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>initializing</p>
         */
        @NameInMap("DownloadStatus")
        public String downloadStatus;

        /**
         * <p>The size of the downloaded data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExportDataSize")
        public Long exportDataSize;

        /**
         * <p>The format to which the downloaded data is converted.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The time when the download task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1661940917570</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The size of the processed data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ImportDataSize")
        public Long importDataSize;

        /**
         * <p>The number of tables that have been downloaded and the total number of tables to be downloaded.</p>
         * <blockquote>
         * <p>If the task is in the preparation stage, 0/0 is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0/0</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionCode")
        public String regionCode;

        /**
         * <p>The destination path to which the backup set is downloaded.</p>
         * <blockquote>
         * <p> This parameter is returned if the value of <strong>TargetType is OSS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_db/path</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The type of the destination to which the backup set is downloaded.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The ID of the download task.</p>
         * 
         * <strong>example:</strong>
         * <p>dt-qxnsfq5s****</p>
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
