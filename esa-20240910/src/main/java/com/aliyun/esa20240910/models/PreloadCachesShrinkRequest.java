// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PreloadCachesShrinkRequest extends TeaModel {
    /**
     * <p>The prefetch objects.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The default header carried in a prefetch request is Accept-Encoding:gzip. If you want the prefetch request to carry other headers or implement multi-copy prefetching, use this parameter to specify custom prefetch headers.</p>
     */
    @NameInMap("Headers")
    public String headersShrink;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
