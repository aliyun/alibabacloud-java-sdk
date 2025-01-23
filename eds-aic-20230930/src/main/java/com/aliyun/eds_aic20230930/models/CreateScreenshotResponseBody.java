// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateScreenshotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3AF82CE1-2801-52CE-BF64-B491DD7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<CreateScreenshotResponseBodyTasks> tasks;

    public static CreateScreenshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenshotResponseBody self = new CreateScreenshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScreenshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScreenshotResponseBody setTasks(java.util.List<CreateScreenshotResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<CreateScreenshotResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class CreateScreenshotResponseBodyTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acp-bwhtebzah2fse****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <strong>example:</strong>
         * <p>t-imr0fufqd7cle****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateScreenshotResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            CreateScreenshotResponseBodyTasks self = new CreateScreenshotResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public CreateScreenshotResponseBodyTasks setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public CreateScreenshotResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
