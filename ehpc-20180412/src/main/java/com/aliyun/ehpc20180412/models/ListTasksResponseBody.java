// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of task information.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of entries of the task.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTasks(java.util.List<ListTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The current step of the task.</p>
         */
        @NameInMap("CurrentStep")
        public Integer currentStep;

        /**
         * <p>The list of error messages returned for the task.</p>
         * <br>
         * <p>For information about error messages and their solutions, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/EHPC).</p>
         */
        @NameInMap("Errors")
        public String errors;

        /**
         * <p>The request parameters of the task. The value is a JSON string.</p>
         */
        @NameInMap("Request")
        public String request;

        /**
         * <p>The result of the task. Valid values:</p>
         * <br>
         * <p>*   If TaskType is set to CreateCluster and AddComputes, the value is in the `{\"Instances\":[]}` format, which indicates the information of the nodes added to the cluster.</p>
         * <p>*   If TaskType is set to a value other than CreateCluster and AddComputes, the value is in the `{}` format.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   Processing: The task is running.</p>
         * <p>*   Success: The task is completed.</p>
         * <p>*   Fail: The task failed.</p>
         * <p>*   PartialFail: The task partially failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   CreateCluster: creates a cluster by calling the [CreateCluster](~~87100~~) operation.</p>
         * <p>*   StartCluster: starts a cluster by calling the [StartCluster](~~200345~~) operation.</p>
         * <p>*   StopCluster: stops a cluster by calling the [StopCluster](~~200346~~) operation.</p>
         * <p>*   DeleteCluster: releases a cluster by calling the [DeleteCluster](~~87110~~) operation.</p>
         * <p>*   AddComputes: adds nodes to a cluster by calling the [AddNodes](~~87147~~) operation.</p>
         * <p>*   StartComputes: starts nodes by calling the [StartNodes](~~87159~~) operation.</p>
         * <p>*   ResetCompute: resets nodes by calling the [ResetNodes](~~87158~~) operation.</p>
         * <p>*   StopComputes: stops nodes by calling the [StopNodes](~~87160~~) operation.</p>
         * <p>*   DeleteComputes: deletes nodes by calling the [DeleteNodes](~~87155~~) operation.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of steps of the task.</p>
         */
        @NameInMap("TotalSteps")
        public Integer totalSteps;

        public static ListTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasks self = new ListTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasks setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListTasksResponseBodyTasks setCurrentStep(Integer currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public Integer getCurrentStep() {
            return this.currentStep;
        }

        public ListTasksResponseBodyTasks setErrors(String errors) {
            this.errors = errors;
            return this;
        }
        public String getErrors() {
            return this.errors;
        }

        public ListTasksResponseBodyTasks setRequest(String request) {
            this.request = request;
            return this;
        }
        public String getRequest() {
            return this.request;
        }

        public ListTasksResponseBodyTasks setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTasksResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListTasksResponseBodyTasks setTotalSteps(Integer totalSteps) {
            this.totalSteps = totalSteps;
            return this;
        }
        public Integer getTotalSteps() {
            return this.totalSteps;
        }

    }

}
