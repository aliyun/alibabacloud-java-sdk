// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListEntityItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEntityItemsResponseBody body;

    public static ListEntityItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntityItemsResponse self = new ListEntityItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListEntityItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEntityItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEntityItemsResponse setBody(ListEntityItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEntityItemsResponseBody getBody() {
        return this.body;
    }

}
