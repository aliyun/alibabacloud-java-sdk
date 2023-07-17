// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListPromClustersRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListPromClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPromClustersRequest self = new ListPromClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListPromClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
