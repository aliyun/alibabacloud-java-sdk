// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeDataExportTasksResponseData data;

    public static DescribeDataExportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportTasksResponse self = new DescribeDataExportTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataExportTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataExportTasksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataExportTasksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataExportTasksResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDataExportTasksResponse setData(DescribeDataExportTasksResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeDataExportTasksResponseData getData() {
        return this.data;
    }

    public static class DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull extends TeaModel {
        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("Tps")
        @Validation(required = true)
        public Integer tps;

        @NameInMap("NeedTime")
        @Validation(required = true)
        public Integer needTime;

        @NameInMap("TransferCount")
        @Validation(required = true)
        public Integer transferCount;

        public static DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull self = new DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull setNeedTime(Integer needTime) {
            this.needTime = needTime;
            return this;
        }
        public Integer getNeedTime() {
            return this.needTime;
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement extends TeaModel {
        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        @NameInMap("Tps")
        @Validation(required = true)
        public Integer tps;

        @NameInMap("TransferCount")
        @Validation(required = true)
        public Integer transferCount;

        public static DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement self = new DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress extends TeaModel {
        @NameInMap("FullRunning")
        @Validation(required = true)
        public Boolean fullRunning;

        @NameInMap("IncrementRunning")
        @Validation(required = true)
        public Boolean incrementRunning;

        @NameInMap("Full")
        @Validation(required = true)
        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull full;

        @NameInMap("Increment")
        @Validation(required = true)
        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement increment;

        public static DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress self = new DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress setFullRunning(Boolean fullRunning) {
            this.fullRunning = fullRunning;
            return this;
        }
        public Boolean getFullRunning() {
            return this.fullRunning;
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress setIncrementRunning(Boolean incrementRunning) {
            this.incrementRunning = incrementRunning;
            return this;
        }
        public Boolean getIncrementRunning() {
            return this.incrementRunning;
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress setFull(DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull full) {
            this.full = full;
            return this;
        }
        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressFull getFull() {
            return this.full;
        }

        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress setIncrement(DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement increment) {
            this.increment = increment;
            return this;
        }
        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgressIncrement getIncrement() {
            return this.increment;
        }

    }

    public static class DescribeDataExportTasksResponseDataDataExportTask extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Stage")
        @Validation(required = true)
        public String stage;

        @NameInMap("SrcInstId")
        @Validation(required = true)
        public String srcInstId;

        @NameInMap("SrcDbName")
        @Validation(required = true)
        public String srcDbName;

        @NameInMap("DstInstId")
        @Validation(required = true)
        public String dstInstId;

        @NameInMap("DstDbName")
        @Validation(required = true)
        public String dstDbName;

        @NameInMap("EvaluateTaskId")
        @Validation(required = true)
        public Integer evaluateTaskId;

        @NameInMap("BatchEvaluateTaskId")
        @Validation(required = true)
        public Integer batchEvaluateTaskId;

        @NameInMap("CreateDbProgress")
        @Validation(required = true)
        public Integer createDbProgress;

        @NameInMap("CreateTablesProgress")
        @Validation(required = true)
        public Integer createTablesProgress;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("JingweiProgress")
        @Validation(required = true)
        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress jingweiProgress;

        public static DescribeDataExportTasksResponseDataDataExportTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseDataDataExportTask self = new DescribeDataExportTasksResponseDataDataExportTask();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseDataDataExportTask setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setSrcInstId(String srcInstId) {
            this.srcInstId = srcInstId;
            return this;
        }
        public String getSrcInstId() {
            return this.srcInstId;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setDstInstId(String dstInstId) {
            this.dstInstId = dstInstId;
            return this;
        }
        public String getDstInstId() {
            return this.dstInstId;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setDstDbName(String dstDbName) {
            this.dstDbName = dstDbName;
            return this;
        }
        public String getDstDbName() {
            return this.dstDbName;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setEvaluateTaskId(Integer evaluateTaskId) {
            this.evaluateTaskId = evaluateTaskId;
            return this;
        }
        public Integer getEvaluateTaskId() {
            return this.evaluateTaskId;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setBatchEvaluateTaskId(Integer batchEvaluateTaskId) {
            this.batchEvaluateTaskId = batchEvaluateTaskId;
            return this;
        }
        public Integer getBatchEvaluateTaskId() {
            return this.batchEvaluateTaskId;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setCreateDbProgress(Integer createDbProgress) {
            this.createDbProgress = createDbProgress;
            return this;
        }
        public Integer getCreateDbProgress() {
            return this.createDbProgress;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setCreateTablesProgress(Integer createTablesProgress) {
            this.createTablesProgress = createTablesProgress;
            return this;
        }
        public Integer getCreateTablesProgress() {
            return this.createTablesProgress;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataExportTasksResponseDataDataExportTask setJingweiProgress(DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress jingweiProgress) {
            this.jingweiProgress = jingweiProgress;
            return this;
        }
        public DescribeDataExportTasksResponseDataDataExportTaskJingweiProgress getJingweiProgress() {
            return this.jingweiProgress;
        }

    }

    public static class DescribeDataExportTasksResponseData extends TeaModel {
        @NameInMap("DataExportTask")
        @Validation(required = true)
        public java.util.List<DescribeDataExportTasksResponseDataDataExportTask> dataExportTask;

        public static DescribeDataExportTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportTasksResponseData self = new DescribeDataExportTasksResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportTasksResponseData setDataExportTask(java.util.List<DescribeDataExportTasksResponseDataDataExportTask> dataExportTask) {
            this.dataExportTask = dataExportTask;
            return this;
        }
        public java.util.List<DescribeDataExportTasksResponseDataDataExportTask> getDataExportTask() {
            return this.dataExportTask;
        }

    }

}
