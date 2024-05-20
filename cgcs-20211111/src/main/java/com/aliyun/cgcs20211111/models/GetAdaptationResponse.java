// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAdaptationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAdaptationResponseBody body;

    public static GetAdaptationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdaptationResponse self = new GetAdaptationResponse();
        return TeaModel.build(map, self);
    }

    public GetAdaptationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdaptationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdaptationResponse setBody(GetAdaptationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdaptationResponseBody getBody() {
        return this.body;
    }

}
