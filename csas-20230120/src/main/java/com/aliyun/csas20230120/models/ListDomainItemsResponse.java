// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDomainItemsResponseBody body;

    public static ListDomainItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDomainItemsResponse self = new ListDomainItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListDomainItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDomainItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDomainItemsResponse setBody(ListDomainItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDomainItemsResponseBody getBody() {
        return this.body;
    }

}
