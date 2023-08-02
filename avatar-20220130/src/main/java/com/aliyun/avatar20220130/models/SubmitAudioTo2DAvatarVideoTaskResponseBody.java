// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAudioTo2DAvatarVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitAudioTo2DAvatarVideoTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitAudioTo2DAvatarVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioTo2DAvatarVideoTaskResponseBody self = new SubmitAudioTo2DAvatarVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAudioTo2DAvatarVideoTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitAudioTo2DAvatarVideoTaskResponseBody setData(SubmitAudioTo2DAvatarVideoTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAudioTo2DAvatarVideoTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitAudioTo2DAvatarVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAudioTo2DAvatarVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAudioTo2DAvatarVideoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitAudioTo2DAvatarVideoTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskUuid")
        public String taskUuid;

        public static SubmitAudioTo2DAvatarVideoTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAudioTo2DAvatarVideoTaskResponseBodyData self = new SubmitAudioTo2DAvatarVideoTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAudioTo2DAvatarVideoTaskResponseBodyData setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

    }

}
