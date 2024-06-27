// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIndexUsageResponseBody extends TeaModel {
    /**
     * <p>The time when the table was last deleted, inserted, or updated.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceIndexUsageResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adbtest</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The definition of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE INDEX idx1 ON schema1.tab1_ptr_2010</p>
         */
        @NameInMap("IndexDef")
        public String indexDef;

        /**
         * <p>The name of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>idx1</p>
         */
        @NameInMap("IndexName")
        public String indexName;

        /**
         * <p>The number of index scans.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("IndexScanTimes")
        public Integer indexScanTimes;

        /**
         * <p>The size of the index. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("IndexSize")
        public String indexSize;

        /**
         * <p>Indicates whether the table is a partitioned table. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The table is a partitioned table.</li>
         * <li><strong>false</strong>: The table is not a partitioned table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPartitionTable")
        public Boolean isPartitionTable;

        /**
         * <p>The name of the parent table.</p>
         * 
         * <strong>example:</strong>
         * <p>tab1</p>
         */
        @NameInMap("ParentTableName")
        public String parentTableName;

        /**
         * <p>The name of the schema.</p>
         * 
         * <strong>example:</strong>
         * <p>schema1</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>tab1_ptr_2010</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The time when the table was last deleted, inserted, or updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-08T20:00:00Z</p>
         */
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
