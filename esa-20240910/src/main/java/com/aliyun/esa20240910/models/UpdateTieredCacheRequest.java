// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTieredCacheRequest extends TeaModel {
    /**
     * <p>The tiered cache architecture mode. Valid values:</p>
     * <ul>
     * <li><p>edge: The edge cache layer.</p>
     * </li>
     * <li><p>edge_smart: The edge cache layer and the intelligent cache layer.</p>
     * </li>
     * <li><p>edge_regional: The edge cache layer and the regional cache layer.</p>
     * </li>
     * <li><p>edge_regional_smart: The edge cache layer, the regional cache layer, and the intelligent cache layer.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edge_smart</p>
     */
    @NameInMap("CacheArchitectureMode")
    public String cacheArchitectureMode;

    /**
     * <p>The site ID. You can get this ID by calling <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateTieredCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTieredCacheRequest self = new UpdateTieredCacheRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTieredCacheRequest setCacheArchitectureMode(String cacheArchitectureMode) {
        this.cacheArchitectureMode = cacheArchitectureMode;
        return this;
    }
    public String getCacheArchitectureMode() {
        return this.cacheArchitectureMode;
    }

    public UpdateTieredCacheRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
