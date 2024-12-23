// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsTableResponseBody body;

    public static GetMmsTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsTableResponse self = new GetMmsTableResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsTableResponse setBody(GetMmsTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsTableResponseBody getBody() {
        return this.body;
    }

}
