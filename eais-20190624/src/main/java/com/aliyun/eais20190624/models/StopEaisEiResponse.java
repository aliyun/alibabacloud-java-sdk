// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class StopEaisEiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopEaisEiResponseBody body;

    public static StopEaisEiResponse build(java.util.Map<String, ?> map) throws Exception {
        StopEaisEiResponse self = new StopEaisEiResponse();
        return TeaModel.build(map, self);
    }

    public StopEaisEiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopEaisEiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopEaisEiResponse setBody(StopEaisEiResponseBody body) {
        this.body = body;
        return this;
    }
    public StopEaisEiResponseBody getBody() {
        return this.body;
    }

}
