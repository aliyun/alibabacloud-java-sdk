// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetTaskStatusByIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTaskStatusByIdResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>566331F9-5AB3-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTaskStatusByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusByIdResponseBody self = new GetTaskStatusByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusByIdResponseBody setData(GetTaskStatusByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskStatusByIdResponseBodyData getData() {
        return this.data;
    }

    public GetTaskStatusByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTaskStatusByIdResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>95906135</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        public static GetTaskStatusByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskStatusByIdResponseBodyData self = new GetTaskStatusByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskStatusByIdResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetTaskStatusByIdResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

    }

}
