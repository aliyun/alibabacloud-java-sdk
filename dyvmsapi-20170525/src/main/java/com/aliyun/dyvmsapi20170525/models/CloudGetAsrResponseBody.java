// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAsrResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudGetAsrResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudGetAsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAsrResponseBody self = new CloudGetAsrResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudGetAsrResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudGetAsrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudGetAsrResponseBody setData(CloudGetAsrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudGetAsrResponseBodyData getData() {
        return this.data;
    }

    public CloudGetAsrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudGetAsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudGetAsrResponseBodyDataRecordFileText1InResult extends TeaModel {
        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>30140</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>通道id</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelId")
        public Long channelId;

        /**
         * <p>情感值</p>
         * 
         * <strong>example:</strong>
         * <p>6.0</p>
         */
        @NameInMap("EmotionValue")
        public Double emotionValue;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>31805</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>沉默时间</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SilenceDuration")
        public Long silenceDuration;

        /**
         * <p>语速</p>
         * 
         * <strong>example:</strong>
         * <p>108</p>
         */
        @NameInMap("SpeechRate")
        public Long speechRate;

        /**
         * <p>转写文本</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Text")
        public String text;

        public static CloudGetAsrResponseBodyDataRecordFileText1InResult build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAsrResponseBodyDataRecordFileText1InResult self = new CloudGetAsrResponseBodyDataRecordFileText1InResult();
            return TeaModel.build(map, self);
        }

        public CloudGetAsrResponseBodyDataRecordFileText1InResult setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1InResult setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1InResult setEmotionValue(Double emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Double getEmotionValue() {
            return this.emotionValue;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1InResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1InResult setSilenceDuration(Long silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1InResult setSpeechRate(Long speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Long getSpeechRate() {
            return this.speechRate;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1InResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CloudGetAsrResponseBodyDataRecordFileText1In extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>33340</p>
         */
        @NameInMap("BizDuration")
        public Long bizDuration;

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>8f2ff56a7cfe458c942595b2f271d715</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>转写结果</p>
         */
        @NameInMap("Result")
        public java.util.List<CloudGetAsrResponseBodyDataRecordFileText1InResult> result;

        /**
         * <p>状态</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>状态码</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        @NameInMap("StatusCode")
        public Long statusCode;

        public static CloudGetAsrResponseBodyDataRecordFileText1In build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAsrResponseBodyDataRecordFileText1In self = new CloudGetAsrResponseBodyDataRecordFileText1In();
            return TeaModel.build(map, self);
        }

        public CloudGetAsrResponseBodyDataRecordFileText1In setBizDuration(Long bizDuration) {
            this.bizDuration = bizDuration;
            return this;
        }
        public Long getBizDuration() {
            return this.bizDuration;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1In setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1In setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1In setResult(java.util.List<CloudGetAsrResponseBodyDataRecordFileText1InResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<CloudGetAsrResponseBodyDataRecordFileText1InResult> getResult() {
            return this.result;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1In setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1In setStatusCode(Long statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Long getStatusCode() {
            return this.statusCode;
        }

    }

    public static class CloudGetAsrResponseBodyDataRecordFileText1OutResult extends TeaModel {
        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>30550</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>通道id</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelId")
        public Long channelId;

        /**
         * <p>情感值</p>
         * 
         * <strong>example:</strong>
         * <p>6.0</p>
         */
        @NameInMap("EmotionValue")
        public Double emotionValue;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>31515</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>沉默时间</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SilenceDuration")
        public Long silenceDuration;

        /**
         * <p>语速</p>
         * 
         * <strong>example:</strong>
         * <p>186</p>
         */
        @NameInMap("SpeechRate")
        public Long speechRate;

        /**
         * <p>转写文本</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Text")
        public String text;

        public static CloudGetAsrResponseBodyDataRecordFileText1OutResult build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAsrResponseBodyDataRecordFileText1OutResult self = new CloudGetAsrResponseBodyDataRecordFileText1OutResult();
            return TeaModel.build(map, self);
        }

        public CloudGetAsrResponseBodyDataRecordFileText1OutResult setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1OutResult setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1OutResult setEmotionValue(Double emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Double getEmotionValue() {
            return this.emotionValue;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1OutResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1OutResult setSilenceDuration(Long silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1OutResult setSpeechRate(Long speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Long getSpeechRate() {
            return this.speechRate;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1OutResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CloudGetAsrResponseBodyDataRecordFileText1Out extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>33340</p>
         */
        @NameInMap("BizDuration")
        public Long bizDuration;

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>145a13227e3249258cd3b5232a56d634</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>转写结果</p>
         */
        @NameInMap("Result")
        public java.util.List<CloudGetAsrResponseBodyDataRecordFileText1OutResult> result;

        /**
         * <p>状态</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>状态码</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StatusCode")
        public Long statusCode;

        public static CloudGetAsrResponseBodyDataRecordFileText1Out build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAsrResponseBodyDataRecordFileText1Out self = new CloudGetAsrResponseBodyDataRecordFileText1Out();
            return TeaModel.build(map, self);
        }

        public CloudGetAsrResponseBodyDataRecordFileText1Out setBizDuration(Long bizDuration) {
            this.bizDuration = bizDuration;
            return this;
        }
        public Long getBizDuration() {
            return this.bizDuration;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1Out setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1Out setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1Out setResult(java.util.List<CloudGetAsrResponseBodyDataRecordFileText1OutResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<CloudGetAsrResponseBodyDataRecordFileText1OutResult> getResult() {
            return this.result;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1Out setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudGetAsrResponseBodyDataRecordFileText1Out setStatusCode(Long statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Long getStatusCode() {
            return this.statusCode;
        }

    }

    public static class CloudGetAsrResponseBodyDataResult extends TeaModel {
        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>4350</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>通道id</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ChannelId")
        public Long channelId;

        /**
         * <p>情感值</p>
         * 
         * <strong>example:</strong>
         * <p>7.0</p>
         */
        @NameInMap("EmotionValue")
        public Double emotionValue;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>10445</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>语音文本所属方；in: 第一侧；out: 第二侧</p>
         * 
         * <strong>example:</strong>
         * <p>out</p>
         */
        @NameInMap("Side")
        public String side;

        /**
         * <p>沉默时间</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SilenceDuration")
        public Long silenceDuration;

        /**
         * <p>语速</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("SpeechRate")
        public Long speechRate;

        /**
         * <p>转写文本</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Text")
        public String text;

        public static CloudGetAsrResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAsrResponseBodyDataResult self = new CloudGetAsrResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public CloudGetAsrResponseBodyDataResult setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public CloudGetAsrResponseBodyDataResult setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public CloudGetAsrResponseBodyDataResult setEmotionValue(Double emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Double getEmotionValue() {
            return this.emotionValue;
        }

        public CloudGetAsrResponseBodyDataResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CloudGetAsrResponseBodyDataResult setSide(String side) {
            this.side = side;
            return this;
        }
        public String getSide() {
            return this.side;
        }

        public CloudGetAsrResponseBodyDataResult setSilenceDuration(Long silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        public CloudGetAsrResponseBodyDataResult setSpeechRate(Long speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Long getSpeechRate() {
            return this.speechRate;
        }

        public CloudGetAsrResponseBodyDataResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CloudGetAsrResponseBodyData extends TeaModel {
        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>转写类型 1：混音 2：分轨</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorType")
        public String monitorType;

        /**
         * <p>转写文件个数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecordFileCount")
        public String recordFileCount;

        /**
         * <p>第一侧转写文本结果</p>
         */
        @NameInMap("RecordFileText1In")
        public CloudGetAsrResponseBodyDataRecordFileText1In recordFileText1In;

        /**
         * <p>第二侧转写文本结果</p>
         */
        @NameInMap("RecordFileText1Out")
        public CloudGetAsrResponseBodyDataRecordFileText1Out recordFileText1Out;

        /**
         * <p>转写结果, 当all=true时返回</p>
         */
        @NameInMap("Result")
        public java.util.List<CloudGetAsrResponseBodyDataResult> result;

        public static CloudGetAsrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAsrResponseBodyData self = new CloudGetAsrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudGetAsrResponseBodyData setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudGetAsrResponseBodyData setMonitorType(String monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public String getMonitorType() {
            return this.monitorType;
        }

        public CloudGetAsrResponseBodyData setRecordFileCount(String recordFileCount) {
            this.recordFileCount = recordFileCount;
            return this;
        }
        public String getRecordFileCount() {
            return this.recordFileCount;
        }

        public CloudGetAsrResponseBodyData setRecordFileText1In(CloudGetAsrResponseBodyDataRecordFileText1In recordFileText1In) {
            this.recordFileText1In = recordFileText1In;
            return this;
        }
        public CloudGetAsrResponseBodyDataRecordFileText1In getRecordFileText1In() {
            return this.recordFileText1In;
        }

        public CloudGetAsrResponseBodyData setRecordFileText1Out(CloudGetAsrResponseBodyDataRecordFileText1Out recordFileText1Out) {
            this.recordFileText1Out = recordFileText1Out;
            return this;
        }
        public CloudGetAsrResponseBodyDataRecordFileText1Out getRecordFileText1Out() {
            return this.recordFileText1Out;
        }

        public CloudGetAsrResponseBodyData setResult(java.util.List<CloudGetAsrResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<CloudGetAsrResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
