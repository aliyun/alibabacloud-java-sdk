// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartPairDrillRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PairId")
    public String pairId;

    @NameInMap("RegionId")
    public String regionId;

    public static StartPairDrillRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPairDrillRequest self = new StartPairDrillRequest();
        return TeaModel.build(map, self);
    }

    public StartPairDrillRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartPairDrillRequest setPairId(String pairId) {
        this.pairId = pairId;
        return this;
    }
    public String getPairId() {
        return this.pairId;
    }

    public StartPairDrillRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
