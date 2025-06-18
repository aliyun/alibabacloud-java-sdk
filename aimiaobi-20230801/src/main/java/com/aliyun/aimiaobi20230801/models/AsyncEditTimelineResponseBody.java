// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncEditTimelineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AsyncEditTimelineResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AsyncEditTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsyncEditTimelineResponseBody self = new AsyncEditTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public AsyncEditTimelineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AsyncEditTimelineResponseBody setData(AsyncEditTimelineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AsyncEditTimelineResponseBodyData getData() {
        return this.data;
    }

    public AsyncEditTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AsyncEditTimelineResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>51e4efd1908242eb93ca9bbb7fc4359d</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static AsyncEditTimelineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AsyncEditTimelineResponseBodyData self = new AsyncEditTimelineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AsyncEditTimelineResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AsyncEditTimelineResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
