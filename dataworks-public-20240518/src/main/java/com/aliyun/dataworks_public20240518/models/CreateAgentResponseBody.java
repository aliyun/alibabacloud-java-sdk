// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentResponseBody extends TeaModel {
    /**
     * <p>The details of the created agent.</p>
     */
    @NameInMap("Agent")
    public CreateAgentResponseBodyAgent agent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResponseBody self = new CreateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentResponseBody setAgent(CreateAgentResponseBodyAgent agent) {
        this.agent = agent;
        return this;
    }
    public CreateAgentResponseBodyAgent getAgent() {
        return this.agent;
    }

    public CreateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAgentResponseBodyAgentExpertSuites extends TeaModel {
        /**
         * <p>This field is not returned during creation. Use GetAgent to explicitly query the published version to obtain the fixed official suite artifact version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0.202610211408</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

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
         * <p>dataworks-data-analysis-extension</p>
         */
        @NameInMap("SuiteId")
        public String suiteId;

        /**
         * <p>The release version number of the custom suite.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The saved version selection strategy is returned only for personal or enterprise resources and is mutually exclusive with the fixed integer Version. It does not represent the specific revision actually loaded in the session. This field is not returned for official resources.</p>
         * 
         * <strong>example:</strong>
         * <p>^1.2.3</p>
         */
        @NameInMap("VersionSelector")
        public String versionSelector;

        public static CreateAgentResponseBodyAgentExpertSuites build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentResponseBodyAgentExpertSuites self = new CreateAgentResponseBodyAgentExpertSuites();
            return TeaModel.build(map, self);
        }

        public CreateAgentResponseBodyAgentExpertSuites setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public CreateAgentResponseBodyAgentExpertSuites setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateAgentResponseBodyAgentExpertSuites setSuiteId(String suiteId) {
            this.suiteId = suiteId;
            return this;
        }
        public String getSuiteId() {
            return this.suiteId;
        }

        public CreateAgentResponseBodyAgentExpertSuites setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public CreateAgentResponseBodyAgentExpertSuites setVersionSelector(String versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public String getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class CreateAgentResponseBodyAgentSkills extends TeaModel {
        /**
         * <p>The name of the custom skill.</p>
         * 
         * <strong>example:</strong>
         * <p>my-business-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This field is not returned during creation. Use GetAgent to explicitly query the published version to obtain the fixed official artifact version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6.0.202608201110</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

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
         * <p>The release version number of the custom skill.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The saved version selection strategy is returned only for personal or enterprise resources and is mutually exclusive with the fixed integer Version. It does not represent the specific revision actually loaded in the session. This field is not returned for official resources.</p>
         * 
         * <strong>example:</strong>
         * <p>^1.2.3</p>
         */
        @NameInMap("VersionSelector")
        public String versionSelector;

        public static CreateAgentResponseBodyAgentSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentResponseBodyAgentSkills self = new CreateAgentResponseBodyAgentSkills();
            return TeaModel.build(map, self);
        }

        public CreateAgentResponseBodyAgentSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAgentResponseBodyAgentSkills setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public CreateAgentResponseBodyAgentSkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public CreateAgentResponseBodyAgentSkills setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateAgentResponseBodyAgentSkills setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public CreateAgentResponseBodyAgentSkills setVersionSelector(String versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public String getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class CreateAgentResponseBodyAgent extends TeaModel {
        /**
         * <p>The saved suite references. Official resources return the source and directory ID. The published artifact version is represented by PackageVersion.</p>
         */
        @NameInMap("ExpertSuites")
        public java.util.List<CreateAgentResponseBodyAgentExpertSuites> expertSuites;

        /**
         * <p>The creation time, expressed as a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

        /**
         * <p>The last modification time, expressed as a timestamp in milliseconds.</p>
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
         * <p>The saved skill references. Official skills return a fixed PackageVersion after the agent is published.</p>
         */
        @NameInMap("Skills")
        public java.util.List<CreateAgentResponseBodyAgentSkills> skills;

        public static CreateAgentResponseBodyAgent build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentResponseBodyAgent self = new CreateAgentResponseBodyAgent();
            return TeaModel.build(map, self);
        }

        public CreateAgentResponseBodyAgent setExpertSuites(java.util.List<CreateAgentResponseBodyAgentExpertSuites> expertSuites) {
            this.expertSuites = expertSuites;
            return this;
        }
        public java.util.List<CreateAgentResponseBodyAgentExpertSuites> getExpertSuites() {
            return this.expertSuites;
        }

        public CreateAgentResponseBodyAgent setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public CreateAgentResponseBodyAgent setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public CreateAgentResponseBodyAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAgentResponseBodyAgent setSkills(java.util.List<CreateAgentResponseBodyAgentSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateAgentResponseBodyAgentSkills> getSkills() {
            return this.skills;
        }

    }

}
