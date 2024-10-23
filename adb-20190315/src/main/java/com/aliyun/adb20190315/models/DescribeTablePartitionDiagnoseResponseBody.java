// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTablePartitionDiagnoseResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1xxxxxxxx47</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeTablePartitionDiagnoseResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The table statistics.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeTablePartitionDiagnoseResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The recommended maximum number of rows in each list partition.</p>
     * 
     * <strong>example:</strong>
     * <p>640000000</p>
     */
    @NameInMap("SuggestMaxRecordsPerPartition")
    public Long suggestMaxRecordsPerPartition;

    /**
     * <p>The recommended minimum number of rows in each list partition.</p>
     * 
     * <strong>example:</strong>
     * <p>64000000</p>
     */
    @NameInMap("SuggestMinRecordsPerPartition")
    public Long suggestMinRecordsPerPartition;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTablePartitionDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablePartitionDiagnoseResponseBody self = new DescribeTablePartitionDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTablePartitionDiagnoseResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeTablePartitionDiagnoseResponseBody setDetectionItems(java.util.List<DescribeTablePartitionDiagnoseResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeTablePartitionDiagnoseResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeTablePartitionDiagnoseResponseBody setItems(java.util.List<DescribeTablePartitionDiagnoseResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeTablePartitionDiagnoseResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeTablePartitionDiagnoseResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTablePartitionDiagnoseResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTablePartitionDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTablePartitionDiagnoseResponseBody setSuggestMaxRecordsPerPartition(Long suggestMaxRecordsPerPartition) {
        this.suggestMaxRecordsPerPartition = suggestMaxRecordsPerPartition;
        return this;
    }
    public Long getSuggestMaxRecordsPerPartition() {
        return this.suggestMaxRecordsPerPartition;
    }

    public DescribeTablePartitionDiagnoseResponseBody setSuggestMinRecordsPerPartition(Long suggestMinRecordsPerPartition) {
        this.suggestMinRecordsPerPartition = suggestMinRecordsPerPartition;
        return this;
    }
    public Long getSuggestMinRecordsPerPartition() {
        return this.suggestMinRecordsPerPartition;
    }

    public DescribeTablePartitionDiagnoseResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTablePartitionDiagnoseResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>A total of 10 tables have an improper partition field</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the detection item.</p>
         * 
         * <strong>example:</strong>
         * <p>Improper Partition Field Diagnosis</p>
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

        public static DescribeTablePartitionDiagnoseResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablePartitionDiagnoseResponseBodyDetectionItems self = new DescribeTablePartitionDiagnoseResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeTablePartitionDiagnoseResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeTablePartitionDiagnoseResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTablePartitionDiagnoseResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeTablePartitionDiagnoseResponseBodyItems extends TeaModel {
        /**
         * <p>The information about inappropriate partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>202005,202006</p>
         */
        @NameInMap("PartitionDetail")
        public String partitionDetail;

        /**
         * <p>The number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PartitionNumber")
        public Integer partitionNumber;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
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
         * <p>66.23</p>
         */
        @NameInMap("SpaceRatio")
        public Double spaceRatio;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total data size of the table. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>42949672960</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeTablePartitionDiagnoseResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablePartitionDiagnoseResponseBodyItems self = new DescribeTablePartitionDiagnoseResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTablePartitionDiagnoseResponseBodyItems setPartitionDetail(String partitionDetail) {
            this.partitionDetail = partitionDetail;
            return this;
        }
        public String getPartitionDetail() {
            return this.partitionDetail;
        }

        public DescribeTablePartitionDiagnoseResponseBodyItems setPartitionNumber(Integer partitionNumber) {
            this.partitionNumber = partitionNumber;
            return this;
        }
        public Integer getPartitionNumber() {
            return this.partitionNumber;
        }

        public DescribeTablePartitionDiagnoseResponseBodyItems setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeTablePartitionDiagnoseResponseBodyItems setSpaceRatio(Double spaceRatio) {
            this.spaceRatio = spaceRatio;
            return this;
        }
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        public DescribeTablePartitionDiagnoseResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeTablePartitionDiagnoseResponseBodyItems setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
