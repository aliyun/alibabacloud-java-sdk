// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTlogTaskInfoResponseBody body;

    public static GetTlogTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTlogTaskInfoResponse self = new GetTlogTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTlogTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTlogTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTlogTaskInfoResponse setBody(GetTlogTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTlogTaskInfoResponseBody getBody() {
        return this.body;
    }

}
