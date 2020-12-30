// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeFullBackupListResponseBody extends TeaModel {
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
    public DescribeFullBackupListResponseBodyItems items;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeFullBackupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullBackupListResponseBody self = new DescribeFullBackupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFullBackupListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeFullBackupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFullBackupListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFullBackupListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeFullBackupListResponseBody setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Integer getTotalElements() {
        return this.totalElements;
    }

    public DescribeFullBackupListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeFullBackupListResponseBody setItems(DescribeFullBackupListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeFullBackupListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeFullBackupListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeFullBackupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFullBackupListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public static class DescribeFullBackupListResponseBodyItemsFullBackupFile extends TeaModel {
        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("SourceEndpointIpPort")
        public String sourceEndpointIpPort;

        @NameInMap("BackupObjects")
        public String backupObjects;

        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("BackupSetExpiredTime")
        public Long backupSetExpiredTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StorageMethod")
        public String storageMethod;

        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("BackupSize")
        public Long backupSize;

        public static DescribeFullBackupListResponseBodyItemsFullBackupFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeFullBackupListResponseBodyItemsFullBackupFile self = new DescribeFullBackupListResponseBodyItemsFullBackupFile();
            return TeaModel.build(map, self);
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setSourceEndpointIpPort(String sourceEndpointIpPort) {
            this.sourceEndpointIpPort = sourceEndpointIpPort;
            return this;
        }
        public String getSourceEndpointIpPort() {
            return this.sourceEndpointIpPort;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setBackupObjects(String backupObjects) {
            this.backupObjects = backupObjects;
            return this;
        }
        public String getBackupObjects() {
            return this.backupObjects;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setBackupSetExpiredTime(Long backupSetExpiredTime) {
            this.backupSetExpiredTime = backupSetExpiredTime;
            return this;
        }
        public Long getBackupSetExpiredTime() {
            return this.backupSetExpiredTime;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setStorageMethod(String storageMethod) {
            this.storageMethod = storageMethod;
            return this;
        }
        public String getStorageMethod() {
            return this.storageMethod;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

    }

    public static class DescribeFullBackupListResponseBodyItems extends TeaModel {
        @NameInMap("FullBackupFile")
        public java.util.List<DescribeFullBackupListResponseBodyItemsFullBackupFile> fullBackupFile;

        public static DescribeFullBackupListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFullBackupListResponseBodyItems self = new DescribeFullBackupListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeFullBackupListResponseBodyItems setFullBackupFile(java.util.List<DescribeFullBackupListResponseBodyItemsFullBackupFile> fullBackupFile) {
            this.fullBackupFile = fullBackupFile;
            return this;
        }
        public java.util.List<DescribeFullBackupListResponseBodyItemsFullBackupFile> getFullBackupFile() {
            return this.fullBackupFile;
        }

    }

}
