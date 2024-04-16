// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CloneModelInModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneModelInModuleResponseBody body;

    public static CloneModelInModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneModelInModuleResponse self = new CloneModelInModuleResponse();
        return TeaModel.build(map, self);
    }

    public CloneModelInModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneModelInModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneModelInModuleResponse setBody(CloneModelInModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneModelInModuleResponseBody getBody() {
        return this.body;
    }

}
