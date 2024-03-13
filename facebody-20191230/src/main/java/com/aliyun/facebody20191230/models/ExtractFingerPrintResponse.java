// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractFingerPrintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExtractFingerPrintResponseBody body;

    public static ExtractFingerPrintResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractFingerPrintResponse self = new ExtractFingerPrintResponse();
        return TeaModel.build(map, self);
    }

    public ExtractFingerPrintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractFingerPrintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExtractFingerPrintResponse setBody(ExtractFingerPrintResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractFingerPrintResponseBody getBody() {
        return this.body;
    }

}
