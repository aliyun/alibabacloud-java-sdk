// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetVideoProcessingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoProcessingResponseBody body;

    public static GetVideoProcessingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoProcessingResponse self = new GetVideoProcessingResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoProcessingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoProcessingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoProcessingResponse setBody(GetVideoProcessingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoProcessingResponseBody getBody() {
        return this.body;
    }

}
