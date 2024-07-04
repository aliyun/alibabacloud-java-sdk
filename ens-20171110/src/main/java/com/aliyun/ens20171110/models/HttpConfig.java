// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class HttpConfig extends TeaModel {
    @NameInMap("Cookie")
    public String cookie;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("StickySession")
    public String stickySession;

    /**
     * <strong>example:</strong>
     * <p>insert</p>
     */
    @NameInMap("StickySessionType")
    public String stickySessionType;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("XForwardedFor")
    public String XForwardedFor;

    public static HttpConfig build(java.util.Map<String, ?> map) throws Exception {
        HttpConfig self = new HttpConfig();
        return TeaModel.build(map, self);
    }

    public HttpConfig setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public HttpConfig setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public HttpConfig setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public HttpConfig setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public HttpConfig setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public HttpConfig setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public HttpConfig setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public HttpConfig setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public HttpConfig setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

}
