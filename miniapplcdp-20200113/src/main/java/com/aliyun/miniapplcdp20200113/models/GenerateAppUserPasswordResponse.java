// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAppUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAppUserPasswordResponseBody body;

    public static GenerateAppUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAppUserPasswordResponse self = new GenerateAppUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAppUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAppUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAppUserPasswordResponse setBody(GenerateAppUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAppUserPasswordResponseBody getBody() {
        return this.body;
    }

}
