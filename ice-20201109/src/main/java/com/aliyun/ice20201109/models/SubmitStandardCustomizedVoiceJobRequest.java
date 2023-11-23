// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitStandardCustomizedVoiceJobRequest extends TeaModel {
    @NameInMap("Audios")
    public String audios;

    @NameInMap("Authentication")
    public String authentication;

    @NameInMap("DemoAudioMediaURL")
    public String demoAudioMediaURL;

    @NameInMap("Gender")
    public String gender;

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
