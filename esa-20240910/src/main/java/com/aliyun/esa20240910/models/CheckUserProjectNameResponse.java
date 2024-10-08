// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckUserProjectNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckUserProjectNameResponseBody body;

    public static CheckUserProjectNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserProjectNameResponse self = new CheckUserProjectNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserProjectNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserProjectNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUserProjectNameResponse setBody(CheckUserProjectNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserProjectNameResponseBody getBody() {
        return this.body;
    }

}
