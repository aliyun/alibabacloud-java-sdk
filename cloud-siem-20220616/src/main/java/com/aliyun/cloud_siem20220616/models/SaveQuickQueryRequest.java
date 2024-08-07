// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SaveQuickQueryRequest extends TeaModel {
    /**
     * <p>The name of the saved search.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>no_1_created_search_used_for_dispaly_ip</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The query statement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>and dst_ip : &quot;121.43.234.***&quot;</li>
     * </ul>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in the Chinese mainland or in the China (Hong Kong) region.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
