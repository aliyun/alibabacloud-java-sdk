// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetQueryResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueryResultResponseBody body;

    public static GetQueryResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryResultResponse self = new GetQueryResultResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryResultResponse setBody(GetQueryResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryResultResponseBody getBody() {
        return this.body;
    }

}
