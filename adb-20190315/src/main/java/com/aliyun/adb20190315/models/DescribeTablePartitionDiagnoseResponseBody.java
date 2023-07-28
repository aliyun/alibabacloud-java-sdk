// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTablePartitionDiagnoseResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The information of tables.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeTablePartitionDiagnoseResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The recommended maximum number of rows in each list partition.</p>
     */
    @NameInMap("SuggestMaxRecordsPerPartition")
    public Long suggestMaxRecordsPerPartition;

    /**
     * <p>The recommended minimum number of rows in each list partition.</p>
     */
    @NameInMap("SuggestMinRecordsPerPartition")
    public Long suggestMinRecordsPerPartition;

    /**
     * <p>The total number of entries.</p>
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

    public static class DescribeTablePartitionDiagnoseResponseBodyItems extends TeaModel {
        /**
         * <p>Details of the inappropriate partitions.</p>
         */
        @NameInMap("PartitionDetail")
        public String partitionDetail;

        /**
         * <p>The number of partitions.</p>
         */
        @NameInMap("PartitionNumber")
        public Integer partitionNumber;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableName")
        public String tableName;

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

        public DescribeTablePartitionDiagnoseResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
