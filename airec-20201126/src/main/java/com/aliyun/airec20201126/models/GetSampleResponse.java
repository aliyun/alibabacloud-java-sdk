// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSampleResponseBody body;

    public static GetSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSampleResponse self = new GetSampleResponse();
        return TeaModel.build(map, self);
    }

    public GetSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSampleResponse setBody(GetSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSampleResponseBody getBody() {
        return this.body;
    }

}
