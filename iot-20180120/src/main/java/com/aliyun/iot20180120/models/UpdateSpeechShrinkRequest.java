// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSpeechShrinkRequest extends TeaModel {
    @NameInMap("EnableSoundCode")
    public Boolean enableSoundCode;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProjectCode")
    public String projectCode;

    @NameInMap("SoundCodeConfig")
    public String soundCodeConfigShrink;

    @NameInMap("SpeechCode")
    public String speechCode;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("Voice")
    public String voice;

    @NameInMap("Volume")
    public Integer volume;

    public static UpdateSpeechShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpeechShrinkRequest self = new UpdateSpeechShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpeechShrinkRequest setEnableSoundCode(Boolean enableSoundCode) {
        this.enableSoundCode = enableSoundCode;
        return this;
    }
    public Boolean getEnableSoundCode() {
        return this.enableSoundCode;
    }

    public UpdateSpeechShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSpeechShrinkRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public UpdateSpeechShrinkRequest setSoundCodeConfigShrink(String soundCodeConfigShrink) {
        this.soundCodeConfigShrink = soundCodeConfigShrink;
        return this;
    }
    public String getSoundCodeConfigShrink() {
        return this.soundCodeConfigShrink;
    }

    public UpdateSpeechShrinkRequest setSpeechCode(String speechCode) {
        this.speechCode = speechCode;
        return this;
    }
    public String getSpeechCode() {
        return this.speechCode;
    }

    public UpdateSpeechShrinkRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public UpdateSpeechShrinkRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public UpdateSpeechShrinkRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
