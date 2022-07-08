// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrRealtimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AsrRealtimeResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    // 给 pop 使用的
    @NameInMap("Success")
    public Boolean success;

    public static AsrRealtimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsrRealtimeResponseBody self = new AsrRealtimeResponseBody();
        return TeaModel.build(map, self);
    }

    public AsrRealtimeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AsrRealtimeResponseBody setData(AsrRealtimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AsrRealtimeResponseBodyData getData() {
        return this.data;
    }

    public AsrRealtimeResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public AsrRealtimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsrRealtimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsrRealtimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AsrRealtimeResponseBodyData extends TeaModel {
        @NameInMap("BeginTime")
        public Long beginTime;

        // 智能语音asr任务code
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Confidence")
        public Double confidence;

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

        @NameInMap("Status")
        public String status;

        // 智能语音asr任务ID
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Time")
        public Long time;

        public static AsrRealtimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AsrRealtimeResponseBodyData self = new AsrRealtimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AsrRealtimeResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public AsrRealtimeResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public AsrRealtimeResponseBodyData setConfidence(Double confidence) {
            this.confidence = confidence;
            return this;
        }
        public Double getConfidence() {
            return this.confidence;
        }

        public AsrRealtimeResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AsrRealtimeResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AsrRealtimeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AsrRealtimeResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public AsrRealtimeResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AsrRealtimeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public AsrRealtimeResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
