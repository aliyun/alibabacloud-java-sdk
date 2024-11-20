// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCustomizedVoiceJobRequest extends TeaModel {
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
