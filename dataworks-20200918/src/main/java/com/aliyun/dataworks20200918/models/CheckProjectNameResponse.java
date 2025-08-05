// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CheckProjectNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckProjectNameResponseBody body;

    public static CheckProjectNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckProjectNameResponse self = new CheckProjectNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckProjectNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckProjectNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckProjectNameResponse setBody(CheckProjectNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckProjectNameResponseBody getBody() {
        return this.body;
    }

}
