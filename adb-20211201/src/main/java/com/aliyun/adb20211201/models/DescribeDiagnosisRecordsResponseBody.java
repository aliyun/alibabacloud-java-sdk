// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsResponseBody extends TeaModel {
    /**
     * <p>The page number. The value is an integer that is greater than 0. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of SQL statement details.</p>
     */
    @NameInMap("Querys")
    public java.util.List<DescribeDiagnosisRecordsResponseBodyQuerys> querys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F88BEFA-CF0B-5C95-8BB1-92EC9F09E40D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDiagnosisRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisRecordsResponseBody self = new DescribeDiagnosisRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnosisRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnosisRecordsResponseBody setQuerys(java.util.List<DescribeDiagnosisRecordsResponseBodyQuerys> querys) {
        this.querys = querys;
        return this;
    }
    public java.util.List<DescribeDiagnosisRecordsResponseBodyQuerys> getQuerys() {
        return this.querys;
    }

    public DescribeDiagnosisRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosisRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties extends TeaModel {
        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>max_select_items_count</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties self = new DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDiagnosisRecordsResponseBodyQuerys extends TeaModel {
        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>59.82.XX.XX</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The total execution duration of the query. Unit: milliseconds.</p>
         * <blockquote>
         * <p>This duration is the sum of <code>QueuedTime</code>, <code>TotalPlanningTime</code>, and <code>ExecutionTime</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>The name of the database where the SQL statement is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The number of rows written to a table in an ETL task.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EtlWriteRows")
        public Long etlWriteRows;

        /**
         * <p>The execution duration of the query. Unit: milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("ExecutionTime")
        public Long executionTime;

        /**
         * <p>The amount of returned data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("OutputDataSize")
        public Long outputDataSize;

        /**
         * <p>The number of returned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutputRows")
        public Long outputRows;

        /**
         * <p>The ID of the SQL pattern.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/612503.html">DescribePatternPerformance</a> operation to view the detailed execution metrics of the SQL pattern within a specified time range.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-5575924945138******</p>
         */
        @NameInMap("PatternId")
        public String patternId;

        /**
         * <p>The peak memory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>16648</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2021093000414401000000023503151******</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The list of properties that are in effect for the current query.</p>
         * <blockquote>
         * <p>For a list of common properties, see <a href="https://help.aliyun.com/document_detail/408955.html">Config and Hint configuration parameters</a>.</p>
         * </blockquote>
         */
        @NameInMap("QueryProperties")
        public java.util.List<DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties> queryProperties;

        /**
         * <p>The amount of time that the query waited in a queue before execution. Unit: milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("QueueTime")
        public Long queueTime;

        /**
         * <p>The IP address and port number of the AnalyticDB for MySQL frontend node that is used to execute the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX:3004</p>
         */
        @NameInMap("RcHost")
        public String rcHost;

        /**
         * <p>The ranking of the execution duration of an operator in the SQL statement.</p>
         * <blockquote>
         * <p>This parameter is returned only for SQL statements that are in the <code>running</code> state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceCostRank")
        public Integer resourceCostRank;

        /**
         * <p>The resource pool to which the SQL statement belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The details of the SQL statement.</p>
         * <blockquote>
         * <p>For performance, an SQL statement can be up to 5,120 characters long. Longer statements are truncated. Call the <a href="https://help.aliyun.com/document_detail/308212.html">DownloadDiagnosisRecords</a> operation to download the summary information of SQL statements that meet the specified conditions, including the complete SQL statements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT count(*)\nFROM nation</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>Indicates whether the length of the query result exceeds the threshold. If the length exceeds the threshold, the query result is truncated. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The length of the query result exceeds the threshold.</p>
         * </li>
         * <li><p><strong>false</strong>: The length of the query result does not exceed the threshold.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SQLTruncated")
        public Boolean SQLTruncated;

        /**
         * <p>The truncation threshold for the SQL statement. The value is fixed at 5,120 characters. SQL statements that exceed this limit are truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("SQLTruncatedThreshold")
        public Long SQLTruncatedThreshold;

        /**
         * <p>The number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The amount of scanned data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("ScanSize")
        public Long scanSize;

        /**
         * <p>The start time of the SQL execution. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1632933704000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The state of the SQL statement. Valid values:</p>
         * <ul>
         * <li><p><strong>running</strong>: The statement is running.</p>
         * </li>
         * <li><p><strong>finished</strong>: The statement is complete.</p>
         * </li>
         * <li><p><strong>failed</strong>: The statement failed to be executed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The amount of time that was required to generate the execution plan. Unit: milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalPlanningTime")
        public Long totalPlanningTime;

        /**
         * <p>The total number of stages generated for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalStages")
        public Integer totalStages;

        /**
         * <p>The username used to execute the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeDiagnosisRecordsResponseBodyQuerys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisRecordsResponseBodyQuerys self = new DescribeDiagnosisRecordsResponseBodyQuerys();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setEtlWriteRows(Long etlWriteRows) {
            this.etlWriteRows = etlWriteRows;
            return this;
        }
        public Long getEtlWriteRows() {
            return this.etlWriteRows;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setExecutionTime(Long executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public Long getExecutionTime() {
            return this.executionTime;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setOutputDataSize(Long outputDataSize) {
            this.outputDataSize = outputDataSize;
            return this;
        }
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setPatternId(String patternId) {
            this.patternId = patternId;
            return this;
        }
        public String getPatternId() {
            return this.patternId;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setQueryProperties(java.util.List<DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties> queryProperties) {
            this.queryProperties = queryProperties;
            return this;
        }
        public java.util.List<DescribeDiagnosisRecordsResponseBodyQuerysQueryProperties> getQueryProperties() {
            return this.queryProperties;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setQueueTime(Long queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Long getQueueTime() {
            return this.queueTime;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setRcHost(String rcHost) {
            this.rcHost = rcHost;
            return this;
        }
        public String getRcHost() {
            return this.rcHost;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setResourceCostRank(Integer resourceCostRank) {
            this.resourceCostRank = resourceCostRank;
            return this;
        }
        public Integer getResourceCostRank() {
            return this.resourceCostRank;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setSQLTruncated(Boolean SQLTruncated) {
            this.SQLTruncated = SQLTruncated;
            return this;
        }
        public Boolean getSQLTruncated() {
            return this.SQLTruncated;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setSQLTruncatedThreshold(Long SQLTruncatedThreshold) {
            this.SQLTruncatedThreshold = SQLTruncatedThreshold;
            return this;
        }
        public Long getSQLTruncatedThreshold() {
            return this.SQLTruncatedThreshold;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setScanSize(Long scanSize) {
            this.scanSize = scanSize;
            return this;
        }
        public Long getScanSize() {
            return this.scanSize;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setTotalPlanningTime(Long totalPlanningTime) {
            this.totalPlanningTime = totalPlanningTime;
            return this;
        }
        public Long getTotalPlanningTime() {
            return this.totalPlanningTime;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setTotalStages(Integer totalStages) {
            this.totalStages = totalStages;
            return this;
        }
        public Integer getTotalStages() {
            return this.totalStages;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
