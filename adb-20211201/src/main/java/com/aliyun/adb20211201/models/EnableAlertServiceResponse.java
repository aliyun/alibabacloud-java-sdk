// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class EnableAlertServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAlertServiceResponseBody body;

    public static EnableAlertServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAlertServiceResponse self = new EnableAlertServiceResponse();
        return TeaModel.build(map, self);
    }

    public EnableAlertServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAlertServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAlertServiceResponse setBody(EnableAlertServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAlertServiceResponseBody getBody() {
        return this.body;
    }

}
