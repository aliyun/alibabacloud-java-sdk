// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDDLJobStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDDLJobStatusResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDDLJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDDLJobStatusResponseBody self = new GetDDLJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDDLJobStatusResponseBody setData(GetDDLJobStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDDLJobStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDDLJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDDLJobStatusResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("NextTaskId")
        public String nextTaskId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static GetDDLJobStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDDLJobStatusResponseBodyData self = new GetDDLJobStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDDLJobStatusResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDDLJobStatusResponseBodyData setNextTaskId(String nextTaskId) {
            this.nextTaskId = nextTaskId;
            return this;
        }
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        public GetDDLJobStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDDLJobStatusResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
