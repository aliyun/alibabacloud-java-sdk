// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartSparkReplSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSparkReplSessionResponseBody body;

    public static StartSparkReplSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSparkReplSessionResponse self = new StartSparkReplSessionResponse();
        return TeaModel.build(map, self);
    }

    public StartSparkReplSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSparkReplSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSparkReplSessionResponse setBody(StartSparkReplSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSparkReplSessionResponseBody getBody() {
        return this.body;
    }

}
