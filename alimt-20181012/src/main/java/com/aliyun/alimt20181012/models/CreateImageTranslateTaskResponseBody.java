// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateImageTranslateTaskResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateImageTranslateTaskResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static CreateImageTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageTranslateTaskResponseBody self = new CreateImageTranslateTaskResponseBody();
        return TeaModel.build(map, self);
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

    public CreateImageTranslateTaskResponseBody setData(CreateImageTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateImageTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateImageTranslateTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class CreateImageTranslateTaskResponseBodyData extends TeaModel {
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
