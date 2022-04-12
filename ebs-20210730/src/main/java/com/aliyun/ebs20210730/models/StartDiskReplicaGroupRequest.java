// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskReplicaGroupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OneShot")
    public Boolean oneShot;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    public static StartDiskReplicaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDiskReplicaGroupRequest self = new StartDiskReplicaGroupRequest();
        return TeaModel.build(map, self);
    }

    public StartDiskReplicaGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartDiskReplicaGroupRequest setOneShot(Boolean oneShot) {
        this.oneShot = oneShot;
        return this;
    }
    public Boolean getOneShot() {
        return this.oneShot;
    }

    public StartDiskReplicaGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartDiskReplicaGroupRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

}
