// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrRealtimeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CustomizationId")
    public String customizationId;

    @NameInMap("Disfluency")
    public Boolean disfluency;

    @NameInMap("EnableIgnoreSentenceTimeout")
    public Boolean enableIgnoreSentenceTimeout;

    @NameInMap("EnableIntermediateResult")
    public Boolean enableIntermediateResult;

    @NameInMap("EnableInverseTextNormalization")
    public Boolean enableInverseTextNormalization;

    @NameInMap("EnablePunctuationPrediction")
    public Boolean enablePunctuationPrediction;

    @NameInMap("EnableSemanticSentenceDetection")
    public Boolean enableSemanticSentenceDetection;

    @NameInMap("EnableWords")
    public Boolean enableWords;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Format")
    public String format;

    @NameInMap("MaxSentenceSilence")
    public Long maxSentenceSilence;

    @NameInMap("SampleRate")
    public Long sampleRate;

    @NameInMap("SpeechNoiseThreshold")
    public Float speechNoiseThreshold;

    @NameInMap("VocabularyId")
    public String vocabularyId;

    public static AsrRealtimeRequest build(java.util.Map<String, ?> map) throws Exception {
        AsrRealtimeRequest self = new AsrRealtimeRequest();
        return TeaModel.build(map, self);
    }

    public AsrRealtimeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AsrRealtimeRequest setCustomizationId(String customizationId) {
        this.customizationId = customizationId;
        return this;
    }
    public String getCustomizationId() {
        return this.customizationId;
    }

    public AsrRealtimeRequest setDisfluency(Boolean disfluency) {
        this.disfluency = disfluency;
        return this;
    }
    public Boolean getDisfluency() {
        return this.disfluency;
    }

    public AsrRealtimeRequest setEnableIgnoreSentenceTimeout(Boolean enableIgnoreSentenceTimeout) {
        this.enableIgnoreSentenceTimeout = enableIgnoreSentenceTimeout;
        return this;
    }
    public Boolean getEnableIgnoreSentenceTimeout() {
        return this.enableIgnoreSentenceTimeout;
    }

    public AsrRealtimeRequest setEnableIntermediateResult(Boolean enableIntermediateResult) {
        this.enableIntermediateResult = enableIntermediateResult;
        return this;
    }
    public Boolean getEnableIntermediateResult() {
        return this.enableIntermediateResult;
    }

    public AsrRealtimeRequest setEnableInverseTextNormalization(Boolean enableInverseTextNormalization) {
        this.enableInverseTextNormalization = enableInverseTextNormalization;
        return this;
    }
    public Boolean getEnableInverseTextNormalization() {
        return this.enableInverseTextNormalization;
    }

    public AsrRealtimeRequest setEnablePunctuationPrediction(Boolean enablePunctuationPrediction) {
        this.enablePunctuationPrediction = enablePunctuationPrediction;
        return this;
    }
    public Boolean getEnablePunctuationPrediction() {
        return this.enablePunctuationPrediction;
    }

    public AsrRealtimeRequest setEnableSemanticSentenceDetection(Boolean enableSemanticSentenceDetection) {
        this.enableSemanticSentenceDetection = enableSemanticSentenceDetection;
        return this;
    }
    public Boolean getEnableSemanticSentenceDetection() {
        return this.enableSemanticSentenceDetection;
    }

    public AsrRealtimeRequest setEnableWords(Boolean enableWords) {
        this.enableWords = enableWords;
        return this;
    }
    public Boolean getEnableWords() {
        return this.enableWords;
    }

    public AsrRealtimeRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AsrRealtimeRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public AsrRealtimeRequest setMaxSentenceSilence(Long maxSentenceSilence) {
        this.maxSentenceSilence = maxSentenceSilence;
        return this;
    }
    public Long getMaxSentenceSilence() {
        return this.maxSentenceSilence;
    }

    public AsrRealtimeRequest setSampleRate(Long sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Long getSampleRate() {
        return this.sampleRate;
    }

    public AsrRealtimeRequest setSpeechNoiseThreshold(Float speechNoiseThreshold) {
        this.speechNoiseThreshold = speechNoiseThreshold;
        return this;
    }
    public Float getSpeechNoiseThreshold() {
        return this.speechNoiseThreshold;
    }

    public AsrRealtimeRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

}
