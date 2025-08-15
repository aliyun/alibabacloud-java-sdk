// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteFactAuditUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFactAuditUrlResponseBody body;

    public static DeleteFactAuditUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFactAuditUrlResponse self = new DeleteFactAuditUrlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFactAuditUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFactAuditUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFactAuditUrlResponse setBody(DeleteFactAuditUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFactAuditUrlResponseBody getBody() {
        return this.body;
    }

}
