// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskReplicaPairRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to immediately synchronize data. Valid values:</p>
     * <br>
     * <p>*   true: immediately synchronizes data.</p>
     * <p>*   false: synchronizes data based on the recovery point objective (RPO).</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("OneShot")
    public Boolean oneShot;

    /**
     * <p>The region ID of the primary or secondary disk in the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~) operation to query the region information of replication pairs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair.</p>
     */
    @NameInMap("ReplicaPairId")
    public String replicaPairId;

    public static StartDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDiskReplicaPairRequest self = new StartDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public StartDiskReplicaPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartDiskReplicaPairRequest setOneShot(Boolean oneShot) {
        this.oneShot = oneShot;
        return this;
    }
    public Boolean getOneShot() {
        return this.oneShot;
    }

    public StartDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartDiskReplicaPairRequest setReplicaPairId(String replicaPairId) {
        this.replicaPairId = replicaPairId;
        return this;
    }
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

}
