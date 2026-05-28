// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddModelApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddModelApplicationResponseBody body;

    public static AddModelApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddModelApplicationResponse self = new AddModelApplicationResponse();
        return TeaModel.build(map, self);
    }

    public AddModelApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddModelApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddModelApplicationResponse setBody(AddModelApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddModelApplicationResponseBody getBody() {
        return this.body;
    }

}
