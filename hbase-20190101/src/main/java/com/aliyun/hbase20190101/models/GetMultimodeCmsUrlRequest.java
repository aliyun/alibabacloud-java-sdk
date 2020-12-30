// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class GetMultimodeCmsUrlRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetMultimodeCmsUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultimodeCmsUrlRequest self = new GetMultimodeCmsUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMultimodeCmsUrlRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMultimodeCmsUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
