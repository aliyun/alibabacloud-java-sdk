// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllBizChainRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListAllBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllBizChainRequest self = new ListAllBizChainRequest();
        return TeaModel.build(map, self);
    }

    public ListAllBizChainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
