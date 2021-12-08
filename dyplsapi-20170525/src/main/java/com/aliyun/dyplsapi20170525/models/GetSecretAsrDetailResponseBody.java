// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSecretAsrDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSecretAsrDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSecretAsrDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecretAsrDetailResponseBody self = new GetSecretAsrDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecretAsrDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecretAsrDetailResponseBody setData(GetSecretAsrDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSecretAsrDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSecretAsrDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecretAsrDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSecretAsrDetailResponseBodyDataSentences extends TeaModel {
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("ChannelId")
        public Integer channelId;

        @NameInMap("EmotionValue")
        public String emotionValue;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("SilenceDuration")
        public Long silenceDuration;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Text")
        public String text;

        public static GetSecretAsrDetailResponseBodyDataSentences build(java.util.Map<String, ?> map) throws Exception {
            GetSecretAsrDetailResponseBodyDataSentences self = new GetSecretAsrDetailResponseBodyDataSentences();
            return TeaModel.build(map, self);
        }

        public GetSecretAsrDetailResponseBodyDataSentences setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public GetSecretAsrDetailResponseBodyDataSentences setChannelId(Integer channelId) {
            this.channelId = channelId;
            return this;
        }
        public Integer getChannelId() {
            return this.channelId;
        }

        public GetSecretAsrDetailResponseBodyDataSentences setEmotionValue(String emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public String getEmotionValue() {
            return this.emotionValue;
        }

        public GetSecretAsrDetailResponseBodyDataSentences setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetSecretAsrDetailResponseBodyDataSentences setSilenceDuration(Long silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        public GetSecretAsrDetailResponseBodyDataSentences setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetSecretAsrDetailResponseBodyDataSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetSecretAsrDetailResponseBodyData extends TeaModel {
        @NameInMap("BizDuration")
        public Long bizDuration;

        @NameInMap("BusinessId")
        public String businessId;

        @NameInMap("BusinessKey")
        public String businessKey;

        @NameInMap("Code")
        public String code;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Sentences")
        public java.util.List<GetSecretAsrDetailResponseBodyDataSentences> sentences;

        @NameInMap("Type")
        public String type;

        public static GetSecretAsrDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSecretAsrDetailResponseBodyData self = new GetSecretAsrDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSecretAsrDetailResponseBodyData setBizDuration(Long bizDuration) {
            this.bizDuration = bizDuration;
            return this;
        }
        public Long getBizDuration() {
            return this.bizDuration;
        }

        public GetSecretAsrDetailResponseBodyData setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public GetSecretAsrDetailResponseBodyData setBusinessKey(String businessKey) {
            this.businessKey = businessKey;
            return this;
        }
        public String getBusinessKey() {
            return this.businessKey;
        }

        public GetSecretAsrDetailResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSecretAsrDetailResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetSecretAsrDetailResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetSecretAsrDetailResponseBodyData setSentences(java.util.List<GetSecretAsrDetailResponseBodyDataSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<GetSecretAsrDetailResponseBodyDataSentences> getSentences() {
            return this.sentences;
        }

        public GetSecretAsrDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
