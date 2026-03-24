// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ScaleServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleServiceResponseBody body;

    public static ScaleServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleServiceResponse self = new ScaleServiceResponse();
        return TeaModel.build(map, self);
    }

    public ScaleServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleServiceResponse setBody(ScaleServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleServiceResponseBody getBody() {
        return this.body;
    }

}
