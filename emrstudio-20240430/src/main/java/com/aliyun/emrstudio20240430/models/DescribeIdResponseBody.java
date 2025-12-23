// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>p-123****</p>
     */
    @NameInMap("data")
    public DescribeIdResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdResponseBody self = new DescribeIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIdResponseBody setData(DescribeIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeIdResponseBodyData getData() {
        return this.data;
    }

    public DescribeIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>p-123****</p>
         */
        @NameInMap("inputId")
        public String inputId;

        /**
         * <strong>example:</strong>
         * <p>PROJECT</p>
         */
        @NameInMap("inputIdType")
        public String inputIdType;

        /**
         * <strong>example:</strong>
         * <p>mt-123****</p>
         */
        @NameInMap("manualTaskId")
        public String manualTaskId;

        /**
         * <strong>example:</strong>
         * <p>mti-123****</p>
         */
        @NameInMap("manualTaskInstanceId")
        public String manualTaskInstanceId;

        /**
         * <strong>example:</strong>
         * <p>p-123****</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>t-123****</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>ti-123****</p>
         */
        @NameInMap("taskInstanceId")
        public String taskInstanceId;

        /**
         * <strong>example:</strong>
         * <p>w-123****</p>
         */
        @NameInMap("workflowId")
        public String workflowId;

        /**
         * <strong>example:</strong>
         * <p>wi-123****</p>
         */
        @NameInMap("workflowInstanceId")
        public String workflowInstanceId;

        /**
         * <strong>example:</strong>
         * <p>workspace-123****</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static DescribeIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeIdResponseBodyData self = new DescribeIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeIdResponseBodyData setInputId(String inputId) {
            this.inputId = inputId;
            return this;
        }
        public String getInputId() {
            return this.inputId;
        }

        public DescribeIdResponseBodyData setInputIdType(String inputIdType) {
            this.inputIdType = inputIdType;
            return this;
        }
        public String getInputIdType() {
            return this.inputIdType;
        }

        public DescribeIdResponseBodyData setManualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        public DescribeIdResponseBodyData setManualTaskInstanceId(String manualTaskInstanceId) {
            this.manualTaskInstanceId = manualTaskInstanceId;
            return this;
        }
        public String getManualTaskInstanceId() {
            return this.manualTaskInstanceId;
        }

        public DescribeIdResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeIdResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeIdResponseBodyData setTaskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public DescribeIdResponseBodyData setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

        public DescribeIdResponseBodyData setWorkflowInstanceId(String workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public String getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public DescribeIdResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
