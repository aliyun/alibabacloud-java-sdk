// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QuerySpeechResponseData data;

    public static QuerySpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechResponse self = new QuerySpeechResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySpeechResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechResponse setData(QuerySpeechResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechResponseData getData() {
        return this.data;
    }

    public static class QuerySpeechResponseData extends TeaModel {
        @NameInMap("SpeechCode")
        @Validation(required = true)
        public String speechCode;

        @NameInMap("BizCode")
        @Validation(required = true)
        public String bizCode;

        @NameInMap("Voice")
        @Validation(required = true)
        public String voice;

        @NameInMap("Volume")
        @Validation(required = true)
        public Integer volume;

        @NameInMap("SpeechRate")
        @Validation(required = true)
        public Integer speechRate;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("AudioFormat")
        @Validation(required = true)
        public String audioFormat;

        @NameInMap("SpeechType")
        @Validation(required = true)
        public String speechType;

        public static QuerySpeechResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechResponseData self = new QuerySpeechResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechResponseData setSpeechCode(String speechCode) {
            this.speechCode = speechCode;
            return this;
        }
        public String getSpeechCode() {
            return this.speechCode;
        }

        public QuerySpeechResponseData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public QuerySpeechResponseData setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public QuerySpeechResponseData setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

        public QuerySpeechResponseData setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public QuerySpeechResponseData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QuerySpeechResponseData setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

        public QuerySpeechResponseData setSpeechType(String speechType) {
            this.speechType = speechType;
            return this;
        }
        public String getSpeechType() {
            return this.speechType;
        }

    }

}
