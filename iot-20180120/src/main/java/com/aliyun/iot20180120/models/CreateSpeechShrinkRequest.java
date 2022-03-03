// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSpeechShrinkRequest extends TeaModel {
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
    public String soundCodeConfigShrink;

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

    public static CreateSpeechShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpeechShrinkRequest self = new CreateSpeechShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpeechShrinkRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public CreateSpeechShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateSpeechShrinkRequest setEnableSoundCode(Boolean enableSoundCode) {
        this.enableSoundCode = enableSoundCode;
        return this;
    }
    public Boolean getEnableSoundCode() {
        return this.enableSoundCode;
    }

    public CreateSpeechShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSpeechShrinkRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CreateSpeechShrinkRequest setSoundCodeConfigShrink(String soundCodeConfigShrink) {
        this.soundCodeConfigShrink = soundCodeConfigShrink;
        return this;
    }
    public String getSoundCodeConfigShrink() {
        return this.soundCodeConfigShrink;
    }

    public CreateSpeechShrinkRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public CreateSpeechShrinkRequest setSpeechType(String speechType) {
        this.speechType = speechType;
        return this;
    }
    public String getSpeechType() {
        return this.speechType;
    }

    public CreateSpeechShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public CreateSpeechShrinkRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public CreateSpeechShrinkRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
