// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class PollTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PollTaskResultResponseBody body;

    public static PollTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        PollTaskResultResponse self = new PollTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public PollTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PollTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PollTaskResultResponse setBody(PollTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public PollTaskResultResponseBody getBody() {
        return this.body;
    }

}
