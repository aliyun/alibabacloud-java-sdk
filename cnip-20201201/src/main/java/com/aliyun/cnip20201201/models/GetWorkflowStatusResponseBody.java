// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetWorkflowStatusResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetWorkflowStatusResponseBodyData> data;

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

    public GetWorkflowStatusResponseBody setData(java.util.List<GetWorkflowStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetWorkflowStatusResponseBodyData> getData() {
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

    public static class GetWorkflowStatusResponseBodyDataWorkflowTasks extends TeaModel {
        // task name
        @NameInMap("name")
        public String name;

        // task status
        @NameInMap("status")
        public String status;

        public static GetWorkflowStatusResponseBodyDataWorkflowTasks build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowStatusResponseBodyDataWorkflowTasks self = new GetWorkflowStatusResponseBodyDataWorkflowTasks();
            return TeaModel.build(map, self);
        }

        public GetWorkflowStatusResponseBodyDataWorkflowTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowStatusResponseBodyDataWorkflowTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetWorkflowStatusResponseBodyData extends TeaModel {
        // step name
        @NameInMap("name")
        public String name;

        // step status
        @NameInMap("status")
        public String status;

        @NameInMap("workflowTasks")
        public java.util.List<GetWorkflowStatusResponseBodyDataWorkflowTasks> workflowTasks;

        public static GetWorkflowStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowStatusResponseBodyData self = new GetWorkflowStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkflowStatusResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkflowStatusResponseBodyData setWorkflowTasks(java.util.List<GetWorkflowStatusResponseBodyDataWorkflowTasks> workflowTasks) {
            this.workflowTasks = workflowTasks;
            return this;
        }
        public java.util.List<GetWorkflowStatusResponseBodyDataWorkflowTasks> getWorkflowTasks() {
            return this.workflowTasks;
        }

    }

}
