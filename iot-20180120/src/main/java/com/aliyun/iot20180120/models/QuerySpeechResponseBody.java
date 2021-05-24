// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QuerySpeechResponseBodyData data;

    public static QuerySpeechResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechResponseBody self = new QuerySpeechResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpeechResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySpeechResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechResponseBody setData(QuerySpeechResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechResponseBodyData getData() {
        return this.data;
    }

    public static class QuerySpeechResponseBodyData extends TeaModel {
        @NameInMap("SpeechCode")
        public String speechCode;

        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("Voice")
        public String voice;

        @NameInMap("Volume")
        public Integer volume;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Text")
        public String text;

        @NameInMap("AudioFormat")
        public String audioFormat;

        @NameInMap("SpeechType")
        public String speechType;

        public static QuerySpeechResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechResponseBodyData self = new QuerySpeechResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechResponseBodyData setSpeechCode(String speechCode) {
            this.speechCode = speechCode;
            return this;
        }
        public String getSpeechCode() {
            return this.speechCode;
        }

        public QuerySpeechResponseBodyData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechResponseBodyData setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public QuerySpeechResponseBodyData setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

        public QuerySpeechResponseBodyData setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public QuerySpeechResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechResponseBodyData setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

        public QuerySpeechResponseBodyData setSpeechType(String speechType) {
            this.speechType = speechType;
            return this;
        }
        public String getSpeechType() {
            return this.speechType;
        }

    }

}
