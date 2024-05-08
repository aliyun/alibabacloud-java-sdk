// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetAsrResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAsrResultResponseBody body;

    public static GetAsrResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsrResultResponse self = new GetAsrResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAsrResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsrResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsrResultResponse setBody(GetAsrResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsrResultResponseBody getBody() {
        return this.body;
    }

}
