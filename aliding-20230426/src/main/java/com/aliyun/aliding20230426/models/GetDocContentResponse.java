// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDocContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocContentResponseBody body;

    public static GetDocContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocContentResponse self = new GetDocContentResponse();
        return TeaModel.build(map, self);
    }

    public GetDocContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocContentResponse setBody(GetDocContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocContentResponseBody getBody() {
        return this.body;
    }

}
