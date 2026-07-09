// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluatorSkillResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The skill details.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;skillName&quot;:&quot;trace_context_loader&quot;,&quot;enable&quot;:true,&quot;currentVersion&quot;:&quot;1782816000000&quot;}</p>
     */
    @NameInMap("skill")
    public GetEvaluatorSkillResponseBodySkill skill;

    public static GetEvaluatorSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluatorSkillResponseBody self = new GetEvaluatorSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEvaluatorSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEvaluatorSkillResponseBody setSkill(GetEvaluatorSkillResponseBodySkill skill) {
        this.skill = skill;
        return this;
    }
    public GetEvaluatorSkillResponseBodySkill getSkill() {
        return this.skill;
    }

    public static class GetEvaluatorSkillResponseBodySkillFiles extends TeaModel {
        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <h1>Trace Context Loader</h1>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The file remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>主技能说明</p>
         */
        @NameInMap("remark")
        public String remark;

        public static GetEvaluatorSkillResponseBodySkillFiles build(java.util.Map<String, ?> map) throws Exception {
            GetEvaluatorSkillResponseBodySkillFiles self = new GetEvaluatorSkillResponseBodySkillFiles();
            return TeaModel.build(map, self);
        }

        public GetEvaluatorSkillResponseBodySkillFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetEvaluatorSkillResponseBodySkillFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEvaluatorSkillResponseBodySkillFiles setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class GetEvaluatorSkillResponseBodySkillVersions extends TeaModel {
        /**
         * <p>The time when the version was created. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000000</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>首次发布版本</p>
         */
        @NameInMap("versionDescription")
        public String versionDescription;

        public static GetEvaluatorSkillResponseBodySkillVersions build(java.util.Map<String, ?> map) throws Exception {
            GetEvaluatorSkillResponseBodySkillVersions self = new GetEvaluatorSkillResponseBodySkillVersions();
            return TeaModel.build(map, self);
        }

        public GetEvaluatorSkillResponseBodySkillVersions setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetEvaluatorSkillResponseBodySkillVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetEvaluatorSkillResponseBodySkillVersions setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class GetEvaluatorSkillResponseBodySkill extends TeaModel {
        /**
         * <p>The time when the skill was created. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The current version.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000000</p>
         */
        @NameInMap("currentVersion")
        public String currentVersion;

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>读取链路上下文辅助评估</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Trace 上下文读取</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>Indicates whether the skill is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The list of skill files.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;# Trace Context Loader&quot;,&quot;remark&quot;:&quot;主技能说明&quot;}]</p>
         */
        @NameInMap("files")
        public java.util.List<GetEvaluatorSkillResponseBodySkillFiles> files;

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000000</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_context_loader</p>
         */
        @NameInMap("skillName")
        public String skillName;

        /**
         * <p>The time when the skill was last updated. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816600</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        /**
         * <p>The list of skill versions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;version&quot;:&quot;1782816000000&quot;,&quot;versionDescription&quot;:&quot;首次发布版本&quot;}]</p>
         */
        @NameInMap("versions")
        public java.util.List<GetEvaluatorSkillResponseBodySkillVersions> versions;

        public static GetEvaluatorSkillResponseBodySkill build(java.util.Map<String, ?> map) throws Exception {
            GetEvaluatorSkillResponseBodySkill self = new GetEvaluatorSkillResponseBodySkill();
            return TeaModel.build(map, self);
        }

        public GetEvaluatorSkillResponseBodySkill setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetEvaluatorSkillResponseBodySkill setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public GetEvaluatorSkillResponseBodySkill setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEvaluatorSkillResponseBodySkill setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetEvaluatorSkillResponseBodySkill setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetEvaluatorSkillResponseBodySkill setFiles(java.util.List<GetEvaluatorSkillResponseBodySkillFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<GetEvaluatorSkillResponseBodySkillFiles> getFiles() {
            return this.files;
        }

        public GetEvaluatorSkillResponseBodySkill setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public GetEvaluatorSkillResponseBodySkill setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public GetEvaluatorSkillResponseBodySkill setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetEvaluatorSkillResponseBodySkill setVersions(java.util.List<GetEvaluatorSkillResponseBodySkillVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetEvaluatorSkillResponseBodySkillVersions> getVersions() {
            return this.versions;
        }

    }

}
