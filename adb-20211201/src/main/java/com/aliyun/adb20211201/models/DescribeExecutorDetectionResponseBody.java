// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeExecutorDetectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>am-xxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DFF5F54-162B-5860-80A5-411FF550B347</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>566</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeExecutorDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutorDetectionResponseBody self = new DescribeExecutorDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExecutorDetectionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeExecutorDetectionResponseBody setDetectionItems(java.util.List<DescribeExecutorDetectionResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeExecutorDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExecutorDetectionResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults extends TeaModel {
        /**
         * <p>The average value of the operator metric.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("AvgValue")
        public Double avgValue;

        /**
         * <p>The maximum value of the operator metric.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("MaxValue")
        public Long maxValue;

        /**
         * <p>The number of occurrences of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OperatorCount")
        public Long operatorCount;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>Window</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The cumulative value of the operator metric.</p>
         * 
         * <strong>example:</strong>
         * <p>345</p>
         */
        @NameInMap("TotalValue")
        public Long totalValue;

        public static DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults self = new DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults();
            return TeaModel.build(map, self);
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setAvgValue(Double avgValue) {
            this.avgValue = avgValue;
            return this;
        }
        public Double getAvgValue() {
            return this.avgValue;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setMaxValue(Long maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Long getMaxValue() {
            return this.maxValue;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setOperatorCount(Long operatorCount) {
            this.operatorCount = operatorCount;
            return this;
        }
        public Long getOperatorCount() {
            return this.operatorCount;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults setTotalValue(Long totalValue) {
            this.totalValue = totalValue;
            return this;
        }
        public Long getTotalValue() {
            return this.totalValue;
        }

    }

    public static class DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg extends TeaModel {
        /**
         * <p>The name of the detection metric.</p>
         * 
         * <strong>example:</strong>
         * <p>OperatorCost</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The detection result items of operator metric aggregation.</p>
         */
        @NameInMap("SearchResults")
        public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults> searchResults;

        public static DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg self = new DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg();
            return TeaModel.build(map, self);
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg setSearchResults(java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults> searchResults) {
            this.searchResults = searchResults;
            return this;
        }
        public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAggSearchResults> getSearchResults() {
            return this.searchResults;
        }

    }

    public static class DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults extends TeaModel {
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
         * <p>345</p>
         */
        @NameInMap("InputSize")
        public Long inputSize;

        /**
         * <p>The total CPU time consumed by all operators in the stage, which is equivalent to the total CPU time of the stage. You can use this parameter to determine which parts of the stage consume a large amount of computing resources. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OperatorCost")
        public Double operatorCost;

        /**
         * <p>The property information about the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP BY field: uid</p>
         */
        @NameInMap("OperatorInfo")
        public String operatorInfo;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>Join</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The number of rows output by the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("OutputRows")
        public Long outputRows;

        /**
         * <p>The amount of data output by the operator. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("OutputSize")
        public Long outputSize;

        /**
         * <p>The peak memory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2024080110010002102500023803151627972</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The stage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Stage[3]</p>
         */
        @NameInMap("StageId")
        public String stageId;

        public static DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults self = new DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults();
            return TeaModel.build(map, self);
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setInputRows(Long inputRows) {
            this.inputRows = inputRows;
            return this;
        }
        public Long getInputRows() {
            return this.inputRows;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setInputSize(Long inputSize) {
            this.inputSize = inputSize;
            return this;
        }
        public Long getInputSize() {
            return this.inputSize;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOperatorCost(Double operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Double getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOperatorInfo(String operatorInfo) {
            this.operatorInfo = operatorInfo;
            return this;
        }
        public String getOperatorInfo() {
            return this.operatorInfo;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setOutputSize(Long outputSize) {
            this.outputSize = outputSize;
            return this;
        }
        public Long getOutputSize() {
            return this.outputSize;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

    }

    public static class DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails extends TeaModel {
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
        public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults> searchResults;

        public static DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails self = new DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails setSearchResults(java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults> searchResults) {
            this.searchResults = searchResults;
            return this;
        }
        public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetailsSearchResults> getSearchResults() {
            return this.searchResults;
        }

    }

    public static class DescribeExecutorDetectionResponseBodyDetectionItemsResults extends TeaModel {
        /**
         * <p>The detection result items of operator metric aggregation.</p>
         */
        @NameInMap("OperatorAgg")
        public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg> operatorAgg;

        /**
         * <p>The detection result items of abnormal operators.</p>
         */
        @NameInMap("OperatorDetails")
        public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails> operatorDetails;

        public static DescribeExecutorDetectionResponseBodyDetectionItemsResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutorDetectionResponseBodyDetectionItemsResults self = new DescribeExecutorDetectionResponseBodyDetectionItemsResults();
            return TeaModel.build(map, self);
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResults setOperatorAgg(java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg> operatorAgg) {
            this.operatorAgg = operatorAgg;
            return this;
        }
        public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorAgg> getOperatorAgg() {
            return this.operatorAgg;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItemsResults setOperatorDetails(java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails> operatorDetails) {
            this.operatorDetails = operatorDetails;
            return this;
        }
        public java.util.List<DescribeExecutorDetectionResponseBodyDetectionItemsResultsOperatorDetails> getOperatorDetails() {
            return this.operatorDetails;
        }

    }

    public static class DescribeExecutorDetectionResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The information about the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>Large amounts of memory resources are used by the Aggregation operator.</p>
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
        public DescribeExecutorDetectionResponseBodyDetectionItemsResults results;

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

        public static DescribeExecutorDetectionResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutorDetectionResponseBodyDetectionItems self = new DescribeExecutorDetectionResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeExecutorDetectionResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItems setResults(DescribeExecutorDetectionResponseBodyDetectionItemsResults results) {
            this.results = results;
            return this;
        }
        public DescribeExecutorDetectionResponseBodyDetectionItemsResults getResults() {
            return this.results;
        }

        public DescribeExecutorDetectionResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
