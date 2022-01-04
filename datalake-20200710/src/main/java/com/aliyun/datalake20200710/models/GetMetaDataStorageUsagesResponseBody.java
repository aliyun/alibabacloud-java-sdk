// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetaDataStorageUsagesResponseBody extends TeaModel {
    @NameInMap("MetaDataStorageUsages")
    public java.util.List<GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages> metaDataStorageUsages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public String totalCount;

    public static GetMetaDataStorageUsagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDataStorageUsagesResponseBody self = new GetMetaDataStorageUsagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaDataStorageUsagesResponseBody setMetaDataStorageUsages(java.util.List<GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages> metaDataStorageUsages) {
        this.metaDataStorageUsages = metaDataStorageUsages;
        return this;
    }
    public java.util.List<GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages> getMetaDataStorageUsages() {
        return this.metaDataStorageUsages;
    }

    public GetMetaDataStorageUsagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaDataStorageUsagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaDataStorageUsagesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages extends TeaModel {
        @NameInMap("Catalog")
        public Long catalog;

        @NameInMap("Database")
        public Long database;

        @NameInMap("Function")
        public Long function;

        @NameInMap("Month")
        public String month;

        @NameInMap("Partition")
        public Long partition;

        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("StorageUsage")
        public Long storageUsage;

        @NameInMap("Table")
        public Long table;

        public static GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages self = new GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages();
            return TeaModel.build(map, self);
        }

        public GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages setCatalog(Long catalog) {
            this.catalog = catalog;
            return this;
        }
        public Long getCatalog() {
            return this.catalog;
        }

        public GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages setDatabase(Long database) {
            this.database = database;
            return this;
        }
        public Long getDatabase() {
            return this.database;
        }

        public GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages setFunction(Long function) {
            this.function = function;
            return this;
        }
        public Long getFunction() {
            return this.function;
        }

        public GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages setStorageUsage(Long storageUsage) {
            this.storageUsage = storageUsage;
            return this;
        }
        public Long getStorageUsage() {
            return this.storageUsage;
        }

        public GetMetaDataStorageUsagesResponseBodyMetaDataStorageUsages setTable(Long table) {
            this.table = table;
            return this;
        }
        public Long getTable() {
            return this.table;
        }

    }

}
