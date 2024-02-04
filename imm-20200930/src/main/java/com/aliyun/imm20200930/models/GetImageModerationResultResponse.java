// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetImageModerationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageModerationResultResponseBody body;

    public static GetImageModerationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageModerationResultResponse self = new GetImageModerationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetImageModerationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageModerationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageModerationResultResponse setBody(GetImageModerationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageModerationResultResponseBody getBody() {
        return this.body;
    }

}
