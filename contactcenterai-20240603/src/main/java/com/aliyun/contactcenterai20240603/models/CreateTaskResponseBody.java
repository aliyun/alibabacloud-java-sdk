// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class CreateTaskResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>9F1DB065-AE0D-5EE3-B1AF-48632CB0831C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public String success;

    public static CreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskResponseBody self = new CreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskResponseBody setData(CreateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20240905-********-93E9-5D45-B4EF-045743A34071</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskResponseBodyData self = new CreateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
