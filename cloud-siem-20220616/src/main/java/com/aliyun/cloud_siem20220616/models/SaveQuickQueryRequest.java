// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SaveQuickQueryRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Query")
    public String query;

    @NameInMap("RegionId")
    public String regionId;

    public static SaveQuickQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveQuickQueryRequest self = new SaveQuickQueryRequest();
        return TeaModel.build(map, self);
    }

    public SaveQuickQueryRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public SaveQuickQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SaveQuickQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
