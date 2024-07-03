// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSecretAsrDetailResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ASR details.</p>
     */
    @NameInMap("Data")
    public GetSecretAsrDetailResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
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
        /**
         * <p>The start time offset of the sentence. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1020</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>The ID of the audio track to which the sentence belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelId")
        public Integer channelId;

        /**
         * <p>The emotion value. Value range: 1 to 10. The higher the value, the stronger the emotion.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EmotionValue")
        public String emotionValue;

        /**
         * <p>The end time offset of the sentence. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1770</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The silence duration between the current sentence and the previous sentence. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SilenceDuration")
        public Long silenceDuration;

        /**
         * <p>The average speech rate of the sentence. Unit: number of words per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>The recognition result of the sentence.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
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
        /**
         * <p>The total duration of the audio file that was recognized. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10944</p>
         */
        @NameInMap("BizDuration")
        public Long bizDuration;

        /**
         * <p>The ID of the business process.</p>
         * 
         * <strong>example:</strong>
         * <p>435ee78c7a019650@!FC100000074672458@!2020061522****</p>
         */
        @NameInMap("BusinessId")
        public String businessId;

        /**
         * <p>The business keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>JCGTncltuNao****</p>
         */
        @NameInMap("BusinessKey")
        public String businessKey;

        /**
         * <p>The status code. The status code 21050000 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>21050000</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8d2329d407a83447a83be441681f4872ac74nE</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The ASR result.</p>
         */
        @NameInMap("Sentences")
        public java.util.List<GetSecretAsrDetailResponseBodyDataSentences> sentences;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>asrResult</p>
         */
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
