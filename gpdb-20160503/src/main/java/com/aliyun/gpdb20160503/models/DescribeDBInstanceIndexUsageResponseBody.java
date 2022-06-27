// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIndexUsageResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceIndexUsageResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDBInstanceIndexUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIndexUsageResponseBody self = new DescribeDBInstanceIndexUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIndexUsageResponseBody setItems(java.util.List<DescribeDBInstanceIndexUsageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBInstanceIndexUsageResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBInstanceIndexUsageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceIndexUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceIndexUsageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBInstanceIndexUsageResponseBodyItems extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("IndexDef")
        public String indexDef;

        @NameInMap("IndexName")
        public String indexName;

        @NameInMap("IndexScanTimes")
        public Integer indexScanTimes;

        @NameInMap("IndexSize")
        public String indexSize;

        @NameInMap("IsPartitionTable")
        public Boolean isPartitionTable;

        @NameInMap("ParentTableName")
        public String parentTableName;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TimeLastUpdated")
        public String timeLastUpdated;

        public static DescribeDBInstanceIndexUsageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIndexUsageResponseBodyItems self = new DescribeDBInstanceIndexUsageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setIndexDef(String indexDef) {
            this.indexDef = indexDef;
            return this;
        }
        public String getIndexDef() {
            return this.indexDef;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setIndexScanTimes(Integer indexScanTimes) {
            this.indexScanTimes = indexScanTimes;
            return this;
        }
        public Integer getIndexScanTimes() {
            return this.indexScanTimes;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setIndexSize(String indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public String getIndexSize() {
            return this.indexSize;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setParentTableName(String parentTableName) {
            this.parentTableName = parentTableName;
            return this;
        }
        public String getParentTableName() {
            return this.parentTableName;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeDBInstanceIndexUsageResponseBodyItems setTimeLastUpdated(String timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            return this;
        }
        public String getTimeLastUpdated() {
            return this.timeLastUpdated;
        }

    }

}
