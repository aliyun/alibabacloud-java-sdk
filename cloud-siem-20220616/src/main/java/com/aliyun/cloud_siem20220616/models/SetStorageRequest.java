// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SetStorageRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Ttl")
    public Integer ttl;

    public static SetStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStorageRequest self = new SetStorageRequest();
        return TeaModel.build(map, self);
    }

    public SetStorageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SetStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetStorageRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
