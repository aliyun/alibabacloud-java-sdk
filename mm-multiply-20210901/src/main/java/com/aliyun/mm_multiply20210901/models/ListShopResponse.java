// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListShopResponseBody body;

    public static ListShopResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShopResponse self = new ListShopResponse();
        return TeaModel.build(map, self);
    }

    public ListShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShopResponse setBody(ListShopResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShopResponseBody getBody() {
        return this.body;
    }

}
