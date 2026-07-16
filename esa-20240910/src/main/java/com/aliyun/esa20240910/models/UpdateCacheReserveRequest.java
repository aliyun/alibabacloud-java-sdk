// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheReserveRequest extends TeaModel {
    /**
     * <p>The cache reserve instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cr_hk_123456789</p>
     */
    @NameInMap("CacheReserveInstanceId")
    public String cacheReserveInstanceId;

    /**
     * <p>The switch. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateCacheReserveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheReserveRequest self = new UpdateCacheReserveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCacheReserveRequest setCacheReserveInstanceId(String cacheReserveInstanceId) {
        this.cacheReserveInstanceId = cacheReserveInstanceId;
        return this;
    }
    public String getCacheReserveInstanceId() {
        return this.cacheReserveInstanceId;
    }

    public UpdateCacheReserveRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateCacheReserveRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
