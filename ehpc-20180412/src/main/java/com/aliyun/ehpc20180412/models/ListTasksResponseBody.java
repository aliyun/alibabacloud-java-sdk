// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89A1AC0F-4A6C-4F3D-98F9-BEF9A823****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The current step of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("CurrentStep")
        public Integer currentStep;

        /**
         * <p>The error messages returned for the task.</p>
         * <p>You can view the error messages and the corresponding solutions in the <a href="https://error-center.alibabacloud.com/status/product/EHPC">Error Center</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Errors")
        public String errors;

        /**
         * <p>The request parameters of the task. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;requestId\&quot;:\&quot;0A6CA33E-BFBF-4F92-BDAE-4E8860DA****\&quot;,\&quot;uid\&quot;:\&quot;160998252992****\&quot;,\&quot;bid\&quot;:\&quot;268**\&quot;,\&quot;clusterId\&quot;:\&quot;ehpc-hz-ysQtcZ****\&quot;}</p>
         */
        @NameInMap("Request")
        public String request;

        /**
         * <p>The result of the task. Valid values:</p>
         * <ul>
         * <li>If you set TaskType to CreateCluster or AddComputes, the value of this parameter is in the <code>{\\&quot;Instances\\&quot;:[]}</code> format. The value indicates the information about the nodes that are added to the cluster.</li>
         * <li>If you set TaskType to a value other than CreateCluster and AddComputes, the value of this parameter is in the <code>{}</code> format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Instances\&quot;:[{\&quot;InstanceId\&quot;:\&quot;i-bp1inb1j2xz8pnoi****\&quot;,\&quot;Ip\&quot;:\&quot;192.168.<em>.</em>\&quot;,\&quot;Hostname\&quot;:\&quot;login0\&quot;,\&quot;role\&quot;:\&quot;login\&quot;}]}</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>Processing: The task is running.</li>
         * <li>Success: The task succeeded.</li>
         * <li>Failed: The task failed.</li>
         * <li>PartialFail: The task partially failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>CreateCluster: creates a cluster by calling the <a href="https://help.aliyun.com/document_detail/87100.html">CreateCluster</a> operation.</li>
         * <li>StartCluster: starts a cluster by calling the <a href="https://help.aliyun.com/document_detail/200345.html">StartCluster</a> operation.</li>
         * <li>StopCluster: stops a cluster by calling the <a href="https://help.aliyun.com/document_detail/200346.html">StopCluster</a> operation.</li>
         * <li>DeleteCluster: releases a cluster by calling the <a href="https://help.aliyun.com/document_detail/87110.html">DeleteCluster</a> operation.</li>
         * <li>AddComputes: adds nodes to a cluster by calling the <a href="https://help.aliyun.com/document_detail/87147.html">AddNodes</a> operation.</li>
         * <li>StartComputes: starts nodes by calling the <a href="https://help.aliyun.com/document_detail/87159.html">StartNodes</a> operation.</li>
         * <li>ResetCompute: resets nodes by calling the <a href="https://help.aliyun.com/document_detail/87158.html">ResetNodes</a> operation.</li>
         * <li>StopComputes: stops nodes by calling the <a href="https://help.aliyun.com/document_detail/87160.html">StopNodes</a> operation.</li>
         * <li>DeleteComputes: deletes nodes by calling the <a href="https://help.aliyun.com/document_detail/87155.html">DeleteNodes</a> operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StopCluster</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of steps of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
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
