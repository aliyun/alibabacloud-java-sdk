// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class EndToEndRealTimeDialogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>nls-base</p>
     */
    @NameInMap("asrModelId")
    public String asrModelId;

    /**
     * <strong>example:</strong>
     * <p>pcm</p>
     */
    @NameInMap("inputFormat")
    public String inputFormat;

    /**
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("outputFormat")
    public String outputFormat;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pitchRate")
    public Integer pitchRate;

    /**
     * <strong>example:</strong>
     * <p>SAMPLE_RATE_16K</p>
     */
    @NameInMap("sampleRate")
    public String sampleRate;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("speechRate")
    public Integer speechRate;

    /**
     * <strong>example:</strong>
     * <p>nls-base</p>
     */
    @NameInMap("ttsModelId")
    public String ttsModelId;

    /**
     * <strong>example:</strong>
     * <p>longxiaochun_v2</p>
     */
    @NameInMap("voiceCode")
    public String voiceCode;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("volume")
    public Integer volume;

    public static EndToEndRealTimeDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        EndToEndRealTimeDialogRequest self = new EndToEndRealTimeDialogRequest();
        return TeaModel.build(map, self);
    }

    public EndToEndRealTimeDialogRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public EndToEndRealTimeDialogRequest setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }
    public String getInputFormat() {
        return this.inputFormat;
    }

    public EndToEndRealTimeDialogRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public EndToEndRealTimeDialogRequest setPitchRate(Integer pitchRate) {
        this.pitchRate = pitchRate;
        return this;
    }
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    public EndToEndRealTimeDialogRequest setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public String getSampleRate() {
        return this.sampleRate;
    }

    public EndToEndRealTimeDialogRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public EndToEndRealTimeDialogRequest setTtsModelId(String ttsModelId) {
        this.ttsModelId = ttsModelId;
        return this;
    }
    public String getTtsModelId() {
        return this.ttsModelId;
    }

    public EndToEndRealTimeDialogRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public EndToEndRealTimeDialogRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
