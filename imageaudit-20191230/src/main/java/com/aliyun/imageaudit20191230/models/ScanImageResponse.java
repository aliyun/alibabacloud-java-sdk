// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanImageResponseBody body;

    public static ScanImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanImageResponse self = new ScanImageResponse();
        return TeaModel.build(map, self);
    }

    public ScanImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanImageResponse setBody(ScanImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanImageResponseBody getBody() {
        return this.body;
    }

}
