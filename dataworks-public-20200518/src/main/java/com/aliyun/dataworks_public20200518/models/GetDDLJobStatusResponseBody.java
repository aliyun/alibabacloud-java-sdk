// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDDLJobStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetDDLJobStatusResponseBodyData data;

    public static GetDDLJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDDLJobStatusResponseBody self = new GetDDLJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDDLJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDDLJobStatusResponseBody setData(GetDDLJobStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDDLJobStatusResponseBodyData getData() {
        return this.data;
    }

    public static class GetDDLJobStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Content")
        public String content;

        public static GetDDLJobStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDDLJobStatusResponseBodyData self = new GetDDLJobStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDDLJobStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDDLJobStatusResponseBodyData setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public GetDDLJobStatusResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetDDLJobStatusResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
