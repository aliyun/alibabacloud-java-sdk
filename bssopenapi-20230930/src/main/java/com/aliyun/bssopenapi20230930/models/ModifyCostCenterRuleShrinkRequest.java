// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterRuleShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>485938</p>
     */
    @NameInMap("CostCenterId")
    public Long costCenterId;

    @NameInMap("FilterExpression")
    public String filterExpressionShrink;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>1234567812345678</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    public static ModifyCostCenterRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostCenterRuleShrinkRequest self = new ModifyCostCenterRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCostCenterRuleShrinkRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public ModifyCostCenterRuleShrinkRequest setFilterExpressionShrink(String filterExpressionShrink) {
        this.filterExpressionShrink = filterExpressionShrink;
        return this;
    }
    public String getFilterExpressionShrink() {
        return this.filterExpressionShrink;
    }

    public ModifyCostCenterRuleShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public ModifyCostCenterRuleShrinkRequest setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

}
