// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AsyncCreateClipsTaskResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AsyncCreateClipsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTaskResponseBody self = new AsyncCreateClipsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AsyncCreateClipsTaskResponseBody setData(AsyncCreateClipsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AsyncCreateClipsTaskResponseBodyData getData() {
        return this.data;
    }

    public AsyncCreateClipsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AsyncCreateClipsTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static AsyncCreateClipsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AsyncCreateClipsTaskResponseBodyData self = new AsyncCreateClipsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AsyncCreateClipsTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
