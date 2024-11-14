// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ClearPairDrillRequest extends TeaModel {
    /**
     * <p>The ID of the drill. You can call the <a href="https://help.aliyun.com/document_detail/2584480.html">DescribePairDrills</a> operation to query the disaster recovery drills that were performed on replication pairs in a specific region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drill-xxxx</p>
     */
    @NameInMap("DrillId")
    public String drillId;

    /**
     * <p>The ID of the replication pair. You can call the <a href="https://help.aliyun.com/document_detail/354206.html">DescribeDiskReplicaPairs</a> operation to query the most recent list of replication pairs, including replication pair IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pair-xxxx</p>
     */
    @NameInMap("PairId")
    public String pairId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
