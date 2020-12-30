// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanTextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanTextResponseBody body;

    public static ScanTextResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanTextResponse self = new ScanTextResponse();
        return TeaModel.build(map, self);
    }

    public ScanTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanTextResponse setBody(ScanTextResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanTextResponseBody getBody() {
        return this.body;
    }

}
