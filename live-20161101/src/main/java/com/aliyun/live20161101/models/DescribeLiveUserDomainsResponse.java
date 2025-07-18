// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveUserDomainsResponseBody body;

    public static DescribeLiveUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserDomainsResponse self = new DescribeLiveUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveUserDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveUserDomainsResponse setBody(DescribeLiveUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveUserDomainsResponseBody getBody() {
        return this.body;
    }

}
