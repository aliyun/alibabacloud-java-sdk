// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SaveQuickQueryRequest extends TeaModel {
    /**
     * <p>The name of the saved search.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The query statement.</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in the Chinese mainland or in the China (Hong Kong) region.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.</p>
     */
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
