// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBackupDataListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeBackupDataListResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DumpId")
        public Long dumpId;

        @NameInMap("DumpSize")
        public Long dumpSize;

        @NameInMap("ExpectExpireTime")
        public String expectExpireTime;

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
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        @NameInMap("BackupLocation")
        public String backupLocation;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("BackupName")
        public String backupName;

        @NameInMap("BackupScale")
        public String backupScale;

        @NameInMap("BackupSize")
        public Long backupSize;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("Checksum")
        public String checksum;

        @NameInMap("ConsistentTime")
        public Long consistentTime;

        @NameInMap("Encryption")
        public String encryption;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpectExpireTime")
        public String expectExpireTime;

        @NameInMap("ExpectExpireType")
        public String expectExpireType;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IsAvail")
        public Integer isAvail;

        @NameInMap("PolarSnapshot")
        public DescribeBackupDataListResponseBodyDataContentPolarSnapshot polarSnapshot;

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
        @NameInMap("Content")
        public java.util.List<DescribeBackupDataListResponseBodyDataContent> content;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalElements")
        public Long totalElements;

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
