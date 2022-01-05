// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanResponseBody extends TeaModel {
    @NameInMap("Detail")
    public DescribeSQLPlanResponseBodyDetail detail;

    @NameInMap("OriginInfo")
    public String originInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StageList")
    public java.util.List<DescribeSQLPlanResponseBodyStageList> stageList;

    public static DescribeSQLPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlanResponseBody self = new DescribeSQLPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPlanResponseBody setDetail(DescribeSQLPlanResponseBodyDetail detail) {
        this.detail = detail;
        return this;
    }
    public DescribeSQLPlanResponseBodyDetail getDetail() {
        return this.detail;
    }

    public DescribeSQLPlanResponseBody setOriginInfo(String originInfo) {
        this.originInfo = originInfo;
        return this;
    }
    public String getOriginInfo() {
        return this.originInfo;
    }

    public DescribeSQLPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLPlanResponseBody setStageList(java.util.List<DescribeSQLPlanResponseBodyStageList> stageList) {
        this.stageList = stageList;
        return this;
    }
    public java.util.List<DescribeSQLPlanResponseBodyStageList> getStageList() {
        return this.stageList;
    }

    public static class DescribeSQLPlanResponseBodyDetail extends TeaModel {
        @NameInMap("CPUTime")
        public Long CPUTime;

        @NameInMap("ClientIP")
        public String clientIP;

        @NameInMap("Database")
        public String database;

        @NameInMap("OutputRows")
        public Long outputRows;

        @NameInMap("OutputSize")
        public Long outputSize;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("PlanningTime")
        public Long planningTime;

        @NameInMap("QueuedTime")
        public Long queuedTime;

        @NameInMap("SQL")
        public String SQL;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("TotalStage")
        public Long totalStage;

        @NameInMap("TotalTask")
        public Long totalTask;

        @NameInMap("TotalTime")
        public Long totalTime;

        @NameInMap("User")
        public String user;

        public static DescribeSQLPlanResponseBodyDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlanResponseBodyDetail self = new DescribeSQLPlanResponseBodyDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlanResponseBodyDetail setCPUTime(Long CPUTime) {
            this.CPUTime = CPUTime;
            return this;
        }
        public Long getCPUTime() {
            return this.CPUTime;
        }

        public DescribeSQLPlanResponseBodyDetail setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeSQLPlanResponseBodyDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeSQLPlanResponseBodyDetail setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeSQLPlanResponseBodyDetail setOutputSize(Long outputSize) {
            this.outputSize = outputSize;
            return this;
        }
        public Long getOutputSize() {
            return this.outputSize;
        }

        public DescribeSQLPlanResponseBodyDetail setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLPlanResponseBodyDetail setPlanningTime(Long planningTime) {
            this.planningTime = planningTime;
            return this;
        }
        public Long getPlanningTime() {
            return this.planningTime;
        }

        public DescribeSQLPlanResponseBodyDetail setQueuedTime(Long queuedTime) {
            this.queuedTime = queuedTime;
            return this;
        }
        public Long getQueuedTime() {
            return this.queuedTime;
        }

        public DescribeSQLPlanResponseBodyDetail setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeSQLPlanResponseBodyDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSQLPlanResponseBodyDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalStage(Long totalStage) {
            this.totalStage = totalStage;
            return this;
        }
        public Long getTotalStage() {
            return this.totalStage;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalTask(Long totalTask) {
            this.totalTask = totalTask;
            return this;
        }
        public Long getTotalTask() {
            return this.totalTask;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public DescribeSQLPlanResponseBodyDetail setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeSQLPlanResponseBodyStageList extends TeaModel {
        @NameInMap("CPUTimeAvg")
        public Long CPUTimeAvg;

        @NameInMap("CPUTimeMax")
        public Long CPUTimeMax;

        @NameInMap("CPUTimeMin")
        public Long CPUTimeMin;

        @NameInMap("InputSizeAvg")
        public Long inputSizeAvg;

        @NameInMap("InputSizeMax")
        public Long inputSizeMax;

        @NameInMap("InputSizeMin")
        public Long inputSizeMin;

        @NameInMap("OperatorCost")
        public Long operatorCost;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("ScanSizeAvg")
        public Long scanSizeAvg;

        @NameInMap("ScanSizeMax")
        public Long scanSizeMax;

        @NameInMap("ScanSizeMin")
        public Long scanSizeMin;

        @NameInMap("ScanTimeAvg")
        public Long scanTimeAvg;

        @NameInMap("ScanTimeMax")
        public Long scanTimeMax;

        @NameInMap("ScanTimeMin")
        public Long scanTimeMin;

        @NameInMap("StageId")
        public Integer stageId;

        @NameInMap("State")
        public String state;

        public static DescribeSQLPlanResponseBodyStageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlanResponseBodyStageList self = new DescribeSQLPlanResponseBodyStageList();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlanResponseBodyStageList setCPUTimeAvg(Long CPUTimeAvg) {
            this.CPUTimeAvg = CPUTimeAvg;
            return this;
        }
        public Long getCPUTimeAvg() {
            return this.CPUTimeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setCPUTimeMax(Long CPUTimeMax) {
            this.CPUTimeMax = CPUTimeMax;
            return this;
        }
        public Long getCPUTimeMax() {
            return this.CPUTimeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setCPUTimeMin(Long CPUTimeMin) {
            this.CPUTimeMin = CPUTimeMin;
            return this;
        }
        public Long getCPUTimeMin() {
            return this.CPUTimeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeAvg(Long inputSizeAvg) {
            this.inputSizeAvg = inputSizeAvg;
            return this;
        }
        public Long getInputSizeAvg() {
            return this.inputSizeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeMax(Long inputSizeMax) {
            this.inputSizeMax = inputSizeMax;
            return this;
        }
        public Long getInputSizeMax() {
            return this.inputSizeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeMin(Long inputSizeMin) {
            this.inputSizeMin = inputSizeMin;
            return this;
        }
        public Long getInputSizeMin() {
            return this.inputSizeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setOperatorCost(Long operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeSQLPlanResponseBodyStageList setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeAvg(Long scanSizeAvg) {
            this.scanSizeAvg = scanSizeAvg;
            return this;
        }
        public Long getScanSizeAvg() {
            return this.scanSizeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeMax(Long scanSizeMax) {
            this.scanSizeMax = scanSizeMax;
            return this;
        }
        public Long getScanSizeMax() {
            return this.scanSizeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeMin(Long scanSizeMin) {
            this.scanSizeMin = scanSizeMin;
            return this;
        }
        public Long getScanSizeMin() {
            return this.scanSizeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeAvg(Long scanTimeAvg) {
            this.scanTimeAvg = scanTimeAvg;
            return this;
        }
        public Long getScanTimeAvg() {
            return this.scanTimeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeMax(Long scanTimeMax) {
            this.scanTimeMax = scanTimeMax;
            return this;
        }
        public Long getScanTimeMax() {
            return this.scanTimeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeMin(Long scanTimeMin) {
            this.scanTimeMin = scanTimeMin;
            return this;
        }
        public Long getScanTimeMin() {
            return this.scanTimeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setStageId(Integer stageId) {
            this.stageId = stageId;
            return this;
        }
        public Integer getStageId() {
            return this.stageId;
        }

        public DescribeSQLPlanResponseBodyStageList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
