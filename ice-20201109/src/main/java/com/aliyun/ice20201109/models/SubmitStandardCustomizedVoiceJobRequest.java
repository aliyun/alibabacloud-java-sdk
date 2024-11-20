// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitStandardCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <ul>
     * <li>The material assets IDs of the materials for training.</li>
     * <li>Separate multiple media IDs with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p>: The total duration of all materials must be within 15 to 30 minutes. The duration of each material must be greater than 1 minute.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong>,<strong><strong>571c704445f9a0ee011406c2</strong></strong>,<strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Audios")
    public String audios;

    /**
     * <ul>
     * <li><p>The media asset ID of the authentication audio.</p>
     * </li>
     * <li><p>Upload an audio file for identity authentication. If the voiceprint extracted from the uploaded file differs from that of the training file, the job fails.</p>
     * <p>**</p>
     * <p><strong>Note</strong>: Clearly read and record the following text: I confirm to customize human voice cloning and provide audio files that contain my voice for training. I promise that I am responsible for the customized content and that the content complies with laws and regulations.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Authentication")
    public String authentication;

    /**
     * <p>The URL of the sample audio file.</p>
     * <ul>
     * <li><p>If this parameter is specified, a sample audio file is generated at the specified Object Storage Service (OSS) URL after the training is complete.</p>
     * </li>
     * <li><p>If this parameter is not specified, no sample audio file is generated.</p>
     * <p>**</p>
     * <p><strong>Note</strong>: The URL must be a valid public OSS URL within your Alibaba Cloud account.</p>
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
     * <p>The voice name.</p>
     * <ul>
     * <li>The name can be up to 32 characters in length.</li>
     * </ul>
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
