// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetTaskStatusByIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTaskStatusByIdResponseBodyData data;

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
        @NameInMap("TaskId")
        public Long taskId;

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
