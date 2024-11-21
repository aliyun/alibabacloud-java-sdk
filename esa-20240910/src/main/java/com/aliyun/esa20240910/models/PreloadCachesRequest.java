// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PreloadCachesRequest extends TeaModel {
    /**
     * <p>The files to be prefetched.</p>
     */
    @NameInMap("Content")
    public java.util.List<String> content;

    /**
     * <p>By default, prefetch requests include the Accept-Encoding:gzip header. If you want a prefetch request to include other headers or implement multi-replica prefetch, you can specify a custom prefetch header by configuring the Headers parameter.</p>
     */
    @NameInMap("Headers")
    public java.util.Map<String, String> headers;

    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static PreloadCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        PreloadCachesRequest self = new PreloadCachesRequest();
        return TeaModel.build(map, self);
    }

    public PreloadCachesRequest setContent(java.util.List<String> content) {
        this.content = content;
        return this;
    }
    public java.util.List<String> getContent() {
        return this.content;
    }

    public PreloadCachesRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreloadCachesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
