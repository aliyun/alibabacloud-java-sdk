// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListBindShopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBindShopResponseBody body;

    public static ListBindShopResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBindShopResponse self = new ListBindShopResponse();
        return TeaModel.build(map, self);
    }

    public ListBindShopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBindShopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBindShopResponse setBody(ListBindShopResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBindShopResponseBody getBody() {
        return this.body;
    }

}
