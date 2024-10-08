// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteCustomLogShrinkRequest extends TeaModel {
    @NameInMap("Cookies")
    public String cookiesShrink;

    @NameInMap("RequestHeaders")
    public String requestHeadersShrink;

    @NameInMap("ResponseHeaders")
    public String responseHeadersShrink;

    /**
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
