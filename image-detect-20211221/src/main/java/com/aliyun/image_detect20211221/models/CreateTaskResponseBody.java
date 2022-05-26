// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class CreateTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Response")
    public CreateTaskResponseBodyResponse response;

    @NameInMap("Success")
    public String success;

    public static CreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskResponseBody self = new CreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskResponseBody setResponse(CreateTaskResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public CreateTaskResponseBodyResponse getResponse() {
        return this.response;
    }

    public CreateTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateTaskResponseBodyResponse extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        public static CreateTaskResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskResponseBodyResponse self = new CreateTaskResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public CreateTaskResponseBodyResponse setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

    }

}
