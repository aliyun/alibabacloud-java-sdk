// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListForwardStrategyBindingItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListForwardStrategyBindingItemsResponseBody body;

    public static ListForwardStrategyBindingItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListForwardStrategyBindingItemsResponse self = new ListForwardStrategyBindingItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListForwardStrategyBindingItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListForwardStrategyBindingItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListForwardStrategyBindingItemsResponse setBody(ListForwardStrategyBindingItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListForwardStrategyBindingItemsResponseBody getBody() {
        return this.body;
    }

}
