// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleInApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleInApplicationResponseBody body;

    public static ScaleInApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleInApplicationResponse self = new ScaleInApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ScaleInApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleInApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleInApplicationResponse setBody(ScaleInApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleInApplicationResponseBody getBody() {
        return this.body;
    }

}
