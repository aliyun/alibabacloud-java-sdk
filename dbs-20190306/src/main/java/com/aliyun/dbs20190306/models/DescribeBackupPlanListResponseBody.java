// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanListResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameterValid</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Details of the backup plans.</p>
     */
    @NameInMap("Items")
    public DescribeBackupPlanListResponseBodyItems items;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F1888AC-1138-4995-B9FE-D2734F61C058</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of backup plans.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalElements")
    public Integer totalElements;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeBackupPlanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanListResponseBody self = new DescribeBackupPlanListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBackupPlanListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupPlanListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBackupPlanListResponseBody setItems(DescribeBackupPlanListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupPlanListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupPlanListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBackupPlanListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupPlanListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPlanListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupPlanListResponseBody setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Integer getTotalElements() {
        return this.totalElements;
    }

    public DescribeBackupPlanListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeBackupPlanListResponseBodyItemsBackupPlanDetail extends TeaModel {
        /**
         * <p>Backup gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>827362187368736</p>
         */
        @NameInMap("BackupGatewayId")
        public Long backupGatewayId;

        /**
         * <p>Backup method. The return values are as follows:</p>
         * <ul>
         * <li><strong>logical</strong>: Logical backup</li>
         * <li><strong>physical</strong>: Physical backup</li>
         * <li><strong>duplication</strong>: Replication backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>logical</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>Backup objects.</p>
         */
        @NameInMap("BackupObjects")
        public String backupObjects;

        /**
         * <p>Full backup cycle. The return values are as follows:</p>
         * <ul>
         * <li><strong>Monday</strong>: Monday</li>
         * <li><strong>Tuesday</strong>: Tuesday</li>
         * <li><strong>Wednesday</strong>: Wednesday</li>
         * <li><strong>Thursday</strong>: Thursday</li>
         * <li><strong>Friday</strong>: Friday</li>
         * <li><strong>Saturday</strong>: Saturday</li>
         * <li><strong>Sunday</strong>: Sunday</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Monday</p>
         */
        @NameInMap("BackupPeriod")
        public String backupPeriod;

        /**
         * <p>Timestamp of the backup plan creation.</p>
         * 
         * <strong>example:</strong>
         * <p>1582527713000</p>
         */
        @NameInMap("BackupPlanCreateTime")
        public Long backupPlanCreateTime;

        /**
         * <p>Backup plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstooi01eXXXX</p>
         */
        @NameInMap("BackupPlanId")
        public String backupPlanId;

        /**
         * <p>Backup plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>dbstooi01e****</p>
         */
        @NameInMap("BackupPlanName")
        public String backupPlanName;

        /**
         * <p>Backup plan status. The return values are as follows:</p>
         * <ul>
         * <li><strong>wait</strong>: Not configured</li>
         * <li><strong>init</strong>: Not started (pre-check failed)</li>
         * <li><strong>running</strong>: Running</li>
         * <li><strong>stop</strong>: Failed</li>
         * <li><strong>pause</strong>: Paused</li>
         * <li><strong>locked</strong>: Locked</li>
         * <li><strong>check_pass</strong>: Pre-check passed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>init</p>
         */
        @NameInMap("BackupPlanStatus")
        public String backupPlanStatus;

        /**
         * <p>Backup data retention period, with a value range of 0 to 1825 days.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("BackupRetentionPeriod")
        public Integer backupRetentionPeriod;

        /**
         * <p>Download server directory of the backup set</p>
         */
        @NameInMap("BackupSetDownloadDir")
        public String backupSetDownloadDir;

        /**
         * <p>Full data format for backup set download:</p>
         * <ul>
         * <li><strong>Native</strong></li>
         * <li><strong>SQL</strong></li>
         * <li><strong>CSV</strong></li>
         * <li><strong>JSON</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("BackupSetDownloadFullDataFormat")
        public String backupSetDownloadFullDataFormat;

        /**
         * <p>Backup set download backup gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("BackupSetDownloadGatewayId")
        public Long backupSetDownloadGatewayId;

        /**
         * <p>Backup set download full data format:</p>
         * <ul>
         * <li><strong>Native</strong></li>
         * <li><strong>SQL</strong></li>
         * <li><strong>CSV</strong></li>
         * <li><strong>JSON</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("BackupSetDownloadIncrementDataFormat")
        public String backupSetDownloadIncrementDataFormat;

        /**
         * <p>Backup set download target type.</p>
         * <blockquote>
         * <p>The only value is: agent, indicating that the backup gateway is installed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("BackupSetDownloadTargetType")
        public String backupSetDownloadTargetType;

        /**
         * <p>Full backup start time, in the format HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>14:22</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>Built-in storage type. The return values are as follows:</p>
         * <ul>
         * <li>Empty (default): Backup data is stored on the user\&quot;s OSS.</li>
         * <li>system: Backup data is stored on the built-in OSS of DBS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("BackupStorageType")
        public String backupStorageType;

        /**
         * <p>Start time for the database restore period, with a return value of 1554560477000.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        @NameInMap("BeginTimestampForRestore")
        public Long beginTimestampForRestore;

        /**
         * <p>UID for cross-Aliyun account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2xxx7778xxxxxxxxxx</p>
         */
        @NameInMap("CrossAliyunId")
        public String crossAliyunId;

        /**
         * <p>RAM role name for cross-Aliyun account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("CrossRoleName")
        public String crossRoleName;

        /**
         * <p>Database type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>Time (in days) to convert to archive cold backup storage.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("DuplicationArchivePeriod")
        public Integer duplicationArchivePeriod;

        /**
         * <p>Time (in days) to convert to infrequent access storage.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DuplicationInfrequentAccessPeriod")
        public Integer duplicationInfrequentAccessPeriod;

        /**
         * <p>Indicates whether incremental log backup is enabled, with return values as follows:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled</li>
         * <li><strong>false</strong>: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableBackupLog")
        public Boolean enableBackupLog;

        /**
         * <p>End time of the database restorable period, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1554560477000</p>
         */
        @NameInMap("EndTimestampForRestore")
        public Long endTimestampForRestore;

        /**
         * <p>Pre-check task error message.</p>
         * 
         * <strong>example:</strong>
         * <p>can not connect to oracle instance orcl with user dbs</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>Instance class, with return values as follows:</p>
         * <ul>
         * <li><strong>micro</strong>: Entry-level</li>
         * <li><strong>small</strong>: Low-spec</li>
         * <li><strong>medium</strong>: Medium-spec</li>
         * <li><strong>large</strong>: High-spec</li>
         * <li><strong>xlarge</strong>: High-spec (no traffic limit)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>micro</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>OSS Bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs-backup-1857XXXXX489</p>
         */
        @NameInMap("OSSBucketName")
        public String OSSBucketName;

        /**
         * <p>OSS Bucket region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("OSSBucketRegion")
        public String OSSBucketRegion;

        /**
         * <p>Indicates whether the automatic backup set download feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OpenBackupSetAutoDownload")
        public Boolean openBackupSetAutoDownload;

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzecovzti****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SourceEndpointDatabaseName")
        public String sourceEndpointDatabaseName;

        /**
         * <p>Database instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SourceEndpointInstanceID")
        public String sourceEndpointInstanceID;

        /**
         * <p>Location of the database, the return values are as follows:</p>
         * <ul>
         * <li><strong>rds</strong></li>
         * <li><strong>ecs</strong></li>
         * <li><strong>express</strong>: Database connected via dedicated line/VPN gateway/smart gateway</li>
         * <li><strong>agent</strong>: Database connected via backup gateway</li>
         * <li><strong>dds</strong>: Cloud MongoDB</li>
         * <li><strong>other</strong>: Database connected directly via IP:Port</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("SourceEndpointInstanceType")
        public String sourceEndpointInstanceType;

        /**
         * <p>Database connection address.</p>
         * 
         * <strong>example:</strong>
         * <p>100.<em>.</em>.10:33204</p>
         */
        @NameInMap("SourceEndpointIpPort")
        public String sourceEndpointIpPort;

        /**
         * <p>Oracle SID name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SourceEndpointOracleSID")
        public String sourceEndpointOracleSID;

        /**
         * <p>Database region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SourceEndpointRegion")
        public String sourceEndpointRegion;

        /**
         * <p>Database username.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SourceEndpointUserName")
        public String sourceEndpointUserName;

        public static DescribeBackupPlanListResponseBodyItemsBackupPlanDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlanListResponseBodyItemsBackupPlanDetail self = new DescribeBackupPlanListResponseBodyItemsBackupPlanDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupGatewayId(Long backupGatewayId) {
            this.backupGatewayId = backupGatewayId;
            return this;
        }
        public Long getBackupGatewayId() {
            return this.backupGatewayId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupObjects(String backupObjects) {
            this.backupObjects = backupObjects;
            return this;
        }
        public String getBackupObjects() {
            return this.backupObjects;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanCreateTime(Long backupPlanCreateTime) {
            this.backupPlanCreateTime = backupPlanCreateTime;
            return this;
        }
        public Long getBackupPlanCreateTime() {
            return this.backupPlanCreateTime;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanName(String backupPlanName) {
            this.backupPlanName = backupPlanName;
            return this;
        }
        public String getBackupPlanName() {
            return this.backupPlanName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanStatus(String backupPlanStatus) {
            this.backupPlanStatus = backupPlanStatus;
            return this;
        }
        public String getBackupPlanStatus() {
            return this.backupPlanStatus;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Integer getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadDir(String backupSetDownloadDir) {
            this.backupSetDownloadDir = backupSetDownloadDir;
            return this;
        }
        public String getBackupSetDownloadDir() {
            return this.backupSetDownloadDir;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadFullDataFormat(String backupSetDownloadFullDataFormat) {
            this.backupSetDownloadFullDataFormat = backupSetDownloadFullDataFormat;
            return this;
        }
        public String getBackupSetDownloadFullDataFormat() {
            return this.backupSetDownloadFullDataFormat;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadGatewayId(Long backupSetDownloadGatewayId) {
            this.backupSetDownloadGatewayId = backupSetDownloadGatewayId;
            return this;
        }
        public Long getBackupSetDownloadGatewayId() {
            return this.backupSetDownloadGatewayId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadIncrementDataFormat(String backupSetDownloadIncrementDataFormat) {
            this.backupSetDownloadIncrementDataFormat = backupSetDownloadIncrementDataFormat;
            return this;
        }
        public String getBackupSetDownloadIncrementDataFormat() {
            return this.backupSetDownloadIncrementDataFormat;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadTargetType(String backupSetDownloadTargetType) {
            this.backupSetDownloadTargetType = backupSetDownloadTargetType;
            return this;
        }
        public String getBackupSetDownloadTargetType() {
            return this.backupSetDownloadTargetType;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupStorageType(String backupStorageType) {
            this.backupStorageType = backupStorageType;
            return this;
        }
        public String getBackupStorageType() {
            return this.backupStorageType;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBeginTimestampForRestore(Long beginTimestampForRestore) {
            this.beginTimestampForRestore = beginTimestampForRestore;
            return this;
        }
        public Long getBeginTimestampForRestore() {
            return this.beginTimestampForRestore;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setCrossAliyunId(String crossAliyunId) {
            this.crossAliyunId = crossAliyunId;
            return this;
        }
        public String getCrossAliyunId() {
            return this.crossAliyunId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setCrossRoleName(String crossRoleName) {
            this.crossRoleName = crossRoleName;
            return this;
        }
        public String getCrossRoleName() {
            return this.crossRoleName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
            this.duplicationArchivePeriod = duplicationArchivePeriod;
            return this;
        }
        public Integer getDuplicationArchivePeriod() {
            return this.duplicationArchivePeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
            this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
            return this;
        }
        public Integer getDuplicationInfrequentAccessPeriod() {
            return this.duplicationInfrequentAccessPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setEnableBackupLog(Boolean enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }
        public Boolean getEnableBackupLog() {
            return this.enableBackupLog;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setEndTimestampForRestore(Long endTimestampForRestore) {
            this.endTimestampForRestore = endTimestampForRestore;
            return this;
        }
        public Long getEndTimestampForRestore() {
            return this.endTimestampForRestore;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setOSSBucketName(String OSSBucketName) {
            this.OSSBucketName = OSSBucketName;
            return this;
        }
        public String getOSSBucketName() {
            return this.OSSBucketName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setOSSBucketRegion(String OSSBucketRegion) {
            this.OSSBucketRegion = OSSBucketRegion;
            return this;
        }
        public String getOSSBucketRegion() {
            return this.OSSBucketRegion;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setOpenBackupSetAutoDownload(Boolean openBackupSetAutoDownload) {
            this.openBackupSetAutoDownload = openBackupSetAutoDownload;
            return this;
        }
        public Boolean getOpenBackupSetAutoDownload() {
            return this.openBackupSetAutoDownload;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }
        public String getSourceEndpointDatabaseName() {
            return this.sourceEndpointDatabaseName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }
        public String getSourceEndpointInstanceID() {
            return this.sourceEndpointInstanceID;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }
        public String getSourceEndpointInstanceType() {
            return this.sourceEndpointInstanceType;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointIpPort(String sourceEndpointIpPort) {
            this.sourceEndpointIpPort = sourceEndpointIpPort;
            return this;
        }
        public String getSourceEndpointIpPort() {
            return this.sourceEndpointIpPort;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }
        public String getSourceEndpointOracleSID() {
            return this.sourceEndpointOracleSID;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointRegion(String sourceEndpointRegion) {
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }
        public String getSourceEndpointRegion() {
            return this.sourceEndpointRegion;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointUserName(String sourceEndpointUserName) {
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }
        public String getSourceEndpointUserName() {
            return this.sourceEndpointUserName;
        }

    }

    public static class DescribeBackupPlanListResponseBodyItems extends TeaModel {
        @NameInMap("BackupPlanDetail")
        public java.util.List<DescribeBackupPlanListResponseBodyItemsBackupPlanDetail> backupPlanDetail;

        public static DescribeBackupPlanListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlanListResponseBodyItems self = new DescribeBackupPlanListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlanListResponseBodyItems setBackupPlanDetail(java.util.List<DescribeBackupPlanListResponseBodyItemsBackupPlanDetail> backupPlanDetail) {
            this.backupPlanDetail = backupPlanDetail;
            return this;
        }
        public java.util.List<DescribeBackupPlanListResponseBodyItemsBackupPlanDetail> getBackupPlanDetail() {
            return this.backupPlanDetail;
        }

    }

}
