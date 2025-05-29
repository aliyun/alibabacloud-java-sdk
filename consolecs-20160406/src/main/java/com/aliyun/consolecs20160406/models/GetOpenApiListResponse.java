// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.consolecs20160406.models;

import com.aliyun.tea.*;

public class GetOpenApiListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpenApiListResponseBody body;

    public static GetOpenApiListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenApiListResponse self = new GetOpenApiListResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenApiListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenApiListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpenApiListResponse setBody(GetOpenApiListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenApiListResponseBody getBody() {
        return this.body;
    }

}
