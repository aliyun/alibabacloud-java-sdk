// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CheckUserAuthToMsceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckUserAuthToMsceneResponseBody body;

    public static CheckUserAuthToMsceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserAuthToMsceneResponse self = new CheckUserAuthToMsceneResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserAuthToMsceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserAuthToMsceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUserAuthToMsceneResponse setBody(CheckUserAuthToMsceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserAuthToMsceneResponseBody getBody() {
        return this.body;
    }

}
