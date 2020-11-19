// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataImportTasksResponse extends TeaModel {
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
    public DescribeDataImportTasksResponseData data;

    public static DescribeDataImportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportTasksResponse self = new DescribeDataImportTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataImportTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataImportTasksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataImportTasksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataImportTasksResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDataImportTasksResponse setData(DescribeDataImportTasksResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeDataImportTasksResponseData getData() {
        return this.data;
    }

    public static class DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull extends TeaModel {
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

        public static DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull self = new DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull setNeedTime(Integer needTime) {
            this.needTime = needTime;
            return this;
        }
        public Integer getNeedTime() {
            return this.needTime;
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement extends TeaModel {
        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        @NameInMap("Tps")
        @Validation(required = true)
        public Integer tps;

        @NameInMap("TransferCount")
        @Validation(required = true)
        public Integer transferCount;

        public static DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement self = new DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress extends TeaModel {
        @NameInMap("FullRunning")
        @Validation(required = true)
        public Boolean fullRunning;

        @NameInMap("IncrementRunning")
        @Validation(required = true)
        public Boolean incrementRunning;

        @NameInMap("Full")
        @Validation(required = true)
        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull full;

        @NameInMap("Increment")
        @Validation(required = true)
        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement increment;

        public static DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress self = new DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress setFullRunning(Boolean fullRunning) {
            this.fullRunning = fullRunning;
            return this;
        }
        public Boolean getFullRunning() {
            return this.fullRunning;
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress setIncrementRunning(Boolean incrementRunning) {
            this.incrementRunning = incrementRunning;
            return this;
        }
        public Boolean getIncrementRunning() {
            return this.incrementRunning;
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress setFull(DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull full) {
            this.full = full;
            return this;
        }
        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressFull getFull() {
            return this.full;
        }

        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress setIncrement(DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement increment) {
            this.increment = increment;
            return this;
        }
        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgressIncrement getIncrement() {
            return this.increment;
        }

    }

    public static class DescribeDataImportTasksResponseDataDataImportTask extends TeaModel {
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
        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress jingweiProgress;

        public static DescribeDataImportTasksResponseDataDataImportTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseDataDataImportTask self = new DescribeDataImportTasksResponseDataDataImportTask();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseDataDataImportTask setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setSrcInstId(String srcInstId) {
            this.srcInstId = srcInstId;
            return this;
        }
        public String getSrcInstId() {
            return this.srcInstId;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setDstInstId(String dstInstId) {
            this.dstInstId = dstInstId;
            return this;
        }
        public String getDstInstId() {
            return this.dstInstId;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setDstDbName(String dstDbName) {
            this.dstDbName = dstDbName;
            return this;
        }
        public String getDstDbName() {
            return this.dstDbName;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setEvaluateTaskId(Integer evaluateTaskId) {
            this.evaluateTaskId = evaluateTaskId;
            return this;
        }
        public Integer getEvaluateTaskId() {
            return this.evaluateTaskId;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setBatchEvaluateTaskId(Integer batchEvaluateTaskId) {
            this.batchEvaluateTaskId = batchEvaluateTaskId;
            return this;
        }
        public Integer getBatchEvaluateTaskId() {
            return this.batchEvaluateTaskId;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setCreateDbProgress(Integer createDbProgress) {
            this.createDbProgress = createDbProgress;
            return this;
        }
        public Integer getCreateDbProgress() {
            return this.createDbProgress;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setCreateTablesProgress(Integer createTablesProgress) {
            this.createTablesProgress = createTablesProgress;
            return this;
        }
        public Integer getCreateTablesProgress() {
            return this.createTablesProgress;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeDataImportTasksResponseDataDataImportTask setJingweiProgress(DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress jingweiProgress) {
            this.jingweiProgress = jingweiProgress;
            return this;
        }
        public DescribeDataImportTasksResponseDataDataImportTaskJingweiProgress getJingweiProgress() {
            return this.jingweiProgress;
        }

    }

    public static class DescribeDataImportTasksResponseData extends TeaModel {
        @NameInMap("DataImportTask")
        @Validation(required = true)
        public java.util.List<DescribeDataImportTasksResponseDataDataImportTask> dataImportTask;

        public static DescribeDataImportTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportTasksResponseData self = new DescribeDataImportTasksResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportTasksResponseData setDataImportTask(java.util.List<DescribeDataImportTasksResponseDataDataImportTask> dataImportTask) {
            this.dataImportTask = dataImportTask;
            return this;
        }
        public java.util.List<DescribeDataImportTasksResponseDataDataImportTask> getDataImportTask() {
            return this.dataImportTask;
        }

    }

}
