// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class FailoverDiskReplicaGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the secondary site of the replication pair-consistent group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair-consistent group.</p>
     */
    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    public static FailoverDiskReplicaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        FailoverDiskReplicaGroupRequest self = new FailoverDiskReplicaGroupRequest();
        return TeaModel.build(map, self);
    }

    public FailoverDiskReplicaGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FailoverDiskReplicaGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public FailoverDiskReplicaGroupRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

}
