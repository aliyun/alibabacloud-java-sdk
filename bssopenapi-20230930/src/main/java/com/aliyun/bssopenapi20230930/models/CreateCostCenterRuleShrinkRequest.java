// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCostCenterRuleShrinkRequest extends TeaModel {
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
     * <p>2084210001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static CreateCostCenterRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCostCenterRuleShrinkRequest self = new CreateCostCenterRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCostCenterRuleShrinkRequest setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }
    public Long getCostCenterId() {
        return this.costCenterId;
    }

    public CreateCostCenterRuleShrinkRequest setFilterExpressionShrink(String filterExpressionShrink) {
        this.filterExpressionShrink = filterExpressionShrink;
        return this;
    }
    public String getFilterExpressionShrink() {
        return this.filterExpressionShrink;
    }

    public CreateCostCenterRuleShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
