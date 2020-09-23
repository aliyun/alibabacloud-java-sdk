// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDDLJobStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDDLJobStatusResponseData data;

    public static GetDDLJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDDLJobStatusResponse self = new GetDDLJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDDLJobStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDDLJobStatusResponse setData(GetDDLJobStatusResponseData data) {
        this.data = data;
        return this;
    }
    public GetDDLJobStatusResponseData getData() {
        return this.data;
    }

    public static class GetDDLJobStatusResponseData extends TeaModel {
        @NameInMap("NextTaskId")
        @Validation(required = true)
        public String nextTaskId;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        public static GetDDLJobStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDDLJobStatusResponseData self = new GetDDLJobStatusResponseData();
            return TeaModel.build(map, self);
        }

        public GetDDLJobStatusResponseData setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public GetDDLJobStatusResponseData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDDLJobStatusResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDDLJobStatusResponseData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
