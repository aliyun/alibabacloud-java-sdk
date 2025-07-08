// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePkgThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePkgThresholdResponseBody body;

    public static CreatePkgThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePkgThresholdResponse self = new CreatePkgThresholdResponse();
        return TeaModel.build(map, self);
    }

    public CreatePkgThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePkgThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePkgThresholdResponse setBody(CreatePkgThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePkgThresholdResponseBody getBody() {
        return this.body;
    }

}
