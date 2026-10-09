// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSkillResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill details.</p>
     */
    @NameInMap("Skill")
    public CreateSkillResponseBodySkill skill;

    public static CreateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillResponseBody self = new CreateSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSkillResponseBody setSkill(CreateSkillResponseBodySkill skill) {
        this.skill = skill;
        return this;
    }
    public CreateSkillResponseBodySkill getSkill() {
        return this.skill;
    }

    public static class CreateSkillResponseBodySkillVisibilityScope extends TeaModel {
        /**
         * <p>The IDs of the visible projects.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        /**
         * <p>The IDs of the visible users. This field is returned only when Visibility is set to USER.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static CreateSkillResponseBodySkillVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillResponseBodySkillVisibilityScope self = new CreateSkillResponseBodySkillVisibilityScope();
            return TeaModel.build(map, self);
        }

        public CreateSkillResponseBodySkillVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public CreateSkillResponseBodySkillVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class CreateSkillResponseBodySkill extends TeaModel {
        /**
         * <p>The content of the SKILL.md file.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analytics skill</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>12345678901</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The ID of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The visibility level.</p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        /**
         * <p>The visibility scope.</p>
         */
        @NameInMap("VisibilityScope")
        public CreateSkillResponseBodySkillVisibilityScope visibilityScope;

        public static CreateSkillResponseBodySkill build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillResponseBodySkill self = new CreateSkillResponseBodySkill();
            return TeaModel.build(map, self);
        }

        public CreateSkillResponseBodySkill setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public CreateSkillResponseBodySkill setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public CreateSkillResponseBodySkill setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSkillResponseBodySkill setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public CreateSkillResponseBodySkill setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public CreateSkillResponseBodySkill setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public CreateSkillResponseBodySkill setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSkillResponseBodySkill setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public CreateSkillResponseBodySkill setVisibilityScope(CreateSkillResponseBodySkillVisibilityScope visibilityScope) {
            this.visibilityScope = visibilityScope;
            return this;
        }
        public CreateSkillResponseBodySkillVisibilityScope getVisibilityScope() {
            return this.visibilityScope;
        }

    }

}
