// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteCustomLogShrinkRequest extends TeaModel {
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
     * <p>site id</p>
     * 
     * <strong>example:</strong>
     * <p>11223****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateSiteCustomLogShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteCustomLogShrinkRequest self = new UpdateSiteCustomLogShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteCustomLogShrinkRequest setCookiesShrink(String cookiesShrink) {
        this.cookiesShrink = cookiesShrink;
        return this;
    }
    public String getCookiesShrink() {
        return this.cookiesShrink;
    }

    public UpdateSiteCustomLogShrinkRequest setRequestHeadersShrink(String requestHeadersShrink) {
        this.requestHeadersShrink = requestHeadersShrink;
        return this;
    }
    public String getRequestHeadersShrink() {
        return this.requestHeadersShrink;
    }

    public UpdateSiteCustomLogShrinkRequest setResponseHeadersShrink(String responseHeadersShrink) {
        this.responseHeadersShrink = responseHeadersShrink;
        return this;
    }
    public String getResponseHeadersShrink() {
        return this.responseHeadersShrink;
    }

    public UpdateSiteCustomLogShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
