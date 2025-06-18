// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTimeLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AsyncCreateClipsTimeLineResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AsyncCreateClipsTimeLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTimeLineResponseBody self = new AsyncCreateClipsTimeLineResponseBody();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTimeLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AsyncCreateClipsTimeLineResponseBody setData(AsyncCreateClipsTimeLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AsyncCreateClipsTimeLineResponseBodyData getData() {
        return this.data;
    }

    public AsyncCreateClipsTimeLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AsyncCreateClipsTimeLineResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static AsyncCreateClipsTimeLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AsyncCreateClipsTimeLineResponseBodyData self = new AsyncCreateClipsTimeLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AsyncCreateClipsTimeLineResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
