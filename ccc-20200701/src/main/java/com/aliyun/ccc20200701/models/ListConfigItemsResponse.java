// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListConfigItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConfigItemsResponseBody body;

    public static ListConfigItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigItemsResponse self = new ListConfigItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigItemsResponse setBody(ListConfigItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigItemsResponseBody getBody() {
        return this.body;
    }

}
