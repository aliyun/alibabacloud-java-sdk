// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetMetaProductListRequest extends TeaModel {
    @NameInMap("ListNormal")
    public String listNormal;

    @NameInMap("RegionId")
    public String regionId;

    public static GetMetaProductListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaProductListRequest self = new GetMetaProductListRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaProductListRequest setListNormal(String listNormal) {
        this.listNormal = listNormal;
        return this;
    }
    public String getListNormal() {
        return this.listNormal;
    }

    public GetMetaProductListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
