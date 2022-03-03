// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TestSpeechShrinkRequest extends TeaModel {
    @NameInMap("AudioFormat")
    public String audioFormat;

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

    public static TestSpeechShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TestSpeechShrinkRequest self = new TestSpeechShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TestSpeechShrinkRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public TestSpeechShrinkRequest setEnableSoundCode(Boolean enableSoundCode) {
        this.enableSoundCode = enableSoundCode;
        return this;
    }
    public Boolean getEnableSoundCode() {
        return this.enableSoundCode;
    }

    public TestSpeechShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public TestSpeechShrinkRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public TestSpeechShrinkRequest setSoundCodeConfigShrink(String soundCodeConfigShrink) {
        this.soundCodeConfigShrink = soundCodeConfigShrink;
        return this;
    }
    public String getSoundCodeConfigShrink() {
        return this.soundCodeConfigShrink;
    }

    public TestSpeechShrinkRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public TestSpeechShrinkRequest setSpeechType(String speechType) {
        this.speechType = speechType;
        return this;
    }
    public String getSpeechType() {
        return this.speechType;
    }

    public TestSpeechShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public TestSpeechShrinkRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public TestSpeechShrinkRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
