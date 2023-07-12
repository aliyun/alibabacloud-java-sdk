// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class StartEaisEiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartEaisEiResponseBody body;

    public static StartEaisEiResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEaisEiResponse self = new StartEaisEiResponse();
        return TeaModel.build(map, self);
    }

    public StartEaisEiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartEaisEiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartEaisEiResponse setBody(StartEaisEiResponseBody body) {
        this.body = body;
        return this;
    }
    public StartEaisEiResponseBody getBody() {
        return this.body;
    }

}
