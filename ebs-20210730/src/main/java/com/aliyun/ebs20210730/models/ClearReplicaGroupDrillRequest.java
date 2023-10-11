// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ClearReplicaGroupDrillRequest extends TeaModel {
    @NameInMap("DrillId")
    public String drillId;

    @NameInMap("GroupId")
    public String groupId;

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
