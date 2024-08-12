// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetParseResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParseResultResponseBody body;

    public static GetParseResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParseResultResponse self = new GetParseResultResponse();
        return TeaModel.build(map, self);
    }

    public GetParseResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParseResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParseResultResponse setBody(GetParseResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParseResultResponseBody getBody() {
        return this.body;
    }

}
