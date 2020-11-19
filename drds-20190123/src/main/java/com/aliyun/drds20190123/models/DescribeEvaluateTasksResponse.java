// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateTasksResponse extends TeaModel {
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
    public DescribeEvaluateTasksResponseData data;

    public static DescribeEvaluateTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateTasksResponse self = new DescribeEvaluateTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEvaluateTasksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEvaluateTasksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEvaluateTasksResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeEvaluateTasksResponse setData(DescribeEvaluateTasksResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeEvaluateTasksResponseData getData() {
        return this.data;
    }

    public static class DescribeEvaluateTasksResponseDataEvaluateTask extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("BatchEvaluateTaskId")
        @Validation(required = true)
        public Integer batchEvaluateTaskId;

        @NameInMap("TaskName")
        @Validation(required = true)
        public String taskName;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InstId")
        @Validation(required = true)
        public String instId;

        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("EvalauteHours")
        @Validation(required = true)
        public Integer evalauteHours;

        @NameInMap("AllSqlCount")
        @Validation(required = true)
        public Integer allSqlCount;

        @NameInMap("DbType")
        @Validation(required = true)
        public Integer dbType;

        public static DescribeEvaluateTasksResponseDataEvaluateTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTasksResponseDataEvaluateTask self = new DescribeEvaluateTasksResponseDataEvaluateTask();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setBatchEvaluateTaskId(Integer batchEvaluateTaskId) {
            this.batchEvaluateTaskId = batchEvaluateTaskId;
            return this;
        }
        public Integer getBatchEvaluateTaskId() {
            return this.batchEvaluateTaskId;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setEvalauteHours(Integer evalauteHours) {
            this.evalauteHours = evalauteHours;
            return this;
        }
        public Integer getEvalauteHours() {
            return this.evalauteHours;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setAllSqlCount(Integer allSqlCount) {
            this.allSqlCount = allSqlCount;
            return this;
        }
        public Integer getAllSqlCount() {
            return this.allSqlCount;
        }

        public DescribeEvaluateTasksResponseDataEvaluateTask setDbType(Integer dbType) {
            this.dbType = dbType;
            return this;
        }
        public Integer getDbType() {
            return this.dbType;
        }

    }

    public static class DescribeEvaluateTasksResponseData extends TeaModel {
        @NameInMap("EvaluateTask")
        @Validation(required = true)
        public java.util.List<DescribeEvaluateTasksResponseDataEvaluateTask> evaluateTask;

        public static DescribeEvaluateTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTasksResponseData self = new DescribeEvaluateTasksResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTasksResponseData setEvaluateTask(java.util.List<DescribeEvaluateTasksResponseDataEvaluateTask> evaluateTask) {
            this.evaluateTask = evaluateTask;
            return this;
        }
        public java.util.List<DescribeEvaluateTasksResponseDataEvaluateTask> getEvaluateTask() {
            return this.evaluateTask;
        }

    }

}
