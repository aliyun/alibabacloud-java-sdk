// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class QueryCloudNativeTaskStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<QueryCloudNativeTaskStatusResponseBodyData> data;

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

    public static QueryCloudNativeTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudNativeTaskStatusResponseBody self = new QueryCloudNativeTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCloudNativeTaskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCloudNativeTaskStatusResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryCloudNativeTaskStatusResponseBody setData(java.util.List<QueryCloudNativeTaskStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCloudNativeTaskStatusResponseBodyData> getData() {
        return this.data;
    }

    public QueryCloudNativeTaskStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryCloudNativeTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCloudNativeTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCloudNativeTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCloudNativeTaskStatusResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class QueryCloudNativeTaskStatusResponseBodyData extends TeaModel {
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

        public static QueryCloudNativeTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudNativeTaskStatusResponseBodyData self = new QueryCloudNativeTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCloudNativeTaskStatusResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public QueryCloudNativeTaskStatusResponseBodyData setProcess(Integer process) {
            this.process = process;
            return this;
        }
        public Integer getProcess() {
            return this.process;
        }

        public QueryCloudNativeTaskStatusResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryCloudNativeTaskStatusResponseBodyData setRootTaskId(String rootTaskId) {
            this.rootTaskId = rootTaskId;
            return this;
        }
        public String getRootTaskId() {
            return this.rootTaskId;
        }

        public QueryCloudNativeTaskStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCloudNativeTaskStatusResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryCloudNativeTaskStatusResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
