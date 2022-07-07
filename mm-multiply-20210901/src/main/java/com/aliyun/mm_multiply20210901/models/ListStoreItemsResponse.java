// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListStoreItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListStoreItemsResponseBody body;

    public static ListStoreItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStoreItemsResponse self = new ListStoreItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListStoreItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStoreItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStoreItemsResponse setBody(ListStoreItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStoreItemsResponseBody getBody() {
        return this.body;
    }

}
