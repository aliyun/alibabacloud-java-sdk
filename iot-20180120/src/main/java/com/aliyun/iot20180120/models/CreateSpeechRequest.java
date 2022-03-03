// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSpeechRequest extends TeaModel {
    @NameInMap("AudioFormat")
    public String audioFormat;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("EnableSoundCode")
    public Boolean enableSoundCode;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProjectCode")
    public String projectCode;

    @NameInMap("SoundCodeConfig")
    public java.util.Map<String, ?> soundCodeConfig;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("SpeechType")
    public String speechType;

    @NameInMap("Text")
    public String text;

    @NameInMap("Voice")
    public String voice;

    @NameInMap("Volume")
    public Integer volume;

    public static CreateSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpeechRequest self = new CreateSpeechRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpeechRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public CreateSpeechRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateSpeechRequest setEnableSoundCode(Boolean enableSoundCode) {
        this.enableSoundCode = enableSoundCode;
        return this;
    }
    public Boolean getEnableSoundCode() {
        return this.enableSoundCode;
    }

    public CreateSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSpeechRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CreateSpeechRequest setSoundCodeConfig(java.util.Map<String, ?> soundCodeConfig) {
        this.soundCodeConfig = soundCodeConfig;
        return this;
    }
    public java.util.Map<String, ?> getSoundCodeConfig() {
        return this.soundCodeConfig;
    }

    public CreateSpeechRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public CreateSpeechRequest setSpeechType(String speechType) {
        this.speechType = speechType;
        return this;
    }
    public String getSpeechType() {
        return this.speechType;
    }

    public CreateSpeechRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public CreateSpeechRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public CreateSpeechRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
