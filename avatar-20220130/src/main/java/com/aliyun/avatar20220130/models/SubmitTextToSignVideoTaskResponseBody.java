// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextToSignVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitTextToSignVideoTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static SubmitTextToSignVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextToSignVideoTaskResponseBody self = new SubmitTextToSignVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTextToSignVideoTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTextToSignVideoTaskResponseBody setData(SubmitTextToSignVideoTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTextToSignVideoTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitTextToSignVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTextToSignVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTextToSignVideoTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class SubmitTextToSignVideoTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskUuid")
        public String taskUuid;

        public static SubmitTextToSignVideoTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextToSignVideoTaskResponseBodyData self = new SubmitTextToSignVideoTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTextToSignVideoTaskResponseBodyData setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

    }

}
