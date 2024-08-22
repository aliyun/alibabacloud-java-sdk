// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateMemoryNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMemoryNodeResponseBody body;

    public static UpdateMemoryNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryNodeResponse self = new UpdateMemoryNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemoryNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMemoryNodeResponse setBody(UpdateMemoryNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryNodeResponseBody getBody() {
        return this.body;
    }

}
