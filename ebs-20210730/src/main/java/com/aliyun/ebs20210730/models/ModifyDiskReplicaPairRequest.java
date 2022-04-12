// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaPairRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Long bandwidth;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("PairName")
    public String pairName;

    @NameInMap("RPO")
    public Long RPO;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplicaPairId")
    public String replicaPairId;

    public static ModifyDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskReplicaPairRequest self = new ModifyDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskReplicaPairRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public ModifyDiskReplicaPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDiskReplicaPairRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDiskReplicaPairRequest setPairName(String pairName) {
        this.pairName = pairName;
        return this;
    }
    public String getPairName() {
        return this.pairName;
    }

    public ModifyDiskReplicaPairRequest setRPO(Long RPO) {
        this.RPO = RPO;
        return this;
    }
    public Long getRPO() {
        return this.RPO;
    }

    public ModifyDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskReplicaPairRequest setReplicaPairId(String replicaPairId) {
        this.replicaPairId = replicaPairId;
        return this;
    }
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

}
