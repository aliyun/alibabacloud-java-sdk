// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAggregateResourceRelationsResponseBody body;

    public static ListAggregateResourceRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourceRelationsResponse self = new ListAggregateResourceRelationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourceRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateResourceRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateResourceRelationsResponse setBody(ListAggregateResourceRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateResourceRelationsResponseBody getBody() {
        return this.body;
    }

}
