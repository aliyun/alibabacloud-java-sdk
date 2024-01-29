// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAggregatorResponseBody body;

    public static UpdateAggregatorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregatorResponse self = new UpdateAggregatorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAggregatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAggregatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAggregatorResponse setBody(UpdateAggregatorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggregatorResponseBody getBody() {
        return this.body;
    }

}
