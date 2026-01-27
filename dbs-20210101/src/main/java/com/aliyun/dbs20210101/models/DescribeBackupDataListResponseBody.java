// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBackupDataListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeBackupDataListResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Request.Forbidden</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95A5FFD0-7F46-5A7D-9DFE-6A376B4E2A28</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeBackupDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDataListResponseBody self = new DescribeBackupDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDataListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBackupDataListResponseBody setData(DescribeBackupDataListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBackupDataListResponseBodyData getData() {
        return this.data;
    }

    public DescribeBackupDataListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBackupDataListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupDataListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupDataListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeBackupDataListResponseBodyDataContentPolarSnapshot extends TeaModel {
        /**
         * <p>The dump backup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc****</p>
         */
        @NameInMap("DumpId")
        public Long dumpId;

        /**
         * <p>The size of the dump backup. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>25669140589</p>
         */
        @NameInMap("DumpSize")
        public Long dumpSize;

        /**
         * <p>The time when the backup set expires. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-19T05:00:49Z</p>
         */
        @NameInMap("ExpectExpireTime")
        public String expectExpireTime;

        /**
         * <p>Indicates whether the backup set expires. Valid values:</p>
         * <ul>
         * <li>NEVER: The backup set does not expire.</li>
         * <li>EXPIRED: The backup set expired.</li>
         * <li>DELAY: The backup set expires after a specific period of time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DELAY</p>
         */
        @NameInMap("expectExpireType")
        public String expectExpireType;

        public static DescribeBackupDataListResponseBodyDataContentPolarSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDataListResponseBodyDataContentPolarSnapshot self = new DescribeBackupDataListResponseBodyDataContentPolarSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDataListResponseBodyDataContentPolarSnapshot setDumpId(Long dumpId) {
            this.dumpId = dumpId;
            return this;
        }
        public Long getDumpId() {
            return this.dumpId;
        }

        public DescribeBackupDataListResponseBodyDataContentPolarSnapshot setDumpSize(Long dumpSize) {
            this.dumpSize = dumpSize;
            return this;
        }
        public Long getDumpSize() {
            return this.dumpSize;
        }

        public DescribeBackupDataListResponseBodyDataContentPolarSnapshot setExpectExpireTime(String expectExpireTime) {
            this.expectExpireTime = expectExpireTime;
            return this;
        }
        public String getExpectExpireTime() {
            return this.expectExpireTime;
        }

        public DescribeBackupDataListResponseBodyDataContentPolarSnapshot setExpectExpireType(String expectExpireType) {
            this.expectExpireType = expectExpireType;
            return this;
        }
        public String getExpectExpireType() {
            return this.expectExpireType;
        }

    }

    public static class DescribeBackupDataListResponseBodyDataContent extends TeaModel {
        /**
         * <p>The URL that is used to download the backup set over the Internet.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of BackupMethod is <strong>Physical</strong> or <strong>Logical</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss.com/">http://oss.com/</a>****</p>
         */
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        /**
         * <p>The end time of the backup. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-17T17:00:32Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>213088****</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The URL that is used to download the backup set over the internal network.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of BackupMethod is <strong>Physical</strong> or <strong>Logical</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss.com/">http://oss.com/</a>****</p>
         */
        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        /**
         * <p>The storage path of backup files.</p>
         * 
         * <strong>example:</strong>
         * <p>logic</p>
         */
        @NameInMap("BackupLocation")
        public String backupLocation;

        /**
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li><strong>Physical</strong></li>
         * <li><strong>Logical</strong></li>
         * <li><strong>Snapshot</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong></li>
         * <li><strong>Manual</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The name of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>logic_backup</p>
         */
        @NameInMap("BackupName")
        public String backupName;

        /**
         * <p>The backup scale. Valid values:</p>
         * <ul>
         * <li><strong>DBInstance</strong></li>
         * <li><strong>DBTable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DBInstance</p>
         */
        @NameInMap("BackupScale")
        public String backupScale;

        /**
         * <p>The size of the backup set. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>25669140480</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The start time of the backup. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-17T17:00:16Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The status of the backup set. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The backup succeeded.</li>
         * <li><strong>ERROR</strong>: The backup failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>FullBackup</strong></li>
         * <li><strong>IncrementBackup</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The checksum value.</p>
         * 
         * <strong>example:</strong>
         * <p>84a4c16431f969712e6895992719****</p>
         */
        @NameInMap("Checksum")
        public String checksum;

        /**
         * <p>The snapshot checkpoint time. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1713373221</p>
         */
        @NameInMap("ConsistentTime")
        public Long consistentTime;

        /**
         * <p>The information about the encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>psk2</p>
         */
        @NameInMap("Encryption")
        public String encryption;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the backup set expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-19T05:00:49Z</p>
         */
        @NameInMap("ExpectExpireTime")
        public String expectExpireTime;

        /**
         * <p>Indicates whether the backup set expires. Valid values:</p>
         * <ul>
         * <li>NEVER: The backup set does not expire.</li>
         * <li>EXPIRED: The backup set expired.</li>
         * <li>DELAY: The backup set expires after a specific period of time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DELAY</p>
         */
        @NameInMap("ExpectExpireType")
        public String expectExpireType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze3nrr64c5******</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the backup set is available. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The backup set is available.</li>
         * <li><strong>0</strong>: The backup set is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAvail")
        public Integer isAvail;

        /**
         * <p>The information about the PolarDB level-2 dump.</p>
         * <blockquote>
         * <p> This parameter is returned only if the level-2 dump feature is enabled for the PolarDB for MySQL cluster and the level-1 backup is dumped.</p>
         * </blockquote>
         */
        @NameInMap("PolarSnapshot")
        public DescribeBackupDataListResponseBodyDataContentPolarSnapshot polarSnapshot;

        /**
         * <p>Indicates whether the backup set can be deleted. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The backup set can be deleted.</li>
         * <li><strong>1</strong>: The backup set cannot be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SupportDeletion")
        public Integer supportDeletion;

        public static DescribeBackupDataListResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDataListResponseBodyDataContent self = new DescribeBackupDataListResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupLocation(String backupLocation) {
            this.backupLocation = backupLocation;
            return this;
        }
        public String getBackupLocation() {
            return this.backupLocation;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupName(String backupName) {
            this.backupName = backupName;
            return this;
        }
        public String getBackupName() {
            return this.backupName;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupScale(String backupScale) {
            this.backupScale = backupScale;
            return this;
        }
        public String getBackupScale() {
            return this.backupScale;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupDataListResponseBodyDataContent setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupDataListResponseBodyDataContent setChecksum(String checksum) {
            this.checksum = checksum;
            return this;
        }
        public String getChecksum() {
            return this.checksum;
        }

        public DescribeBackupDataListResponseBodyDataContent setConsistentTime(Long consistentTime) {
            this.consistentTime = consistentTime;
            return this;
        }
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        public DescribeBackupDataListResponseBodyDataContent setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public DescribeBackupDataListResponseBodyDataContent setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeBackupDataListResponseBodyDataContent setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeBackupDataListResponseBodyDataContent setExpectExpireTime(String expectExpireTime) {
            this.expectExpireTime = expectExpireTime;
            return this;
        }
        public String getExpectExpireTime() {
            return this.expectExpireTime;
        }

        public DescribeBackupDataListResponseBodyDataContent setExpectExpireType(String expectExpireType) {
            this.expectExpireType = expectExpireType;
            return this;
        }
        public String getExpectExpireType() {
            return this.expectExpireType;
        }

        public DescribeBackupDataListResponseBodyDataContent setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeBackupDataListResponseBodyDataContent setIsAvail(Integer isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public Integer getIsAvail() {
            return this.isAvail;
        }

        public DescribeBackupDataListResponseBodyDataContent setPolarSnapshot(DescribeBackupDataListResponseBodyDataContentPolarSnapshot polarSnapshot) {
            this.polarSnapshot = polarSnapshot;
            return this;
        }
        public DescribeBackupDataListResponseBodyDataContentPolarSnapshot getPolarSnapshot() {
            return this.polarSnapshot;
        }

        public DescribeBackupDataListResponseBodyDataContent setSupportDeletion(Integer supportDeletion) {
            this.supportDeletion = supportDeletion;
            return this;
        }
        public Integer getSupportDeletion() {
            return this.supportDeletion;
        }

    }

    public static class DescribeBackupDataListResponseBodyData extends TeaModel {
        /**
         * <p>The information about the task.</p>
         */
        @NameInMap("Content")
        public java.util.List<DescribeBackupDataListResponseBodyDataContent> content;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>dbtest</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of backup sets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalElements")
        public Long totalElements;

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static DescribeBackupDataListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupDataListResponseBodyData self = new DescribeBackupDataListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupDataListResponseBodyData setContent(java.util.List<DescribeBackupDataListResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeBackupDataListResponseBodyDataContent> getContent() {
            return this.content;
        }

        public DescribeBackupDataListResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeBackupDataListResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeBackupDataListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeBackupDataListResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public DescribeBackupDataListResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
