// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDDLJobStatusResponseBody extends TeaModel {
    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("Data")
    public GetDDLJobStatusResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The content of the task.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the ongoing task. If no value is returned for this parameter, all subtasks are complete.</p>
         */
        @NameInMap("NextTaskId")
        public String nextTaskId;

        /**
         * <p>The status of the task</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
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
