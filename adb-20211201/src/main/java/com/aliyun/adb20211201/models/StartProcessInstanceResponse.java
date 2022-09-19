// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartProcessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
