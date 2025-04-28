// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeOversizeNonPartitionTableInfosResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-8vb46cpn2aaxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F67B5AC5-6CDE-5187-9E25-B1EEE9AC4D91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried oversized non-partitioned tables.</p>
     */
    @NameInMap("Tables")
    public java.util.List<DescribeOversizeNonPartitionTableInfosResponseBodyTables> tables;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeOversizeNonPartitionTableInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOversizeNonPartitionTableInfosResponseBody self = new DescribeOversizeNonPartitionTableInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOversizeNonPartitionTableInfosResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeOversizeNonPartitionTableInfosResponseBody setDetectionItems(java.util.List<DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeOversizeNonPartitionTableInfosResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOversizeNonPartitionTableInfosResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOversizeNonPartitionTableInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOversizeNonPartitionTableInfosResponseBody setTables(java.util.List<DescribeOversizeNonPartitionTableInfosResponseBodyTables> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<DescribeOversizeNonPartitionTableInfosResponseBodyTables> getTables() {
        return this.tables;
    }

    public DescribeOversizeNonPartitionTableInfosResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The information about the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>Multiple oversized non-partitioned tables are detected.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the detection item.</p>
         * 
         * <strong>example:</strong>
         * <p>Oversized non-partitioned tables</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The severity level of the detection result. Valid values:</p>
         * <ul>
         * <li>NORMAL</li>
         * <li>WARNING</li>
         * <li>CRITICAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WARNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems self = new DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeOversizeNonPartitionTableInfosResponseBodyTables extends TeaModel {
        /**
         * <p>The data size of table records. Unit: bytes.</p>
         * <blockquote>
         * <p> The data size of table records does not include the data size of regular and primary key indexes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>21474836480</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <p>The data size of regular indexes. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        @NameInMap("IndexSize")
        public Long indexSize;

        /**
         * <p>The size of hot data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>24696061952</p>
         */
        @NameInMap("LocalDataSize")
        public Long localDataSize;

        /**
         * <p>The data size of the primary key index. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2147483648</p>
         */
        @NameInMap("PrimaryKeySize")
        public Long primaryKeySize;

        /**
         * <p>The size of cold data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemoteDataSize")
        public Long remoteDataSize;

        /**
         * <p>The number of rows in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>3294</p>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The storage percentage of the table. Unit: %.</p>
         * <blockquote>
         * <p> Formula: Table storage percentage = Total data size of a table/Total data size of the cluster × 100%.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("SpaceRatio")
        public Double spaceRatio;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeOversizeNonPartitionTableInfosResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeOversizeNonPartitionTableInfosResponseBodyTables self = new DescribeOversizeNonPartitionTableInfosResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setIndexSize(Long indexSize) {
            this.indexSize = indexSize;
            return this;
        }
        public Long getIndexSize() {
            return this.indexSize;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setLocalDataSize(Long localDataSize) {
            this.localDataSize = localDataSize;
            return this;
        }
        public Long getLocalDataSize() {
            return this.localDataSize;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setPrimaryKeySize(Long primaryKeySize) {
            this.primaryKeySize = primaryKeySize;
            return this;
        }
        public Long getPrimaryKeySize() {
            return this.primaryKeySize;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setRemoteDataSize(Long remoteDataSize) {
            this.remoteDataSize = remoteDataSize;
            return this;
        }
        public Long getRemoteDataSize() {
            return this.remoteDataSize;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setSpaceRatio(Double spaceRatio) {
            this.spaceRatio = spaceRatio;
            return this;
        }
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBodyTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
