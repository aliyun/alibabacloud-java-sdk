// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedLogstashRestartTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EstimatedLogstashRestartTimeResponseBody body;

    public static EstimatedLogstashRestartTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        EstimatedLogstashRestartTimeResponse self = new EstimatedLogstashRestartTimeResponse();
        return TeaModel.build(map, self);
    }

    public EstimatedLogstashRestartTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstimatedLogstashRestartTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EstimatedLogstashRestartTimeResponse setBody(EstimatedLogstashRestartTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public EstimatedLogstashRestartTimeResponseBody getBody() {
        return this.body;
    }

}
