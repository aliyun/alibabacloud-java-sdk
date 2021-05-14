// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractFingerPrintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ExtractFingerPrintResponse setBody(ExtractFingerPrintResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractFingerPrintResponseBody getBody() {
        return this.body;
    }

}
