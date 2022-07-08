// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrSentenceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AsrSentenceResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    // 给 pop 使用的
    @NameInMap("Success")
    public Boolean success;

    public static AsrSentenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsrSentenceResponseBody self = new AsrSentenceResponseBody();
        return TeaModel.build(map, self);
    }

    public AsrSentenceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AsrSentenceResponseBody setData(AsrSentenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AsrSentenceResponseBodyData getData() {
        return this.data;
    }

    public AsrSentenceResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public AsrSentenceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsrSentenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsrSentenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AsrSentenceResponseBodyData extends TeaModel {
        // 智能语音asr任务code
        @NameInMap("Code")
        public Integer code;

        // 双录端处理asr任务ID
        @NameInMap("Id")
        public String id;

        // 智能语音asr任务message
        @NameInMap("Message")
        public String message;

        // 智能语音asr任务名称
        @NameInMap("Name")
        public String name;

        // asr识别出的文本
        @NameInMap("Result")
        public String result;

        // 智能语音asr任务ID
        @NameInMap("TaskId")
        public String taskId;

        public static AsrSentenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AsrSentenceResponseBodyData self = new AsrSentenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AsrSentenceResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public AsrSentenceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AsrSentenceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AsrSentenceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AsrSentenceResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public AsrSentenceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
