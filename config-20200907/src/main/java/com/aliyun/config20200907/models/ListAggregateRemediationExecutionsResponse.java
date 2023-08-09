// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAggregateRemediationExecutionsResponseBody body;

    public static ListAggregateRemediationExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationExecutionsResponse self = new ListAggregateRemediationExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateRemediationExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateRemediationExecutionsResponse setBody(ListAggregateRemediationExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateRemediationExecutionsResponseBody getBody() {
        return this.body;
    }

}
