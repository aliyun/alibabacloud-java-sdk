// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateImageTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateImageTranslateTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A41F6E25-8520-4AF0-90EF-AF7E32840108</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateImageTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageTranslateTaskResponseBody self = new CreateImageTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageTranslateTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateImageTranslateTaskResponseBody setData(CreateImageTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateImageTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateImageTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateImageTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateImageTranslateTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>A41F6E25-8520-4AF0-90EF-111111</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateImageTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateImageTranslateTaskResponseBodyData self = new CreateImageTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateImageTranslateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
