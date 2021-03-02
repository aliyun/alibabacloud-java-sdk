// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class CreateFilePredictResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateFilePredictResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static CreateFilePredictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFilePredictResponseBody self = new CreateFilePredictResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFilePredictResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFilePredictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFilePredictResponseBody setData(CreateFilePredictResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateFilePredictResponseBodyData getData() {
        return this.data;
    }

    public CreateFilePredictResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateFilePredictResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static CreateFilePredictResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateFilePredictResponseBodyData self = new CreateFilePredictResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateFilePredictResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
