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
     * <p>Indicates whether the request succeeded.</p>
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
        @NameInMap("BackupGatewayId")
        public Long backupGatewayId;

        /**
         * <strong>example:</strong>
         * <p>TESTGATEWAY</p>
         */
        @NameInMap("BackupGatewayIdentifier")
        public String backupGatewayIdentifier;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupObjects")
        public String backupObjects;

        @NameInMap("BackupPeriod")
        public String backupPeriod;

        @NameInMap("BackupPlanCreateTime")
        public Long backupPlanCreateTime;

        @NameInMap("BackupPlanId")
        public String backupPlanId;

        @NameInMap("BackupPlanName")
        public String backupPlanName;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("BackupPlanRegion")
        public String backupPlanRegion;

        @NameInMap("BackupPlanStatus")
        public String backupPlanStatus;

        @NameInMap("BackupRetentionPeriod")
        public Integer backupRetentionPeriod;

        @NameInMap("BackupSetDownloadDir")
        public String backupSetDownloadDir;

        @NameInMap("BackupSetDownloadFullDataFormat")
        public String backupSetDownloadFullDataFormat;

        @NameInMap("BackupSetDownloadGatewayId")
        public Long backupSetDownloadGatewayId;

        @NameInMap("BackupSetDownloadIncrementDataFormat")
        public String backupSetDownloadIncrementDataFormat;

        @NameInMap("BackupSetDownloadTargetType")
        public String backupSetDownloadTargetType;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupStorageType")
        public String backupStorageType;

        @NameInMap("BeginTimestampForRestore")
        public Long beginTimestampForRestore;

        @NameInMap("CrossAliyunId")
        public String crossAliyunId;

        @NameInMap("CrossRoleName")
        public String crossRoleName;

        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("DuplicationArchivePeriod")
        public Integer duplicationArchivePeriod;

        @NameInMap("DuplicationInfrequentAccessPeriod")
        public Integer duplicationInfrequentAccessPeriod;

        @NameInMap("EnableBackupLog")
        public Boolean enableBackupLog;

        @NameInMap("EnableMysqlPhysicalBackupBinLog")
        public Boolean enableMysqlPhysicalBackupBinLog;

        @NameInMap("EndTimestampForRestore")
        public Long endTimestampForRestore;

        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("IncrementBackupRetentionPeriod")
        public String incrementBackupRetentionPeriod;

        /**
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("IncrementDuplicationArchivePeriod")
        public String incrementDuplicationArchivePeriod;

        /**
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("IncrementDuplicationInfrequentAccessPeriod")
        public String incrementDuplicationInfrequentAccessPeriod;

        /**
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <strong>example:</strong>
         * <p>1764051253000</p>
         */
        @NameInMap("InstanceExpiredTimestamp")
        public Long instanceExpiredTimestamp;

        /**
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("LogBackupRetentionPeriod")
        public String logBackupRetentionPeriod;

        /**
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("LogDuplicationArchivePeriod")
        public String logDuplicationArchivePeriod;

        /**
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("LogDuplicationInfrequentAccessPeriod")
        public String logDuplicationInfrequentAccessPeriod;

        @NameInMap("OSSBucketName")
        public String OSSBucketName;

        @NameInMap("OSSBucketRegion")
        public String OSSBucketRegion;

        @NameInMap("OpenBackupSetAutoDownload")
        public Boolean openBackupSetAutoDownload;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SourceEndpointDatabaseName")
        public String sourceEndpointDatabaseName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SourceEndpointEnableSsl")
        public String sourceEndpointEnableSsl;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SourceEndpointHost")
        public String sourceEndpointHost;

        @NameInMap("SourceEndpointInstanceID")
        public String sourceEndpointInstanceID;

        @NameInMap("SourceEndpointInstanceType")
        public String sourceEndpointInstanceType;

        @NameInMap("SourceEndpointIpPort")
        public String sourceEndpointIpPort;

        @NameInMap("SourceEndpointOracleSID")
        public String sourceEndpointOracleSID;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("SourceEndpointPort")
        public String sourceEndpointPort;

        @NameInMap("SourceEndpointRegion")
        public String sourceEndpointRegion;

        @NameInMap("SourceEndpointUserName")
        public String sourceEndpointUserName;

        /**
         * <strong>example:</strong>
         * <p>encrypted</p>
         */
        @NameInMap("StorageEncryptMethod")
        public String storageEncryptMethod;

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

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupGatewayIdentifier(String backupGatewayIdentifier) {
            this.backupGatewayIdentifier = backupGatewayIdentifier;
            return this;
        }
        public String getBackupGatewayIdentifier() {
            return this.backupGatewayIdentifier;
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

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanRegion(String backupPlanRegion) {
            this.backupPlanRegion = backupPlanRegion;
            return this;
        }
        public String getBackupPlanRegion() {
            return this.backupPlanRegion;
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

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setEnableMysqlPhysicalBackupBinLog(Boolean enableMysqlPhysicalBackupBinLog) {
            this.enableMysqlPhysicalBackupBinLog = enableMysqlPhysicalBackupBinLog;
            return this;
        }
        public Boolean getEnableMysqlPhysicalBackupBinLog() {
            return this.enableMysqlPhysicalBackupBinLog;
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

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setIncrementBackupRetentionPeriod(String incrementBackupRetentionPeriod) {
            this.incrementBackupRetentionPeriod = incrementBackupRetentionPeriod;
            return this;
        }
        public String getIncrementBackupRetentionPeriod() {
            return this.incrementBackupRetentionPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setIncrementDuplicationArchivePeriod(String incrementDuplicationArchivePeriod) {
            this.incrementDuplicationArchivePeriod = incrementDuplicationArchivePeriod;
            return this;
        }
        public String getIncrementDuplicationArchivePeriod() {
            return this.incrementDuplicationArchivePeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setIncrementDuplicationInfrequentAccessPeriod(String incrementDuplicationInfrequentAccessPeriod) {
            this.incrementDuplicationInfrequentAccessPeriod = incrementDuplicationInfrequentAccessPeriod;
            return this;
        }
        public String getIncrementDuplicationInfrequentAccessPeriod() {
            return this.incrementDuplicationInfrequentAccessPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setInstanceExpiredTimestamp(Long instanceExpiredTimestamp) {
            this.instanceExpiredTimestamp = instanceExpiredTimestamp;
            return this;
        }
        public Long getInstanceExpiredTimestamp() {
            return this.instanceExpiredTimestamp;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }
        public String getLogBackupRetentionPeriod() {
            return this.logBackupRetentionPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setLogDuplicationArchivePeriod(String logDuplicationArchivePeriod) {
            this.logDuplicationArchivePeriod = logDuplicationArchivePeriod;
            return this;
        }
        public String getLogDuplicationArchivePeriod() {
            return this.logDuplicationArchivePeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setLogDuplicationInfrequentAccessPeriod(String logDuplicationInfrequentAccessPeriod) {
            this.logDuplicationInfrequentAccessPeriod = logDuplicationInfrequentAccessPeriod;
            return this;
        }
        public String getLogDuplicationInfrequentAccessPeriod() {
            return this.logDuplicationInfrequentAccessPeriod;
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

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointEnableSsl(String sourceEndpointEnableSsl) {
            this.sourceEndpointEnableSsl = sourceEndpointEnableSsl;
            return this;
        }
        public String getSourceEndpointEnableSsl() {
            return this.sourceEndpointEnableSsl;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointHost(String sourceEndpointHost) {
            this.sourceEndpointHost = sourceEndpointHost;
            return this;
        }
        public String getSourceEndpointHost() {
            return this.sourceEndpointHost;
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

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointPort(String sourceEndpointPort) {
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }
        public String getSourceEndpointPort() {
            return this.sourceEndpointPort;
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

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setStorageEncryptMethod(String storageEncryptMethod) {
            this.storageEncryptMethod = storageEncryptMethod;
            return this;
        }
        public String getStorageEncryptMethod() {
            return this.storageEncryptMethod;
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
