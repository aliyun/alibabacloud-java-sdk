// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTranscodeTaskStatusResponseBody body;

    public static GetTranscodeTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskStatusResponse self = new GetTranscodeTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranscodeTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranscodeTaskStatusResponse setBody(GetTranscodeTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranscodeTaskStatusResponseBody getBody() {
        return this.body;
    }

}
