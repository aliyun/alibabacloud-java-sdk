// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDISyncTasksResponseBody extends TeaModel {
    @NameInMap("success")
    public Boolean success;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public ExportDISyncTasksResponseBodyData data;

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

    public ExportDISyncTasksResponseBody setData(ExportDISyncTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportDISyncTasksResponseBodyData getData() {
        return this.data;
    }

    public static class ExportDISyncTasksResponseBodyData extends TeaModel {
        @NameInMap("realTimeSolution")
        public String realTimeSolution;

        public static ExportDISyncTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportDISyncTasksResponseBodyData self = new ExportDISyncTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportDISyncTasksResponseBodyData setRealTimeSolution(String realTimeSolution) {
            this.realTimeSolution = realTimeSolution;
            return this;
        }
        public String getRealTimeSolution() {
            return this.realTimeSolution;
        }

    }

}
