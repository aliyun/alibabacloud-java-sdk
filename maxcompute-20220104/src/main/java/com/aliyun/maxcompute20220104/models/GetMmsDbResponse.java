// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsDbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsDbResponseBody body;

    public static GetMmsDbResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsDbResponse self = new GetMmsDbResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsDbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsDbResponse setBody(GetMmsDbResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsDbResponseBody getBody() {
        return this.body;
    }

}
