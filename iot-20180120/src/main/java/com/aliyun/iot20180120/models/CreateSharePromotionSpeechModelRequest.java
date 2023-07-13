// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSharePromotionSpeechModelRequest extends TeaModel {
    @NameInMap("AudioFormat")
    public String audioFormat;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SharePromotionActivityId")
    public String sharePromotionActivityId;

    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    @NameInMap("SpeechModelType")
    public String speechModelType;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("Text")
    public String text;

    @NameInMap("Voice")
    public String voice;

    @NameInMap("Volume")
    public Integer volume;

    public static CreateSharePromotionSpeechModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSharePromotionSpeechModelRequest self = new CreateSharePromotionSpeechModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateSharePromotionSpeechModelRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public CreateSharePromotionSpeechModelRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateSharePromotionSpeechModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSharePromotionSpeechModelRequest setSharePromotionActivityId(String sharePromotionActivityId) {
        this.sharePromotionActivityId = sharePromotionActivityId;
        return this;
    }
    public String getSharePromotionActivityId() {
        return this.sharePromotionActivityId;
    }

    public CreateSharePromotionSpeechModelRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public CreateSharePromotionSpeechModelRequest setSpeechModelType(String speechModelType) {
        this.speechModelType = speechModelType;
        return this;
    }
    public String getSpeechModelType() {
        return this.speechModelType;
    }

    public CreateSharePromotionSpeechModelRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public CreateSharePromotionSpeechModelRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public CreateSharePromotionSpeechModelRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public CreateSharePromotionSpeechModelRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
