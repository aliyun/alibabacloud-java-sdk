// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSkillResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

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
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Description")
        public String description;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>my-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("Visibility")
        public String visibility;

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
