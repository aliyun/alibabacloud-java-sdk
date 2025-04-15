// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeWorkerDetectionResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-xxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E5B37B61-E6C9-5FE0-9374-45BAA548AEF6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeWorkerDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkerDetectionResponseBody self = new DescribeWorkerDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkerDetectionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeWorkerDetectionResponseBody setDetectionItems(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeWorkerDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWorkerDetectionResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults extends TeaModel {
        /**
         * <p>The average value of the operator metric.</p>
         * 
         * <strong>example:</strong>
         * <p>2234</p>
         */
        @NameInMap("AvgValue")
        public Double avgValue;

        /**
         * <p>The maximum value of the operator metric.</p>
         * 
         * <strong>example:</strong>
         * <p>444</p>
         */
        @NameInMap("MaxValue")
        public Long maxValue;

        /**
         * <p>The number of occurrences of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("OperatorCount")
        public Long operatorCount;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>Aggregation</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The cumulative value of the operator metric.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TotalValue")
        public Long totalValue;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults self = new DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setAvgValue(Double avgValue) {
            this.avgValue = avgValue;
            return this;
        }
        public Double getAvgValue() {
            return this.avgValue;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setOperatorCount(Long operatorCount) {
            this.operatorCount = operatorCount;
            return this;
        }
        public Long getOperatorCount() {
            return this.operatorCount;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setTotalValue(Long totalValue) {
            this.totalValue = totalValue;
            return this;
        }
        public Long getTotalValue() {
            return this.totalValue;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg extends TeaModel {
        /**
         * <p>The detection result items of operator metric aggregation.</p>
         * 
         * <strong>example:</strong>
         * <p>Peak memory</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The detection result items of operator metric aggregation.</p>
         */
        @NameInMap("SearchResults")
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults> searchResults;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg self = new DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg setSearchResults(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults> searchResults) {
            this.searchResults = searchResults;
            return this;
        }
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults> getSearchResults() {
            return this.searchResults;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults extends TeaModel {
        /**
         * <p>The number of rows input by the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputRows")
        public Long inputRows;

        /**
         * <p>The amount of data input by the operator. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("InputSize")
        public Long inputSize;

        /**
         * <p>The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("OperatorCost")
        public Long operatorCost;

        /**
         * <p>The property information about the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP BY field: id</p>
         */
        @NameInMap("OperatorInfo")
        public String operatorInfo;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>TableScan</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The number of rows output by the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputRows")
        public Long outputRows;

        /**
         * <p>The amount of data output by the operator. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutputSize")
        public Long outputSize;

        /**
         * <p>The peak memory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The query ID that can be used for diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>2024041909301402103302422803151411141</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The stage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Stage[2]</p>
         */
        @NameInMap("StageId")
        public String stageId;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults self = new DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setInputRows(Long inputRows) {
            this.inputRows = inputRows;
            return this;
        }
        public Long getInputRows() {
            return this.inputRows;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setInputSize(Long inputSize) {
            this.inputSize = inputSize;
            return this;
        }
        public Long getInputSize() {
            return this.inputSize;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOperatorCost(Long operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOperatorInfo(String operatorInfo) {
            this.operatorInfo = operatorInfo;
            return this;
        }
        public String getOperatorInfo() {
            return this.operatorInfo;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOutputSize(Long outputSize) {
            this.outputSize = outputSize;
            return this;
        }
        public Long getOutputSize() {
            return this.outputSize;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails extends TeaModel {
        /**
         * <p>The name of the detection metric.</p>
         * 
         * <strong>example:</strong>
         * <p>PeakMemory</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The detection result items of abnormal operators.</p>
         */
        @NameInMap("SearchResults")
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults> searchResults;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails self = new DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails setSearchResults(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults> searchResults) {
            this.searchResults = searchResults;
            return this;
        }
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults> getSearchResults() {
            return this.searchResults;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables extends TeaModel {
        /**
         * <p>The SQL statement that is used to create the table.</p>
         * 
         * <strong>example:</strong>
         * <p>create table test(id varchar)</p>
         */
        @NameInMap("DDL")
        public String DDL;

        /**
         * <p>The number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("PartitionCount")
        public String partitionCount;

        /**
         * <p>The ID of the improper partition.</p>
         * 
         * <strong>example:</strong>
         * <p>[2024,2025]</p>
         */
        @NameInMap("PartitionIds")
        public String partitionIds;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>nxg</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>zhw_place_order</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total data size of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TotalDataSize")
        public Long totalDataSize;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables self = new DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables setDDL(String DDL) {
            this.DDL = DDL;
            return this;
        }
        public String getDDL() {
            return this.DDL;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables setPartitionCount(String partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public String getPartitionCount() {
            return this.partitionCount;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables setPartitionIds(String partitionIds) {
            this.partitionIds = partitionIds;
            return this;
        }
        public String getPartitionIds() {
            return this.partitionIds;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables setTotalDataSize(Long totalDataSize) {
            this.totalDataSize = totalDataSize;
            return this;
        }
        public Long getTotalDataSize() {
            return this.totalDataSize;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables extends TeaModel {
        /**
         * <p>The SQL statement that is used to create the table.</p>
         * 
         * <strong>example:</strong>
         * <p>create table test(id varchar)</p>
         */
        @NameInMap("DDL")
        public String DDL;

        /**
         * <p>The number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PartitionCount")
        public Integer partitionCount;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>platfunc</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The number of skewed rows in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ShardSkewedRows")
        public String shardSkewedRows;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>sls_log_cheat_action</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The total data size of the table. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("TotalDataSize")
        public Long totalDataSize;

        /**
         * <p>The size of hot data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("TotalLocalDataSize")
        public String totalLocalDataSize;

        /**
         * <p>The data size of the primary key. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("TotalPkSize")
        public Long totalPkSize;

        /**
         * <p>The size of cold data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("TotalRemoteDataSize")
        public Long totalRemoteDataSize;

        /**
         * <p>The number of rows in the table.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("TotalRowCount")
        public Long totalRowCount;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables self = new DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setDDL(String DDL) {
            this.DDL = DDL;
            return this;
        }
        public String getDDL() {
            return this.DDL;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setPartitionCount(Integer partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Integer getPartitionCount() {
            return this.partitionCount;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setShardSkewedRows(String shardSkewedRows) {
            this.shardSkewedRows = shardSkewedRows;
            return this;
        }
        public String getShardSkewedRows() {
            return this.shardSkewedRows;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setTotalDataSize(Long totalDataSize) {
            this.totalDataSize = totalDataSize;
            return this;
        }
        public Long getTotalDataSize() {
            return this.totalDataSize;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setTotalLocalDataSize(String totalLocalDataSize) {
            this.totalLocalDataSize = totalLocalDataSize;
            return this;
        }
        public String getTotalLocalDataSize() {
            return this.totalLocalDataSize;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setTotalPkSize(Long totalPkSize) {
            this.totalPkSize = totalPkSize;
            return this;
        }
        public Long getTotalPkSize() {
            return this.totalPkSize;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setTotalRemoteDataSize(Long totalRemoteDataSize) {
            this.totalRemoteDataSize = totalRemoteDataSize;
            return this;
        }
        public Long getTotalRemoteDataSize() {
            return this.totalRemoteDataSize;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables setTotalRowCount(Long totalRowCount) {
            this.totalRowCount = totalRowCount;
            return this;
        }
        public Long getTotalRowCount() {
            return this.totalRowCount;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults extends TeaModel {
        /**
         * <p>The number of accesses to the table.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("AccessCount")
        public Long accessCount;

        /**
         * <p>The average amount of time for scanning. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("AvgScanCost")
        public Double avgScanCost;

        /**
         * <p>The average data size for scanning. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("AvgScanSize")
        public Double avgScanSize;

        /**
         * <p>The maximum amount of time for scanning. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>345</p>
         */
        @NameInMap("MaxScanCost")
        public Long maxScanCost;

        /**
         * <p>The maximum data size for scanning. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("MaxScanSize")
        public Long maxScanSize;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>tiberias_2copt_origin_order_goods_info</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults self = new DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults setAccessCount(Long accessCount) {
            this.accessCount = accessCount;
            return this;
        }
        public Long getAccessCount() {
            return this.accessCount;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults setAvgScanCost(Double avgScanCost) {
            this.avgScanCost = avgScanCost;
            return this;
        }
        public Double getAvgScanCost() {
            return this.avgScanCost;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults setAvgScanSize(Double avgScanSize) {
            this.avgScanSize = avgScanSize;
            return this;
        }
        public Double getAvgScanSize() {
            return this.avgScanSize;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults setMaxScanCost(Long maxScanCost) {
            this.maxScanCost = maxScanCost;
            return this;
        }
        public Long getMaxScanCost() {
            return this.maxScanCost;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults setMaxScanSize(Long maxScanSize) {
            this.maxScanSize = maxScanSize;
            return this;
        }
        public Long getMaxScanSize() {
            return this.maxScanSize;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables extends TeaModel {
        /**
         * <p>The name of the detection metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Peak memory detection</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The detection result items of table access.</p>
         */
        @NameInMap("SearchResults")
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults> searchResults;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables self = new DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables setSearchResults(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults> searchResults) {
            this.searchResults = searchResults;
            return this;
        }
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTablesSearchResults> getSearchResults() {
            return this.searchResults;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItemsResults extends TeaModel {
        /**
         * <p>The detection result items of operator metric aggregation.</p>
         */
        @NameInMap("OperatorAgg")
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg> operatorAgg;

        /**
         * <p>The detection result items of abnormal operators.</p>
         */
        @NameInMap("OperatorDetails")
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails> operatorDetails;

        /**
         * <p>The detection result items of improper partitioned tables.</p>
         */
        @NameInMap("PartitionedTables")
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables> partitionedTables;

        /**
         * <p>The detection result items of skewed tables.</p>
         */
        @NameInMap("SkewedTables")
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables> skewedTables;

        /**
         * <p>The detection result items of table access.</p>
         */
        @NameInMap("TopAccessTables")
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables> topAccessTables;

        public static DescribeWorkerDetectionResponseBodyDetectionItemsResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItemsResults self = new DescribeWorkerDetectionResponseBodyDetectionItemsResults();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResults setOperatorAgg(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg> operatorAgg) {
            this.operatorAgg = operatorAgg;
            return this;
        }
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorAgg> getOperatorAgg() {
            return this.operatorAgg;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResults setOperatorDetails(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails> operatorDetails) {
            this.operatorDetails = operatorDetails;
            return this;
        }
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsOperatorDetails> getOperatorDetails() {
            return this.operatorDetails;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResults setPartitionedTables(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables> partitionedTables) {
            this.partitionedTables = partitionedTables;
            return this;
        }
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsPartitionedTables> getPartitionedTables() {
            return this.partitionedTables;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResults setSkewedTables(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables> skewedTables) {
            this.skewedTables = skewedTables;
            return this;
        }
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsSkewedTables> getSkewedTables() {
            return this.skewedTables;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItemsResults setTopAccessTables(java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables> topAccessTables) {
            this.topAccessTables = topAccessTables;
            return this;
        }
        public java.util.List<DescribeWorkerDetectionResponseBodyDetectionItemsResultsTopAccessTables> getTopAccessTables() {
            return this.topAccessTables;
        }

    }

    public static class DescribeWorkerDetectionResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The information about the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>There are a total of 10 tables with an excessive number of primary keys.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the detection item.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric detection</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The detection result items.</p>
         */
        @NameInMap("Results")
        public DescribeWorkerDetectionResponseBodyDetectionItemsResults results;

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

        public static DescribeWorkerDetectionResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkerDetectionResponseBodyDetectionItems self = new DescribeWorkerDetectionResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeWorkerDetectionResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItems setResults(DescribeWorkerDetectionResponseBodyDetectionItemsResults results) {
            this.results = results;
            return this;
        }
        public DescribeWorkerDetectionResponseBodyDetectionItemsResults getResults() {
            return this.results;
        }

        public DescribeWorkerDetectionResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
