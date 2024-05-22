// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UnmapPlanogramRailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RailCode")
    public String railCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static UnmapPlanogramRailRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmapPlanogramRailRequest self = new UnmapPlanogramRailRequest();
        return TeaModel.build(map, self);
    }

    public UnmapPlanogramRailRequest setRailCode(String railCode) {
        this.railCode = railCode;
        return this;
    }
    public String getRailCode() {
        return this.railCode;
    }

    public UnmapPlanogramRailRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
