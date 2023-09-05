// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairProgressRequest extends TeaModel {
    /**
     * <p>The region ID of the replication pair.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~)operation to query the IDs of existing replication pairs.</p>
     */
    @NameInMap("ReplicaPairId")
    public String replicaPairId;

    public static DescribeDiskReplicaPairProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairProgressRequest self = new DescribeDiskReplicaPairProgressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaPairProgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskReplicaPairProgressRequest setReplicaPairId(String replicaPairId) {
        this.replicaPairId = replicaPairId;
        return this;
    }
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

}
