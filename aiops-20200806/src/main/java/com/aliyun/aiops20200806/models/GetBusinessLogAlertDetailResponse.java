// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessLogAlertDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessLogAlertDetailResponseBody body;

    public static GetBusinessLogAlertDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessLogAlertDetailResponse self = new GetBusinessLogAlertDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessLogAlertDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessLogAlertDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessLogAlertDetailResponse setBody(GetBusinessLogAlertDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessLogAlertDetailResponseBody getBody() {
        return this.body;
    }

}
