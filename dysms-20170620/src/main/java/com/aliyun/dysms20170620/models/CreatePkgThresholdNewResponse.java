// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePkgThresholdNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePkgThresholdNewResponseBody body;

    public static CreatePkgThresholdNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePkgThresholdNewResponse self = new CreatePkgThresholdNewResponse();
        return TeaModel.build(map, self);
    }

    public CreatePkgThresholdNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePkgThresholdNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePkgThresholdNewResponse setBody(CreatePkgThresholdNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePkgThresholdNewResponseBody getBody() {
        return this.body;
    }

}
