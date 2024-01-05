// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetGraphSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGraphSchemaResponseBody body;

    public static GetGraphSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGraphSchemaResponse self = new GetGraphSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetGraphSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGraphSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGraphSchemaResponse setBody(GetGraphSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGraphSchemaResponseBody getBody() {
        return this.body;
    }

}
