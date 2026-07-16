// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCosyVoiceCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The media asset ID of the training audio material. Currently, only one audio material can be used for training.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Audios")
    public String audios;

    /**
     * <p>The sample audio output address.  </p>
     * <ul>
     * <li>If you specify this parameter, a sample audio file is generated at the specified OSS address after training succeeds.  <blockquote>
     * <p>Notice: The address must be a valid public OSS address under your account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.MP3">https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.MP3</a></p>
     */
    @NameInMap("DemoAudioMediaURL")
    public String demoAudioMediaURL;

    /**
     * <p>The gender. Valid values:</p>
     * <ul>
     * <li>female</li>
     * <li>male</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>female</p>
     */
    @NameInMap("Gender")
    public String gender;

    /**
     * <p>The voice cloning model. Valid values:</p>
     * <ul>
     * <li><strong>cosyvoice-v3-plus</strong></li>
     * <li><strong>cosyvoice-v3-flash</strong></li>
     * <li><strong>cosyvoice-v3.5-plus</strong></li>
     * <li><strong>cosyvoice-v3.5-flash</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cosyvoice-v3-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The voice name. The name can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>小专</p>
     */
    @NameInMap("VoiceName")
    public String voiceName;

    public static SubmitCosyVoiceCustomizedVoiceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCosyVoiceCustomizedVoiceJobRequest self = new SubmitCosyVoiceCustomizedVoiceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCosyVoiceCustomizedVoiceJobRequest setAudios(String audios) {
        this.audios = audios;
        return this;
    }
    public String getAudios() {
        return this.audios;
    }

    public SubmitCosyVoiceCustomizedVoiceJobRequest setDemoAudioMediaURL(String demoAudioMediaURL) {
        this.demoAudioMediaURL = demoAudioMediaURL;
        return this;
    }
    public String getDemoAudioMediaURL() {
        return this.demoAudioMediaURL;
    }

    public SubmitCosyVoiceCustomizedVoiceJobRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public SubmitCosyVoiceCustomizedVoiceJobRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SubmitCosyVoiceCustomizedVoiceJobRequest setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

}
