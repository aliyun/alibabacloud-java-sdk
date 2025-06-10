// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateVideoProcessingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVideoProcessingResponseBody body;

    public static UpdateVideoProcessingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoProcessingResponse self = new UpdateVideoProcessingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoProcessingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoProcessingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVideoProcessingResponse setBody(UpdateVideoProcessingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoProcessingResponseBody getBody() {
        return this.body;
    }

}
