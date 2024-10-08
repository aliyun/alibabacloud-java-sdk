// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PreloadCachesShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String contentShrink;

    @NameInMap("Headers")
    public String headersShrink;

    /**
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
