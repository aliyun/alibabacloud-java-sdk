// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateCostCenterShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CostCenterEntityList")
    public String costCenterEntityListShrink;

    /**
     * <strong>example:</strong>
     * <p>2084210001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static CreateCostCenterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCostCenterShrinkRequest self = new CreateCostCenterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCostCenterShrinkRequest setCostCenterEntityListShrink(String costCenterEntityListShrink) {
        this.costCenterEntityListShrink = costCenterEntityListShrink;
        return this;
    }
    public String getCostCenterEntityListShrink() {
        return this.costCenterEntityListShrink;
    }

    public CreateCostCenterShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
