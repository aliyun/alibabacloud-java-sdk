// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class LogMsaQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LogMsaQueryResponseBody body;

    public static LogMsaQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        LogMsaQueryResponse self = new LogMsaQueryResponse();
        return TeaModel.build(map, self);
    }

    public LogMsaQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogMsaQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LogMsaQueryResponse setBody(LogMsaQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public LogMsaQueryResponseBody getBody() {
        return this.body;
    }

}
