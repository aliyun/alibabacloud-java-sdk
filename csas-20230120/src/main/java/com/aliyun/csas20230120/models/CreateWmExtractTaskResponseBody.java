// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmExtractTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateWmExtractTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWmExtractTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWmExtractTaskResponseBody self = new CreateWmExtractTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWmExtractTaskResponseBody setData(CreateWmExtractTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWmExtractTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateWmExtractTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateWmExtractTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wmt-9648c22d2eb2cb57bb855dcae7898464********</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateWmExtractTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWmExtractTaskResponseBodyData self = new CreateWmExtractTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWmExtractTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
