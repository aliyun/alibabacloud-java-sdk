// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckDrdsDbNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDrdsDbNameResponseBody body;

    public static CheckDrdsDbNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDrdsDbNameResponse self = new CheckDrdsDbNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckDrdsDbNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDrdsDbNameResponse setBody(CheckDrdsDbNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDrdsDbNameResponseBody getBody() {
        return this.body;
    }

}
