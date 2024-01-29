// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateRemediationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAggregateRemediationsResponseBody body;

    public static DeleteAggregateRemediationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateRemediationsResponse self = new DeleteAggregateRemediationsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateRemediationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAggregateRemediationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAggregateRemediationsResponse setBody(DeleteAggregateRemediationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAggregateRemediationsResponseBody getBody() {
        return this.body;
    }

}
