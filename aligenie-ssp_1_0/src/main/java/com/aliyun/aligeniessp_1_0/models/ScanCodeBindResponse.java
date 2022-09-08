// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScanCodeBindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScanCodeBindResponseBody body;

    public static ScanCodeBindResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanCodeBindResponse self = new ScanCodeBindResponse();
        return TeaModel.build(map, self);
    }

    public ScanCodeBindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanCodeBindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScanCodeBindResponse setBody(ScanCodeBindResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanCodeBindResponseBody getBody() {
        return this.body;
    }

}
