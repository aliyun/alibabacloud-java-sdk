// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The audio output address of the sample.  </p>
     * <ul>
     * <li>If you specify this parameter, a sample audio file is generated at the specified OSS address after training succeeds.  </li>
     * <li>If you do not specify this parameter, no sample audio is generated.<blockquote>
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
     * <p>The voice ID.</p>
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
