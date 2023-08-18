// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class StartJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartJobResponseBody body;

    public static StartJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartJobResponse self = new StartJobResponse();
        return TeaModel.build(map, self);
    }

    public StartJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartJobResponse setBody(StartJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartJobResponseBody getBody() {
        return this.body;
    }

}
