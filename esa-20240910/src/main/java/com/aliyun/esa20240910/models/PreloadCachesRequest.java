// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PreloadCachesRequest extends TeaModel {
    /**
     * <p>The prefetch objects.</p>
     */
    @NameInMap("Content")
    public java.util.List<String> content;

    /**
     * <p>The default header carried in a prefetch request is Accept-Encoding:gzip. If you want the prefetch request to carry other headers or implement multi-copy prefetching, use this parameter to specify custom prefetch headers.</p>
     */
    @NameInMap("Headers")
    public java.util.Map<String, String> headers;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
