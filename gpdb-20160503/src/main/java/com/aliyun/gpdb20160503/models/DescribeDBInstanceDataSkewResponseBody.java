// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDataSkewResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceDataSkewResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DistributeKey")
        public String distributeKey;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("Sequence")
        public Integer sequence;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableSize")
        public String tableSize;

        @NameInMap("TableSkew")
        public String tableSkew;

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
