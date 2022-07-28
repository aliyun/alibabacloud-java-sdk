// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeIncrementBackupListResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public DescribeIncrementBackupListResponseBodyItems items;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalElements")
    public Integer totalElements;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeIncrementBackupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIncrementBackupListResponseBody self = new DescribeIncrementBackupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIncrementBackupListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeIncrementBackupListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeIncrementBackupListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeIncrementBackupListResponseBody setItems(DescribeIncrementBackupListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeIncrementBackupListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeIncrementBackupListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeIncrementBackupListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIncrementBackupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIncrementBackupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeIncrementBackupListResponseBody setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Integer getTotalElements() {
        return this.totalElements;
    }

    public DescribeIncrementBackupListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile extends TeaModel {
        @NameInMap("BackupSetExpiredTime")
        public Long backupSetExpiredTime;

        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("BackupSetJobId")
        public String backupSetJobId;

        @NameInMap("BackupSize")
        public Long backupSize;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("SourceEndpointIpPort")
        public String sourceEndpointIpPort;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StorageMethod")
        public String storageMethod;

        public static DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile self = new DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile();
            return TeaModel.build(map, self);
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setBackupSetExpiredTime(Long backupSetExpiredTime) {
            this.backupSetExpiredTime = backupSetExpiredTime;
            return this;
        }
        public Long getBackupSetExpiredTime() {
            return this.backupSetExpiredTime;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setBackupSetJobId(String backupSetJobId) {
            this.backupSetJobId = backupSetJobId;
            return this;
        }
        public String getBackupSetJobId() {
            return this.backupSetJobId;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setSourceEndpointIpPort(String sourceEndpointIpPort) {
            this.sourceEndpointIpPort = sourceEndpointIpPort;
            return this;
        }
        public String getSourceEndpointIpPort() {
            return this.sourceEndpointIpPort;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setStorageMethod(String storageMethod) {
            this.storageMethod = storageMethod;
            return this;
        }
        public String getStorageMethod() {
            return this.storageMethod;
        }

    }

    public static class DescribeIncrementBackupListResponseBodyItems extends TeaModel {
        @NameInMap("IncrementBackupFile")
        public java.util.List<DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile> incrementBackupFile;

        public static DescribeIncrementBackupListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeIncrementBackupListResponseBodyItems self = new DescribeIncrementBackupListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeIncrementBackupListResponseBodyItems setIncrementBackupFile(java.util.List<DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile> incrementBackupFile) {
            this.incrementBackupFile = incrementBackupFile;
            return this;
        }
        public java.util.List<DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile> getIncrementBackupFile() {
            return this.incrementBackupFile;
        }

    }

}
