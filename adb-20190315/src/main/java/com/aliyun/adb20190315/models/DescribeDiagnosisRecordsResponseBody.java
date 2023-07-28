// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The queried SQL statements.</p>
     */
    @NameInMap("Querys")
    public java.util.List<DescribeDiagnosisRecordsResponseBodyQuerys> querys;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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

    public static class DescribeDiagnosisRecordsResponseBodyQuerys extends TeaModel {
        /**
         * <p>The source IP address.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The total execution duration. Unit: milliseconds.</p>
         * <br>
         * <p>>  This value is the cumulative value of the `QueuedTime`, `TotalPlanningTime`, and `ExecutionTime` parameters.</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>The name of the database on which the SQL statement is executed.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The number of rows written to the table by an extract, transform, and load (ETL) task.</p>
         */
        @NameInMap("EtlWriteRows")
        public Long etlWriteRows;

        /**
         * <p>The execution duration. Unit: milliseconds.</p>
         */
        @NameInMap("ExecutionTime")
        public Long executionTime;

        /**
         * <p>The amount of returned data. Unit: bytes.</p>
         */
        @NameInMap("OutputDataSize")
        public Long outputDataSize;

        /**
         * <p>The number of rows returned.</p>
         */
        @NameInMap("OutputRows")
        public Long outputRows;

        /**
         * <p>The peak memory. Unit: bytes.</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The query ID.</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The amount of time that is consumed for queuing. Unit: milliseconds.</p>
         */
        @NameInMap("QueueTime")
        public Long queueTime;

        /**
         * <p>The IP address and port number of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.</p>
         */
        @NameInMap("RcHost")
        public String rcHost;

        /**
         * <p>The execution duration rank of operators that are used in the SQL statement.</p>
         * <br>
         * <p>> This field is returned only for SQL statements that have the `Status` parameter set to `running`.</p>
         */
        @NameInMap("ResourceCostRank")
        public Integer resourceCostRank;

        /**
         * <p>The resource group to which the SQL statement belongs.</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The SQL statement.</p>
         * <br>
         * <p>> For performance considerations, an SQL statement cannot exceed 5,120 characters in length. Otherwise, the SQL statement is truncated. You can call the [DownloadDiagnosisRecords](~~308212~~) operation to download the diagnostic information about SQL statements that meet a condition in an AnalyticDB for MySQL cluster, including the complete SQL statements.</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>Indicates whether the SQL statement is truncated. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("SQLTruncated")
        public Boolean SQLTruncated;

        /**
         * <p>The maximum length of the SQL statement. 5120 is returned. Unit: character. SQL statements that exceed this limit are truncated.</p>
         */
        @NameInMap("SQLTruncatedThreshold")
        public Long SQLTruncatedThreshold;

        /**
         * <p>The number of entries scanned.</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The amount of scanned data. Unit: bytes.</p>
         */
        @NameInMap("ScanSize")
        public Long scanSize;

        /**
         * <p>The beginning of the time range in which the SQL statement is executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The state of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **running**</p>
         * <p>*   **finished**</p>
         * <p>*   **failed**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The amount of time that is consumed to generate an execution plan. Unit: milliseconds.</p>
         */
        @NameInMap("TotalPlanningTime")
        public Long totalPlanningTime;

        /**
         * <p>The total number of stages generated.</p>
         */
        @NameInMap("TotalStages")
        public Integer totalStages;

        /**
         * <p>The username that is used to execute the SQL statement.</p>
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
