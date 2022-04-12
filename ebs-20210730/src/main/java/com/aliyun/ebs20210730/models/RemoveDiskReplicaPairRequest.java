// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class RemoveDiskReplicaPairRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    @NameInMap("ReplicaPairId")
    public String replicaPairId;

    public static RemoveDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDiskReplicaPairRequest self = new RemoveDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDiskReplicaPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveDiskReplicaPairRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    public RemoveDiskReplicaPairRequest setReplicaPairId(String replicaPairId) {
        this.replicaPairId = replicaPairId;
        return this;
    }
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

}
