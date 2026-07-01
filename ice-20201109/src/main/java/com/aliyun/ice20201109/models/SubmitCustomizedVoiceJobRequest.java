// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The OSS URL where the demo audio will be saved.</p>
     * <ul>
     * <li><p>If specified, the service generates a demo audio file at the provided OSS URL after training completes.</p>
     * </li>
     * <li><blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The URL must be a valid public address for an OSS object in your account.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.MP3">https://your-bucket.oss-cn-shanghai.aliyuncs.com/demo.MP3</a></p>
     */
    @NameInMap("DemoAudioMediaURL")
    public String demoAudioMediaURL;

    /**
     * <p>The unique identifier for the voice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaozhuan</p>
     */
    @NameInMap("VoiceId")
    public String voiceId;

    public static SubmitCustomizedVoiceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomizedVoiceJobRequest self = new SubmitCustomizedVoiceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCustomizedVoiceJobRequest setDemoAudioMediaURL(String demoAudioMediaURL) {
        this.demoAudioMediaURL = demoAudioMediaURL;
        return this;
    }
    public String getDemoAudioMediaURL() {
        return this.demoAudioMediaURL;
    }

    public SubmitCustomizedVoiceJobRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

}
