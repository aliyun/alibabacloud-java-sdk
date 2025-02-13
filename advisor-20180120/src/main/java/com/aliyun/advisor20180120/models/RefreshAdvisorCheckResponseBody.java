// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCheckResponseBody extends TeaModel {
    @NameInMap("Data")
    public RefreshAdvisorCheckResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>566331F9-5AB3-550F-B745-A730331F97A9</p>
     */
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
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>manual-1be17af1121b4974822e69daee4f2481</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RefreshAdvisorCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshAdvisorCheckResponseBodyData self = new RefreshAdvisorCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshAdvisorCheckResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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
