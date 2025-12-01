// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeFullBackupListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public DescribeFullBackupListResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>636BC118-6080-4119-A6B5-C199CEC1037D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalElements")
    public Integer totalElements;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeFullBackupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullBackupListResponseBody self = new DescribeFullBackupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFullBackupListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeFullBackupListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeFullBackupListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeFullBackupListResponseBody setItems(DescribeFullBackupListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeFullBackupListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeFullBackupListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeFullBackupListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFullBackupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFullBackupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public static class DescribeFullBackupListResponseBodyItemsFullBackupFile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{\&quot;DBName\&quot;:\&quot;test\&quot;}]</p>
         */
        @NameInMap("BackupObjects")
        public String backupObjects;

        @NameInMap("BackupSetExpiredTime")
        public Long backupSetExpiredTime;

        @NameInMap("BackupSetId")
        public String backupSetId;

        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("SourceEndpointIpPort")
        public String sourceEndpointIpPort;

        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("StorageMethod")
        public String storageMethod;

        public static DescribeFullBackupListResponseBodyItemsFullBackupFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeFullBackupListResponseBodyItemsFullBackupFile self = new DescribeFullBackupListResponseBodyItemsFullBackupFile();
            return TeaModel.build(map, self);
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setBackupObjects(String backupObjects) {
            this.backupObjects = backupObjects;
            return this;
        }
        public String getBackupObjects() {
            return this.backupObjects;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setBackupSetExpiredTime(Long backupSetExpiredTime) {
            this.backupSetExpiredTime = backupSetExpiredTime;
            return this;
        }
        public Long getBackupSetExpiredTime() {
            return this.backupSetExpiredTime;
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

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeFullBackupListResponseBodyItemsFullBackupFile setSourceEndpointIpPort(String sourceEndpointIpPort) {
            this.sourceEndpointIpPort = sourceEndpointIpPort;
            return this;
        }
        public String getSourceEndpointIpPort() {
            return this.sourceEndpointIpPort;
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
