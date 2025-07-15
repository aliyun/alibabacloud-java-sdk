// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRtcAsrTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRtcAsrTaskResponseBody body;

    public static CreateRtcAsrTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRtcAsrTaskResponse self = new CreateRtcAsrTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRtcAsrTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRtcAsrTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRtcAsrTaskResponse setBody(CreateRtcAsrTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRtcAsrTaskResponseBody getBody() {
        return this.body;
    }

}
