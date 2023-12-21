// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartReverseWriterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartReverseWriterResponseBody body;

    public static StartReverseWriterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartReverseWriterResponse self = new StartReverseWriterResponse();
        return TeaModel.build(map, self);
    }

    public StartReverseWriterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartReverseWriterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartReverseWriterResponse setBody(StartReverseWriterResponseBody body) {
        this.body = body;
        return this;
    }
    public StartReverseWriterResponseBody getBody() {
        return this.body;
    }

}
