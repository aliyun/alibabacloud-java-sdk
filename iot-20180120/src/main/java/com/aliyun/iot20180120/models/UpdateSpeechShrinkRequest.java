// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSpeechShrinkRequest extends TeaModel {
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
    public String soundCodeConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VlKzbj3XIZ**<strong>CeIHH6vR82JNCSzk</strong></p>
     */
    @NameInMap("SpeechCode")
    public String speechCode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpeechRate")
    public Integer speechRate;

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
