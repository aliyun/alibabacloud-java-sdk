// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetWorkflowStatusResponseBody extends TeaModel {
    @NameInMap("data")
    public GetWorkflowStatusResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetWorkflowStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowStatusResponseBody self = new GetWorkflowStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowStatusResponseBody setData(GetWorkflowStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkflowStatusResponseBodyData getData() {
        return this.data;
    }

    public GetWorkflowStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetWorkflowStatusResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetWorkflowStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks extends TeaModel {
        // task name
        @NameInMap("name")
        public String name;

        // task status
        @NameInMap("status")
        public String status;

        public static GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks self = new GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks();
            return TeaModel.build(map, self);
        }

        public GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowStatusResponseBodyDataStepStatus extends TeaModel {
        // step name
        @NameInMap("name")
        public String name;

        // step status
        @NameInMap("status")
        public String status;

        @NameInMap("workflowTasks")
        public java.util.List<GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks> workflowTasks;

        public static GetWorkflowStatusResponseBodyDataStepStatus build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowStatusResponseBodyDataStepStatus self = new GetWorkflowStatusResponseBodyDataStepStatus();
            return TeaModel.build(map, self);
        }

        public GetWorkflowStatusResponseBodyDataStepStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowStatusResponseBodyDataStepStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkflowStatusResponseBodyDataStepStatus setWorkflowTasks(java.util.List<GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks> workflowTasks) {
            this.workflowTasks = workflowTasks;
            return this;
        }
        public java.util.List<GetWorkflowStatusResponseBodyDataStepStatusWorkflowTasks> getWorkflowTasks() {
            return this.workflowTasks;
        }

    }

    public static class GetWorkflowStatusResponseBodyData extends TeaModel {
        @NameInMap("status")
        public String status;

        @NameInMap("stepStatus")
        public GetWorkflowStatusResponseBodyDataStepStatus stepStatus;

        public static GetWorkflowStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowStatusResponseBodyData self = new GetWorkflowStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkflowStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkflowStatusResponseBodyData setStepStatus(GetWorkflowStatusResponseBodyDataStepStatus stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public GetWorkflowStatusResponseBodyDataStepStatus getStepStatus() {
            return this.stepStatus;
        }

    }

}
