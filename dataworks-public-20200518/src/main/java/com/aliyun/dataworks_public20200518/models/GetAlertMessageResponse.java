// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetAlertMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertMessageResponseBody body;

    public static GetAlertMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertMessageResponse self = new GetAlertMessageResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertMessageResponse setBody(GetAlertMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertMessageResponseBody getBody() {
        return this.body;
    }

}
