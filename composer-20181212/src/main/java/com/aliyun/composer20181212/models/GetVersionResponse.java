// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVersionResponseBody body;

    public static GetVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVersionResponse self = new GetVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVersionResponse setBody(GetVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVersionResponseBody getBody() {
        return this.body;
    }

}
