// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDataSkewResponseBody extends TeaModel {
    /**
     * <p>Details about data skew.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceDataSkewResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDBInstanceDataSkewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDataSkewResponseBody self = new DescribeDBInstanceDataSkewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDataSkewResponseBody setItems(java.util.List<DescribeDBInstanceDataSkewResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBInstanceDataSkewResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBInstanceDataSkewResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceDataSkewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceDataSkewResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBInstanceDataSkewResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The distribution key of the table.</p>
         */
        @NameInMap("DistributeKey")
        public String distributeKey;

        /**
         * <p>The owner of the table.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the schema.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The sequence number of the data skew case. All data skew cases are sorted by severity in descending order.</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total number of rows in the table.</p>
         */
        @NameInMap("TableSize")
        public String tableSize;

        /**
         * <p>The skew ratio of the table. Valid values: 0 to 100. Unit: %. A greater value indicates that the table is more severely skewed. A smaller value indicates less impact on query performance. A value of 0 indicates no data skew.</p>
         */
        @NameInMap("TableSkew")
        public String tableSkew;

        /**
         * <p>The time when the table was last deleted, inserted, or updated.</p>
         */
        @NameInMap("TimeLastUpdated")
        public String timeLastUpdated;

        public static DescribeDBInstanceDataSkewResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceDataSkewResponseBodyItems self = new DescribeDBInstanceDataSkewResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setDistributeKey(String distributeKey) {
            this.distributeKey = distributeKey;
            return this;
        }
        public String getDistributeKey() {
            return this.distributeKey;
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setTableSize(String tableSize) {
            this.tableSize = tableSize;
            return this;
        }
        public String getTableSize() {
            return this.tableSize;
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setTableSkew(String tableSkew) {
            this.tableSkew = tableSkew;
            return this;
        }
        public String getTableSkew() {
            return this.tableSkew;
        }

        public DescribeDBInstanceDataSkewResponseBodyItems setTimeLastUpdated(String timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            return this;
        }
        public String getTimeLastUpdated() {
            return this.timeLastUpdated;
        }

    }

}
