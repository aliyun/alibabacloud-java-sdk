// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The gender. Valid values:</p>
     * <ul>
     * <li>female</li>
     * <li>male</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>female</p>
     */
    @NameInMap("Gender")
    public String gender;

    /**
     * <p>The scenario. Valid values:</p>
     * <ul>
     * <li>story</li>
     * <li>interaction</li>
     * <li>navigation</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>story</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    /**
     * <p>The voice description.</p>
     * <ul>
     * <li>The description can be up to 256 characters in length.</li>
     * </ul>
     */
    @NameInMap("VoiceDesc")
    public String voiceDesc;

    /**
     * <p>The voice ID. It can be the English name or Chinese Pinyin of the voice.</p>
     * <ul>
     * <li>The value must be a unique ID that is not used by other custom voices.</li>
     * <li>The ID can be up to 32 characters in length.</li>
     * <li>Only letters and digits are supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaozhuan</p>
     */
    @NameInMap("VoiceId")
    public String voiceId;

    /**
     * <p>The voice name.</p>
     * <ul>
     * <li>The name can be up to 32 characters in length.</li>
     * </ul>
     */
    @NameInMap("VoiceName")
    public String voiceName;

    public static CreateCustomizedVoiceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedVoiceJobRequest self = new CreateCustomizedVoiceJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedVoiceJobRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public CreateCustomizedVoiceJobRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public CreateCustomizedVoiceJobRequest setVoiceDesc(String voiceDesc) {
        this.voiceDesc = voiceDesc;
        return this;
    }
    public String getVoiceDesc() {
        return this.voiceDesc;
    }

    public CreateCustomizedVoiceJobRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public CreateCustomizedVoiceJobRequest setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

}
