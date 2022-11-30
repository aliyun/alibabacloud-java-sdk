// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitTextTo3DAvatarVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitTextTo3DAvatarVideoTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitTextTo3DAvatarVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextTo3DAvatarVideoTaskResponseBody self = new SubmitTextTo3DAvatarVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTextTo3DAvatarVideoTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTextTo3DAvatarVideoTaskResponseBody setData(SubmitTextTo3DAvatarVideoTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTextTo3DAvatarVideoTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitTextTo3DAvatarVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTextTo3DAvatarVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTextTo3DAvatarVideoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitTextTo3DAvatarVideoTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskUuid")
        public String taskUuid;

        public static SubmitTextTo3DAvatarVideoTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTextTo3DAvatarVideoTaskResponseBodyData self = new SubmitTextTo3DAvatarVideoTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTextTo3DAvatarVideoTaskResponseBodyData setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

    }

}
