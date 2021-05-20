// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDISyncTasksResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public ImportDISyncTasksResponseBodyTaskInfo taskInfo;

    public static ImportDISyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportDISyncTasksResponseBody self = new ImportDISyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportDISyncTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportDISyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDISyncTasksResponseBody setTaskInfo(ImportDISyncTasksResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public ImportDISyncTasksResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class ImportDISyncTasksResponseBodyTaskInfo extends TeaModel {
        @NameInMap("TaskId")
        public Long taskId;

        public static ImportDISyncTasksResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ImportDISyncTasksResponseBodyTaskInfo self = new ImportDISyncTasksResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public ImportDISyncTasksResponseBodyTaskInfo setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
