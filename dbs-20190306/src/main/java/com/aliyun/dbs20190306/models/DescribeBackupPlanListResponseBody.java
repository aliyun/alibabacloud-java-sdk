// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanListResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("TotalElements")
    public Integer totalElements;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Items")
    public DescribeBackupPlanListResponseBodyItems items;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeBackupPlanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanListResponseBody self = new DescribeBackupPlanListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBackupPlanListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPlanListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupPlanListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public DescribeBackupPlanListResponseBody setItems(DescribeBackupPlanListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBackupPlanListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBackupPlanListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupPlanListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupPlanListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public static class DescribeBackupPlanListResponseBodyItemsBackupPlanDetail extends TeaModel {
        @NameInMap("CrossRoleName")
        public String crossRoleName;

        @NameInMap("SourceEndpointInstanceType")
        public String sourceEndpointInstanceType;

        @NameInMap("BackupSetDownloadDir")
        public String backupSetDownloadDir;

        @NameInMap("SourceEndpointIpPort")
        public String sourceEndpointIpPort;

        @NameInMap("CrossAliyunId")
        public String crossAliyunId;

        @NameInMap("DuplicationArchivePeriod")
        public Integer duplicationArchivePeriod;

        @NameInMap("BackupPlanId")
        public String backupPlanId;

        @NameInMap("EndTimestampForRestore")
        public Long endTimestampForRestore;

        @NameInMap("BackupPlanStatus")
        public String backupPlanStatus;

        @NameInMap("BackupSetDownloadFullDataFormat")
        public String backupSetDownloadFullDataFormat;

        @NameInMap("BackupRetentionPeriod")
        public Integer backupRetentionPeriod;

        @NameInMap("OSSBucketRegion")
        public String OSSBucketRegion;

        @NameInMap("SourceEndpointOracleSID")
        public String sourceEndpointOracleSID;

        @NameInMap("BackupStorageType")
        public String backupStorageType;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("SourceEndpointRegion")
        public String sourceEndpointRegion;

        @NameInMap("SourceEndpointDatabaseName")
        public String sourceEndpointDatabaseName;

        @NameInMap("BackupPeriod")
        public String backupPeriod;

        @NameInMap("BackupSetDownloadGatewayId")
        public Long backupSetDownloadGatewayId;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("BackupPlanCreateTime")
        public Long backupPlanCreateTime;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("DuplicationInfrequentAccessPeriod")
        public Integer duplicationInfrequentAccessPeriod;

        @NameInMap("BackupSetDownloadTargetType")
        public String backupSetDownloadTargetType;

        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("BackupObjects")
        public String backupObjects;

        @NameInMap("BeginTimestampForRestore")
        public Long beginTimestampForRestore;

        @NameInMap("SourceEndpointInstanceID")
        public String sourceEndpointInstanceID;

        @NameInMap("OpenBackupSetAutoDownload")
        public Boolean openBackupSetAutoDownload;

        @NameInMap("BackupPlanName")
        public String backupPlanName;

        @NameInMap("OSSBucketName")
        public String OSSBucketName;

        @NameInMap("BackupGatewayId")
        public Long backupGatewayId;

        @NameInMap("SourceEndpointUserName")
        public String sourceEndpointUserName;

        @NameInMap("BackupSetDownloadIncrementDataFormat")
        public String backupSetDownloadIncrementDataFormat;

        @NameInMap("EnableBackupLog")
        public Boolean enableBackupLog;

        public static DescribeBackupPlanListResponseBodyItemsBackupPlanDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPlanListResponseBodyItemsBackupPlanDetail self = new DescribeBackupPlanListResponseBodyItemsBackupPlanDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setCrossRoleName(String crossRoleName) {
            this.crossRoleName = crossRoleName;
            return this;
        }
        public String getCrossRoleName() {
            return this.crossRoleName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }
        public String getSourceEndpointInstanceType() {
            return this.sourceEndpointInstanceType;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadDir(String backupSetDownloadDir) {
            this.backupSetDownloadDir = backupSetDownloadDir;
            return this;
        }
        public String getBackupSetDownloadDir() {
            return this.backupSetDownloadDir;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointIpPort(String sourceEndpointIpPort) {
            this.sourceEndpointIpPort = sourceEndpointIpPort;
            return this;
        }
        public String getSourceEndpointIpPort() {
            return this.sourceEndpointIpPort;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setCrossAliyunId(String crossAliyunId) {
            this.crossAliyunId = crossAliyunId;
            return this;
        }
        public String getCrossAliyunId() {
            return this.crossAliyunId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
            this.duplicationArchivePeriod = duplicationArchivePeriod;
            return this;
        }
        public Integer getDuplicationArchivePeriod() {
            return this.duplicationArchivePeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setEndTimestampForRestore(Long endTimestampForRestore) {
            this.endTimestampForRestore = endTimestampForRestore;
            return this;
        }
        public Long getEndTimestampForRestore() {
            return this.endTimestampForRestore;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanStatus(String backupPlanStatus) {
            this.backupPlanStatus = backupPlanStatus;
            return this;
        }
        public String getBackupPlanStatus() {
            return this.backupPlanStatus;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadFullDataFormat(String backupSetDownloadFullDataFormat) {
            this.backupSetDownloadFullDataFormat = backupSetDownloadFullDataFormat;
            return this;
        }
        public String getBackupSetDownloadFullDataFormat() {
            return this.backupSetDownloadFullDataFormat;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }
        public Integer getBackupRetentionPeriod() {
            return this.backupRetentionPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setOSSBucketRegion(String OSSBucketRegion) {
            this.OSSBucketRegion = OSSBucketRegion;
            return this;
        }
        public String getOSSBucketRegion() {
            return this.OSSBucketRegion;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }
        public String getSourceEndpointOracleSID() {
            return this.sourceEndpointOracleSID;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupStorageType(String backupStorageType) {
            this.backupStorageType = backupStorageType;
            return this;
        }
        public String getBackupStorageType() {
            return this.backupStorageType;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointRegion(String sourceEndpointRegion) {
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }
        public String getSourceEndpointRegion() {
            return this.sourceEndpointRegion;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }
        public String getSourceEndpointDatabaseName() {
            return this.sourceEndpointDatabaseName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPeriod(String backupPeriod) {
            this.backupPeriod = backupPeriod;
            return this;
        }
        public String getBackupPeriod() {
            return this.backupPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadGatewayId(Long backupSetDownloadGatewayId) {
            this.backupSetDownloadGatewayId = backupSetDownloadGatewayId;
            return this;
        }
        public Long getBackupSetDownloadGatewayId() {
            return this.backupSetDownloadGatewayId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanCreateTime(Long backupPlanCreateTime) {
            this.backupPlanCreateTime = backupPlanCreateTime;
            return this;
        }
        public Long getBackupPlanCreateTime() {
            return this.backupPlanCreateTime;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
            this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
            return this;
        }
        public Integer getDuplicationInfrequentAccessPeriod() {
            return this.duplicationInfrequentAccessPeriod;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadTargetType(String backupSetDownloadTargetType) {
            this.backupSetDownloadTargetType = backupSetDownloadTargetType;
            return this;
        }
        public String getBackupSetDownloadTargetType() {
            return this.backupSetDownloadTargetType;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupObjects(String backupObjects) {
            this.backupObjects = backupObjects;
            return this;
        }
        public String getBackupObjects() {
            return this.backupObjects;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBeginTimestampForRestore(Long beginTimestampForRestore) {
            this.beginTimestampForRestore = beginTimestampForRestore;
            return this;
        }
        public Long getBeginTimestampForRestore() {
            return this.beginTimestampForRestore;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }
        public String getSourceEndpointInstanceID() {
            return this.sourceEndpointInstanceID;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setOpenBackupSetAutoDownload(Boolean openBackupSetAutoDownload) {
            this.openBackupSetAutoDownload = openBackupSetAutoDownload;
            return this;
        }
        public Boolean getOpenBackupSetAutoDownload() {
            return this.openBackupSetAutoDownload;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupPlanName(String backupPlanName) {
            this.backupPlanName = backupPlanName;
            return this;
        }
        public String getBackupPlanName() {
            return this.backupPlanName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setOSSBucketName(String OSSBucketName) {
            this.OSSBucketName = OSSBucketName;
            return this;
        }
        public String getOSSBucketName() {
            return this.OSSBucketName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupGatewayId(Long backupGatewayId) {
            this.backupGatewayId = backupGatewayId;
            return this;
        }
        public Long getBackupGatewayId() {
            return this.backupGatewayId;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setSourceEndpointUserName(String sourceEndpointUserName) {
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }
        public String getSourceEndpointUserName() {
            return this.sourceEndpointUserName;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setBackupSetDownloadIncrementDataFormat(String backupSetDownloadIncrementDataFormat) {
            this.backupSetDownloadIncrementDataFormat = backupSetDownloadIncrementDataFormat;
            return this;
        }
        public String getBackupSetDownloadIncrementDataFormat() {
            return this.backupSetDownloadIncrementDataFormat;
        }

        public DescribeBackupPlanListResponseBodyItemsBackupPlanDetail setEnableBackupLog(Boolean enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }
        public Boolean getEnableBackupLog() {
            return this.enableBackupLog;
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
