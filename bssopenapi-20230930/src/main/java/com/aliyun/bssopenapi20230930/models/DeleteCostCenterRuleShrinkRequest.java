// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCostCenterRuleShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>637127</p>
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

    public static DeleteCostCenterRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostCenterRuleShrinkRequest self = new DeleteCostCenterRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCostCenterRuleShrinkRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public DeleteCostCenterRuleShrinkRequest setFilterExpressionShrink(String filterExpressionShrink) {
        this.filterExpressionShrink = filterExpressionShrink;
        return this;
    }
    public String getFilterExpressionShrink() {
        return this.filterExpressionShrink;
    }

    public DeleteCostCenterRuleShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
