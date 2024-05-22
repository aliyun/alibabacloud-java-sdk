// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCustomizedVoiceJobRequest extends TeaModel {
    @NameInMap("DemoAudioMediaURL")
    public String demoAudioMediaURL;

    /**
     * <p>This parameter is required.</p>
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
