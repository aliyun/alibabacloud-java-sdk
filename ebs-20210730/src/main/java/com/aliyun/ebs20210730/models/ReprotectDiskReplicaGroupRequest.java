// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ReprotectDiskReplicaGroupRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the replication pair-consistent group. You can call the [DescribeDiskReplicaGroups](~~426614~~) operation to query the IDs of replication pair-consistent groups.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    @NameInMap("ReverseReplicate")
    public Boolean reverseReplicate;

    public static ReprotectDiskReplicaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ReprotectDiskReplicaGroupRequest self = new ReprotectDiskReplicaGroupRequest();
        return TeaModel.build(map, self);
    }

    public ReprotectDiskReplicaGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReprotectDiskReplicaGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReprotectDiskReplicaGroupRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    public ReprotectDiskReplicaGroupRequest setReverseReplicate(Boolean reverseReplicate) {
        this.reverseReplicate = reverseReplicate;
        return this;
    }
    public Boolean getReverseReplicate() {
        return this.reverseReplicate;
    }

}
