// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitStandardCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The list of media asset IDs for training audio materials. Separate multiple media asset IDs with commas (,).</p>
     * <blockquote>
     * <p>Notice: The total duration of all materials must be between 15 and 30 minutes, and the duration of each individual material must be greater than 1 minute.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong>,<strong><strong>571c704445f9a0ee011406c2</strong></strong>,<strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Audios")
    public String audios;

    /**
     * <p>The media asset ID of the authentication audio. Upload an audio clip to verify your identity. The task fails if the voiceprint does not match the training audio.</p>
     * <blockquote>
     * <p>Notice: Read and record the following statement clearly: I confirm that I am initiating voice cloning customization. The training audio is provided by me. I commit to being responsible for the customized content and guarantee that no illegal or non-compliant content will be created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Authentication")
    public String authentication;

    /**
     * <p>The audio output address for the sample.  </p>
     * <ul>
     * <li>If you specify this parameter, a sample audio file is generated at the specified OSS address after training succeeds.  </li>
     * <li>If you do not specify this parameter, no sample audio is generated.<blockquote>
     * <p>Notice: The address must be a valid public OSS URL under your account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.mp3">https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.mp3</a></p>
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
     * <p>The voice name. The name can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("VoiceName")
    public String voiceName;

    public static SubmitStandardCustomizedVoiceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitStandardCustomizedVoiceJobRequest self = new SubmitStandardCustomizedVoiceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitStandardCustomizedVoiceJobRequest setAudios(String audios) {
        this.audios = audios;
        return this;
    }
    public String getAudios() {
        return this.audios;
    }

    public SubmitStandardCustomizedVoiceJobRequest setAuthentication(String authentication) {
        this.authentication = authentication;
        return this;
    }
    public String getAuthentication() {
        return this.authentication;
    }

    public SubmitStandardCustomizedVoiceJobRequest setDemoAudioMediaURL(String demoAudioMediaURL) {
        this.demoAudioMediaURL = demoAudioMediaURL;
        return this;
    }
    public String getDemoAudioMediaURL() {
        return this.demoAudioMediaURL;
    }

    public SubmitStandardCustomizedVoiceJobRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public SubmitStandardCustomizedVoiceJobRequest setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

}
