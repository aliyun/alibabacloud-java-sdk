// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTieredCacheRequest extends TeaModel {
    /**
     * <p>The tiered cache architecture mode. Valid values:</p>
     * <ul>
     * <li>edge: edge tiered cache.</li>
     * <li>edge_smart: edge tiered cache + smart tiered cache.</li>
     * <li>edge_regional: edge tiered cache + regional tiered cache.</li>
     * <li>edge_regional_smart: edge tiered cache + regional tiered cache + smart tiered cache.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edge_smart</p>
     */
    @NameInMap("CacheArchitectureMode")
    public String cacheArchitectureMode;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
