// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompareFaceVerifyResponseBody body;

    public static CompareFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceVerifyResponse self = new CompareFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public CompareFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareFaceVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompareFaceVerifyResponse setBody(CompareFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
