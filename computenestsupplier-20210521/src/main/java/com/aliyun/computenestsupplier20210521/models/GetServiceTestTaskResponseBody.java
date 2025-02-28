// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceTestTaskResponseBody extends TeaModel {
    /**
     * <p>The execution details.</p>
     */
    @NameInMap("ExecutionDetails")
    public java.util.List<GetServiceTestTaskResponseBodyExecutionDetails> executionDetails;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A361BA9E-xxxx-xxxx-xxxx-C26E5180456E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the service test task. Valid values:</p>
     * <ul>
     * <li>Running</li>
     * <li>Success</li>
     * <li>Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The task execution region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("TaskRegionId")
    public String taskRegionId;

    public static GetServiceTestTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTestTaskResponseBody self = new GetServiceTestTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceTestTaskResponseBody setExecutionDetails(java.util.List<GetServiceTestTaskResponseBodyExecutionDetails> executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }
    public java.util.List<GetServiceTestTaskResponseBodyExecutionDetails> getExecutionDetails() {
        return this.executionDetails;
    }

    public GetServiceTestTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceTestTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceTestTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetServiceTestTaskResponseBody setTaskRegionId(String taskRegionId) {
        this.taskRegionId = taskRegionId;
        return this;
    }
    public String getTaskRegionId() {
        return this.taskRegionId;
    }

    public static class GetServiceTestTaskResponseBodyExecutionDetails extends TeaModel {
        /**
         * <p>The service test case name.</p>
         * 
         * <strong>example:</strong>
         * <p>case1</p>
         */
        @NameInMap("CaseName")
        public String caseName;

        /**
         * <p>The execution report</p>
         * 
         * <strong>example:</strong>
         * <hr>
         * <p>Region: cn-qingdao
         * StackName: iact3-default-cn-qingd
         * StackId: 009d2991-f494-d</p>
         * <hr>
         */
        @NameInMap("ExecutionReport")
        public String executionReport;

        /**
         * <p>The sub task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Runing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sub task id.</p>
         * 
         * <strong>example:</strong>
         * <p>stt-xxxx</p>
         */
        @NameInMap("SubTaskId")
        public String subTaskId;

        public static GetServiceTestTaskResponseBodyExecutionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetServiceTestTaskResponseBodyExecutionDetails self = new GetServiceTestTaskResponseBodyExecutionDetails();
            return TeaModel.build(map, self);
        }

        public GetServiceTestTaskResponseBodyExecutionDetails setCaseName(String caseName) {
            this.caseName = caseName;
            return this;
        }
        public String getCaseName() {
            return this.caseName;
        }

        public GetServiceTestTaskResponseBodyExecutionDetails setExecutionReport(String executionReport) {
            this.executionReport = executionReport;
            return this;
        }
        public String getExecutionReport() {
            return this.executionReport;
        }

        public GetServiceTestTaskResponseBodyExecutionDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceTestTaskResponseBodyExecutionDetails setSubTaskId(String subTaskId) {
            this.subTaskId = subTaskId;
            return this;
        }
        public String getSubTaskId() {
            return this.subTaskId;
        }

    }

}
