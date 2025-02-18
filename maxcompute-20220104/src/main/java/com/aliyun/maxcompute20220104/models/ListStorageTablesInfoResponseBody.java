// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageTablesInfoResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListStorageTablesInfoResponseBodyData data;

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
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters and syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
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
     * <p>0bc12e6a16679892465424670db3eb</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListStorageTablesInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStorageTablesInfoResponseBody self = new ListStorageTablesInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStorageTablesInfoResponseBody setData(ListStorageTablesInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListStorageTablesInfoResponseBodyData getData() {
        return this.data;
    }

    public ListStorageTablesInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListStorageTablesInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListStorageTablesInfoResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListStorageTablesInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListStorageTablesInfoResponseBodyDataStorageTableInfoList extends TeaModel {
        /**
         * <p>The date on which the statistics are collected. This value is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>Indicates whether the table is a partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isPartitioned")
        public Boolean isPartitioned;

        /**
         * <p>The time when the table was last accessed. This value is returned when the table is a non-partitioned table.</p>
         * <blockquote>
         * <p> The data collection method is upgraded from July 2023. If the data is not accessed after the upgrade or is accessed by using ALGO jobs or the direct read method of Hologres, the last access time cannot be collected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694589365</p>
         */
        @NameInMap("lastAccessTime")
        public Long lastAccessTime;

        /**
         * <p>The storage usage at the long-term storage tier.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("longTermStorage")
        public Double longTermStorage;

        /**
         * <p>The number of long-term storage files.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("longTermStorageFileCount")
        public Long longTermStorageFileCount;

        /**
         * <p>The unit of the storage usage at the long-term storage tier.</p>
         * 
         * <strong>example:</strong>
         * <p>B</p>
         */
        @NameInMap("longTermStorageUnit")
        public String longTermStorageUnit;

        /**
         * <p>The storage usage at the low-frequency tier.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lowFreqStorage")
        public Double lowFreqStorage;

        /**
         * <p>The number of low-frequency storage files.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lowFreqStorageFileCount")
        public Long lowFreqStorageFileCount;

        /**
         * <p>The unit of the storage usage at the low-frequency storage tier.</p>
         * 
         * <strong>example:</strong>
         * <p>B</p>
         */
        @NameInMap("lowFreqStorageUnit")
        public String lowFreqStorageUnit;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>The change rate of the total storage usage compared with that of the recent {$recentDays} days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The storage usage at the standard storage tier.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("standardStorage")
        public Double standardStorage;

        /**
         * <p>The number of standard storage files.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("standardStorageFileCount")
        public Long standardStorageFileCount;

        /**
         * <p>The unit of the storage usage at the standard storage tier.</p>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("standardStorageUnit")
        public String standardStorageUnit;

        /**
         * <p>The table storage type.</p>
         * <ul>
         * <li>standard</li>
         * <li>lowfrequency</li>
         * <li>longterm</li>
         * <li>unknown: This value is returned when the table is a partitioned table. You can call the ListStoragePartitionsInfo operation to query the storage type of each partition.</li>
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
         * </blockquote>
         * <ul>
         * <li><p>Access behaviors include:</p>
         * </li>
         * <li><p>The table is used as the input table of an SQL task.</p>
         * </li>
         * <li><p>The table is downloaded by Tunnel.</p>
         * </li>
         * <li><p>The table is read by calling the Storage API. The partition granularity of the partitioned table is not available. Each time an access operation is performed, the access frequency is incremented by 1.</p>
         * </li>
         * <li><p>The data collection method is upgraded from July 2023. If the data is not accessed after the upgrade or is accessed by using ALGO jobs or the direct read method of Hologres, the access frequency cannot be collected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalFrequency")
        public Long totalFrequency;

        /**
         * <p>The total amount of accessed data.</p>
         * <blockquote>
         * <p> The amount of data that is read by all access behaviors.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalInputAmount")
        public Double totalInputAmount;

        /**
         * <p>The unit of the total amount of accessed data.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("totalInputAmountUnit")
        public String totalInputAmountUnit;

        /**
         * <p>The total storage usage. For a partitioned table, this parameter indicates the sum of the storage usage of all partitions. If the storage types of partitions are different, the value is the sum of the storage usage of each storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("totalStorage")
        public Double totalStorage;

        /**
         * <p>The total number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalStorageFileCount")
        public Long totalStorageFileCount;

        /**
         * <p>The unit of storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("totalStorageUnit")
        public String totalStorageUnit;

        public static ListStorageTablesInfoResponseBodyDataStorageTableInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListStorageTablesInfoResponseBodyDataStorageTableInfoList self = new ListStorageTablesInfoResponseBodyDataStorageTableInfoList();
            return TeaModel.build(map, self);
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setIsPartitioned(Boolean isPartitioned) {
            this.isPartitioned = isPartitioned;
            return this;
        }
        public Boolean getIsPartitioned() {
            return this.isPartitioned;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setLongTermStorage(Double longTermStorage) {
            this.longTermStorage = longTermStorage;
            return this;
        }
        public Double getLongTermStorage() {
            return this.longTermStorage;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setLongTermStorageFileCount(Long longTermStorageFileCount) {
            this.longTermStorageFileCount = longTermStorageFileCount;
            return this;
        }
        public Long getLongTermStorageFileCount() {
            return this.longTermStorageFileCount;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setLongTermStorageUnit(String longTermStorageUnit) {
            this.longTermStorageUnit = longTermStorageUnit;
            return this;
        }
        public String getLongTermStorageUnit() {
            return this.longTermStorageUnit;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setLowFreqStorage(Double lowFreqStorage) {
            this.lowFreqStorage = lowFreqStorage;
            return this;
        }
        public Double getLowFreqStorage() {
            return this.lowFreqStorage;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setLowFreqStorageFileCount(Long lowFreqStorageFileCount) {
            this.lowFreqStorageFileCount = lowFreqStorageFileCount;
            return this;
        }
        public Long getLowFreqStorageFileCount() {
            return this.lowFreqStorageFileCount;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setLowFreqStorageUnit(String lowFreqStorageUnit) {
            this.lowFreqStorageUnit = lowFreqStorageUnit;
            return this;
        }
        public String getLowFreqStorageUnit() {
            return this.lowFreqStorageUnit;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setStandardStorage(Double standardStorage) {
            this.standardStorage = standardStorage;
            return this;
        }
        public Double getStandardStorage() {
            return this.standardStorage;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setStandardStorageFileCount(Long standardStorageFileCount) {
            this.standardStorageFileCount = standardStorageFileCount;
            return this;
        }
        public Long getStandardStorageFileCount() {
            return this.standardStorageFileCount;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setStandardStorageUnit(String standardStorageUnit) {
            this.standardStorageUnit = standardStorageUnit;
            return this;
        }
        public String getStandardStorageUnit() {
            return this.standardStorageUnit;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setTotalFrequency(Long totalFrequency) {
            this.totalFrequency = totalFrequency;
            return this;
        }
        public Long getTotalFrequency() {
            return this.totalFrequency;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setTotalInputAmount(Double totalInputAmount) {
            this.totalInputAmount = totalInputAmount;
            return this;
        }
        public Double getTotalInputAmount() {
            return this.totalInputAmount;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setTotalInputAmountUnit(String totalInputAmountUnit) {
            this.totalInputAmountUnit = totalInputAmountUnit;
            return this;
        }
        public String getTotalInputAmountUnit() {
            return this.totalInputAmountUnit;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setTotalStorage(Double totalStorage) {
            this.totalStorage = totalStorage;
            return this;
        }
        public Double getTotalStorage() {
            return this.totalStorage;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setTotalStorageFileCount(Long totalStorageFileCount) {
            this.totalStorageFileCount = totalStorageFileCount;
            return this;
        }
        public Long getTotalStorageFileCount() {
            return this.totalStorageFileCount;
        }

        public ListStorageTablesInfoResponseBodyDataStorageTableInfoList setTotalStorageUnit(String totalStorageUnit) {
            this.totalStorageUnit = totalStorageUnit;
            return this;
        }
        public String getTotalStorageUnit() {
            return this.totalStorageUnit;
        }

    }

    public static class ListStorageTablesInfoResponseBodyData extends TeaModel {
        /**
         * <p>The date on which the statistics are collected.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        @NameInMap("date")
        public String date;

        /**
         * <p>The page number.</p>
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
         * <p>The table storage information.</p>
         */
        @NameInMap("storageTableInfoList")
        public java.util.List<ListStorageTablesInfoResponseBodyDataStorageTableInfoList> storageTableInfoList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListStorageTablesInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStorageTablesInfoResponseBodyData self = new ListStorageTablesInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStorageTablesInfoResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListStorageTablesInfoResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListStorageTablesInfoResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListStorageTablesInfoResponseBodyData setStorageTableInfoList(java.util.List<ListStorageTablesInfoResponseBodyDataStorageTableInfoList> storageTableInfoList) {
            this.storageTableInfoList = storageTableInfoList;
            return this;
        }
        public java.util.List<ListStorageTablesInfoResponseBodyDataStorageTableInfoList> getStorageTableInfoList() {
            return this.storageTableInfoList;
        }

        public ListStorageTablesInfoResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
