// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateRealTimeProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateRealTimeProcessResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateRealTimeProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRealTimeProcessResponseBody self = new CreateRealTimeProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRealTimeProcessResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateRealTimeProcessResponseBody setData(CreateRealTimeProcessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRealTimeProcessResponseBodyData getData() {
        return this.data;
    }

    public CreateRealTimeProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRealTimeProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateRealTimeProcessResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static CreateRealTimeProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRealTimeProcessResponseBodyData self = new CreateRealTimeProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRealTimeProcessResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
