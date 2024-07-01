// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeExcessivePrimaryKeysResponseBody extends TeaModel {
    /**
     * <p>The queried information about the request denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;1906102576997697&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcNqPqHV6lwR4INiAGjIvK1ngXxN1O+6ORRB6A8YvztEOGywOk81ZmuNk0YrNy+qk7+UVDTHeXKsy8h9e/ePY/LMidj0RCmDpo/YpCumd0UGe0qEPe2U+UJAm/+UHlnEFLVg6BP3yIB5D++MCy7mgWm8Kwyhk62IeYly4hQ+5IpXjkh1GQXuDgLVVPVpxEek9n30vnCUL4KsaMgfa7dgojb+3TM8xGsD2zVK5STJNrsXclscIJEqyNXd7CBYiRJVZi1HPO6drN9WW0chLpCSTgjO8n0bNanZaxXKumW9PSwV58UoSFASeMWfZK3TLngX+oq8nGmnTwcJosVjfF4RGzAnS1IXt0Q9N2WHDnpwyLBU/nOz7Hsy8IZ+h+OVjsBTXSM9688/vOF707a5mNzpETvQeGRcua3A5livcKAM2cML0yeUs/Zyj/+BGqtVa+wektspDHC/CECh6R5lxQjRmUdPawY8VDs2onmdLuEH8DdmYt+Yv/jBFBUMWOyAluzkPYcX5nuQKouCIUJUFTSbsJsuH5CTIh7Ls5rbmkj+T1qTVz8gnDR8LxwaqoMSna+elXgVyOOxXtMkenVntsmoC3p/4G7yTPL1hu8JyWGIIvZHZGGLXGEH7FeSuMV8buKxPGFWG3arG8e9LGvDdz5dgTien4y6G5AQ0o1iQdXDos5VWdH3u7k5PrsvdEOpvMi6uSd8a42na80FsYlgGlwM5upydcWUC5Un2HCkJpT1xgk2L6shdVTrK6bidRrqE784FhW9bBQePzGaxSupPENZya0VUctRt+7uq3QwIn4y5jzjgX0E0jgmqPrgiVDjBesMQZYfGPCGysWYWYzfoh+G6V7N2VVGtNnGUwNWzM0WJBPONAgxPv+AmixFRCQ==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;202515810214480629&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
     *   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>am-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeExcessivePrimaryKeysResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>863D51B7-5321-41D8-A0B6-A088B0******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried tables that have excessive primary key fields.</p>
     */
    @NameInMap("Tables")
    public java.util.List<DescribeExcessivePrimaryKeysResponseBodyTables> tables;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeExcessivePrimaryKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcessivePrimaryKeysResponseBody self = new DescribeExcessivePrimaryKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExcessivePrimaryKeysResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeExcessivePrimaryKeysResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeExcessivePrimaryKeysResponseBody setDetectionItems(java.util.List<DescribeExcessivePrimaryKeysResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeExcessivePrimaryKeysResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeExcessivePrimaryKeysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExcessivePrimaryKeysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExcessivePrimaryKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExcessivePrimaryKeysResponseBody setTables(java.util.List<DescribeExcessivePrimaryKeysResponseBodyTables> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<DescribeExcessivePrimaryKeysResponseBodyTables> getTables() {
        return this.tables;
    }

    public DescribeExcessivePrimaryKeysResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeExcessivePrimaryKeysResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The detection result.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the detection item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The severity level of the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL
         * WARNNING
         * CRITICAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeExcessivePrimaryKeysResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeExcessivePrimaryKeysResponseBodyDetectionItems self = new DescribeExcessivePrimaryKeysResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeExcessivePrimaryKeysResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeExcessivePrimaryKeysResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExcessivePrimaryKeysResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeExcessivePrimaryKeysResponseBodyTables extends TeaModel {
        /**
         * <p>The total number of columns.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("ColumnCount")
        public Integer columnCount;

        /**
         * <p>The queried primary key fields.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PrimaryKeyColumns")
        public String primaryKeyColumns;

        /**
         * <p>The number of primary key fields.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PrimaryKeyCount")
        public Integer primaryKeyCount;

        /**
         * <p>The data size of primary key indexes. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("PrimaryKeyIndexSize")
        public Long primaryKeyIndexSize;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The percentage of the table size. Unit: %.</p>
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
         * <p>The name of the table</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The cold data size. Unit: bytes.</p>
         * <blockquote>
         * <p> Formula: Cold data size = Data size of table records + Data size of regular indexes + Data size of primary key indexes + Data size of other data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeExcessivePrimaryKeysResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeExcessivePrimaryKeysResponseBodyTables self = new DescribeExcessivePrimaryKeysResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeExcessivePrimaryKeysResponseBodyTables setColumnCount(Integer columnCount) {
            this.columnCount = columnCount;
            return this;
        }
        public Integer getColumnCount() {
            return this.columnCount;
        }

        public DescribeExcessivePrimaryKeysResponseBodyTables setPrimaryKeyColumns(String primaryKeyColumns) {
            this.primaryKeyColumns = primaryKeyColumns;
            return this;
        }
        public String getPrimaryKeyColumns() {
            return this.primaryKeyColumns;
        }

        public DescribeExcessivePrimaryKeysResponseBodyTables setPrimaryKeyCount(Integer primaryKeyCount) {
            this.primaryKeyCount = primaryKeyCount;
            return this;
        }
        public Integer getPrimaryKeyCount() {
            return this.primaryKeyCount;
        }

        public DescribeExcessivePrimaryKeysResponseBodyTables setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
            this.primaryKeyIndexSize = primaryKeyIndexSize;
            return this;
        }
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
        }

        public DescribeExcessivePrimaryKeysResponseBodyTables setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeExcessivePrimaryKeysResponseBodyTables setSpaceRatio(Double spaceRatio) {
            this.spaceRatio = spaceRatio;
            return this;
        }
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        public DescribeExcessivePrimaryKeysResponseBodyTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeExcessivePrimaryKeysResponseBodyTables setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
