// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetTableInfoResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetTableInfoResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a06dd4516687375802853481ec9fd</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetTableInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableInfoResponseBody self = new GetTableInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableInfoResponseBody setData(GetTableInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTableInfoResponseBodyData getData() {
        return this.data;
    }

    public GetTableInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTableInfoResponseBodyDataClusterInfoSortCols extends TeaModel {
        /**
         * <p>The name of the sorting field.</p>
         * 
         * <strong>example:</strong>
         * <p>col_2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The sorting order.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("order")
        public String order;

        public static GetTableInfoResponseBodyDataClusterInfoSortCols build(java.util.Map<String, ?> map) throws Exception {
            GetTableInfoResponseBodyDataClusterInfoSortCols self = new GetTableInfoResponseBodyDataClusterInfoSortCols();
            return TeaModel.build(map, self);
        }

        public GetTableInfoResponseBodyDataClusterInfoSortCols setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableInfoResponseBodyDataClusterInfoSortCols setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

    public static class GetTableInfoResponseBodyDataClusterInfo extends TeaModel {
        /**
         * <p>Optional. The number of buckets in the clustered table. The value 0 indicates that the number of buckets dynamically changes when a job is running.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("bucketNum")
        public Long bucketNum;

        /**
         * <p>The cluster keys.</p>
         */
        @NameInMap("clusterCols")
        public java.util.List<String> clusterCols;

        /**
         * <p>The clustering type of the table. MaxCompute supports <a href="https://www.alibabacloud.com/help/maxcompute/use-cases/hash-clustering">hash clustering</a> and</p>
         * <p><a href="https://www.alibabacloud.com/help/maxcompute/use-cases/range-clustering">range clustering</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Hash</p>
         */
        @NameInMap("clusterType")
        public String clusterType;

        /**
         * <p>The condition by which the results are sorted.</p>
         */
        @NameInMap("sortCols")
        public java.util.List<GetTableInfoResponseBodyDataClusterInfoSortCols> sortCols;

        public static GetTableInfoResponseBodyDataClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTableInfoResponseBodyDataClusterInfo self = new GetTableInfoResponseBodyDataClusterInfo();
            return TeaModel.build(map, self);
        }

        public GetTableInfoResponseBodyDataClusterInfo setBucketNum(Long bucketNum) {
            this.bucketNum = bucketNum;
            return this;
        }
        public Long getBucketNum() {
            return this.bucketNum;
        }

        public GetTableInfoResponseBodyDataClusterInfo setClusterCols(java.util.List<String> clusterCols) {
            this.clusterCols = clusterCols;
            return this;
        }
        public java.util.List<String> getClusterCols() {
            return this.clusterCols;
        }

        public GetTableInfoResponseBodyDataClusterInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public GetTableInfoResponseBodyDataClusterInfo setSortCols(java.util.List<GetTableInfoResponseBodyDataClusterInfoSortCols> sortCols) {
            this.sortCols = sortCols;
            return this;
        }
        public java.util.List<GetTableInfoResponseBodyDataClusterInfoSortCols> getSortCols() {
            return this.sortCols;
        }

    }

    public static class GetTableInfoResponseBodyDataNativeColumns extends TeaModel {
        /**
         * <p>The column comments.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of shop.</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The sensitivity-level label of the column. For more information, see <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>shop_name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The column type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("type")
        public String type;

        public static GetTableInfoResponseBodyDataNativeColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTableInfoResponseBodyDataNativeColumns self = new GetTableInfoResponseBodyDataNativeColumns();
            return TeaModel.build(map, self);
        }

        public GetTableInfoResponseBodyDataNativeColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableInfoResponseBodyDataNativeColumns setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetTableInfoResponseBodyDataNativeColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableInfoResponseBodyDataNativeColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableInfoResponseBodyDataPartitionColumns extends TeaModel {
        /**
         * <p>The comments of the partition key column.</p>
         * 
         * <strong>example:</strong>
         * <p>Sale date.</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The sensitivity-level label of the column. For more information, see <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The partition name.</p>
         * 
         * <strong>example:</strong>
         * <p>sale_date</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The partition column type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("type")
        public String type;

        public static GetTableInfoResponseBodyDataPartitionColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTableInfoResponseBodyDataPartitionColumns self = new GetTableInfoResponseBodyDataPartitionColumns();
            return TeaModel.build(map, self);
        }

        public GetTableInfoResponseBodyDataPartitionColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableInfoResponseBodyDataPartitionColumns setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetTableInfoResponseBodyDataPartitionColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableInfoResponseBodyDataPartitionColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableInfoResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the materialized view is automatically refreshed. This response parameter is returned when type is set to materializedView.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoRefreshEnabled")
        public Boolean autoRefreshEnabled;

        /**
         * <p>The clustering attribute. This response parameter is returned when the table is a clustered table.</p>
         */
        @NameInMap("clusterInfo")
        public GetTableInfoResponseBodyDataClusterInfo clusterInfo;

        /**
         * <p>The comments of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>sale_detail</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>DDL statement to create a table.</p>
         * 
         * <strong>example:</strong>
         * <p>create table if not exists sale_detail( shop_name STRING, customer_id STRING, total_price DOUBLE) partitioned by (sale_date STRING, region STRING);</p>
         */
        @NameInMap("createTableDDL")
        public String createTableDDL;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-17T07:07:47Z</p>
         */
        @NameInMap("creationTime")
        public Long creationTime;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>project_name.schema_name.table_name</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The number of file of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("fileNum")
        public Long fileNum;

        /**
         * <p>Indicates whether the table is an external table. This response parameter is returned when type is set to external.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isExternalTable")
        public Boolean isExternalTable;

        /**
         * <p>Indicates whether data of the materialized view is invalid due to changes in the data of the source table. This response parameter is returned when type is set to materializedView.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isOutdated")
        public Boolean isOutdated;

        /**
         * <p>The time when data of the table or view was last accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T02:05:56Z</p>
         */
        @NameInMap("lastAccessTime")
        public Long lastAccessTime;

        /**
         * <p>The time when the data definition language (DDL) statement of the table or view was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T02:05:56Z</p>
         */
        @NameInMap("lastDDLTime")
        public Long lastDDLTime;

        /**
         * <p>The time when data of the table or view was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T02:05:56Z</p>
         */
        @NameInMap("lastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The lifecycle. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("lifecycle")
        public String lifecycle;

        /**
         * <p>The path of the external table. This response parameter is returned when type is set to external.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://oss-cn-hangzhou-internal.aliyuncs.com/oss-mc-test/Demo1/</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <p>Indicates whether the table or view is a <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/materialized-view-operations">materialize view</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("materializedView")
        public Boolean materializedView;

        /**
         * <p>The name of the table or view.</p>
         * 
         * <strong>example:</strong>
         * <p>sale_detail</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The field information.</p>
         */
        @NameInMap("nativeColumns")
        public java.util.List<GetTableInfoResponseBodyDataNativeColumns> nativeColumns;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the role AliyunODPSDefaultRole in Resource Access Management (RAM). This response parameter is returned when type is set to external.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::xxxxx:role/aliyunodpsdefaultrole</p>
         */
        @NameInMap("odpsPropertiesRolearn")
        public String odpsPropertiesRolearn;

        /**
         * <p>Indicates whether the table header is ignored. This response parameter is returned when type is set to external.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("odpsSqlTextOptionFlushHeader")
        public Boolean odpsSqlTextOptionFlushHeader;

        /**
         * <p>The first N rows that were ignored in the table header. This response parameter is returned when type is set to external.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("odpsTextOptionHeaderLinesCount")
        public Long odpsTextOptionHeaderLinesCount;

        /**
         * <p>The account information of the table or view owner.</p>
         * 
         * <strong>example:</strong>
         * <p>188785396123****</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The information about partition key columns. This response parameter is returned only for partitioned tables.</p>
         */
        @NameInMap("partitionColumns")
        public java.util.List<GetTableInfoResponseBodyDataPartitionColumns> partitionColumns;

        /**
         * <p>The physical size of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>2763</p>
         */
        @NameInMap("physicalSize")
        public Long physicalSize;

        /**
         * <p>The name of the project to which the table or view belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>projectA</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>Indicates whether the query rewrite operation can be performed by using the materialized view. This response parameter is returned when type is set to materializedView.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("rewriteEnabled")
        public Boolean rewriteEnabled;

        /**
         * <p>The name of the schema to which the table or the view belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("schema")
        public String schema;

        /**
         * <p>The data size of the non-partitioned table. If the table is a partitioned table, the system does not calculate the data size of the table. In this case, the value of this parameter is NULL. The PARTITIONS view includes the data size of each partition in a partitioned table. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>5372</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The storage handler of the external table. This response parameter is returned when type is set to external.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.odps.CsvStorageHandler</p>
         */
        @NameInMap("storageHandler")
        public String storageHandler;

        /**
         * <p>The sensitivity-level label of the table. For more information, see <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("tableLabel")
        public String tableLabel;

        /**
         * <p>The name of the Tablestore table to be accessed. This response parameter is returned when type is set to external.</p>
         * 
         * <strong>example:</strong>
         * <p>ots_tpch_orders</p>
         */
        @NameInMap("tablesotreTableName")
        public String tablesotreTableName;

        /**
         * <p>The columns of the Tablestore table to be accessed, including the primary key column and attribute column. This response parameter is returned when type is set to external.</p>
         * 
         * <strong>example:</strong>
         * <p>:o_orderkey,:o_orderdate,o_custkey,o_orderstatus,o_totalprice</p>
         */
        @NameInMap("tablestoreColumnsMapping")
        public String tablestoreColumnsMapping;

        /**
         * <p>The type of the table or view. Valid values:</p>
         * <ul>
         * <li><strong>internal</strong>: internal table</li>
         * <li><strong>external</strong>: external table</li>
         * <li><strong>view</strong>: view</li>
         * <li><strong>materializedView</strong>: <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/materialized-view-operations">materialize view</a></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internal</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The statement that generates the view. This response parameter is returned when type is set to view.</p>
         * 
         * <strong>example:</strong>
         * <p>select shop_name, sum(total_price) from sale_detail group by shop_name</p>
         */
        @NameInMap("viewText")
        public String viewText;

        public static GetTableInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableInfoResponseBodyData self = new GetTableInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableInfoResponseBodyData setAutoRefreshEnabled(Boolean autoRefreshEnabled) {
            this.autoRefreshEnabled = autoRefreshEnabled;
            return this;
        }
        public Boolean getAutoRefreshEnabled() {
            return this.autoRefreshEnabled;
        }

        public GetTableInfoResponseBodyData setClusterInfo(GetTableInfoResponseBodyDataClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public GetTableInfoResponseBodyDataClusterInfo getClusterInfo() {
            return this.clusterInfo;
        }

        public GetTableInfoResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableInfoResponseBodyData setCreateTableDDL(String createTableDDL) {
            this.createTableDDL = createTableDDL;
            return this;
        }
        public String getCreateTableDDL() {
            return this.createTableDDL;
        }

        public GetTableInfoResponseBodyData setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public GetTableInfoResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTableInfoResponseBodyData setFileNum(Long fileNum) {
            this.fileNum = fileNum;
            return this;
        }
        public Long getFileNum() {
            return this.fileNum;
        }

        public GetTableInfoResponseBodyData setIsExternalTable(Boolean isExternalTable) {
            this.isExternalTable = isExternalTable;
            return this;
        }
        public Boolean getIsExternalTable() {
            return this.isExternalTable;
        }

        public GetTableInfoResponseBodyData setIsOutdated(Boolean isOutdated) {
            this.isOutdated = isOutdated;
            return this;
        }
        public Boolean getIsOutdated() {
            return this.isOutdated;
        }

        public GetTableInfoResponseBodyData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetTableInfoResponseBodyData setLastDDLTime(Long lastDDLTime) {
            this.lastDDLTime = lastDDLTime;
            return this;
        }
        public Long getLastDDLTime() {
            return this.lastDDLTime;
        }

        public GetTableInfoResponseBodyData setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetTableInfoResponseBodyData setLifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public String getLifecycle() {
            return this.lifecycle;
        }

        public GetTableInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetTableInfoResponseBodyData setMaterializedView(Boolean materializedView) {
            this.materializedView = materializedView;
            return this;
        }
        public Boolean getMaterializedView() {
            return this.materializedView;
        }

        public GetTableInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableInfoResponseBodyData setNativeColumns(java.util.List<GetTableInfoResponseBodyDataNativeColumns> nativeColumns) {
            this.nativeColumns = nativeColumns;
            return this;
        }
        public java.util.List<GetTableInfoResponseBodyDataNativeColumns> getNativeColumns() {
            return this.nativeColumns;
        }

        public GetTableInfoResponseBodyData setOdpsPropertiesRolearn(String odpsPropertiesRolearn) {
            this.odpsPropertiesRolearn = odpsPropertiesRolearn;
            return this;
        }
        public String getOdpsPropertiesRolearn() {
            return this.odpsPropertiesRolearn;
        }

        public GetTableInfoResponseBodyData setOdpsSqlTextOptionFlushHeader(Boolean odpsSqlTextOptionFlushHeader) {
            this.odpsSqlTextOptionFlushHeader = odpsSqlTextOptionFlushHeader;
            return this;
        }
        public Boolean getOdpsSqlTextOptionFlushHeader() {
            return this.odpsSqlTextOptionFlushHeader;
        }

        public GetTableInfoResponseBodyData setOdpsTextOptionHeaderLinesCount(Long odpsTextOptionHeaderLinesCount) {
            this.odpsTextOptionHeaderLinesCount = odpsTextOptionHeaderLinesCount;
            return this;
        }
        public Long getOdpsTextOptionHeaderLinesCount() {
            return this.odpsTextOptionHeaderLinesCount;
        }

        public GetTableInfoResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTableInfoResponseBodyData setPartitionColumns(java.util.List<GetTableInfoResponseBodyDataPartitionColumns> partitionColumns) {
            this.partitionColumns = partitionColumns;
            return this;
        }
        public java.util.List<GetTableInfoResponseBodyDataPartitionColumns> getPartitionColumns() {
            return this.partitionColumns;
        }

        public GetTableInfoResponseBodyData setPhysicalSize(Long physicalSize) {
            this.physicalSize = physicalSize;
            return this;
        }
        public Long getPhysicalSize() {
            return this.physicalSize;
        }

        public GetTableInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetTableInfoResponseBodyData setRewriteEnabled(Boolean rewriteEnabled) {
            this.rewriteEnabled = rewriteEnabled;
            return this;
        }
        public Boolean getRewriteEnabled() {
            return this.rewriteEnabled;
        }

        public GetTableInfoResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetTableInfoResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetTableInfoResponseBodyData setStorageHandler(String storageHandler) {
            this.storageHandler = storageHandler;
            return this;
        }
        public String getStorageHandler() {
            return this.storageHandler;
        }

        public GetTableInfoResponseBodyData setTableLabel(String tableLabel) {
            this.tableLabel = tableLabel;
            return this;
        }
        public String getTableLabel() {
            return this.tableLabel;
        }

        public GetTableInfoResponseBodyData setTablesotreTableName(String tablesotreTableName) {
            this.tablesotreTableName = tablesotreTableName;
            return this;
        }
        public String getTablesotreTableName() {
            return this.tablesotreTableName;
        }

        public GetTableInfoResponseBodyData setTablestoreColumnsMapping(String tablestoreColumnsMapping) {
            this.tablestoreColumnsMapping = tablestoreColumnsMapping;
            return this;
        }
        public String getTablestoreColumnsMapping() {
            return this.tablestoreColumnsMapping;
        }

        public GetTableInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTableInfoResponseBodyData setViewText(String viewText) {
            this.viewText = viewText;
            return this;
        }
        public String getViewText() {
            return this.viewText;
        }

    }

}
