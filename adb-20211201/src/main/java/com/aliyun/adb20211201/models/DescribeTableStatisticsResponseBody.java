// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeTableStatisticsResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Items")
    public DescribeTableStatisticsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C4433FF-5D3A-4C3E-A19C-6D93B2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The names of databases.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;adb_platform\&quot;, \&quot;adb_ai\&quot;, \&quot;adb_data\&quot;]</p>
     */
    @NameInMap("SchemaNames")
    public String schemaNames;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>693</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeTableStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableStatisticsResponseBody self = new DescribeTableStatisticsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeTableStatisticsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
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

    public DescribeTableStatisticsResponseBody setSchemaNames(String schemaNames) {
        this.schemaNames = schemaNames;
        return this;
    }
    public String getSchemaNames() {
        return this.schemaNames;
    }

    public DescribeTableStatisticsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTableStatisticsResponseBodyItemsTableStatisticRecords extends TeaModel {
        @NameInMap("ColdDataSize")
        public Long coldDataSize;

        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("HotDataSize")
        public Long hotDataSize;

        @NameInMap("IndexSize")
        public Long indexSize;

        @NameInMap("OtherSize")
        public Long otherSize;

        @NameInMap("PartitionCount")
        public Long partitionCount;

        @NameInMap("PrimaryKeyIndexSize")
        public Long primaryKeyIndexSize;

        @NameInMap("RowCount")
        public Long rowCount;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SpaceRatio")
        public Double spaceRatio;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeTableStatisticsResponseBodyItemsTableStatisticRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableStatisticsResponseBodyItemsTableStatisticRecords self = new DescribeTableStatisticsResponseBodyItemsTableStatisticRecords();
            return TeaModel.build(map, self);
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setColdDataSize(Long coldDataSize) {
            this.coldDataSize = coldDataSize;
            return this;
        }
        public Long getColdDataSize() {
            return this.coldDataSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setHotDataSize(Long hotDataSize) {
            this.hotDataSize = hotDataSize;
            return this;
        }
        public Long getHotDataSize() {
            return this.hotDataSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setOtherSize(Long otherSize) {
            this.otherSize = otherSize;
            return this;
        }
        public Long getOtherSize() {
            return this.otherSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setPartitionCount(Long partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Long getPartitionCount() {
            return this.partitionCount;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
            this.primaryKeyIndexSize = primaryKeyIndexSize;
            return this;
        }
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setSpaceRatio(Double spaceRatio) {
            this.spaceRatio = spaceRatio;
            return this;
        }
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeTableStatisticsResponseBodyItemsTableStatisticRecords setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
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
