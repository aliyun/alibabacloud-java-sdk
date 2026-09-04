// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScanResponseBody body;

    public static CreateScanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScanResponse self = new CreateScanResponse();
        return TeaModel.build(map, self);
    }

    public CreateScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScanResponse setBody(CreateScanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScanResponseBody getBody() {
        return this.body;
    }

}
