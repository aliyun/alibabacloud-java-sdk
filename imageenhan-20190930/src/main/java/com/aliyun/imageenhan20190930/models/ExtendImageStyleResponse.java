// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExtendImageStyleResponseBody body;

    public static ExtendImageStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleResponse self = new ExtendImageStyleResponse();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtendImageStyleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExtendImageStyleResponse setBody(ExtendImageStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtendImageStyleResponseBody getBody() {
        return this.body;
    }

}
