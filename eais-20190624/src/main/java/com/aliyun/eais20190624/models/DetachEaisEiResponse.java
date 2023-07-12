// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DetachEaisEiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachEaisEiResponseBody body;

    public static DetachEaisEiResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachEaisEiResponse self = new DetachEaisEiResponse();
        return TeaModel.build(map, self);
    }

    public DetachEaisEiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachEaisEiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachEaisEiResponse setBody(DetachEaisEiResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachEaisEiResponseBody getBody() {
        return this.body;
    }

}
