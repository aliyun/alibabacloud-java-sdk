// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetQuickQueryRequest extends TeaModel {
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

    /**
     * <p>The name of the saved search.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>display_login_ip_search</p>
     */
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
