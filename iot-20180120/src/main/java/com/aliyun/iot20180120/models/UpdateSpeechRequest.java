// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSpeechRequest extends TeaModel {
    @NameInMap("Voice")
    public String voice;

    @NameInMap("SpeechCode")
    public String speechCode;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("Volume")
    public Integer volume;

    @NameInMap("ProjectCode")
    public String projectCode;

    public static UpdateSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpeechRequest self = new UpdateSpeechRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpeechRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public UpdateSpeechRequest setSpeechCode(String speechCode) {
        this.speechCode = speechCode;
        return this;
    }
    public String getSpeechCode() {
        return this.speechCode;
    }

    public UpdateSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSpeechRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public UpdateSpeechRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

    public UpdateSpeechRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

}
