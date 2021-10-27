// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDataExportTasksResponseBodyData data;

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

    public static DescribeDataExportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportTasksResponseBody self = new DescribeDataExportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportTasksResponseBody setData(DescribeDataExportTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataExportTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataExportTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataExportTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataExportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataExportTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataExportTasksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull extends TeaModel {
        @NameInMap("NeedTime")
        public Integer needTime;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Tps")
        public Integer tps;

        @NameInMap("TransferCount")
        public Integer transferCount;

        public static DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull self = new DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull setNeedTime(Integer needTime) {
            this.needTime = needTime;
            return this;
        }
        public Integer getNeedTime() {
            return this.needTime;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Tps")
        public Integer tps;

        @NameInMap("TransferCount")
        public Integer transferCount;

        public static DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement self = new DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress extends TeaModel {
        @NameInMap("Full")
        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull full;

        @NameInMap("FullRunning")
        public Boolean fullRunning;

        @NameInMap("Increment")
        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement increment;

        @NameInMap("IncrementRunning")
        public Boolean incrementRunning;

        public static DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress self = new DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress setFull(DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull full) {
            this.full = full;
            return this;
        }
        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressFull getFull() {
            return this.full;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress setFullRunning(Boolean fullRunning) {
            this.fullRunning = fullRunning;
            return this;
        }
        public Boolean getFullRunning() {
            return this.fullRunning;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress setIncrement(DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement increment) {
            this.increment = increment;
            return this;
        }
        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgressIncrement getIncrement() {
            return this.increment;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress setIncrementRunning(Boolean incrementRunning) {
            this.incrementRunning = incrementRunning;
            return this;
        }
        public Boolean getIncrementRunning() {
            return this.incrementRunning;
        }

    }

    public static class DescribeDataExportTasksResponseBodyDataDataExportTask extends TeaModel {
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
        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress jingweiProgress;

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

        public static DescribeDataExportTasksResponseBodyDataDataExportTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseBodyDataDataExportTask self = new DescribeDataExportTasksResponseBodyDataDataExportTask();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setBatchEvaluateTaskId(Integer batchEvaluateTaskId) {
            this.batchEvaluateTaskId = batchEvaluateTaskId;
            return this;
        }
        public Integer getBatchEvaluateTaskId() {
            return this.batchEvaluateTaskId;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setCreateDbProgress(Integer createDbProgress) {
            this.createDbProgress = createDbProgress;
            return this;
        }
        public Integer getCreateDbProgress() {
            return this.createDbProgress;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setCreateTablesProgress(Integer createTablesProgress) {
            this.createTablesProgress = createTablesProgress;
            return this;
        }
        public Integer getCreateTablesProgress() {
            return this.createTablesProgress;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setDstDbName(String dstDbName) {
            this.dstDbName = dstDbName;
            return this;
        }
        public String getDstDbName() {
            return this.dstDbName;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setDstInstId(String dstInstId) {
            this.dstInstId = dstInstId;
            return this;
        }
        public String getDstInstId() {
            return this.dstInstId;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setEvaluateTaskId(Integer evaluateTaskId) {
            this.evaluateTaskId = evaluateTaskId;
            return this;
        }
        public Integer getEvaluateTaskId() {
            return this.evaluateTaskId;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setJingweiProgress(DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress jingweiProgress) {
            this.jingweiProgress = jingweiProgress;
            return this;
        }
        public DescribeDataExportTasksResponseBodyDataDataExportTaskJingweiProgress getJingweiProgress() {
            return this.jingweiProgress;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setSrcInstId(String srcInstId) {
            this.srcInstId = srcInstId;
            return this;
        }
        public String getSrcInstId() {
            return this.srcInstId;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDataExportTasksResponseBodyDataDataExportTask setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeDataExportTasksResponseBodyData extends TeaModel {
        @NameInMap("DataExportTask")
        public java.util.List<DescribeDataExportTasksResponseBodyDataDataExportTask> dataExportTask;

        public static DescribeDataExportTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseBodyData self = new DescribeDataExportTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseBodyData setDataExportTask(java.util.List<DescribeDataExportTasksResponseBodyDataDataExportTask> dataExportTask) {
            this.dataExportTask = dataExportTask;
            return this;
        }
        public java.util.List<DescribeDataExportTasksResponseBodyDataDataExportTask> getDataExportTask() {
            return this.dataExportTask;
        }

    }

}
