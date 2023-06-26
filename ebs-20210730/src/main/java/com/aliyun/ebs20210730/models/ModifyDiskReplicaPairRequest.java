// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaPairRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Long bandwidth;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The recovery point objective (RPO) of the replication pair. Unit: seconds. Set the value to 900.</p>
     */
    @NameInMap("PairName")
    public String pairName;

    @NameInMap("RPO")
    public Long RPO;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure idempotence ](~~25693~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The bandwidth used to asynchronously replicate data between the primary and secondary disks. Unit: Kbit/s. Valid values:</p>
     * <br>
     * <p>*   10240: equal to 10 Mbit/s</p>
     * <p>*   20480: equal to 20 Mbit/s</p>
     * <p>*   51200: equal to 50 Mbit/s</p>
     * <p>*   102400: equal to 100 Mbit/s</p>
     * <br>
     * <p>Default value: 10240.</p>
     */
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
