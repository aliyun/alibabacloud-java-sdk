// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TraceSiteShrinkRequest extends TeaModel {
    /**
     * <p>The HTTP request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PlainText&quot;:&quot;bc58c54211db&quot;}</p>
     */
    @NameInMap("Body")
    public String bodyShrink;

    /**
     * <p>The environment context. This parameter is optional.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

    /**
     * <p>The cookie parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Cookies")
    public String cookiesShrink;

    /**
     * <p>The request headers.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Headers")
    public String headersShrink;

    /**
     * <p>The HTTP method.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The HTTP protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP/1.1</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The URL of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/test">http://example.com/test</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static TraceSiteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TraceSiteShrinkRequest self = new TraceSiteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TraceSiteShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public TraceSiteShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public TraceSiteShrinkRequest setCookiesShrink(String cookiesShrink) {
        this.cookiesShrink = cookiesShrink;
        return this;
    }
    public String getCookiesShrink() {
        return this.cookiesShrink;
    }

    public TraceSiteShrinkRequest setHeadersShrink(String headersShrink) {
        this.headersShrink = headersShrink;
        return this;
    }
    public String getHeadersShrink() {
        return this.headersShrink;
    }

    public TraceSiteShrinkRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public TraceSiteShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public TraceSiteShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
