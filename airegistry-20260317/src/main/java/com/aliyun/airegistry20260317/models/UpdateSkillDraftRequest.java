// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillDraftRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>更新说明</p>
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
     * <p>This parameter is required.</p>
     * 
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

    public static UpdateSkillDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillDraftRequest self = new UpdateSkillDraftRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillDraftRequest setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }
    public String getCommitMsg() {
        return this.commitMsg;
    }

    public UpdateSkillDraftRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateSkillDraftRequest setSkillCard(String skillCard) {
        this.skillCard = skillCard;
        return this;
    }
    public String getSkillCard() {
        return this.skillCard;
    }

    public UpdateSkillDraftRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
