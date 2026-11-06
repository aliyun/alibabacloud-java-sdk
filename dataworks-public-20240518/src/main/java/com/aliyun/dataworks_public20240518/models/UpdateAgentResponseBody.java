// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAgentResponseBody extends TeaModel {
    /**
     * <p>The details of the updated agent.</p>
     */
    @NameInMap("Agent")
    public UpdateAgentResponseBodyAgent agent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentResponseBody self = new UpdateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgentResponseBody setAgent(UpdateAgentResponseBodyAgent agent) {
        this.agent = agent;
        return this;
    }
    public UpdateAgentResponseBodyAgent getAgent() {
        return this.agent;
    }

    public UpdateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAgentResponseBodyAgentExpertSuites extends TeaModel {
        /**
         * <p>The suite description of the bound version.</p>
         * 
         * <strong>example:</strong>
         * <p>Collection of data analytics expert capabilities</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the bound version.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analytics expert suite</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The suite name of the bound version.</p>
         * 
         * <strong>example:</strong>
         * <p>analysis-suite</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The semantic version of the bound version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        @NameInMap("SemanticVersion")
        public String semanticVersion;

        /**
         * <p>The source of the expert suite.</p>
         * 
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the expert suite.</p>
         * 
         * <strong>example:</strong>
         * <p>suite_example</p>
         */
        @NameInMap("SuiteId")
        public String suiteId;

        /**
         * <p>The bound published version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The version selection expression.</p>
         * 
         * <strong>example:</strong>
         * <p>^1.2.3</p>
         */
        @NameInMap("VersionSelector")
        public String versionSelector;

        public static UpdateAgentResponseBodyAgentExpertSuites build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentResponseBodyAgentExpertSuites self = new UpdateAgentResponseBodyAgentExpertSuites();
            return TeaModel.build(map, self);
        }

        public UpdateAgentResponseBodyAgentExpertSuites setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateAgentResponseBodyAgentExpertSuites setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateAgentResponseBodyAgentExpertSuites setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAgentResponseBodyAgentExpertSuites setSemanticVersion(String semanticVersion) {
            this.semanticVersion = semanticVersion;
            return this;
        }
        public String getSemanticVersion() {
            return this.semanticVersion;
        }

        public UpdateAgentResponseBodyAgentExpertSuites setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAgentResponseBodyAgentExpertSuites setSuiteId(String suiteId) {
            this.suiteId = suiteId;
            return this;
        }
        public String getSuiteId() {
            return this.suiteId;
        }

        public UpdateAgentResponseBodyAgentExpertSuites setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public UpdateAgentResponseBodyAgentExpertSuites setVersionSelector(String versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public String getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class UpdateAgentResponseBodyAgentSkills extends TeaModel {
        /**
         * <p>The name of the bound custom skill.</p>
         * 
         * <strong>example:</strong>
         * <p>my-business-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the official skill.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-semantic</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The source of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The published version number of the bound custom skill.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The version selection expression.</p>
         * 
         * <strong>example:</strong>
         * <p>^1.2.3</p>
         */
        @NameInMap("VersionSelector")
        public String versionSelector;

        public static UpdateAgentResponseBodyAgentSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentResponseBodyAgentSkills self = new UpdateAgentResponseBodyAgentSkills();
            return TeaModel.build(map, self);
        }

        public UpdateAgentResponseBodyAgentSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAgentResponseBodyAgentSkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public UpdateAgentResponseBodyAgentSkills setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateAgentResponseBodyAgentSkills setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public UpdateAgentResponseBodyAgentSkills setVersionSelector(String versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public String getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class UpdateAgentResponseBodyAgent extends TeaModel {
        /**
         * <p>The version of the updated agent definition.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AgentVersion")
        public Integer agentVersion;

        /**
         * <p>The bound expert suites.</p>
         */
        @NameInMap("ExpertSuites")
        public java.util.List<UpdateAgentResponseBodyAgentExpertSuites> expertSuites;

        /**
         * <p>The creation time of the agent. It is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

        /**
         * <p>The last modified time of the agent. It is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public Long gmtModifiedTime;

        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of bound skill references after the update.</p>
         */
        @NameInMap("Skills")
        public java.util.List<UpdateAgentResponseBodyAgentSkills> skills;

        public static UpdateAgentResponseBodyAgent build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentResponseBodyAgent self = new UpdateAgentResponseBodyAgent();
            return TeaModel.build(map, self);
        }

        public UpdateAgentResponseBodyAgent setAgentVersion(Integer agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Integer getAgentVersion() {
            return this.agentVersion;
        }

        public UpdateAgentResponseBodyAgent setExpertSuites(java.util.List<UpdateAgentResponseBodyAgentExpertSuites> expertSuites) {
            this.expertSuites = expertSuites;
            return this;
        }
        public java.util.List<UpdateAgentResponseBodyAgentExpertSuites> getExpertSuites() {
            return this.expertSuites;
        }

        public UpdateAgentResponseBodyAgent setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public UpdateAgentResponseBodyAgent setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public UpdateAgentResponseBodyAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAgentResponseBodyAgent setSkills(java.util.List<UpdateAgentResponseBodyAgentSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateAgentResponseBodyAgentSkills> getSkills() {
            return this.skills;
        }

    }

}
