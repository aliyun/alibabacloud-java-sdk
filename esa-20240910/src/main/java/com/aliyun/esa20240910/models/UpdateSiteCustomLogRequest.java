// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteCustomLogRequest extends TeaModel {
    /**
     * <p>The cookie fields.</p>
     */
    @NameInMap("Cookies")
    public java.util.List<String> cookies;

    /**
     * <p>The request header fields.</p>
     */
    @NameInMap("RequestHeaders")
    public java.util.List<String> requestHeaders;

    /**
     * <p>The response header fields.</p>
     */
    @NameInMap("ResponseHeaders")
    public java.util.List<String> responseHeaders;

    /**
     * <p>site id</p>
     * 
     * <strong>example:</strong>
     * <p>11223****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateSiteCustomLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteCustomLogRequest self = new UpdateSiteCustomLogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteCustomLogRequest setCookies(java.util.List<String> cookies) {
        this.cookies = cookies;
        return this;
    }
    public java.util.List<String> getCookies() {
        return this.cookies;
    }

    public UpdateSiteCustomLogRequest setRequestHeaders(java.util.List<String> requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }
    public java.util.List<String> getRequestHeaders() {
        return this.requestHeaders;
    }

    public UpdateSiteCustomLogRequest setResponseHeaders(java.util.List<String> responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }
    public java.util.List<String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public UpdateSiteCustomLogRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
