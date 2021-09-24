// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDISyncTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskInfo")
    @Validation(required = true)
    public ImportDISyncTasksResponseTaskInfo taskInfo;

    public static ImportDISyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDISyncTasksResponse self = new ImportDISyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public ImportDISyncTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportDISyncTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportDISyncTasksResponse setTaskInfo(ImportDISyncTasksResponseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public ImportDISyncTasksResponseTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class ImportDISyncTasksResponseTaskInfo extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public Long taskId;

        public static ImportDISyncTasksResponseTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ImportDISyncTasksResponseTaskInfo self = new ImportDISyncTasksResponseTaskInfo();
            return TeaModel.build(map, self);
        }

        public ImportDISyncTasksResponseTaskInfo setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
