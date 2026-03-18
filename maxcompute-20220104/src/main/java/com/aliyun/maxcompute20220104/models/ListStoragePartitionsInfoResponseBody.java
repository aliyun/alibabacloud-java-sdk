// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListStoragePartitionsInfoResponseBody extends TeaModel {
    @NameInMap("data")
    public ListStoragePartitionsInfoResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

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
        @NameInMap("fileCount")
        public Long fileCount;

        @NameInMap("fileSize")
        public Double fileSize;

        @NameInMap("fileSizeUnit")
        public String fileSizeUnit;

        @NameInMap("isPartitioned")
        public Boolean isPartitioned;

        @NameInMap("lastAccessTime")
        public Long lastAccessTime;

        @NameInMap("partition")
        public String partition;

        @NameInMap("projectName")
        public String projectName;

        @NameInMap("rate")
        public Double rate;

        @NameInMap("schemaName")
        public String schemaName;

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
        @NameInMap("date")
        public String date;

        @NameInMap("pageNumber")
        public Long pageNumber;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("storagePartitionInfoList")
        public java.util.List<ListStoragePartitionsInfoResponseBodyDataStoragePartitionInfoList> storagePartitionInfoList;

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
