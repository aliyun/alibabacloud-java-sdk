// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartAiOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartAiOutboundTaskResponseBody body;

    public static StartAiOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAiOutboundTaskResponse self = new StartAiOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartAiOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAiOutboundTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAiOutboundTaskResponse setBody(StartAiOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAiOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
