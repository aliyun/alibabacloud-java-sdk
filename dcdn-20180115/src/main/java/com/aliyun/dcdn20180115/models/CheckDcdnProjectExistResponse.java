// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CheckDcdnProjectExistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDcdnProjectExistResponseBody body;

    public static CheckDcdnProjectExistResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDcdnProjectExistResponse self = new CheckDcdnProjectExistResponse();
        return TeaModel.build(map, self);
    }

    public CheckDcdnProjectExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDcdnProjectExistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDcdnProjectExistResponse setBody(CheckDcdnProjectExistResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDcdnProjectExistResponseBody getBody() {
        return this.body;
    }

}
