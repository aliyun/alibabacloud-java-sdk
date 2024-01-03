// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskReplicaGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to immediately synchronize data once. Valid values:</p>
     * <br>
     * <p>*   true: immediately synchronizes data once.</p>
     * <p>*   false: synchronizes data based on the RPO of the replication pair-consistent group.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("OneShot")
    public Boolean oneShot;

    /**
     * <p>The ID of the replication pair-consistent group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair-consistent group. You can call the [DescribeDiskReplicaGroups](~~426614~~) operation to query the IDs of replication pair-consistent groups.</p>
     */
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
