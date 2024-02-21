// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopPipelinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopPipelinesResponseBody body;

    public static StopPipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopPipelinesResponse self = new StopPipelinesResponse();
        return TeaModel.build(map, self);
    }

    public StopPipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopPipelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopPipelinesResponse setBody(StopPipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopPipelinesResponseBody getBody() {
        return this.body;
    }

}
