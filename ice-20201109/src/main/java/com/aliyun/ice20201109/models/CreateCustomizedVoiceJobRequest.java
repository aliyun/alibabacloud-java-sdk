// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The gender. Valid values:</p>
     * <ul>
     * <li>female: female.</li>
     * <li>male: male.</li>
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
     * <li>story: story.</li>
     * <li>interaction: interaction.</li>
     * <li>navigation: navigation.</li>
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
     * <li>The description cannot exceed 256 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>This is a personalized voice</p>
     */
    @NameInMap("VoiceDesc")
    public String voiceDesc;

    /**
     * <p>The custom voice ID (English name or pinyin of the voice).</p>
     * <ul>
     * <li>The ID cannot be the same as any of your other custom voice IDs.</li>
     * <li>The ID cannot exceed 32 characters.</li>
     * <li>Only letters and numbers are supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaozhuan</p>
     */
    @NameInMap("VoiceId")
    public String voiceId;

    /**
     * <p>The voice name (generally a Chinese name).</p>
     * <ul>
     * <li>The name cannot exceed 32 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>小专</p>
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
