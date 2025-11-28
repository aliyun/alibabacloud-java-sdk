// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSAntChainConsortiumRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListBaaSAntChainConsortiumRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSAntChainConsortiumRequest self = new ListBaaSAntChainConsortiumRequest();
        return TeaModel.build(map, self);
    }

    public ListBaaSAntChainConsortiumRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
