// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo2DAvatarVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitTextTo2DAvatarVideoTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitTextTo2DAvatarVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextTo2DAvatarVideoTaskResponseBody self = new SubmitTextTo2DAvatarVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTextTo2DAvatarVideoTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTextTo2DAvatarVideoTaskResponseBody setData(SubmitTextTo2DAvatarVideoTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTextTo2DAvatarVideoTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitTextTo2DAvatarVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTextTo2DAvatarVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTextTo2DAvatarVideoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitTextTo2DAvatarVideoTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskUuid")
        public String taskUuid;

        public static SubmitTextTo2DAvatarVideoTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo2DAvatarVideoTaskResponseBodyData self = new SubmitTextTo2DAvatarVideoTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo2DAvatarVideoTaskResponseBodyData setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

    }

}
