// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateSkillDraftRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateSkillDraftRequestBody body;

    public static CreateSkillDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillDraftRequest self = new CreateSkillDraftRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillDraftRequest setBody(CreateSkillDraftRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateSkillDraftRequestBody getBody() {
        return this.body;
    }

    public static class CreateSkillDraftRequestBody extends TeaModel {
        /**
         * <p>The version from which to fork the draft. If not specified, a new Skill is created.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("basedOnVersion")
        public String basedOnVersion;

        /**
         * <p>The commit message.</p>
         * 
         * <strong>example:</strong>
         * <p>Initial version</p>
         */
        @NameInMap("commitMsg")
        public String commitMsg;

        /**
         * <p>The Skill card JSON string that contains the complete Skill information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;customer-service-skill&quot;,&quot;description&quot;:&quot;...&quot;}</p>
         */
        @NameInMap("skillCard")
        public String skillCard;

        /**
         * <p>The Skill name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-skill</p>
         */
        @NameInMap("skillName")
        public String skillName;

        /**
         * <p>The draft version number to assign. If not specified, the version number is automatically incremented.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.2</p>
         */
        @NameInMap("targetVersion")
        public String targetVersion;

        public static CreateSkillDraftRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillDraftRequestBody self = new CreateSkillDraftRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateSkillDraftRequestBody setBasedOnVersion(String basedOnVersion) {
            this.basedOnVersion = basedOnVersion;
            return this;
        }
        public String getBasedOnVersion() {
            return this.basedOnVersion;
        }

        public CreateSkillDraftRequestBody setCommitMsg(String commitMsg) {
            this.commitMsg = commitMsg;
            return this;
        }
        public String getCommitMsg() {
            return this.commitMsg;
        }

        public CreateSkillDraftRequestBody setSkillCard(String skillCard) {
            this.skillCard = skillCard;
            return this;
        }
        public String getSkillCard() {
            return this.skillCard;
        }

        public CreateSkillDraftRequestBody setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public CreateSkillDraftRequestBody setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

    }

}
