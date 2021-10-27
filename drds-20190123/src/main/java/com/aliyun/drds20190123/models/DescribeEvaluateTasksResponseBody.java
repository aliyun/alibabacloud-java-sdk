// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeEvaluateTasksResponseBodyData data;

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

    public static DescribeEvaluateTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateTasksResponseBody self = new DescribeEvaluateTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateTasksResponseBody setData(DescribeEvaluateTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEvaluateTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeEvaluateTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEvaluateTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEvaluateTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEvaluateTasksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeEvaluateTasksResponseBodyDataEvaluateTask extends TeaModel {
        @NameInMap("AllSqlCount")
        public Integer allSqlCount;

        @NameInMap("BatchEvaluateTaskId")
        public Integer batchEvaluateTaskId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public Integer dbType;

        @NameInMap("EvalauteHours")
        public Integer evalauteHours;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstId")
        public String instId;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskName")
        public String taskName;

        public static DescribeEvaluateTasksResponseBodyDataEvaluateTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTasksResponseBodyDataEvaluateTask self = new DescribeEvaluateTasksResponseBodyDataEvaluateTask();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setAllSqlCount(Integer allSqlCount) {
            this.allSqlCount = allSqlCount;
            return this;
        }
        public Integer getAllSqlCount() {
            return this.allSqlCount;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setBatchEvaluateTaskId(Integer batchEvaluateTaskId) {
            this.batchEvaluateTaskId = batchEvaluateTaskId;
            return this;
        }
        public Integer getBatchEvaluateTaskId() {
            return this.batchEvaluateTaskId;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setDbType(Integer dbType) {
            this.dbType = dbType;
            return this;
        }
        public Integer getDbType() {
            return this.dbType;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setEvalauteHours(Integer evalauteHours) {
            this.evalauteHours = evalauteHours;
            return this;
        }
        public Integer getEvalauteHours() {
            return this.evalauteHours;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEvaluateTasksResponseBodyDataEvaluateTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class DescribeEvaluateTasksResponseBodyData extends TeaModel {
        @NameInMap("EvaluateTask")
        public java.util.List<DescribeEvaluateTasksResponseBodyDataEvaluateTask> evaluateTask;

        public static DescribeEvaluateTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluateTasksResponseBodyData self = new DescribeEvaluateTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluateTasksResponseBodyData setEvaluateTask(java.util.List<DescribeEvaluateTasksResponseBodyDataEvaluateTask> evaluateTask) {
            this.evaluateTask = evaluateTask;
            return this;
        }
        public java.util.List<DescribeEvaluateTasksResponseBodyDataEvaluateTask> getEvaluateTask() {
            return this.evaluateTask;
        }

    }

}
