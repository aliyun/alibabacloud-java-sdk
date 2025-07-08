// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateWarningThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWarningThresholdResponseBody body;

    public static CreateWarningThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWarningThresholdResponse self = new CreateWarningThresholdResponse();
        return TeaModel.build(map, self);
    }

    public CreateWarningThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWarningThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWarningThresholdResponse setBody(CreateWarningThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWarningThresholdResponseBody getBody() {
        return this.body;
    }

}
