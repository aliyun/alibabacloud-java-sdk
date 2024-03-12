// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListDomainProxyTokensResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDomainProxyTokensResponseBody body;

    public static ListDomainProxyTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainProxyTokensResponse self = new ListDomainProxyTokensResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainProxyTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainProxyTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDomainProxyTokensResponse setBody(ListDomainProxyTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainProxyTokensResponseBody getBody() {
        return this.body;
    }

}
