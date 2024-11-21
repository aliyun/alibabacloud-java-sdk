// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteCustomLogShrinkRequest extends TeaModel {
    /**
     * <p>The cookie fields.</p>
     */
    @NameInMap("Cookies")
    public String cookiesShrink;

    /**
     * <p>The request header fields.</p>
     */
    @NameInMap("RequestHeaders")
    public String requestHeadersShrink;

    /**
     * <p>The response header fields.</p>
     */
    @NameInMap("ResponseHeaders")
    public String responseHeadersShrink;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>11223</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CreateSiteCustomLogShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteCustomLogShrinkRequest self = new CreateSiteCustomLogShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSiteCustomLogShrinkRequest setCookiesShrink(String cookiesShrink) {
        this.cookiesShrink = cookiesShrink;
        return this;
    }
    public String getCookiesShrink() {
        return this.cookiesShrink;
    }

    public CreateSiteCustomLogShrinkRequest setRequestHeadersShrink(String requestHeadersShrink) {
        this.requestHeadersShrink = requestHeadersShrink;
        return this;
    }
    public String getRequestHeadersShrink() {
        return this.requestHeadersShrink;
    }

    public CreateSiteCustomLogShrinkRequest setResponseHeadersShrink(String responseHeadersShrink) {
        this.responseHeadersShrink = responseHeadersShrink;
        return this;
    }
    public String getResponseHeadersShrink() {
        return this.responseHeadersShrink;
    }

    public CreateSiteCustomLogShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
