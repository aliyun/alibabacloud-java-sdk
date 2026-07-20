// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueryResponseBody body;

    public static GetQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryResponse self = new GetQueryResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryResponse setBody(GetQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryResponseBody getBody() {
        return this.body;
    }

}
