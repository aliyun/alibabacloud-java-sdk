// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartReplicaGroupDrillRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RegionId")
    public String regionId;

    public static StartReplicaGroupDrillRequest build(java.util.Map<String, ?> map) throws Exception {
        StartReplicaGroupDrillRequest self = new StartReplicaGroupDrillRequest();
        return TeaModel.build(map, self);
    }

    public StartReplicaGroupDrillRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartReplicaGroupDrillRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public StartReplicaGroupDrillRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
