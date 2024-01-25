// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductComponentVersionResponseBody body;

    public static GetProductComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductComponentVersionResponse self = new GetProductComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetProductComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductComponentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductComponentVersionResponse setBody(GetProductComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductComponentVersionResponseBody getBody() {
        return this.body;
    }

}
