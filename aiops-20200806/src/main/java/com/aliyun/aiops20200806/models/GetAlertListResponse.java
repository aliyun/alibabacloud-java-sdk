// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertListResponseBody body;

    public static GetAlertListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertListResponse self = new GetAlertListResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertListResponse setBody(GetAlertListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertListResponseBody getBody() {
        return this.body;
    }

}
