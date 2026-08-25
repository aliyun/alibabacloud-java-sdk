// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateSkillResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Skill details.</p>
     */
    @NameInMap("Skill")
    public UpdateSkillResponseBodySkill skill;

    public static UpdateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillResponseBody self = new UpdateSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSkillResponseBody setSkill(UpdateSkillResponseBodySkill skill) {
        this.skill = skill;
        return this;
    }
    public UpdateSkillResponseBodySkill getSkill() {
        return this.skill;
    }

    public static class UpdateSkillResponseBodySkillVisibilityScope extends TeaModel {
        /**
         * <p>The list of visible project IDs.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        /**
         * <p>The list of visible user IDs.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static UpdateSkillResponseBodySkillVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateSkillResponseBodySkillVisibilityScope self = new UpdateSkillResponseBodySkillVisibilityScope();
            return TeaModel.build(map, self);
        }

        public UpdateSkillResponseBodySkillVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public UpdateSkillResponseBodySkillVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class UpdateSkillResponseBodySkill extends TeaModel {
        /**
         * <p>The SKILL.md body content.</p>
         * 
         * <strong>example:</strong>
         * <p>Putting an elephant in a refrigerator takes three steps: open the refrigerator door, put the elephant in, and close the refrigerator door</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The Skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analytics skill</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation time (millisecond timestamp).</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The last modification time (millisecond timestamp).</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The last modifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p>The Skill name.</p>
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
        public UpdateSkillResponseBodySkillVisibilityScope visibilityScope;

        public static UpdateSkillResponseBodySkill build(java.util.Map<String, ?> map) throws Exception {
            UpdateSkillResponseBodySkill self = new UpdateSkillResponseBodySkill();
            return TeaModel.build(map, self);
        }

        public UpdateSkillResponseBodySkill setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public UpdateSkillResponseBodySkill setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public UpdateSkillResponseBodySkill setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSkillResponseBodySkill setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public UpdateSkillResponseBodySkill setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public UpdateSkillResponseBodySkill setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public UpdateSkillResponseBodySkill setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSkillResponseBodySkill setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public UpdateSkillResponseBodySkill setVisibilityScope(UpdateSkillResponseBodySkillVisibilityScope visibilityScope) {
            this.visibilityScope = visibilityScope;
            return this;
        }
        public UpdateSkillResponseBodySkillVisibilityScope getVisibilityScope() {
            return this.visibilityScope;
        }

    }

}
