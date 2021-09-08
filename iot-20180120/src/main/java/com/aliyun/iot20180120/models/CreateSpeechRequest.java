// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSpeechRequest extends TeaModel {
    @NameInMap("Voice")
    @Validation(required = true)
    public String voice;

    @NameInMap("SpeechType")
    public String speechType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("Volume")
    public Integer volume;

    @NameInMap("ProjectCode")
    @Validation(required = true)
    public String projectCode;

    @NameInMap("Text")
    public String text;

    @NameInMap("AudioFormat")
    public String audioFormat;

    public static CreateSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpeechRequest self = new CreateSpeechRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpeechRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public CreateSpeechRequest setSpeechType(String speechType) {
        this.speechType = speechType;
        return this;
    }
    public String getSpeechType() {
        return this.speechType;
    }

    public CreateSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSpeechRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateSpeechRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public CreateSpeechRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

    public CreateSpeechRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CreateSpeechRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public CreateSpeechRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

}
