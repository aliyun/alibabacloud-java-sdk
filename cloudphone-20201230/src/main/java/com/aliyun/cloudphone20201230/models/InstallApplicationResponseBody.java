// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class InstallApplicationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task IDs.</p>
     */
    @NameInMap("TaskId")
    public InstallApplicationResponseBodyTaskId taskId;

    public static InstallApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallApplicationResponseBody self = new InstallApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallApplicationResponseBody setTaskId(InstallApplicationResponseBodyTaskId taskId) {
        this.taskId = taskId;
        return this;
    }
    public InstallApplicationResponseBodyTaskId getTaskId() {
        return this.taskId;
    }

    public static class InstallApplicationResponseBodyTaskId extends TeaModel {
        @NameInMap("TaskId")
        public java.util.List<String> taskId;

        public static InstallApplicationResponseBodyTaskId build(java.util.Map<String, ?> map) throws Exception {
            InstallApplicationResponseBodyTaskId self = new InstallApplicationResponseBodyTaskId();
            return TeaModel.build(map, self);
        }

        public InstallApplicationResponseBodyTaskId setTaskId(java.util.List<String> taskId) {
            this.taskId = taskId;
            return this;
        }
        public java.util.List<String> getTaskId() {
            return this.taskId;
        }

    }

}
