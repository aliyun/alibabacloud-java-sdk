// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceScreenshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceScreenshotResponseBody body;

    public static GetInstanceScreenshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceScreenshotResponse self = new GetInstanceScreenshotResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceScreenshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceScreenshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceScreenshotResponse setBody(GetInstanceScreenshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceScreenshotResponseBody getBody() {
        return this.body;
    }

}
