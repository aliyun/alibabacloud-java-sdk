// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class TtsCommonResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public TtsCommonResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    // 给 pop 使用的
    @NameInMap("Success")
    public Boolean success;

    public static TtsCommonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TtsCommonResponseBody self = new TtsCommonResponseBody();
        return TeaModel.build(map, self);
    }

    public TtsCommonResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TtsCommonResponseBody setData(TtsCommonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TtsCommonResponseBodyData getData() {
        return this.data;
    }

    public TtsCommonResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public TtsCommonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TtsCommonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TtsCommonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TtsCommonResponseBodyData extends TeaModel {
        // 智能语音tts任务code
        @NameInMap("Code")
        public Integer code;

        // 双录端处理tts任务ID
        @NameInMap("Id")
        public String id;

        // 智能语音tts任务message
        @NameInMap("Message")
        public String message;

        // 智能语音tts任务名称
        @NameInMap("Name")
        public String name;

        // 双录端语音合成结果可公网下载地址
        @NameInMap("PublicUrl")
        public String publicUrl;

        // 智能语音tts任务ID
        @NameInMap("TaskId")
        public String taskId;

        public static TtsCommonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TtsCommonResponseBodyData self = new TtsCommonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TtsCommonResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public TtsCommonResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TtsCommonResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public TtsCommonResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TtsCommonResponseBodyData setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public TtsCommonResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
