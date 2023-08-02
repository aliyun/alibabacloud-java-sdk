// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SubmitAudioTo3DAvatarVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitAudioTo3DAvatarVideoTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitAudioTo3DAvatarVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioTo3DAvatarVideoTaskResponseBody self = new SubmitAudioTo3DAvatarVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAudioTo3DAvatarVideoTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitAudioTo3DAvatarVideoTaskResponseBody setData(SubmitAudioTo3DAvatarVideoTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAudioTo3DAvatarVideoTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitAudioTo3DAvatarVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAudioTo3DAvatarVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAudioTo3DAvatarVideoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitAudioTo3DAvatarVideoTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskUuid")
        public String taskUuid;

        public static SubmitAudioTo3DAvatarVideoTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAudioTo3DAvatarVideoTaskResponseBodyData self = new SubmitAudioTo3DAvatarVideoTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAudioTo3DAvatarVideoTaskResponseBodyData setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

    }

}
