// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDISyncTasksResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskDetail")
    public ExportDISyncTasksResponseBodyTaskDetail taskDetail;

    public static ExportDISyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDISyncTasksResponseBody self = new ExportDISyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDISyncTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExportDISyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDISyncTasksResponseBody setTaskDetail(ExportDISyncTasksResponseBodyTaskDetail taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public ExportDISyncTasksResponseBodyTaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static class ExportDISyncTasksResponseBodyTaskDetail extends TeaModel {
        @NameInMap("RealTimeSolution")
        public String realTimeSolution;

        public static ExportDISyncTasksResponseBodyTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            ExportDISyncTasksResponseBodyTaskDetail self = new ExportDISyncTasksResponseBodyTaskDetail();
            return TeaModel.build(map, self);
        }

        public ExportDISyncTasksResponseBodyTaskDetail setRealTimeSolution(String realTimeSolution) {
            this.realTimeSolution = realTimeSolution;
            return this;
        }
        public String getRealTimeSolution() {
            return this.realTimeSolution;
        }

    }

}
