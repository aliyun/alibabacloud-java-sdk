// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListCustomDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomDomainOutput body;

    public static ListCustomDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsResponse self = new ListCustomDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomDomainsResponse setBody(ListCustomDomainOutput body) {
        this.body = body;
        return this;
    }
    public ListCustomDomainOutput getBody() {
        return this.body;
    }

}
