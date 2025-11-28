// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricConsortiumRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListBaaSFabricConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricConsortiumRequest self = new ListBaaSFabricConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricConsortiumRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
