// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SaveCostCenterShareRuleShrinkRequest extends TeaModel {
    @NameInMap("CreateShareRuleList")
    public String createShareRuleListShrink;

    @NameInMap("ModifyShareRuleList")
    public String modifyShareRuleListShrink;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>1977800748053695</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

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
