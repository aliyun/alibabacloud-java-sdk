// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoModerationResultResponseBody body;

    public static GetVideoModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoModerationResultResponse self = new GetVideoModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoModerationResultResponse setBody(GetVideoModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoModerationResultResponseBody getBody() {
        return this.body;
    }

}
