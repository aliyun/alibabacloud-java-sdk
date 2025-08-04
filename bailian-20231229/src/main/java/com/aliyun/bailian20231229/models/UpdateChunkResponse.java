// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateChunkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateChunkResponseBody body;

    public static UpdateChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChunkResponse self = new UpdateChunkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChunkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChunkResponse setBody(UpdateChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChunkResponseBody getBody() {
        return this.body;
    }

}
