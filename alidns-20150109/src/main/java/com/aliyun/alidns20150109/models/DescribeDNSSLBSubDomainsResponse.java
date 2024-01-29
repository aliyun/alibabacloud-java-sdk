// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDNSSLBSubDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDNSSLBSubDomainsResponseBody body;

    public static DescribeDNSSLBSubDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSSLBSubDomainsResponse self = new DescribeDNSSLBSubDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDNSSLBSubDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDNSSLBSubDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDNSSLBSubDomainsResponse setBody(DescribeDNSSLBSubDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDNSSLBSubDomainsResponseBody getBody() {
        return this.body;
    }

}
