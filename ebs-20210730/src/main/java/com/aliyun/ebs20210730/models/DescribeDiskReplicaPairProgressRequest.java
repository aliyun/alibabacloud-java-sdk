// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairProgressRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

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
