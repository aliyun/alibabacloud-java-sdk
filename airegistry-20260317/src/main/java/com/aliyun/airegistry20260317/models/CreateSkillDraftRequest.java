// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreateSkillDraftRequest extends TeaModel {
    /**
     * <p>The version to fork from. If not specified, a new Skill is created based on the latest version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1</p>
     */
    @NameInMap("BasedOnVersion")
    public String basedOnVersion;

    /**
     * <p>The commit message.</p>
     * 
     * <strong>example:</strong>
     * <p>Initial version.</p>
     */
    @NameInMap("CommitMsg")
    public String commitMsg;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The Skill card JSON string that contains complete Skill information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;customer-service-skill&quot;,&quot;description&quot;:&quot;customer-skill-desc&quot;,&quot;skillMd&quot;:&quot;---\nname: customer-service-skill\ndescription: customer-skill-desc\n---\ncustomer-skill-content&quot;}</p>
     */
    @NameInMap("SkillCard")
    public String skillCard;

    /**
     * <p>The Skill name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-skill</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The specified draft version number. If not specified, the version number is automatically incremented.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.2</p>
     */
    @NameInMap("TargetVersion")
    public String targetVersion;

    public static CreateSkillDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillDraftRequest self = new CreateSkillDraftRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillDraftRequest setBasedOnVersion(String basedOnVersion) {
        this.basedOnVersion = basedOnVersion;
        return this;
    }
    public String getBasedOnVersion() {
        return this.basedOnVersion;
    }

    public CreateSkillDraftRequest setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }
    public String getCommitMsg() {
        return this.commitMsg;
    }

    public CreateSkillDraftRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateSkillDraftRequest setSkillCard(String skillCard) {
        this.skillCard = skillCard;
        return this;
    }
    public String getSkillCard() {
        return this.skillCard;
    }

    public CreateSkillDraftRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public CreateSkillDraftRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
