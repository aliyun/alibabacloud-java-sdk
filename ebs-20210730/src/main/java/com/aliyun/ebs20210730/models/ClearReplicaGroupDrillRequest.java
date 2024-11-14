// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ClearReplicaGroupDrillRequest extends TeaModel {
    /**
     * <p>The ID of the drill. You can call the <a href="https://help.aliyun.com/document_detail/2584481.html">DescribeReplicaGroupDrills</a> operation to query disaster recovery drills that were performed on replication pairs in a specific region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-drill-xxxx</p>
     */
    @NameInMap("DrillId")
    public String drillId;

    /**
     * <p>The ID of the replication pair-consistent group. You can call the <a href="https://help.aliyun.com/document_detail/426614.html">DescribeDiskReplicaGroups</a> operation to query the most recent list of replication pair-consistent groups, including group IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxx</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ClearReplicaGroupDrillRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearReplicaGroupDrillRequest self = new ClearReplicaGroupDrillRequest();
        return TeaModel.build(map, self);
    }

    public ClearReplicaGroupDrillRequest setDrillId(String drillId) {
        this.drillId = drillId;
        return this;
    }
    public String getDrillId() {
        return this.drillId;
    }

    public ClearReplicaGroupDrillRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ClearReplicaGroupDrillRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
