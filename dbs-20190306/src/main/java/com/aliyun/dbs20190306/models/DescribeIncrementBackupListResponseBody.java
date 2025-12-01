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

    /**
     * <p>The details of incremental backup tasks.</p>
     */
    @NameInMap("Items")
    public DescribeIncrementBackupListResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A5D52069-E8AA-5056-8C5C-654C3610****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
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
     * <p>The total number of returned pages.</p>
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
        /**
         * <p>The point in time when the backup set expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1711506719000</p>
         */
        @NameInMap("BackupSetExpiredTime")
        public Long backupSetExpiredTime;

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-bin.00****</p>
         */
        @NameInMap("BackupSetId")
        public String backupSetId;

        /**
         * <p>The ID of the incremental backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>1hv5g9wk4****</p>
         */
        @NameInMap("BackupSetJobId")
        public String backupSetJobId;

        /**
         * <p>The size of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>18535</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The status of the incremental backup task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The incremental backup task is not started.</li>
         * <li><strong>FILLING</strong>: The incremental backup task is in progress.</li>
         * <li><strong>COMPLETED</strong>: The incremental backup task is complete.</li>
         * <li><strong>UNCOMPLETED</strong>: The incremental backup task is not complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FILLING</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The end time of the incremental backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>1648434713000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The endpoint that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>172.1XX.103.1:4XXX</p>
         */
        @NameInMap("SourceEndpointIpPort")
        public String sourceEndpointIpPort;

        /**
         * <p>The start time of the incremental backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>1648433764000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The storage class of the backup data. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: The storage class is Standard.</li>
         * <li><strong>IA</strong>: The storage class is Infrequent Access (IA).</li>
         * <li><strong>Archive</strong>: The storage class is Archive.</li>
         * <li><strong>UNKNOWN</strong>: The storage class is unknown. This value is returned because the task is not complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
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
