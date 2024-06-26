// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetBcSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBcSchemaResponseBody body;

    public static GetBcSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBcSchemaResponse self = new GetBcSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetBcSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBcSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBcSchemaResponse setBody(GetBcSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBcSchemaResponseBody getBody() {
        return this.body;
    }

}
