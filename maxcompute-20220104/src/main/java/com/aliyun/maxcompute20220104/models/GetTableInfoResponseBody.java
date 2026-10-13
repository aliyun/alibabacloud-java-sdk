// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetTableInfoResponseBody extends TeaModel {
    /**
     * <p>The response result.</p>
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
         * <p>The name of the sort column.</p>
         * 
         * <strong>example:</strong>
         * <p>col_2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The sort order.</p>
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
         * <p>The number of buckets in the clustered table. This is an optional field. A value of 0 indicates that the number of buckets is dynamically determined during job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("bucketNum")
        public Long bucketNum;

        /**
         * <p>The cluster key.</p>
         */
        @NameInMap("clusterCols")
        public java.util.List<String> clusterCols;

        /**
         * <p>The clustering type of the table. MaxCompute currently supports &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/use-cases/hash-clustering">Hash Clustering</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/use-cases/hash-clustering">Hash Clustering</a> and
         * &lt;props=&quot;china&quot;&gt; <a href="https://www.alibabacloud.com/help/en/maxcompute/use-cases/hash-clustering">Range Clustering</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/use-cases/range-clustering">Range Clustering</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Hash</p>
         */
        @NameInMap("clusterType")
        public String clusterType;

        /**
         * <p>The sort columns.</p>
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
         * <p>The column comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Store name</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The sensitivity level label of the column. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/label-based-access-control">Label-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
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
         * <p>The data type.</p>
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
         * <p>The partition column comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Sale date</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The sensitivity level label of the column. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/label-based-access-control">Label-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
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
         * <p>ds=\&quot;20190130\&quot;</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The data type.</p>
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
         * <p>Indicates whether automatic refresh of the materialized view is enabled. This parameter is returned only when the type is materialized view.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoRefreshEnabled")
        public Boolean autoRefreshEnabled;

        /**
         * <p>The clustering properties. This parameter is returned only when the table type is clustered table.</p>
         */
        @NameInMap("clusterInfo")
        public GetTableInfoResponseBodyDataClusterInfo clusterInfo;

        /**
         * <p>The table comment.</p>
         * 
         * <strong>example:</strong>
         * <p>sale_detail</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The DDL statement used to create the table.</p>
         * 
         * <strong>example:</strong>
         * <p>create table if not exists sale_detail( shop_name STRING, customer_id STRING, total_price DOUBLE) partitioned by (sale_date STRING, region STRING);</p>
         */
        @NameInMap("createTableDDL")
        public String createTableDDL;

        /**
         * <p>The creation time. The time is in ISO 8601 format and in the UTC time zone.</p>
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
         * <p>odps_project.default.sale_detail</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("fileNum")
        public Long fileNum;

        /**
         * <p>Indicates whether the table is an external table. This parameter is returned only when the type is table.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isExternalTable")
        public Boolean isExternalTable;

        /**
         * <p>Indicates whether the data in the materialized view is invalid due to changes in the source table data. This parameter is returned only when the type is materialized view.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isOutdated")
        public Boolean isOutdated;

        /**
         * <p>The time when the data of the table or view was last accessed. This parameter is returned only when the table is a non-partitioned table.</p>
         * <blockquote>
         * <p>This data has been gradually collected since July 2023. If the table has not been accessed after the upgrade, or if it is accessed through ALGO jobs or Hologres direct read, the last_access_time cannot be collected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T02:05:56Z</p>
         */
        @NameInMap("lastAccessTime")
        public Long lastAccessTime;

        /**
         * <p>The time when the DDL statement of the table or view was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T02:05:56Z</p>
         */
        @NameInMap("lastDDLTime")
        public Long lastDDLTime;

        /**
         * <p>The time when the data of the table or view was last modified. The time is in ISO 8601 format and in the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-21T02:05:56Z</p>
         */
        @NameInMap("lastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The lifecycle in days.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("lifecycle")
        public String lifecycle;

        /**
         * <p>The external table location. This parameter is returned only when the type is external table.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://oss-cn-hangzhou-internal.aliyuncs.com/oss-mc-test/Demo1/</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <p>Indicates whether the table is a &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/materialized-view-operations">materialized view</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/user-guide/materialized-view-operations">materialized view</a>.</p>
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
         * <p>The column information.</p>
         */
        @NameInMap("nativeColumns")
        public java.util.List<GetTableInfoResponseBodyDataNativeColumns> nativeColumns;

        /**
         * <p>The ARN of AliyunODPSDefaultRole in RAM. This parameter is returned only when the type is external table.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::xxxxx:role/aliyunodpsdefaultrole</p>
         */
        @NameInMap("odpsPropertiesRolearn")
        public String odpsPropertiesRolearn;

        /**
         * <p>Indicates whether to ignore the header. This parameter is returned only when the type is external table.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("odpsSqlTextOptionFlushHeader")
        public Boolean odpsSqlTextOptionFlushHeader;

        /**
         * <p>The number of header lines to ignore. This parameter is returned only when the type is external table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("odpsTextOptionHeaderLinesCount")
        public Long odpsTextOptionHeaderLinesCount;

        /**
         * <p>The account information of the owner of the table or view.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$odps****@aliyunid.com</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The partition column information. This parameter is returned only for partitioned tables.</p>
         */
        @NameInMap("partitionColumns")
        public java.util.List<GetTableInfoResponseBodyDataPartitionColumns> partitionColumns;

        /**
         * <p>The physical size.</p>
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
         * <p>odps_project</p>
         */
        @NameInMap("projectName")
        public String projectName;

        /**
         * <p>Indicates whether query rewrite through the materialized view is allowed. This parameter is returned only when the type is materialized view.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("rewriteEnabled")
        public Boolean rewriteEnabled;

        /**
         * <p>The name of the schema to which the table or view belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("schema")
        public String schema;

        /**
         * <p>The data size of the table. If the table is a non-partitioned table, the value is the data size of the table. If the table is a partitioned table, the system does not calculate the data size of the table, and the value is NULL. The PARTITIONS view contains the data size of each partition in the partitioned table. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>5372</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The external table parser. This parameter is returned only when the type is external table.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.odps.CsvStorageHandler</p>
         */
        @NameInMap("storageHandler")
        public String storageHandler;

        /**
         * <p>The sensitivity level label of the table. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/label-based-access-control">Label-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("tableLabel")
        public String tableLabel;

        /**
         * <p>The name of the Tablestore table to be accessed. This parameter is returned only when the type is external table.</p>
         * 
         * <strong>example:</strong>
         * <p>ots_tpch_orders</p>
         */
        @NameInMap("tablesotreTableName")
        public String tablesotreTableName;

        /**
         * <p>The columns of the Tablestore table to be accessed by MaxCompute, including the primary key columns and attribute columns. This parameter is returned only when the type is external table.</p>
         * 
         * <strong>example:</strong>
         * <p>o_orderkey,o_orderdate,o_custkey,o_orderstatus,o_totalprice</p>
         */
        @NameInMap("tablestoreColumnsMapping")
        public String tablestoreColumnsMapping;

        /**
         * <p>The type of the table or view. Valid values:</p>
         * <ul>
         * <li><strong>internal</strong>: Internal table.</li>
         * <li><strong>external</strong>: External table.</li>
         * <li><strong>view</strong>: View.</li>
         * <li><strong>materializedView</strong>: &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/maxcompute/user-guide/materialized-view-operations">Materialized view</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/user-guide/materialized-view-operations">Materialized view</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internal</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The statement used to create the view. This parameter is returned only when the type is view.</p>
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
