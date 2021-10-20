// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Querys")
    public java.util.List<DescribeDiagnosisRecordsResponseBodyQuerys> querys;

    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeDiagnosisRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public static class DescribeDiagnosisRecordsResponseBodyQuerys extends TeaModel {
        @NameInMap("SQL")
        public String SQL;

        @NameInMap("SQLTruncatedThreshold")
        public Long SQLTruncatedThreshold;

        @NameInMap("Status")
        public String status;

        @NameInMap("OutputDataSize")
        public Long outputDataSize;

        @NameInMap("Cost")
        public Long cost;

        @NameInMap("OutputRows")
        public Long outputRows;

        @NameInMap("RcHost")
        public String rcHost;

        @NameInMap("ScanSize")
        public Long scanSize;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("SQLTruncated")
        public Boolean SQLTruncated;

        @NameInMap("Database")
        public String database;

        @NameInMap("ScanRows")
        public Long scanRows;

        @NameInMap("ResourceCostRank")
        public Integer resourceCostRank;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("QueueTime")
        public Long queueTime;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ExecutionTime")
        public Long executionTime;

        @NameInMap("TotalPlanningTime")
        public Long totalPlanningTime;

        @NameInMap("EtlWriteRows")
        public Long etlWriteRows;

        @NameInMap("TotalStages")
        public Integer totalStages;

        public static DescribeDiagnosisRecordsResponseBodyQuerys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisRecordsResponseBodyQuerys self = new DescribeDiagnosisRecordsResponseBodyQuerys();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setSQLTruncatedThreshold(Long SQLTruncatedThreshold) {
            this.SQLTruncatedThreshold = SQLTruncatedThreshold;
            return this;
        }
        public Long getSQLTruncatedThreshold() {
            return this.SQLTruncatedThreshold;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setOutputDataSize(Long outputDataSize) {
            this.outputDataSize = outputDataSize;
            return this;
        }
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setRcHost(String rcHost) {
            this.rcHost = rcHost;
            return this;
        }
        public String getRcHost() {
            return this.rcHost;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setScanSize(Long scanSize) {
            this.scanSize = scanSize;
            return this;
        }
        public Long getScanSize() {
            return this.scanSize;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setSQLTruncated(Boolean SQLTruncated) {
            this.SQLTruncated = SQLTruncated;
            return this;
        }
        public Boolean getSQLTruncated() {
            return this.SQLTruncated;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setResourceCostRank(Integer resourceCostRank) {
            this.resourceCostRank = resourceCostRank;
            return this;
        }
        public Integer getResourceCostRank() {
            return this.resourceCostRank;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setQueueTime(Long queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Long getQueueTime() {
            return this.queueTime;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setExecutionTime(Long executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public Long getExecutionTime() {
            return this.executionTime;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setTotalPlanningTime(Long totalPlanningTime) {
            this.totalPlanningTime = totalPlanningTime;
            return this;
        }
        public Long getTotalPlanningTime() {
            return this.totalPlanningTime;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setEtlWriteRows(Long etlWriteRows) {
            this.etlWriteRows = etlWriteRows;
            return this;
        }
        public Long getEtlWriteRows() {
            return this.etlWriteRows;
        }

        public DescribeDiagnosisRecordsResponseBodyQuerys setTotalStages(Integer totalStages) {
            this.totalStages = totalStages;
            return this;
        }
        public Integer getTotalStages() {
            return this.totalStages;
        }

    }

}
