// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitTraceM3u8JobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTraceM3u8JobResponseBody body;

    public static SubmitTraceM3u8JobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceM3u8JobResponse self = new SubmitTraceM3u8JobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTraceM3u8JobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTraceM3u8JobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTraceM3u8JobResponse setBody(SubmitTraceM3u8JobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTraceM3u8JobResponseBody getBody() {
        return this.body;
    }

}
