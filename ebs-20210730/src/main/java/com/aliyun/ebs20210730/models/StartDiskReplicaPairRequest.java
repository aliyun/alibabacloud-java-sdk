// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskReplicaPairRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OneShot")
    public Boolean oneShot;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
