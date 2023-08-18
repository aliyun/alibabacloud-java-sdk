// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCheckResponseBody extends TeaModel {
    @NameInMap("Data")
    public RefreshAdvisorCheckResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RefreshAdvisorCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCheckResponseBody self = new RefreshAdvisorCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCheckResponseBody setData(RefreshAdvisorCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshAdvisorCheckResponseBodyData getData() {
        return this.data;
    }

    public RefreshAdvisorCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RefreshAdvisorCheckResponseBodyData extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TraceId")
        public String traceId;

        public static RefreshAdvisorCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshAdvisorCheckResponseBodyData self = new RefreshAdvisorCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshAdvisorCheckResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public RefreshAdvisorCheckResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public RefreshAdvisorCheckResponseBodyData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
