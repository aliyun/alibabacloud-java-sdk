// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UnbindAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindAppResponseBody body;

    public static UnbindAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAppResponse self = new UnbindAppResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAppResponse setBody(UnbindAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAppResponseBody getBody() {
        return this.body;
    }

}
