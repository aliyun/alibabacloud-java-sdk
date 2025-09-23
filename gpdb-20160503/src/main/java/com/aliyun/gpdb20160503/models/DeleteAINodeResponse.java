// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteAINodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAINodeResponseBody body;

    public static DeleteAINodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAINodeResponse self = new DeleteAINodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAINodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAINodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAINodeResponse setBody(DeleteAINodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAINodeResponseBody getBody() {
        return this.body;
    }

}
