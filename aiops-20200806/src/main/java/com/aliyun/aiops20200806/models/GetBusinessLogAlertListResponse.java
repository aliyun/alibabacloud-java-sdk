// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessLogAlertListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessLogAlertListResponseBody body;

    public static GetBusinessLogAlertListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessLogAlertListResponse self = new GetBusinessLogAlertListResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessLogAlertListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessLogAlertListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessLogAlertListResponse setBody(GetBusinessLogAlertListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessLogAlertListResponseBody getBody() {
        return this.body;
    }

}
