// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeInclinedTablesResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
     * }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeInclinedTablesResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The queried tables.</p>
     */
    @NameInMap("Items")
    public DescribeInclinedTablesResponseBodyItems items;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The total number of pages.</p>
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
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeInclinedTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInclinedTablesResponseBody self = new DescribeInclinedTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInclinedTablesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeInclinedTablesResponseBody setDetectionItems(java.util.List<DescribeInclinedTablesResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeInclinedTablesResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeInclinedTablesResponseBody setItems(DescribeInclinedTablesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeInclinedTablesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeInclinedTablesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInclinedTablesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInclinedTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInclinedTablesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInclinedTablesResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The message of the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>A shard skew is detected in a table.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the detection item.</p>
         * 
         * <strong>example:</strong>
         * <p>Table skew</p>
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

        public static DescribeInclinedTablesResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedTablesResponseBodyDetectionItems self = new DescribeInclinedTablesResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedTablesResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeInclinedTablesResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInclinedTablesResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInclinedTablesResponseBodyItemsTable extends TeaModel {
        /**
         * <p>Indicates whether data is skewed in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsIncline")
        public Boolean isIncline;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>admin_daily_own_statistic_record</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of rows in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>spark_test</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The number of rows in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The percentage of the table size. Unit: %.</p>
         * <blockquote>
         * <p> Formula: Table storage percentage = Total data size of a table/Total data size of the cluster × 100%.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("SpaceRatio")
        public Double spaceRatio;

        /**
         * <p>The total data size of the table. Unit: bytes.</p>
         * <blockquote>
         * <p> The following formulas can be used to calculate the total data size:</p>
         * </blockquote>
         * <ul>
         * <li>Formula 1: Total data size = Hot data size + Cold data size.</li>
         * <li>Formula 2: Total data size = Data size of table records + Data size of regular indexes + Data size of primary key indexes + Data size of other data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>53687091200</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <p>The detection type of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>Fact</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeInclinedTablesResponseBodyItemsTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedTablesResponseBodyItemsTable self = new DescribeInclinedTablesResponseBodyItemsTable();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedTablesResponseBodyItemsTable setIsIncline(Boolean isIncline) {
            this.isIncline = isIncline;
            return this;
        }
        public Boolean getIsIncline() {
            return this.isIncline;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setSpaceRatio(Double spaceRatio) {
            this.spaceRatio = spaceRatio;
            return this;
        }
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInclinedTablesResponseBodyItems extends TeaModel {
        /**
         * <p>The queried table.</p>
         */
        @NameInMap("Table")
        public java.util.List<DescribeInclinedTablesResponseBodyItemsTable> table;

        public static DescribeInclinedTablesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedTablesResponseBodyItems self = new DescribeInclinedTablesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedTablesResponseBodyItems setTable(java.util.List<DescribeInclinedTablesResponseBodyItemsTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeInclinedTablesResponseBodyItemsTable> getTable() {
            return this.table;
        }

    }

}
