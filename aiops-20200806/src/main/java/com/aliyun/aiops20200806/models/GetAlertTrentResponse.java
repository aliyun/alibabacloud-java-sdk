// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlertTrentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertTrentResponseBody body;

    public static GetAlertTrentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertTrentResponse self = new GetAlertTrentResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertTrentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertTrentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertTrentResponse setBody(GetAlertTrentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertTrentResponseBody getBody() {
        return this.body;
    }

}
