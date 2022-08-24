// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DcdnHttpRequestTestToolShrinkRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("Body")
    public String body;

    @NameInMap("Header")
    public String headerShrink;

    @NameInMap("Host")
    public String host;

    @NameInMap("Method")
    public String method;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProxyIp")
    public String proxyIp;

    @NameInMap("Scheme")
    public String scheme;

    @NameInMap("Uri")
    public String uri;

    public static DcdnHttpRequestTestToolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DcdnHttpRequestTestToolShrinkRequest self = new DcdnHttpRequestTestToolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DcdnHttpRequestTestToolShrinkRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public DcdnHttpRequestTestToolShrinkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public DcdnHttpRequestTestToolShrinkRequest setHeaderShrink(String headerShrink) {
        this.headerShrink = headerShrink;
        return this;
    }
    public String getHeaderShrink() {
        return this.headerShrink;
    }

    public DcdnHttpRequestTestToolShrinkRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DcdnHttpRequestTestToolShrinkRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public DcdnHttpRequestTestToolShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DcdnHttpRequestTestToolShrinkRequest setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp;
        return this;
    }
    public String getProxyIp() {
        return this.proxyIp;
    }

    public DcdnHttpRequestTestToolShrinkRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public DcdnHttpRequestTestToolShrinkRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
