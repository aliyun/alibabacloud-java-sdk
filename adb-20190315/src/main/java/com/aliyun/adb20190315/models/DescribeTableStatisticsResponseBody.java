// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTableStatisticsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Items")
    public DescribeTableStatisticsResponseBodyItems items;

    public static DescribeTableStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableStatisticsResponseBody self = new DescribeTableStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableStatisticsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeTableStatisticsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeTableStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableStatisticsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTableStatisticsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeTableStatisticsResponseBody setItems(DescribeTableStatisticsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeTableStatisticsResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeTableStatisticsResponseBodyItemsTableStatisticRecords extends TeaModel {
        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("RowCount")
        public Long rowCount;

        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("IndexSize")
        public Long indexSize;

        @NameInMap("PrimaryKeyIndexSize")
        public Long primaryKeyIndexSize;

        @NameInMap("PartitionCount")
        public Long partitionCount;

        @NameInMap("ColdDataSize")
        public Long coldDataSize;

        public static DescribeTableStatisticsResponseBodyItemsTableStatisticRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableStatisticsResponseBodyItemsTableStatisticRecords self = new DescribeTableStatisticsResponseBodyItemsTableStatisticRecords();
            return TeaModel.build(map, self);
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
            this.primaryKeyIndexSize = primaryKeyIndexSize;
            return this;
        }
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setPartitionCount(Long partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Long getPartitionCount() {
            return this.partitionCount;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setColdDataSize(Long coldDataSize) {
            this.coldDataSize = coldDataSize;
            return this;
        }
        public Long getColdDataSize() {
            return this.coldDataSize;
        }

    }

    public static class DescribeTableStatisticsResponseBodyItems extends TeaModel {
        @NameInMap("TableStatisticRecords")
        public java.util.List<DescribeTableStatisticsResponseBodyItemsTableStatisticRecords> tableStatisticRecords;

        public static DescribeTableStatisticsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableStatisticsResponseBodyItems self = new DescribeTableStatisticsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTableStatisticsResponseBodyItems setTableStatisticRecords(java.util.List<DescribeTableStatisticsResponseBodyItemsTableStatisticRecords> tableStatisticRecords) {
            this.tableStatisticRecords = tableStatisticRecords;
            return this;
        }
        public java.util.List<DescribeTableStatisticsResponseBodyItemsTableStatisticRecords> getTableStatisticRecords() {
            return this.tableStatisticRecords;
        }

    }

}
