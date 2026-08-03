// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    @NameInMap("agentIconUrl")
    public String agentIconUrl;

    @NameInMap("agentName")
    public String agentName;

    @NameInMap("agentScene")
    public String agentScene;

    @NameInMap("characterAgeStage")
    public String characterAgeStage;

    @NameInMap("characterGender")
    public String characterGender;

    @NameInMap("characterName")
    public String characterName;

    @NameInMap("extraDescription")
    public String extraDescription;

    @NameInMap("industry")
    public String industry;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setAgentIconUrl(String agentIconUrl) {
        this.agentIconUrl = agentIconUrl;
        return this;
    }
    public String getAgentIconUrl() {
        return this.agentIconUrl;
    }

    public CreateAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CreateAgentRequest setAgentScene(String agentScene) {
        this.agentScene = agentScene;
        return this;
    }
    public String getAgentScene() {
        return this.agentScene;
    }

    public CreateAgentRequest setCharacterAgeStage(String characterAgeStage) {
        this.characterAgeStage = characterAgeStage;
        return this;
    }
    public String getCharacterAgeStage() {
        return this.characterAgeStage;
    }

    public CreateAgentRequest setCharacterGender(String characterGender) {
        this.characterGender = characterGender;
        return this;
    }
    public String getCharacterGender() {
        return this.characterGender;
    }

    public CreateAgentRequest setCharacterName(String characterName) {
        this.characterName = characterName;
        return this;
    }
    public String getCharacterName() {
        return this.characterName;
    }

    public CreateAgentRequest setExtraDescription(String extraDescription) {
        this.extraDescription = extraDescription;
        return this;
    }
    public String getExtraDescription() {
        return this.extraDescription;
    }

    public CreateAgentRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

}
