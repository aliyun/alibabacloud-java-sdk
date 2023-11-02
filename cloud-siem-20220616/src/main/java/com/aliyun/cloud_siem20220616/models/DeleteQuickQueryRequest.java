// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteQuickQueryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SearchName")
    public String searchName;

    public static DeleteQuickQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuickQueryRequest self = new DeleteQuickQueryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQuickQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteQuickQueryRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

}
