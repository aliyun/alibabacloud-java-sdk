// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmEmbedTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateWmEmbedTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWmEmbedTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWmEmbedTaskResponseBody self = new CreateWmEmbedTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWmEmbedTaskResponseBody setData(CreateWmEmbedTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWmEmbedTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateWmEmbedTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateWmEmbedTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>job:5GfrJYsoaffmCE7Z5bZtjUefzxfd****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateWmEmbedTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskResponseBodyData self = new CreateWmEmbedTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
