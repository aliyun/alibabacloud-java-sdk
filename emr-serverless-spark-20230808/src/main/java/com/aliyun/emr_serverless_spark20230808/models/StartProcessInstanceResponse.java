// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartProcessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartProcessInstanceResponseBody body;

    public static StartProcessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartProcessInstanceResponse self = new StartProcessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartProcessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartProcessInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartProcessInstanceResponse setBody(StartProcessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartProcessInstanceResponseBody getBody() {
        return this.body;
    }

}
