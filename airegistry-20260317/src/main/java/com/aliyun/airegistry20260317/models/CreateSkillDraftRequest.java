// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreateSkillDraftRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.0.1</p>
     */
    @NameInMap("BasedOnVersion")
    public String basedOnVersion;

    /**
     * <strong>example:</strong>
     * <p>初始版本</p>
     */
    @NameInMap("CommitMsg")
    public String commitMsg;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;customer-service-skill&quot;,&quot;description&quot;:&quot;...&quot;}</p>
     */
    @NameInMap("SkillCard")
    public String skillCard;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-skill</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
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
