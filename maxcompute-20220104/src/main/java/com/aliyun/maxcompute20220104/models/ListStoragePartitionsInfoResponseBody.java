// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStoragePartitionsInfoResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListStoragePartitionsInfoResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p>1xx: Informational response - The request has been received and is being processed.</p>
     * </li>
     * <li><p>2xx: Success - The request was successfully received, understood, and accepted.</p>
     * </li>
     * <li><p>3xx: Redirection - Further action must be taken to complete the request.</p>
     * </li>
     * <li><p>4xx: Client error - The request contains invalid parameters or syntax, or cannot be fulfilled.</p>
     * </li>
     * <li><p>5xx: Server error - The server failed to fulfill a valid request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0be3e0bd16661643917136451ebf55</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListStoragePartitionsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStoragePartitionsInfoResponseBody self = new ListStoragePartitionsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStoragePartitionsInfoResponseBody setData(ListStoragePartitionsInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListStoragePartitionsInfoResponseBodyData getData() {
        return this.data;
    }

    public ListStoragePartitionsInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListStoragePartitionsInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListStoragePartitionsInfoResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListStoragePartitionsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList extends TeaModel {
        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("fileCount")
        public Long fileCount;

        /**
         * <p>The storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fileSize")
        public Double fileSize;

        /**
         * <p>The unit of the storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("fileSizeUnit")
        public String fileSizeUnit;

        /**
         * <p>Indicates whether the table is a partitioned table. You can ignore this parameter because this operation returns data only for partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isPartitioned")
        public Boolean isPartitioned;

        /**
         * <p>The last access time of the partition.</p>
         * <blockquote>
         * <p>Data collection for this metric began a gradual rollout in July 2023. Consequently, the lastAccessTime may not be recorded for a partition that has not been accessed since then or is accessed only by ALGO jobs or direct reads from Hologres.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694589365</p>
         */
        @NameInMap("lastAccessTime")
        public Long lastAccessTime;

        /**
         * <p>The partition name.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20241201</p>
         */
        @NameInMap("partition")
        public String partition;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The period-over-period change in the total storage usage over the last {$recentDays} days. This API operation does not return this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1%</p>
         */
        @NameInMap("rate")
        public Double rate;

        /**
         * <p>The schema name.</p>
         * 
         * <strong>example:</strong>
         * <p>schema</p>
         */
        @NameInMap("schemaName")
        public String schemaName;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><p><code>standard</code>: Standard storage</p>
         * </li>
         * <li><p><code>lowfrequency</code>: Infrequent-access storage</p>
         * </li>
         * <li><p><code>longterm</code>: Archive storage</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("storageType")
        public String storageType;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>bank_data</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>The access frequency.</p>
         * <blockquote>
         * <ul>
         * <li>Access activities include:</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>The table is used as input in a SQL compute task.</p>
         * </li>
         * <li><p>The table is downloaded via Tunnel.</p>
         * </li>
         * <li><p>The table data is read by calling the <code>Read</code> operation of the StorageAPI. Partition-level data for partitioned tables is not available. Each access activity increases the access frequency by 1.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Data collection for this metric began a gradual rollout in July 2023. Consequently, the access frequency may not be recorded for tables that have not been accessed since then or are accessed only by ALGO jobs or direct reads from Hologres.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalFrequency")
        public Long totalFrequency;

        /**
         * <p>The total data accessed.</p>
         * <blockquote>
         * <p>The cumulative amount of data read from all access operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalInputAmount")
        public Double totalInputAmount;

        /**
         * <p>The unit of the total data accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("totalInputAmountUnit")
        public String totalInputAmountUnit;

        /**
         * <p>The type of the object. The value is always PARTITION.</p>
         * 
         * <strong>example:</strong>
         * <p>PARTITION</p>
         */
        @NameInMap("type")
        public String type;

        public static ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList self = new ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList();
            return TeaModel.build(map, self);
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setFileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Long getFileCount() {
            return this.fileCount;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setFileSize(Double fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Double getFileSize() {
            return this.fileSize;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setFileSizeUnit(String fileSizeUnit) {
            this.fileSizeUnit = fileSizeUnit;
            return this;
        }
        public String getFileSizeUnit() {
            return this.fileSizeUnit;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setIsPartitioned(Boolean isPartitioned) {
            this.isPartitioned = isPartitioned;
            return this;
        }
        public Boolean getIsPartitioned() {
            return this.isPartitioned;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setTotalFrequency(Long totalFrequency) {
            this.totalFrequency = totalFrequency;
            return this;
        }
        public Long getTotalFrequency() {
            return this.totalFrequency;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setTotalInputAmount(Double totalInputAmount) {
            this.totalInputAmount = totalInputAmount;
            return this;
        }
        public Double getTotalInputAmount() {
            return this.totalInputAmount;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setTotalInputAmountUnit(String totalInputAmountUnit) {
            this.totalInputAmountUnit = totalInputAmountUnit;
            return this;
        }
        public String getTotalInputAmountUnit() {
            return this.totalInputAmountUnit;
        }

        public ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListStoragePartitionsInfoResponseBodyData extends TeaModel {
        /**
         * <p>The date to which the statistics apply.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The page number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The storage information for the partitions.</p>
         */
        @NameInMap("storagePartitionInfoList")
        public java.util.List<ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList> storagePartitionInfoList;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListStoragePartitionsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStoragePartitionsInfoResponseBodyData self = new ListStoragePartitionsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStoragePartitionsInfoResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListStoragePartitionsInfoResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListStoragePartitionsInfoResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListStoragePartitionsInfoResponseBodyData setStoragePartitionInfoList(java.util.List<ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList> storagePartitionInfoList) {
            this.storagePartitionInfoList = storagePartitionInfoList;
            return this;
        }
        public java.util.List<ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList> getStoragePartitionInfoList() {
            return this.storagePartitionInfoList;
        }

        public ListStoragePartitionsInfoResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
