// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetQuickQueryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SearchName")
    public String searchName;

    public static GetQuickQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuickQueryRequest self = new GetQuickQueryRequest();
        return TeaModel.build(map, self);
    }

    public GetQuickQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetQuickQueryRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

}
