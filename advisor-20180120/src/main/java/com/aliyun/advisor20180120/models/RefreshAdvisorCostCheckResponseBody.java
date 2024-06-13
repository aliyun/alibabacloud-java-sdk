// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCostCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RefreshAdvisorCostCheckResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RefreshAdvisorCostCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCostCheckResponseBody self = new RefreshAdvisorCostCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCostCheckResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshAdvisorCostCheckResponseBody setData(RefreshAdvisorCostCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshAdvisorCostCheckResponseBodyData getData() {
        return this.data;
    }

    public RefreshAdvisorCostCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshAdvisorCostCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshAdvisorCostCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefreshAdvisorCostCheckResponseBodyData extends TeaModel {
        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("ManagerTaskId")
        public Long managerTaskId;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskId")
        public Long taskId;

        public static RefreshAdvisorCostCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshAdvisorCostCheckResponseBodyData self = new RefreshAdvisorCostCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshAdvisorCostCheckResponseBodyData setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public RefreshAdvisorCostCheckResponseBodyData setManagerTaskId(Long managerTaskId) {
            this.managerTaskId = managerTaskId;
            return this;
        }
        public Long getManagerTaskId() {
            return this.managerTaskId;
        }

        public RefreshAdvisorCostCheckResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public RefreshAdvisorCostCheckResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
