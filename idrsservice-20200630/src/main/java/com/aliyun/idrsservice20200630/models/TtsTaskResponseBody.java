// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class TtsTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public TtsTaskResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static TtsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TtsTaskResponseBody self = new TtsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public TtsTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TtsTaskResponseBody setData(TtsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TtsTaskResponseBodyData getData() {
        return this.data;
    }

    public TtsTaskResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public TtsTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TtsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TtsTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TtsTaskResponseBodyData extends TeaModel {
        @NameInMap("Answer")
        public String answer;

        @NameInMap("Duration")
        public Double duration;

        @NameInMap("Question")
        public String question;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        public static TtsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TtsTaskResponseBodyData self = new TtsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TtsTaskResponseBodyData setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public TtsTaskResponseBodyData setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public TtsTaskResponseBodyData setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public TtsTaskResponseBodyData setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

    }

}
