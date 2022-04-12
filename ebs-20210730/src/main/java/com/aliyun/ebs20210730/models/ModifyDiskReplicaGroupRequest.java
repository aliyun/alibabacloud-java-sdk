// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaGroupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RPO")
    public Long RPO;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    public static ModifyDiskReplicaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskReplicaGroupRequest self = new ModifyDiskReplicaGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskReplicaGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDiskReplicaGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDiskReplicaGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDiskReplicaGroupRequest setRPO(Long RPO) {
        this.RPO = RPO;
        return this;
    }
    public Long getRPO() {
        return this.RPO;
    }

    public ModifyDiskReplicaGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskReplicaGroupRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

}
