// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitAvatarVideoTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitAvatarVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarVideoTaskResponseBody self = new SubmitAvatarVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarVideoTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitAvatarVideoTaskResponseBody setData(SubmitAvatarVideoTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAvatarVideoTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitAvatarVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAvatarVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAvatarVideoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitAvatarVideoTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskUuid")
        public String taskUuid;

        public static SubmitAvatarVideoTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAvatarVideoTaskResponseBodyData self = new SubmitAvatarVideoTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAvatarVideoTaskResponseBodyData setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

    }

}
