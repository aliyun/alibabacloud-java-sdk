// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteMemoryNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMemoryNodeResponseBody body;

    public static DeleteMemoryNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryNodeResponse self = new DeleteMemoryNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMemoryNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMemoryNodeResponse setBody(DeleteMemoryNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMemoryNodeResponseBody getBody() {
        return this.body;
    }

}
