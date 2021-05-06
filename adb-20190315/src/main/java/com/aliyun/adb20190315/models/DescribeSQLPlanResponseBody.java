// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StageList")
    public java.util.List<DescribeSQLPlanResponseBodyStageList> stageList;

    @NameInMap("OriginInfo")
    public String originInfo;

    @NameInMap("Detail")
    public DescribeSQLPlanResponseBodyDetail detail;

    public static DescribeSQLPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlanResponseBody self = new DescribeSQLPlanResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeSQLPlanResponseBody setOriginInfo(String originInfo) {
        this.originInfo = originInfo;
        return this;
    }
    public String getOriginInfo() {
        return this.originInfo;
    }

    public DescribeSQLPlanResponseBody setDetail(DescribeSQLPlanResponseBodyDetail detail) {
        this.detail = detail;
        return this;
    }
    public DescribeSQLPlanResponseBodyDetail getDetail() {
        return this.detail;
    }

    public static class DescribeSQLPlanResponseBodyStageList extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("CPUTimeAvg")
        public Long CPUTimeAvg;

        @NameInMap("CPUTimeMax")
        public Long CPUTimeMax;

        @NameInMap("OperatorCost")
        public Long operatorCost;

        @NameInMap("ScanTimeMax")
        public Long scanTimeMax;

        @NameInMap("InputSizeMax")
        public Long inputSizeMax;

        @NameInMap("StageId")
        public Integer stageId;

        @NameInMap("ScanSizeMax")
        public Long scanSizeMax;

        @NameInMap("CPUTimeMin")
        public Long CPUTimeMin;

        @NameInMap("ScanTimeMin")
        public Long scanTimeMin;

        @NameInMap("ScanSizeMin")
        public Long scanSizeMin;

        @NameInMap("InputSizeMin")
        public Long inputSizeMin;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("ScanTimeAvg")
        public Long scanTimeAvg;

        @NameInMap("ScanSizeAvg")
        public Long scanSizeAvg;

        @NameInMap("InputSizeAvg")
        public Long inputSizeAvg;

        public static DescribeSQLPlanResponseBodyStageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlanResponseBodyStageList self = new DescribeSQLPlanResponseBodyStageList();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlanResponseBodyStageList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
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

        public DescribeSQLPlanResponseBodyStageList setOperatorCost(Long operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeMax(Long scanTimeMax) {
            this.scanTimeMax = scanTimeMax;
            return this;
        }
        public Long getScanTimeMax() {
            return this.scanTimeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeMax(Long inputSizeMax) {
            this.inputSizeMax = inputSizeMax;
            return this;
        }
        public Long getInputSizeMax() {
            return this.inputSizeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setStageId(Integer stageId) {
            this.stageId = stageId;
            return this;
        }
        public Integer getStageId() {
            return this.stageId;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeMax(Long scanSizeMax) {
            this.scanSizeMax = scanSizeMax;
            return this;
        }
        public Long getScanSizeMax() {
            return this.scanSizeMax;
        }

        public DescribeSQLPlanResponseBodyStageList setCPUTimeMin(Long CPUTimeMin) {
            this.CPUTimeMin = CPUTimeMin;
            return this;
        }
        public Long getCPUTimeMin() {
            return this.CPUTimeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeMin(Long scanTimeMin) {
            this.scanTimeMin = scanTimeMin;
            return this;
        }
        public Long getScanTimeMin() {
            return this.scanTimeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeMin(Long scanSizeMin) {
            this.scanSizeMin = scanSizeMin;
            return this;
        }
        public Long getScanSizeMin() {
            return this.scanSizeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeMin(Long inputSizeMin) {
            this.inputSizeMin = inputSizeMin;
            return this;
        }
        public Long getInputSizeMin() {
            return this.inputSizeMin;
        }

        public DescribeSQLPlanResponseBodyStageList setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLPlanResponseBodyStageList setScanTimeAvg(Long scanTimeAvg) {
            this.scanTimeAvg = scanTimeAvg;
            return this;
        }
        public Long getScanTimeAvg() {
            return this.scanTimeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setScanSizeAvg(Long scanSizeAvg) {
            this.scanSizeAvg = scanSizeAvg;
            return this;
        }
        public Long getScanSizeAvg() {
            return this.scanSizeAvg;
        }

        public DescribeSQLPlanResponseBodyStageList setInputSizeAvg(Long inputSizeAvg) {
            this.inputSizeAvg = inputSizeAvg;
            return this;
        }
        public Long getInputSizeAvg() {
            return this.inputSizeAvg;
        }

    }

    public static class DescribeSQLPlanResponseBodyDetail extends TeaModel {
        @NameInMap("SQL")
        public String SQL;

        @NameInMap("OutputSize")
        public Long outputSize;

        @NameInMap("State")
        public String state;

        @NameInMap("OutputRows")
        public Long outputRows;

        @NameInMap("User")
        public String user;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TotalStage")
        public Long totalStage;

        @NameInMap("QueuedTime")
        public Long queuedTime;

        @NameInMap("TotalTime")
        public Long totalTime;

        @NameInMap("TotalTask")
        public Long totalTask;

        @NameInMap("Database")
        public String database;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("ClientIP")
        public String clientIP;

        @NameInMap("PlanningTime")
        public Long planningTime;

        @NameInMap("CPUTime")
        public Long CPUTime;

        public static DescribeSQLPlanResponseBodyDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPlanResponseBodyDetail self = new DescribeSQLPlanResponseBodyDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPlanResponseBodyDetail setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeSQLPlanResponseBodyDetail setOutputSize(Long outputSize) {
            this.outputSize = outputSize;
            return this;
        }
        public Long getOutputSize() {
            return this.outputSize;
        }

        public DescribeSQLPlanResponseBodyDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSQLPlanResponseBodyDetail setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeSQLPlanResponseBodyDetail setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribeSQLPlanResponseBodyDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalStage(Long totalStage) {
            this.totalStage = totalStage;
            return this;
        }
        public Long getTotalStage() {
            return this.totalStage;
        }

        public DescribeSQLPlanResponseBodyDetail setQueuedTime(Long queuedTime) {
            this.queuedTime = queuedTime;
            return this;
        }
        public Long getQueuedTime() {
            return this.queuedTime;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public DescribeSQLPlanResponseBodyDetail setTotalTask(Long totalTask) {
            this.totalTask = totalTask;
            return this;
        }
        public Long getTotalTask() {
            return this.totalTask;
        }

        public DescribeSQLPlanResponseBodyDetail setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeSQLPlanResponseBodyDetail setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSQLPlanResponseBodyDetail setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribeSQLPlanResponseBodyDetail setPlanningTime(Long planningTime) {
            this.planningTime = planningTime;
            return this;
        }
        public Long getPlanningTime() {
            return this.planningTime;
        }

        public DescribeSQLPlanResponseBodyDetail setCPUTime(Long CPUTime) {
            this.CPUTime = CPUTime;
            return this;
        }
        public Long getCPUTime() {
            return this.CPUTime;
        }

    }

}
