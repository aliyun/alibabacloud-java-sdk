// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RestartTranscodeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartTranscodeTaskResponseBody body;

    public static RestartTranscodeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartTranscodeTaskResponse self = new RestartTranscodeTaskResponse();
        return TeaModel.build(map, self);
    }

    public RestartTranscodeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartTranscodeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartTranscodeTaskResponse setBody(RestartTranscodeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartTranscodeTaskResponseBody getBody() {
        return this.body;
    }

}
