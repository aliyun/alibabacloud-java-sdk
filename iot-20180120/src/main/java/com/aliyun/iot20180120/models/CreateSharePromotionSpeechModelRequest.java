// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSharePromotionSpeechModelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("AudioFormat")
    public String audioFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZFDZ</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <strong>example:</strong>
     * <p>iot-cv3********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61******_****<em>4901</em><strong><strong>_47</strong></strong>*******</p>
     */
    @NameInMap("SharePromotionActivityId")
    public String sharePromotionActivityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52******_7<strong>e_4</strong>3_9<strong>e_61</strong>********</p>
     */
    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("SpeechModelType")
    public String speechModelType;

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

    public static CreateSharePromotionSpeechModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSharePromotionSpeechModelRequest self = new CreateSharePromotionSpeechModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateSharePromotionSpeechModelRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public CreateSharePromotionSpeechModelRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateSharePromotionSpeechModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSharePromotionSpeechModelRequest setSharePromotionActivityId(String sharePromotionActivityId) {
        this.sharePromotionActivityId = sharePromotionActivityId;
        return this;
    }
    public String getSharePromotionActivityId() {
        return this.sharePromotionActivityId;
    }

    public CreateSharePromotionSpeechModelRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public CreateSharePromotionSpeechModelRequest setSpeechModelType(String speechModelType) {
        this.speechModelType = speechModelType;
        return this;
    }
    public String getSpeechModelType() {
        return this.speechModelType;
    }

    public CreateSharePromotionSpeechModelRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public CreateSharePromotionSpeechModelRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public CreateSharePromotionSpeechModelRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public CreateSharePromotionSpeechModelRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
