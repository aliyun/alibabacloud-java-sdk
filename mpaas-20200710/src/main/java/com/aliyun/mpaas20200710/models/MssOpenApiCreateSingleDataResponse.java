// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class MssOpenApiCreateSingleDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MssOpenApiCreateSingleDataResponseBody body;

    public static MssOpenApiCreateSingleDataResponse build(java.util.Map<String, ?> map) throws Exception {
        MssOpenApiCreateSingleDataResponse self = new MssOpenApiCreateSingleDataResponse();
        return TeaModel.build(map, self);
    }

    public MssOpenApiCreateSingleDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MssOpenApiCreateSingleDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MssOpenApiCreateSingleDataResponse setBody(MssOpenApiCreateSingleDataResponseBody body) {
        this.body = body;
        return this;
    }
    public MssOpenApiCreateSingleDataResponseBody getBody() {
        return this.body;
    }

}
