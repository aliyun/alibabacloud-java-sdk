// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDISyncTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskDetail")
    @Validation(required = true)
    public ExportDISyncTasksResponseTaskDetail taskDetail;

    public static ExportDISyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDISyncTasksResponse self = new ExportDISyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public ExportDISyncTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDISyncTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExportDISyncTasksResponse setTaskDetail(ExportDISyncTasksResponseTaskDetail taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public ExportDISyncTasksResponseTaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static class ExportDISyncTasksResponseTaskDetail extends TeaModel {
        @NameInMap("RealTimeSolution")
        @Validation(required = true)
        public String realTimeSolution;

        public static ExportDISyncTasksResponseTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            ExportDISyncTasksResponseTaskDetail self = new ExportDISyncTasksResponseTaskDetail();
            return TeaModel.build(map, self);
        }

        public ExportDISyncTasksResponseTaskDetail setRealTimeSolution(String realTimeSolution) {
            this.realTimeSolution = realTimeSolution;
            return this;
        }
        public String getRealTimeSolution() {
            return this.realTimeSolution;
        }

    }

}
