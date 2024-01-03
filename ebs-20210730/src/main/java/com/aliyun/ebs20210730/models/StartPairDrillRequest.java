// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartPairDrillRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~) operation to query a list of replication pairs, including replication pair IDs.</p>
     */
    @NameInMap("PairId")
    public String pairId;

    /**
     * <p>The region ID of the secondary disk in the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~) operation to query the region in which the secondary disk of the replication pair resides.</p>
     * <br>
     * <p>>  You must enable the disaster recovery drill feature in the region in which the secondary site resides.</p>
     */
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
