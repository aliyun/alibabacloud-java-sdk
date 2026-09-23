// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SaveCostCenterShareRuleShrinkRequest extends TeaModel {
    /**
     * <p>The list of allocation rules to create.</p>
     */
    @NameInMap("CreateShareRuleList")
    public String createShareRuleListShrink;

    /**
     * <p>The list of allocation rules to update.</p>
     */
    @NameInMap("ModifyShareRuleList")
    public String modifyShareRuleListShrink;

    /**
     * <p>The ID of the level-1 sales channel. If this parameter is left empty, the ID of the sales channel to which the current user belongs is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The ID of the user who owns the financial unit.</p>
     * 
     * <strong>example:</strong>
     * <p>1977800748053695</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    /**
     * <p>The list of allocation rules to delete.</p>
     */
    @NameInMap("RemoveShareRuleList")
    public String removeShareRuleListShrink;

    public static SaveCostCenterShareRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCostCenterShareRuleShrinkRequest self = new SaveCostCenterShareRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveCostCenterShareRuleShrinkRequest setCreateShareRuleListShrink(String createShareRuleListShrink) {
        this.createShareRuleListShrink = createShareRuleListShrink;
        return this;
    }
    public String getCreateShareRuleListShrink() {
        return this.createShareRuleListShrink;
    }

    public SaveCostCenterShareRuleShrinkRequest setModifyShareRuleListShrink(String modifyShareRuleListShrink) {
        this.modifyShareRuleListShrink = modifyShareRuleListShrink;
        return this;
    }
    public String getModifyShareRuleListShrink() {
        return this.modifyShareRuleListShrink;
    }

    public SaveCostCenterShareRuleShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public SaveCostCenterShareRuleShrinkRequest setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public SaveCostCenterShareRuleShrinkRequest setRemoveShareRuleListShrink(String removeShareRuleListShrink) {
        this.removeShareRuleListShrink = removeShareRuleListShrink;
        return this;
    }
    public String getRemoveShareRuleListShrink() {
        return this.removeShareRuleListShrink;
    }

}
