// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataImportTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDataImportTasksResponseBodyData data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static DescribeDataImportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportTasksResponseBody self = new DescribeDataImportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportTasksResponseBody setData(DescribeDataImportTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataImportTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataImportTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataImportTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataImportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataImportTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataImportTasksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull extends TeaModel {
        @NameInMap("NeedTime")
        public Integer needTime;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Tps")
        public Integer tps;

        @NameInMap("TransferCount")
        public Integer transferCount;

        public static DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull self = new DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull setNeedTime(Integer needTime) {
            this.needTime = needTime;
            return this;
        }
        public Integer getNeedTime() {
            return this.needTime;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Tps")
        public Integer tps;

        @NameInMap("TransferCount")
        public Integer transferCount;

        public static DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement self = new DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress extends TeaModel {
        @NameInMap("Full")
        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull full;

        @NameInMap("FullRunning")
        public Boolean fullRunning;

        @NameInMap("Increment")
        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement increment;

        @NameInMap("IncrementRunning")
        public Boolean incrementRunning;

        public static DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress self = new DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress setFull(DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull full) {
            this.full = full;
            return this;
        }
        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressFull getFull() {
            return this.full;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress setFullRunning(Boolean fullRunning) {
            this.fullRunning = fullRunning;
            return this;
        }
        public Boolean getFullRunning() {
            return this.fullRunning;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress setIncrement(DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement increment) {
            this.increment = increment;
            return this;
        }
        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgressIncrement getIncrement() {
            return this.increment;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress setIncrementRunning(Boolean incrementRunning) {
            this.incrementRunning = incrementRunning;
            return this;
        }
        public Boolean getIncrementRunning() {
            return this.incrementRunning;
        }

    }

    public static class DescribeDataImportTasksResponseBodyDataDataImportTask extends TeaModel {
        @NameInMap("BatchEvaluateTaskId")
        public Integer batchEvaluateTaskId;

        @NameInMap("CreateDbProgress")
        public Integer createDbProgress;

        @NameInMap("CreateTablesProgress")
        public Integer createTablesProgress;

        @NameInMap("DstDbName")
        public String dstDbName;

        @NameInMap("DstInstId")
        public String dstInstId;

        @NameInMap("EvaluateTaskId")
        public Integer evaluateTaskId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("JingweiProgress")
        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress jingweiProgress;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("SrcDbName")
        public String srcDbName;

        @NameInMap("SrcInstId")
        public String srcInstId;

        @NameInMap("Stage")
        public String stage;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Type")
        public Integer type;

        public static DescribeDataImportTasksResponseBodyDataDataImportTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseBodyDataDataImportTask self = new DescribeDataImportTasksResponseBodyDataDataImportTask();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setBatchEvaluateTaskId(Integer batchEvaluateTaskId) {
            this.batchEvaluateTaskId = batchEvaluateTaskId;
            return this;
        }
        public Integer getBatchEvaluateTaskId() {
            return this.batchEvaluateTaskId;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setCreateDbProgress(Integer createDbProgress) {
            this.createDbProgress = createDbProgress;
            return this;
        }
        public Integer getCreateDbProgress() {
            return this.createDbProgress;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setCreateTablesProgress(Integer createTablesProgress) {
            this.createTablesProgress = createTablesProgress;
            return this;
        }
        public Integer getCreateTablesProgress() {
            return this.createTablesProgress;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setDstDbName(String dstDbName) {
            this.dstDbName = dstDbName;
            return this;
        }
        public String getDstDbName() {
            return this.dstDbName;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setDstInstId(String dstInstId) {
            this.dstInstId = dstInstId;
            return this;
        }
        public String getDstInstId() {
            return this.dstInstId;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setEvaluateTaskId(Integer evaluateTaskId) {
            this.evaluateTaskId = evaluateTaskId;
            return this;
        }
        public Integer getEvaluateTaskId() {
            return this.evaluateTaskId;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setJingweiProgress(DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress jingweiProgress) {
            this.jingweiProgress = jingweiProgress;
            return this;
        }
        public DescribeDataImportTasksResponseBodyDataDataImportTaskJingweiProgress getJingweiProgress() {
            return this.jingweiProgress;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setSrcInstId(String srcInstId) {
            this.srcInstId = srcInstId;
            return this;
        }
        public String getSrcInstId() {
            return this.srcInstId;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDataImportTasksResponseBodyDataDataImportTask setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeDataImportTasksResponseBodyData extends TeaModel {
        @NameInMap("DataImportTask")
        public java.util.List<DescribeDataImportTasksResponseBodyDataDataImportTask> dataImportTask;

        public static DescribeDataImportTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseBodyData self = new DescribeDataImportTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseBodyData setDataImportTask(java.util.List<DescribeDataImportTasksResponseBodyDataDataImportTask> dataImportTask) {
            this.dataImportTask = dataImportTask;
            return this;
        }
        public java.util.List<DescribeDataImportTasksResponseBodyDataDataImportTask> getDataImportTask() {
            return this.dataImportTask;
        }

    }

}
