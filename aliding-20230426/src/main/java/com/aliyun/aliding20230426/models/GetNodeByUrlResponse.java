// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeByUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeByUrlResponseBody body;

    public static GetNodeByUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeByUrlResponse self = new GetNodeByUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeByUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeByUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeByUrlResponse setBody(GetNodeByUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeByUrlResponseBody getBody() {
        return this.body;
    }

}
