// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAgentsResponseBody extends TeaModel {
    @NameInMap("list")
    public java.util.List<ListAgentsResponseBodyList> list;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Integer total;

    public static ListAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsResponseBody self = new ListAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentsResponseBody setList(java.util.List<ListAgentsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAgentsResponseBodyList> getList() {
        return this.list;
    }

    public ListAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAgentsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAgentsResponseBodyList extends TeaModel {
        @NameInMap("agentIconUrl")
        public String agentIconUrl;

        @NameInMap("agentId")
        public String agentId;

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

        @NameInMap("charactersDescription")
        public String charactersDescription;

        @NameInMap("enableInteraction")
        public Integer enableInteraction;

        @NameInMap("industry")
        public String industry;

        @NameInMap("onlineSearch")
        public Boolean onlineSearch;

        @NameInMap("owner")
        public String owner;

        @NameInMap("referenceUrl")
        public String referenceUrl;

        @NameInMap("status")
        public Integer status;

        @NameInMap("textStyle")
        public String textStyle;

        @NameInMap("viewer")
        public String viewer;

        public static ListAgentsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentsResponseBodyList self = new ListAgentsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAgentsResponseBodyList setAgentIconUrl(String agentIconUrl) {
            this.agentIconUrl = agentIconUrl;
            return this;
        }
        public String getAgentIconUrl() {
            return this.agentIconUrl;
        }

        public ListAgentsResponseBodyList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentsResponseBodyList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentsResponseBodyList setAgentScene(String agentScene) {
            this.agentScene = agentScene;
            return this;
        }
        public String getAgentScene() {
            return this.agentScene;
        }

        public ListAgentsResponseBodyList setCharacterAgeStage(String characterAgeStage) {
            this.characterAgeStage = characterAgeStage;
            return this;
        }
        public String getCharacterAgeStage() {
            return this.characterAgeStage;
        }

        public ListAgentsResponseBodyList setCharacterGender(String characterGender) {
            this.characterGender = characterGender;
            return this;
        }
        public String getCharacterGender() {
            return this.characterGender;
        }

        public ListAgentsResponseBodyList setCharacterName(String characterName) {
            this.characterName = characterName;
            return this;
        }
        public String getCharacterName() {
            return this.characterName;
        }

        public ListAgentsResponseBodyList setCharactersDescription(String charactersDescription) {
            this.charactersDescription = charactersDescription;
            return this;
        }
        public String getCharactersDescription() {
            return this.charactersDescription;
        }

        public ListAgentsResponseBodyList setEnableInteraction(Integer enableInteraction) {
            this.enableInteraction = enableInteraction;
            return this;
        }
        public Integer getEnableInteraction() {
            return this.enableInteraction;
        }

        public ListAgentsResponseBodyList setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public ListAgentsResponseBodyList setOnlineSearch(Boolean onlineSearch) {
            this.onlineSearch = onlineSearch;
            return this;
        }
        public Boolean getOnlineSearch() {
            return this.onlineSearch;
        }

        public ListAgentsResponseBodyList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListAgentsResponseBodyList setReferenceUrl(String referenceUrl) {
            this.referenceUrl = referenceUrl;
            return this;
        }
        public String getReferenceUrl() {
            return this.referenceUrl;
        }

        public ListAgentsResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAgentsResponseBodyList setTextStyle(String textStyle) {
            this.textStyle = textStyle;
            return this;
        }
        public String getTextStyle() {
            return this.textStyle;
        }

        public ListAgentsResponseBodyList setViewer(String viewer) {
            this.viewer = viewer;
            return this;
        }
        public String getViewer() {
            return this.viewer;
        }

    }

}
