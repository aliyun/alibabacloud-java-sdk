// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertDetailTrendDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertDetailTrendDataResponseBody body;

    public static GetAlertDetailTrendDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertDetailTrendDataResponse self = new GetAlertDetailTrendDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertDetailTrendDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertDetailTrendDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertDetailTrendDataResponse setBody(GetAlertDetailTrendDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertDetailTrendDataResponseBody getBody() {
        return this.body;
    }

}
