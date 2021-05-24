// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TestSpeechRequest extends TeaModel {
    @NameInMap("Voice")
    public String voice;

    @NameInMap("Volume")
    public Integer volume;

    @NameInMap("ProjectCode")
    public String projectCode;

    @NameInMap("SpeechRate")
    public Integer speechRate;

    @NameInMap("Text")
    public String text;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SpeechType")
    public String speechType;

    public static TestSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        TestSpeechRequest self = new TestSpeechRequest();
        return TeaModel.build(map, self);
    }

    public TestSpeechRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public TestSpeechRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

    public TestSpeechRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public TestSpeechRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public TestSpeechRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public TestSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public TestSpeechRequest setSpeechType(String speechType) {
        this.speechType = speechType;
        return this;
    }
    public String getSpeechType() {
        return this.speechType;
    }

}
