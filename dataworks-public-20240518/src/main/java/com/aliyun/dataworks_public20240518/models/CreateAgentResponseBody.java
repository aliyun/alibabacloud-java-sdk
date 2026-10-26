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
         * <p>创建时不返回；请使用 GetAgent 显式查询已发布版本获取固定的官方套件制品版本。</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0.202610211408</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>dataworks-data-analysis-extension</p>
         */
        @NameInMap("SuiteId")
        public String suiteId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

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

    }

    public static class CreateAgentResponseBodyAgentSkills extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-business-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>创建时不返回；请使用 GetAgent 显式查询已发布版本获取固定的官方制品版本。</p>
         * 
         * <strong>example:</strong>
         * <p>0.6.0.202608201110</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <strong>example:</strong>
         * <p>dataworks-semantic</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <strong>example:</strong>
         * <p>OFFICIAL</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

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

    }

    public static class CreateAgentResponseBodyAgent extends TeaModel {
        /**
         * <p>已保存的套件引用。官方资源返回来源及目录 ID；发布后的制品版本由 PackageVersion 表示。</p>
         */
        @NameInMap("ExpertSuites")
        public java.util.List<CreateAgentResponseBodyAgentExpertSuites> expertSuites;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The last modification time. The value is a UNIX timestamp in milliseconds.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>已保存的 Skill 引用；官方 Skill 在 Agent 发布后返回固定的 PackageVersion。</p>
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

        public CreateAgentResponseBodyAgent setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public CreateAgentResponseBodyAgent setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
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
