// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableHBaseueModuleResponseBody body;

    public static EnableHBaseueModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableHBaseueModuleResponse self = new EnableHBaseueModuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableHBaseueModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableHBaseueModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableHBaseueModuleResponse setBody(EnableHBaseueModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHBaseueModuleResponseBody getBody() {
        return this.body;
    }

}
