// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DcdnHttpRequestTestToolRequest extends TeaModel {
    @NameInMap("Args")
    public String args;

    @NameInMap("Body")
    public String body;

    @NameInMap("Header")
    public java.util.Map<String, ?> header;

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

    public static DcdnHttpRequestTestToolRequest build(java.util.Map<String, ?> map) throws Exception {
        DcdnHttpRequestTestToolRequest self = new DcdnHttpRequestTestToolRequest();
        return TeaModel.build(map, self);
    }

    public DcdnHttpRequestTestToolRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public DcdnHttpRequestTestToolRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public DcdnHttpRequestTestToolRequest setHeader(java.util.Map<String, ?> header) {
        this.header = header;
        return this;
    }
    public java.util.Map<String, ?> getHeader() {
        return this.header;
    }

    public DcdnHttpRequestTestToolRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DcdnHttpRequestTestToolRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public DcdnHttpRequestTestToolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DcdnHttpRequestTestToolRequest setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp;
        return this;
    }
    public String getProxyIp() {
        return this.proxyIp;
    }

    public DcdnHttpRequestTestToolRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public DcdnHttpRequestTestToolRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
