// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class SendFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task IDs. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("TaskId")
    public SendFileResponseBodyTaskId taskId;

    public static SendFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendFileResponseBody self = new SendFileResponseBody();
        return TeaModel.build(map, self);
    }

    public SendFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendFileResponseBody setTaskId(SendFileResponseBodyTaskId taskId) {
        this.taskId = taskId;
        return this;
    }
    public SendFileResponseBodyTaskId getTaskId() {
        return this.taskId;
    }

    public static class SendFileResponseBodyTaskId extends TeaModel {
        @NameInMap("TaskId")
        public java.util.List<String> taskId;

        public static SendFileResponseBodyTaskId build(java.util.Map<String, ?> map) throws Exception {
            SendFileResponseBodyTaskId self = new SendFileResponseBodyTaskId();
            return TeaModel.build(map, self);
        }

        public SendFileResponseBodyTaskId setTaskId(java.util.List<String> taskId) {
            this.taskId = taskId;
            return this;
        }
        public java.util.List<String> getTaskId() {
            return this.taskId;
        }

    }

}
