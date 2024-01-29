// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAggregateRemediationsResponseBody body;

    public static ListAggregateRemediationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationsResponse self = new ListAggregateRemediationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateRemediationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateRemediationsResponse setBody(ListAggregateRemediationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateRemediationsResponseBody getBody() {
        return this.body;
    }

}
