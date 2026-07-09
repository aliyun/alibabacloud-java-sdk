// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterShrinkRequest extends TeaModel {
    /**
     * <p>The list of cost center entities.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CostCenterEntityList")
    public String costCenterEntityListShrink;

    /**
     * <p>The level-1 marketplace ID. If this parameter is left empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    public static ModifyCostCenterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostCenterShrinkRequest self = new ModifyCostCenterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCostCenterShrinkRequest setCostCenterEntityListShrink(String costCenterEntityListShrink) {
        this.costCenterEntityListShrink = costCenterEntityListShrink;
        return this;
    }
    public String getCostCenterEntityListShrink() {
        return this.costCenterEntityListShrink;
    }

    public ModifyCostCenterShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

}
