// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class Test02Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Test02ResponseBody body;

    public static Test02Response build(java.util.Map<String, ?> map) throws Exception {
        Test02Response self = new Test02Response();
        return TeaModel.build(map, self);
    }

    public Test02Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Test02Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Test02Response setBody(Test02ResponseBody body) {
        this.body = body;
        return this;
    }
    public Test02ResponseBody getBody() {
        return this.body;
    }

}
