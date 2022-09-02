// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class GetConfigJsonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigJsonResponseBody body;

    public static GetConfigJsonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigJsonResponse self = new GetConfigJsonResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigJsonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigJsonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigJsonResponse setBody(GetConfigJsonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigJsonResponseBody getBody() {
        return this.body;
    }

}
