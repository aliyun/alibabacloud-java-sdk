// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DeleteDiskReplicaGroupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    public static DeleteDiskReplicaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiskReplicaGroupRequest self = new DeleteDiskReplicaGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDiskReplicaGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteDiskReplicaGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDiskReplicaGroupRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

}
