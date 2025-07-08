// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateWarningThresholdNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWarningThresholdNewResponseBody body;

    public static CreateWarningThresholdNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWarningThresholdNewResponse self = new CreateWarningThresholdNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateWarningThresholdNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWarningThresholdNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWarningThresholdNewResponse setBody(CreateWarningThresholdNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWarningThresholdNewResponseBody getBody() {
        return this.body;
    }

}
