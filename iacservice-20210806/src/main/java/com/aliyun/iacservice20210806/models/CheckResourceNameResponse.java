// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CheckResourceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckResourceNameResponseBody body;

    public static CheckResourceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceNameResponse self = new CheckResourceNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckResourceNameResponse setBody(CheckResourceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourceNameResponseBody getBody() {
        return this.body;
    }

}
