// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateRemediationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAggregateRemediationResponseBody body;

    public static StartAggregateRemediationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateRemediationResponse self = new StartAggregateRemediationResponse();
        return TeaModel.build(map, self);
    }

    public StartAggregateRemediationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAggregateRemediationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAggregateRemediationResponse setBody(StartAggregateRemediationResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAggregateRemediationResponseBody getBody() {
        return this.body;
    }

}
