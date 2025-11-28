// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllProductKeyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListAllProductKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllProductKeyRequest self = new ListAllProductKeyRequest();
        return TeaModel.build(map, self);
    }

    public ListAllProductKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
