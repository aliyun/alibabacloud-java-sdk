// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListShopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ShopPageResult body;

    public static ListShopsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShopsResponse self = new ListShopsResponse();
        return TeaModel.build(map, self);
    }

    public ListShopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShopsResponse setBody(ShopPageResult body) {
        this.body = body;
        return this;
    }
    public ShopPageResult getBody() {
        return this.body;
    }

}
