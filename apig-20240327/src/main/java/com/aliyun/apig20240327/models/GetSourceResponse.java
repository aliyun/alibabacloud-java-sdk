// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSourceResponseBody body;

    public static GetSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSourceResponse self = new GetSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSourceResponse setBody(GetSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSourceResponseBody getBody() {
        return this.body;
    }

}
