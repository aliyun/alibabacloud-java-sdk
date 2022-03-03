// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSpeechRequest extends TeaModel {
    @NameInMap("EnableSoundCode")
    public Boolean enableSoundCode;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProjectCode")
    public String projectCode;

    @NameInMap("SoundCodeConfig")
    public java.util.Map<String, ?> soundCodeConfig;

    @NameInMap("SpeechCode")
    public String speechCode;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("Voice")
    public String voice;

    @NameInMap("Volume")
    public Integer volume;

    public static UpdateSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpeechRequest self = new UpdateSpeechRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpeechRequest setEnableSoundCode(Boolean enableSoundCode) {
        this.enableSoundCode = enableSoundCode;
        return this;
    }
    public Boolean getEnableSoundCode() {
        return this.enableSoundCode;
    }

    public UpdateSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSpeechRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public UpdateSpeechRequest setSoundCodeConfig(java.util.Map<String, ?> soundCodeConfig) {
        this.soundCodeConfig = soundCodeConfig;
        return this;
    }
    public java.util.Map<String, ?> getSoundCodeConfig() {
        return this.soundCodeConfig;
    }

    public UpdateSpeechRequest setSpeechCode(String speechCode) {
        this.speechCode = speechCode;
        return this;
    }
    public String getSpeechCode() {
        return this.speechCode;
    }

    public UpdateSpeechRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public UpdateSpeechRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public UpdateSpeechRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
