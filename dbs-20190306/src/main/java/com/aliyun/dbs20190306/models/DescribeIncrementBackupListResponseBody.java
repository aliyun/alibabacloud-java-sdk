// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeIncrementBackupListResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Param.NotFound</p>
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
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public DescribeIncrementBackupListResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5D52069-E8AA-5056-8C5C-654C3610****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of incremental backup tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalElements")
    public Integer totalElements;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SourceEndpointHost")
        public String sourceEndpointHost;

        /**
         * <strong>example:</strong>
         * <p>rm-testxx</p>
         */
        @NameInMap("SourceEndpointInstanceId")
        public String sourceEndpointInstanceId;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("SourceEndpointInstanceType")
        public String sourceEndpointInstanceType;

        @NameInMap("SourceEndpointIpPort")
        public String sourceEndpointIpPort;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("SourceEndpointPort")
        public String sourceEndpointPort;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceEndpointRegion")
        public String sourceEndpointRegion;

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

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setSourceEndpointHost(String sourceEndpointHost) {
            this.sourceEndpointHost = sourceEndpointHost;
            return this;
        }
        public String getSourceEndpointHost() {
            return this.sourceEndpointHost;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setSourceEndpointInstanceId(String sourceEndpointInstanceId) {
            this.sourceEndpointInstanceId = sourceEndpointInstanceId;
            return this;
        }
        public String getSourceEndpointInstanceId() {
            return this.sourceEndpointInstanceId;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }
        public String getSourceEndpointInstanceType() {
            return this.sourceEndpointInstanceType;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setSourceEndpointIpPort(String sourceEndpointIpPort) {
            this.sourceEndpointIpPort = sourceEndpointIpPort;
            return this;
        }
        public String getSourceEndpointIpPort() {
            return this.sourceEndpointIpPort;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setSourceEndpointPort(String sourceEndpointPort) {
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }
        public String getSourceEndpointPort() {
            return this.sourceEndpointPort;
        }

        public DescribeIncrementBackupListResponseBodyItemsIncrementBackupFile setSourceEndpointRegion(String sourceEndpointRegion) {
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }
        public String getSourceEndpointRegion() {
            return this.sourceEndpointRegion;
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
