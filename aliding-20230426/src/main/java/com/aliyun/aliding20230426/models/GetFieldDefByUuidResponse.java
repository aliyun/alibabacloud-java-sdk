// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFieldDefByUuidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFieldDefByUuidResponseBody body;

    public static GetFieldDefByUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFieldDefByUuidResponse self = new GetFieldDefByUuidResponse();
        return TeaModel.build(map, self);
    }

    public GetFieldDefByUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFieldDefByUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFieldDefByUuidResponse setBody(GetFieldDefByUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFieldDefByUuidResponseBody getBody() {
        return this.body;
    }

}
