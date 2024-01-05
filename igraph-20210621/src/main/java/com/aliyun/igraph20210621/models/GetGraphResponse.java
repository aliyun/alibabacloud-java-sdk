// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class GetGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGraphResponseBody body;

    public static GetGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGraphResponse self = new GetGraphResponse();
        return TeaModel.build(map, self);
    }

    public GetGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGraphResponse setBody(GetGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGraphResponseBody getBody() {
        return this.body;
    }

}
