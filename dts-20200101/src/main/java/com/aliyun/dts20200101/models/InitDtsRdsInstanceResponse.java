// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class InitDtsRdsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitDtsRdsInstanceResponseBody body;

    public static InitDtsRdsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitDtsRdsInstanceResponse self = new InitDtsRdsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public InitDtsRdsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitDtsRdsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitDtsRdsInstanceResponse setBody(InitDtsRdsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public InitDtsRdsInstanceResponseBody getBody() {
        return this.body;
    }

}
