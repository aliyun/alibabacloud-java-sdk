// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStorageTablesInfoResponseBody extends TeaModel {
    @NameInMap("data")
    public ListStorageTablesInfoResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

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
        @NameInMap("date")
        public String date;

        @NameInMap("isPartitioned")
        public Boolean isPartitioned;

        @NameInMap("lastAccessTime")
        public Long lastAccessTime;

        @NameInMap("longTermStorage")
        public Double longTermStorage;

        @NameInMap("longTermStorageFileCount")
        public Long longTermStorageFileCount;

        @NameInMap("longTermStorageUnit")
        public String longTermStorageUnit;

        @NameInMap("lowFreqStorage")
        public Double lowFreqStorage;

        @NameInMap("lowFreqStorageFileCount")
        public Long lowFreqStorageFileCount;

        @NameInMap("lowFreqStorageUnit")
        public String lowFreqStorageUnit;

        @NameInMap("projectName")
        public String projectName;

        @NameInMap("rate")
        public Double rate;

        @NameInMap("schemaName")
        public String schemaName;

        @NameInMap("standardStorage")
        public Double standardStorage;

        @NameInMap("standardStorageFileCount")
        public Long standardStorageFileCount;

        @NameInMap("standardStorageUnit")
        public String standardStorageUnit;

        @NameInMap("storageType")
        public String storageType;

        @NameInMap("tableName")
        public String tableName;

        @NameInMap("totalFrequency")
        public Long totalFrequency;

        @NameInMap("totalInputAmount")
        public Double totalInputAmount;

        @NameInMap("totalInputAmountUnit")
        public String totalInputAmountUnit;

        @NameInMap("totalStorage")
        public Double totalStorage;

        @NameInMap("totalStorageFileCount")
        public Long totalStorageFileCount;

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
        @NameInMap("date")
        public String date;

        @NameInMap("pageNumber")
        public Long pageNumber;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("storageTableInfoList")
        public java.util.List<ListStorageTablesInfoResponseBodyDataStorageTableInfoList> storageTableInfoList;

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
