// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class UpdateAgentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://abc/1.jpg">http://abc/1.jpg</a></p>
     */
    @NameInMap("agentIconUrl")
    public String agentIconUrl;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>agent</p>
     */
    @NameInMap("agentName")
    public String agentName;

    /**
     * <strong>example:</strong>
     * <p>18-20</p>
     */
    @NameInMap("characterAgeStage")
    public String characterAgeStage;

    @NameInMap("characterGender")
    public String characterGender;

    /**
     * <strong>example:</strong>
     * <p>ZhangSan</p>
     */
    @NameInMap("characterName")
    public String characterName;

    /**
     * <strong>example:</strong>
     * <p>He is a doctor.</p>
     */
    @NameInMap("extraDescription")
    public String extraDescription;

    /**
     * <strong>example:</strong>
     * <p>Medical</p>
     */
    @NameInMap("industry")
    public String industry;

    public static UpdateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRequest self = new UpdateAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRequest setAgentIconUrl(String agentIconUrl) {
        this.agentIconUrl = agentIconUrl;
        return this;
    }
    public String getAgentIconUrl() {
        return this.agentIconUrl;
    }

    public UpdateAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdateAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public UpdateAgentRequest setCharacterAgeStage(String characterAgeStage) {
        this.characterAgeStage = characterAgeStage;
        return this;
    }
    public String getCharacterAgeStage() {
        return this.characterAgeStage;
    }

    public UpdateAgentRequest setCharacterGender(String characterGender) {
        this.characterGender = characterGender;
        return this;
    }
    public String getCharacterGender() {
        return this.characterGender;
    }

    public UpdateAgentRequest setCharacterName(String characterName) {
        this.characterName = characterName;
        return this;
    }
    public String getCharacterName() {
        return this.characterName;
    }

    public UpdateAgentRequest setExtraDescription(String extraDescription) {
        this.extraDescription = extraDescription;
        return this;
    }
    public String getExtraDescription() {
        return this.extraDescription;
    }

    public UpdateAgentRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

}
