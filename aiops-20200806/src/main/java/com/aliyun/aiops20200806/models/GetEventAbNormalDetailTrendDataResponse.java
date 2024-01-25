// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventAbNormalDetailTrendDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventAbNormalDetailTrendDataResponseBody body;

    public static GetEventAbNormalDetailTrendDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventAbNormalDetailTrendDataResponse self = new GetEventAbNormalDetailTrendDataResponse();
        return TeaModel.build(map, self);
    }

    public GetEventAbNormalDetailTrendDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventAbNormalDetailTrendDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventAbNormalDetailTrendDataResponse setBody(GetEventAbNormalDetailTrendDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventAbNormalDetailTrendDataResponseBody getBody() {
        return this.body;
    }

}
