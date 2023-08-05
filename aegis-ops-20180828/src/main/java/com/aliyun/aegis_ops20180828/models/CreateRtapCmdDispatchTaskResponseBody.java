// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class CreateRtapCmdDispatchTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<CreateRtapCmdDispatchTaskResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeCost")
    public Long timeCost;

    public static CreateRtapCmdDispatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRtapCmdDispatchTaskResponseBody self = new CreateRtapCmdDispatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRtapCmdDispatchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRtapCmdDispatchTaskResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public CreateRtapCmdDispatchTaskResponseBody setData(java.util.List<CreateRtapCmdDispatchTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateRtapCmdDispatchTaskResponseBodyData> getData() {
        return this.data;
    }

    public CreateRtapCmdDispatchTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateRtapCmdDispatchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRtapCmdDispatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRtapCmdDispatchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateRtapCmdDispatchTaskResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class CreateRtapCmdDispatchTaskResponseBodyData extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Process")
        public Integer process;

        @NameInMap("Result")
        public String result;

        @NameInMap("RootTaskId")
        public String rootTaskId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Uuid")
        public String uuid;

        public static CreateRtapCmdDispatchTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRtapCmdDispatchTaskResponseBodyData self = new CreateRtapCmdDispatchTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRtapCmdDispatchTaskResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public CreateRtapCmdDispatchTaskResponseBodyData setProcess(Integer process) {
            this.process = process;
            return this;
        }
        public Integer getProcess() {
            return this.process;
        }

        public CreateRtapCmdDispatchTaskResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CreateRtapCmdDispatchTaskResponseBodyData setRootTaskId(String rootTaskId) {
            this.rootTaskId = rootTaskId;
            return this;
        }
        public String getRootTaskId() {
            return this.rootTaskId;
        }

        public CreateRtapCmdDispatchTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateRtapCmdDispatchTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateRtapCmdDispatchTaskResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
