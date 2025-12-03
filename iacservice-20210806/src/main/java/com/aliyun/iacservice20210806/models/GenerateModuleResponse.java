// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GenerateModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateModuleResponseBody body;

    public static GenerateModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateModuleResponse self = new GenerateModuleResponse();
        return TeaModel.build(map, self);
    }

    public GenerateModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateModuleResponse setBody(GenerateModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateModuleResponseBody getBody() {
        return this.body;
    }

}
