// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSkillResponseBody extends TeaModel {
    /**
     * <p>The unique ID for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned Skill object.</p>
     */
    @NameInMap("Skill")
    public GetSkillResponseBodySkill skill;

    public static GetSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillResponseBody self = new GetSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillResponseBody setSkill(GetSkillResponseBodySkill skill) {
        this.skill = skill;
        return this;
    }
    public GetSkillResponseBodySkill getSkill() {
        return this.skill;
    }

    public static class GetSkillResponseBodySkillVisibilityScope extends TeaModel {
        /**
         * <p><strong>A list of project IDs that can access the Skill.</strong></p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        /**
         * <p>A list of user IDs that can access the Skill.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static GetSkillResponseBodySkillVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            GetSkillResponseBodySkillVisibilityScope self = new GetSkillResponseBodySkillVisibilityScope();
            return TeaModel.build(map, self);
        }

        public GetSkillResponseBodySkillVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public GetSkillResponseBodySkillVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class GetSkillResponseBodySkill extends TeaModel {
        /**
         * <p><strong>The content of the SKILL.md file.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>把大象装冰箱需要3步，把冰箱门打开，把大象放进去，把冰箱门关上。</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>A temporary download link for <code>bundle.zip</code>, which does not require authentication and will expire.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/xxx.zip?Expires=...&Signature=">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/xxx.zip?Expires=...&amp;Signature=</a>...</p>
         */
        @NameInMap("BundleUrl")
        public String bundleUrl;

        /**
         * <p>The ID of the user who created the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p><strong>The Skill description.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>数据分析技能</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time the Skill was created, provided as a UNIX timestamp in milliseconds.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time the Skill was last modified, provided as a UNIX timestamp in milliseconds.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The ID of the user who last modified the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p><strong>The name of the Skill.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>my-skill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p><strong>The visibility level.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        /**
         * <p><strong>The visibility scope.</strong></p>
         */
        @NameInMap("VisibilityScope")
        public GetSkillResponseBodySkillVisibilityScope visibilityScope;

        public static GetSkillResponseBodySkill build(java.util.Map<String, ?> map) throws Exception {
            GetSkillResponseBodySkill self = new GetSkillResponseBodySkill();
            return TeaModel.build(map, self);
        }

        public GetSkillResponseBodySkill setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public GetSkillResponseBodySkill setBundleUrl(String bundleUrl) {
            this.bundleUrl = bundleUrl;
            return this;
        }
        public String getBundleUrl() {
            return this.bundleUrl;
        }

        public GetSkillResponseBodySkill setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetSkillResponseBodySkill setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSkillResponseBodySkill setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetSkillResponseBodySkill setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetSkillResponseBodySkill setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetSkillResponseBodySkill setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSkillResponseBodySkill setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public GetSkillResponseBodySkill setVisibilityScope(GetSkillResponseBodySkillVisibilityScope visibilityScope) {
            this.visibilityScope = visibilityScope;
            return this;
        }
        public GetSkillResponseBodySkillVisibilityScope getVisibilityScope() {
            return this.visibilityScope;
        }

    }

}
