// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class UninstallApplicationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("TaskId")
    public UninstallApplicationResponseBodyTaskId taskId;

    public static UninstallApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallApplicationResponseBody self = new UninstallApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallApplicationResponseBody setTaskId(UninstallApplicationResponseBodyTaskId taskId) {
        this.taskId = taskId;
        return this;
    }
    public UninstallApplicationResponseBodyTaskId getTaskId() {
        return this.taskId;
    }

    public static class UninstallApplicationResponseBodyTaskId extends TeaModel {
        @NameInMap("TaskId")
        public java.util.List<String> taskId;

        public static UninstallApplicationResponseBodyTaskId build(java.util.Map<String, ?> map) throws Exception {
            UninstallApplicationResponseBodyTaskId self = new UninstallApplicationResponseBodyTaskId();
            return TeaModel.build(map, self);
        }

        public UninstallApplicationResponseBodyTaskId setTaskId(java.util.List<String> taskId) {
            this.taskId = taskId;
            return this;
        }
        public java.util.List<String> getTaskId() {
            return this.taskId;
        }

    }

}
