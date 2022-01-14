// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class LogMsaQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public LogMsaQueryResponse setBody(LogMsaQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public LogMsaQueryResponseBody getBody() {
        return this.body;
    }

}
