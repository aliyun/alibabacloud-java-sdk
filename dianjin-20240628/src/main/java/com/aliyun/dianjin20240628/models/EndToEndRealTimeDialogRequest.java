// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class EndToEndRealTimeDialogRequest extends TeaModel {
    /**
     * <p>The ID of the speech recognition model. The default value is nls-base. Supported models include paraformer-realtime-v2 and paraformer-realtime-8k-v2.</p>
     * 
     * <strong>example:</strong>
     * <p>nls-base</p>
     */
    @NameInMap("asrModelId")
    public String asrModelId;

    /**
     * <p>The input audio format. Supported formats are pcm, wav, and mp3.</p>
     * 
     * <strong>example:</strong>
     * <p>pcm</p>
     */
    @NameInMap("inputFormat")
    public String inputFormat;

    /**
     * <p>The output audio format.</p>
     * 
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("outputFormat")
    public String outputFormat;

    /**
     * <p>The pitch rate.
     * ● If \<code>ttsModelId\\</code> is \<code>nls-base\\</code>:
     * The value ranges from -500 to 500. The default is 0.
     * ● If \<code>ttsModelId\\</code> is \<code>cosyvoice-v2\\</code>: Specifies the pitch of the synthesized audio. The value ranges from 0.5 to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pitchRate")
    public Integer pitchRate;

    /**
     * <p>The sample rate.</p>
     * 
     * <strong>example:</strong>
     * <p>SAMPLE_RATE_16K</p>
     */
    @NameInMap("sampleRate")
    public String sampleRate;

    /**
     * <p>The speech rate.
     * ● If \<code>ttsModelId\\</code> is \<code>nls-base\\</code>: The value ranges from -500 to 500. The default is 0.
     * ● If \<code>ttsModelId\\</code> is \<code>cosyvoice-v2\\</code>:
     * Specifies the speech rate of the synthesized audio. The value ranges from 0.5 to 2.
     * ○ 0.5: Half the default speed.
     * ○ 1: The default speed. The default speed is the model\&quot;s standard output speed and may vary slightly by speaker. It is about four characters per second.
     * ○ 2: Twice the default speed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("speechRate")
    public Integer speechRate;

    /**
     * <p>The ID of the speech synthesis model. The default value is nls-base. The cosyvoice-v2 model is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>nls-base</p>
     */
    @NameInMap("ttsModelId")
    public String ttsModelId;

    /**
     * <p>The voice parameter. This is available only for models that support word-level or sentence-level timestamps.</p>
     * 
     * <strong>example:</strong>
     * <p>longxiaochun_v2</p>
     */
    @NameInMap("voiceCode")
    public String voiceCode;

    /**
     * <p>The volume. The value ranges from 0 to 100. This parameter is optional. The default value is 50.</p>
     * 
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
