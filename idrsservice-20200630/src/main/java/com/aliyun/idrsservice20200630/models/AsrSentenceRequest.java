// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrSentenceRequest extends TeaModel {
    @NameInMap("AsrRequest")
    public AsrSentenceRequestAsrRequest asrRequest;

    public static AsrSentenceRequest build(java.util.Map<String, ?> map) throws Exception {
        AsrSentenceRequest self = new AsrSentenceRequest();
        return TeaModel.build(map, self);
    }

    public AsrSentenceRequest setAsrRequest(AsrSentenceRequestAsrRequest asrRequest) {
        this.asrRequest = asrRequest;
        return this;
    }
    public AsrSentenceRequestAsrRequest getAsrRequest() {
        return this.asrRequest;
    }

    public static class AsrSentenceRequestAsrRequest extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("EnableInverseTextNormalization")
        public Boolean enableInverseTextNormalization;

        @NameInMap("EnablePunctuationPrediction")
        public Boolean enablePunctuationPrediction;

        @NameInMap("EnableVoiceDetection")
        public Boolean enableVoiceDetection;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Format")
        public String format;

        @NameInMap("SampleRate")
        public Integer sampleRate;

        public static AsrSentenceRequestAsrRequest build(java.util.Map<String, ?> map) throws Exception {
            AsrSentenceRequestAsrRequest self = new AsrSentenceRequestAsrRequest();
            return TeaModel.build(map, self);
        }

        public AsrSentenceRequestAsrRequest setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AsrSentenceRequestAsrRequest setEnableInverseTextNormalization(Boolean enableInverseTextNormalization) {
            this.enableInverseTextNormalization = enableInverseTextNormalization;
            return this;
        }
        public Boolean getEnableInverseTextNormalization() {
            return this.enableInverseTextNormalization;
        }

        public AsrSentenceRequestAsrRequest setEnablePunctuationPrediction(Boolean enablePunctuationPrediction) {
            this.enablePunctuationPrediction = enablePunctuationPrediction;
            return this;
        }
        public Boolean getEnablePunctuationPrediction() {
            return this.enablePunctuationPrediction;
        }

        public AsrSentenceRequestAsrRequest setEnableVoiceDetection(Boolean enableVoiceDetection) {
            this.enableVoiceDetection = enableVoiceDetection;
            return this;
        }
        public Boolean getEnableVoiceDetection() {
            return this.enableVoiceDetection;
        }

        public AsrSentenceRequestAsrRequest setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public AsrSentenceRequestAsrRequest setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public AsrSentenceRequestAsrRequest setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

    }

}
