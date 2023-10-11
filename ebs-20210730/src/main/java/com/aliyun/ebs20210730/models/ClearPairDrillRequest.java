// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ClearPairDrillRequest extends TeaModel {
    @NameInMap("DrillId")
    public String drillId;

    @NameInMap("PairId")
    public String pairId;

    @NameInMap("RegionId")
    public String regionId;

    public static ClearPairDrillRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearPairDrillRequest self = new ClearPairDrillRequest();
        return TeaModel.build(map, self);
    }

    public ClearPairDrillRequest setDrillId(String drillId) {
        this.drillId = drillId;
        return this;
    }
    public String getDrillId() {
        return this.drillId;
    }

    public ClearPairDrillRequest setPairId(String pairId) {
        this.pairId = pairId;
        return this;
    }
    public String getPairId() {
        return this.pairId;
    }

    public ClearPairDrillRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
