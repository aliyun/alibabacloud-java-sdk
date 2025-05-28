// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ModifyCostCenterShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CostCenterEntityList")
    public String costCenterEntityListShrink;

    /**
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
