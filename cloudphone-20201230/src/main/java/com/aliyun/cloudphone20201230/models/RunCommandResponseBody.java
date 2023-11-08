// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RunCommandResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task IDs.</p>
     */
    @NameInMap("TaskId")
    public RunCommandResponseBodyTaskId taskId;

    public static RunCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponseBody self = new RunCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCommandResponseBody setTaskId(RunCommandResponseBodyTaskId taskId) {
        this.taskId = taskId;
        return this;
    }
    public RunCommandResponseBodyTaskId getTaskId() {
        return this.taskId;
    }

    public static class RunCommandResponseBodyTaskId extends TeaModel {
        @NameInMap("TaskId")
        public java.util.List<String> taskId;

        public static RunCommandResponseBodyTaskId build(java.util.Map<String, ?> map) throws Exception {
            RunCommandResponseBodyTaskId self = new RunCommandResponseBodyTaskId();
            return TeaModel.build(map, self);
        }

        public RunCommandResponseBodyTaskId setTaskId(java.util.List<String> taskId) {
            this.taskId = taskId;
            return this;
        }
        public java.util.List<String> getTaskId() {
            return this.taskId;
        }

    }

}
