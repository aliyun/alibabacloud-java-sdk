// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PreloadCachesShrinkRequest extends TeaModel {
    /**
     * <p>The files to be prefetched.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>By default, prefetch requests include the Accept-Encoding:gzip header. If you want a prefetch request to include other headers or implement multi-replica prefetch, you can specify a custom prefetch header by configuring the Headers parameter.</p>
     */
    @NameInMap("Headers")
    public String headersShrink;

    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static PreloadCachesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadCachesShrinkRequest self = new PreloadCachesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PreloadCachesShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public PreloadCachesShrinkRequest setHeadersShrink(String headersShrink) {
        this.headersShrink = headersShrink;
        return this;
    }
    public String getHeadersShrink() {
        return this.headersShrink;
    }

    public PreloadCachesShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
