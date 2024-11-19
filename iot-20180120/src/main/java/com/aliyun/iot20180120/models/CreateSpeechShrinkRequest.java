// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSpeechShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("AudioFormat")
    public String audioFormat;

    /**
     * <strong>example:</strong>
     * <p>identifying</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

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
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("ProjectCode")
    public String projectCode;

    /**
     * <strong>example:</strong>
     * <p>{&quot;SoundCodeContent&quot;: &quot;<a href="http://www.taobao.com">www.taobao.com</a>&quot;, &quot;AdditionalDuration&quot;: 3}</p>
     */
    @NameInMap("SoundCodeConfig")
    public String soundCodeConfigShrink;

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
     * <p>Xiaoyun</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
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
