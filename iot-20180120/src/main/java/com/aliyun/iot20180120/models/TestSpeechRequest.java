// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TestSpeechRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("AudioFormat")
    public String audioFormat;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSoundCode")
    public Boolean enableSoundCode;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4de2c367**<strong>8c585e5992</strong></p>
     */
    @NameInMap("ProjectCode")
    public String projectCode;

    /**
     * <strong>example:</strong>
     * <p>{&quot;SoundCodeContent&quot;: &quot;<a href="http://www.taobao.com">www.taobao.com</a>&quot;, &quot;AdditionalDuration&quot;: 3}</p>
     */
    @NameInMap("SoundCodeConfig")
    public java.util.Map<String, ?> soundCodeConfig;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpeechRate")
    public Integer speechRate;

    /**
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("SpeechType")
    public String speechType;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Siyue</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Volume")
    public Integer volume;

    public static TestSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        TestSpeechRequest self = new TestSpeechRequest();
        return TeaModel.build(map, self);
    }

    public TestSpeechRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public TestSpeechRequest setEnableSoundCode(Boolean enableSoundCode) {
        this.enableSoundCode = enableSoundCode;
        return this;
    }
    public Boolean getEnableSoundCode() {
        return this.enableSoundCode;
    }

    public TestSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public TestSpeechRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public TestSpeechRequest setSoundCodeConfig(java.util.Map<String, ?> soundCodeConfig) {
        this.soundCodeConfig = soundCodeConfig;
        return this;
    }
    public java.util.Map<String, ?> getSoundCodeConfig() {
        return this.soundCodeConfig;
    }

    public TestSpeechRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public TestSpeechRequest setSpeechType(String speechType) {
        this.speechType = speechType;
        return this;
    }
    public String getSpeechType() {
        return this.speechType;
    }

    public TestSpeechRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
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

}
