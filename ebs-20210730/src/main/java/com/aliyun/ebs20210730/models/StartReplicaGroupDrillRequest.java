// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartReplicaGroupDrillRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the replication pair-consistent group ID. You can call the [DescribeDiskReplicaGroups](~~426614~~) operation the most recent list of async replication pair-consistent groups, including group IDs.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the region where the secondary site in the replication pair-consistent group is located. You can call the [DescribeDiskReplicaGroups](~~426614~~) operation to query the region where the secondary site in the replication pair-consistent group is located.</p>
     * <br>
     * <p>>  You must enable the disaster recovery drill feature in the region in which the secondary site resides.</p>
     */
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
